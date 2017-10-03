package com.bootcamp.maventpjpa.dao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * Created by SOUL
 * repository e base à implementer par chaque entite
 * @param <T>
 */
public abstract class BaseRepository<T> {

    private  EntityManager em;
    private String persistUnit;
    private Class entityClass;
    private  EntityManagerFactory emf;

    
 

    public BaseRepository(String persistUnit, Class entityClass) {
        
        this.persistUnit = persistUnit;
        emf=Persistence.createEntityManagerFactory(this.persistUnit) ;
        this.em=getEntityManager();
        this.entityClass=entityClass;

    }
    
     public final EntityManager getEntityManager() {
        em= emf.createEntityManager();
        return em;
        
    }

  /**
   * methode genetique de creation dans la bdd
   * @param obj
   * @return
   * @throws SQLException 
   */
    public boolean create(T obj) throws SQLException {
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
        return true;
    }

    /**
     * Méthode pour supprimer une entite dans la bdd
     *
     * @param obj
     * @return boolean
     * @throws java.sql.SQLException
     */
    public boolean delete(T obj) throws SQLException {
        em.getTransaction().begin();
        em.remove(obj);
        em.getTransaction().commit();
        return true;
    }

    /**
     * Méthode de mise à jour
     *
     * @param obj
     * @return boolean
     * @throws java.sql.SQLException
     */
    public boolean update(T obj) throws SQLException {
        em.getTransaction().begin();
        em.merge(obj);
        em.getTransaction().commit();
        return true;
    }

    /**
     * Méthode de recherche des informations
     *
     * @param propertyName
     * @param value
     * @param id
     * @return T
     * @throws java.sql.SQLException
     */
    public List<T> findByProperty(String propertyName, Object value) throws SQLException {
        String className = entityClass.getSimpleName();
        String query = "select t from " + className + " t where t." + propertyName + "=:param";
        Query qry = getEntityManager().createQuery(query);
        qry.setParameter("param", value);
        return qry.getResultList();

    }
      public T findByPropertyUnique(String propertyName, Object value) throws SQLException {
        
          String className = entityClass.getSimpleName();
        String request = "select t from " + className + " t where t." + propertyName + "=:param";
        Query query = getEm().createQuery(request);
        query.setParameter("param", value);
        return (T) query.getSingleResult();

    }
    
     /*
	  * Méthode de recherche de tous les objets T
     */
    public  List<T> findAll(T obj) throws SQLException{
       
        return getEm().createQuery("select t from " + entityClass.getClass().getSimpleName() + " t").getResultList();
    }

    /**
     * 
     * @return the entity manager
     */
    public EntityManager getEm() {
        return em;
    }

    /**
     * 
     * @param em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }

    /**
     * 
     * @return the persistence unit
     */
    public String getPersistUnit() {
        return persistUnit;
    }

    /**
     * 
     * @param persistUnit 
     */
    public void setPersistUnit(String persistUnit) {
        this.persistUnit = persistUnit;
    }



}
