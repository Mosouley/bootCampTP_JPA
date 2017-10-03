
package com.bootcamp.maventpjpa.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 *
 * @author soul
 */
@Entity(name = "tp_livrable")
public class Livrable implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable = false,length=45)
    private String nom;
    
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateDeDebut;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateDeLivraison;
    
    @ManyToOne
    private Projet projet;
    
    @OneToOne
    private IndicateurPerformance indicateurPerformance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateDeDebut() {
        return dateDeDebut;
    }

    public void setDateDeDebut(Date dateDeDebut) {
        this.dateDeDebut = dateDeDebut;
    }

    public Date getDateDeLivraison() {
        return dateDeLivraison;
    }

    public void setDateDeLivraison(Date dateDeLivraison) {
        this.dateDeLivraison = dateDeLivraison;
    }

  
    public IndicateurPerformance getIndicateurPerformance() {
        return indicateurPerformance;
    }

    public void setIndicateurPerformance(IndicateurPerformance indicateurPerformance) {
        this.indicateurPerformance = indicateurPerformance;
    }
            
}
