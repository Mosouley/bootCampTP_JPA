package com.bootcamp;

import com.bootcamp.maventpjpa.dao.BailleurRepository;
import com.bootcamp.maventpjpa.dao.Bailleur_ProgrammeRepository;
import com.bootcamp.maventpjpa.dao.BeneficiaireRepository;
import com.bootcamp.maventpjpa.dao.Beneficiaire_ProgrammeRepository;
import com.bootcamp.maventpjpa.dao.FournisseurRepository;
import com.bootcamp.maventpjpa.dao.Fournisseur_ProgrammeRepository;
import com.bootcamp.maventpjpa.dao.IndicateurPerformanceRepository;
import com.bootcamp.maventpjpa.dao.ProgrammeRepository;
import com.bootcamp.maventpjpa.dao.ProjetRepository;
import com.bootcamp.maventpjpa.entities.Bailleur;
import com.bootcamp.maventpjpa.entities.Bailleur_Programme;
import com.bootcamp.maventpjpa.entities.Beneficiaire;
import com.bootcamp.maventpjpa.entities.Beneficiaire_Programme;
import com.bootcamp.maventpjpa.entities.Fournisseur;
import com.bootcamp.maventpjpa.entities.Fournisseur_Programme;
import com.bootcamp.maventpjpa.entities.IndicateurPerformance;
import com.bootcamp.maventpjpa.entities.Programme;
import com.bootcamp.maventpjpa.entities.Projet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.TypeDeBailleur;
import org.testng.annotations.Test;
import tpjpa.App;
import tpjpa.LoadTestData;

public class GenerateTableTest {

    String persistOne = "TpJpaPU";
    String persistTwo = "TpPostgrePU";

    Bailleur fmd = new Bailleur();
    Bailleur usaid = new Bailleur();
    Bailleur onusida = new Bailleur();
    Bailleur mef = new Bailleur();
    Bailleur pnls = new Bailleur();
    Bailleur fondZ = new Bailleur();
    //créer une liste des bailleurs de ce programme
    List<Bailleur_Programme> bailcadredevie = new ArrayList<>();

    //création des fournisseurs
    Fournisseur onasa = new Fournisseur();
    Fournisseur frs1 = new Fournisseur();
    Fournisseur frs2 = new Fournisseur();
    Fournisseur frs3 = new Fournisseur();
    //créer une liste des fournisseurs de ce progarmme
    List<Fournisseur> frscadredevie = new ArrayList<>();

    //creation des beneficiaires
    Beneficiaire benef1 = new Beneficiaire();
    Beneficiaire benef2 = new Beneficiaire();
    Beneficiaire benef3 = new Beneficiaire();
    Beneficiaire benef4 = new Beneficiaire();
    Beneficiaire benef5 = new Beneficiaire();
    //créer une liste des bénéficiaires de ce programmes
    List<Beneficiaire> benefcadredevie = new ArrayList<>();

    //création de deux nouveaux programmes
//    Programme firstp = new Programme();

    //le second programme
    //création de deux nouveaux programmes
    Programme cadredevie = new Programme();

    //indicateurs
    IndicateurPerformance indicateur1 = new IndicateurPerformance();
    IndicateurPerformance indicateur2 = new IndicateurPerformance();

    //créations de nouveaux projets
    Projet luttenutrition = new Projet();
    Projet emancipation = new Projet();
    Projet educationfille = new Projet();

    Projet amenagement = new Projet();
    Projet espacevert = new Projet();
    Projet eaupotable = new Projet();

//    @Test
//    public void generateTables(){
//       // Persistence.("tpJpa", new Properties());
//        Persistence.createEntityManagerFactory(persistOne, new Properties());
//    }
//
    @Test
    public void createBailleurTest() throws SQLException {
        //Chargement de Bailleurs

        fmd.setNom("Fonds Mondial");
        fmd.setTypeDeBailleur(TypeDeBailleur.INTER);

        usaid.setNom("USAID");
        usaid.setTypeDeBailleur(TypeDeBailleur.INTER);

        onusida.setNom("ONU SIDA");
        onusida.setTypeDeBailleur(TypeDeBailleur.INTER);

        mef.setNom("Ministere de l'économie et des finances");
        mef.setTypeDeBailleur(TypeDeBailleur.GOVMENT);

        pnls.setNom("PNLS");
        pnls.setTypeDeBailleur(TypeDeBailleur.INTER);

        fondZ.setNom("Fondation ZZZ");
        fondZ.setTypeDeBailleur(TypeDeBailleur.PRIVE);
        BailleurRepository donneesBailleurs = new BailleurRepository(persistOne);

        donneesBailleurs.create(fmd);
        donneesBailleurs.create(usaid);
        donneesBailleurs.create(onusida);
        donneesBailleurs.create(pnls);
        donneesBailleurs.create(fondZ);

    }

    @Test
    public void createFournisseurTest() throws SQLException {
        //Chargement de fournisseurs

        onasa.setNom("ONASA");

        frs1.setNom("FOURNISSEUR 1");
        Fournisseur frs2 = new Fournisseur();
        frs2.setNom("FOURNISSEUR 2");

        frs3.setNom("FOURNISSEUR 3");
        FournisseurRepository donFournisseur = new FournisseurRepository(persistOne);

        donFournisseur.create(onasa);
        donFournisseur.create(frs1);
        donFournisseur.create(frs2);
        donFournisseur.create(frs3);

    }

    @Test
    public void createBeneficiaireTest() throws SQLException {

        //Chargement de Bénificiaire
        benef1.setNom("Commune du Zou");

        benef2.setNom("Commune du Littoral");

        benef3.setNom("Commune du Borgou");

        benef4.setNom("Commune de l'ATLTANTIQUE");//

        benef5.setNom("Commune du MONO");
        BeneficiaireRepository donBeneficiaires = new BeneficiaireRepository(persistOne);

        donBeneficiaires.create(benef1);
        donBeneficiaires.create(benef2);
        donBeneficiaires.create(benef3);
        donBeneficiaires.create(benef4);
        donBeneficiaires.create(benef5);

    }

    @Test
    public void indicateurPerformanceTest() throws SQLException {
        //définir les indicateurs de performance

        indicateur1.setLibelle("Performance Financiere");
        indicateur1.setNature("Quantité");
        indicateur1.setValeur("Valeur de l'indicateur");

        indicateur2.setLibelle("Performance Managériale");
        indicateur2.setNature("Cervelle");
        indicateur2.setValeur("Valeur de l'indicateur");

        IndicateurPerformanceRepository donIndicateurs = new IndicateurPerformanceRepository(persistOne);

        donIndicateurs.create(indicateur1);
        donIndicateurs.create(indicateur2);

    }

    @Test
    public void createChangePUTest() throws SQLException {
         //Charger les données dans la bdd MySql
        String persistMySql = "TpJpaPU";
        String persistPostgres="tpPostgresJPA";
        try {
            //Charger dans la base Postgres
           LoadTestData charger= new LoadTestData(persistPostgres);
         //Charger les donnees
           charger.loadDataSample();
         //  Charger dans la base MySql
           charger= new LoadTestData(persistMySql);
     //Charger les donnees
           charger.loadDataSample();
         

        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

   
    @Test
    public void generateQueryWithMySqlTest(){
        
          //requ?te pour retourner tous les bailleurs du programme cadre de vie
        
        Bailleur_ProgrammeRepository donneesBailleur=new Bailleur_ProgrammeRepository(persistOne);
        Fournisseur_ProgrammeRepository donneesFournisseur=new Fournisseur_ProgrammeRepository(persistOne);
        Beneficiaire_ProgrammeRepository donneesBeneficiaire=new Beneficiaire_ProgrammeRepository(persistOne);
        ProjetRepository donneesProjet= new ProjetRepository(persistOne);
        
        List<Bailleur_Programme> bp=new ArrayList<>();
        List<Fournisseur_Programme> lFour=new ArrayList<>();
        List<Beneficiaire_Programme> lBene=new ArrayList<>();
        Projet leprojet=new Projet();
        try {
           
            bp=donneesBailleur.findByProperty("programme.id", 1);
            lFour=donneesFournisseur.findByProperty("programme.id", 1);
            lBene=donneesBeneficiaire.findByProperty("programme.id", 1);
            //projet sur lequel faire la recherche
           leprojet =donneesProjet.findByPropertyUnique("id", 3);
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        for (Bailleur_Programme bail : bp) {
            System.out.println( "La liste des bailleurs du programme 1 est: "  +bail.getBailleur().getNom()+" et son capital est : "+ bail.getCapital());
            System.out.println("");
        }
      
        for (Fournisseur_Programme bail : lFour) {
            System.out.println( "La liste des fournisseurs du programme 1 est: "  +bail.getFournisseur().getNom()+" et son Compte est : "+ bail.getCompteBancaire());
            System.out.println("");
        }
       for (Beneficiaire_Programme bail : lBene) {
            System.out.println( "La liste des beneficiaires du programme 1 est: "  +bail.getBeneficiaire().getNom()+" et son capital est : "+ bail.getCompteBancaire());
            System.out.println("");
        }
        
        
        ///Affichage des informations sur le projet
         System.out.println( "\t Attention pour verrez les informations sur le projet "
                +leprojet.getNom()+"\t " + "Extraction des informations");
      
//         for (Bailleur_Programme bail : leprojet.getBailleurs()) {
//            System.out.println(  "\t La liste des bailleurs du projet "
//                +leprojet.getNom()+"\t est: \n"
//                +bail.getNom()+" \n" + "Listes des bailleurs");
//      
//        }
        
        for (Fournisseur fourn : leprojet.getFournisseurs()) {
            System.out.println(  "\t La liste des fournisseurs du projet "
                +leprojet.getNom()+"\t est: \n"
                +fourn.getNom()+" \n" + "Listes des fournisseurs");
      
        }
        for (Beneficiaire benef : leprojet.getBeneficiaires()) {
            System.out.println(  "\t La liste des beneficiaires du projet "
                +leprojet.getNom()+"\t est: \n"
                +benef.getNom()+" \n" + "Listes des beneficiaires");
      
        }
             
       
    }
}
