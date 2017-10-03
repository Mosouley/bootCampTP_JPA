
package tpjpa;

import com.bootcamp.maventpjpa.dao.BailleurRepository;
import com.bootcamp.maventpjpa.dao.Bailleur_ProgrammeRepository;
import com.bootcamp.maventpjpa.dao.BeneficiaireRepository;
import com.bootcamp.maventpjpa.dao.FournisseurRepository;
import com.bootcamp.maventpjpa.dao.IndicateurPerformanceRepository;
import com.bootcamp.maventpjpa.dao.ProgrammeRepository;
import com.bootcamp.maventpjpa.dao.ProjetRepository;
import com.bootcamp.maventpjpa.entities.Bailleur;
import com.bootcamp.maventpjpa.entities.Bailleur_Programme;
import com.bootcamp.maventpjpa.entities.Beneficiaire;
import com.bootcamp.maventpjpa.entities.Fournisseur;
import com.bootcamp.maventpjpa.entities.IndicateurPerformance;
import com.bootcamp.maventpjpa.entities.Programme;
import com.bootcamp.maventpjpa.entities.Projet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modele.TypeDeBailleur;

/**
 *
 * @author soul
 */
public class LoadTestData {

     
    String persisUnit="TpJpaPU";
    Bailleur fmd = new Bailleur();
    Bailleur usaid = new Bailleur();
    Bailleur onusida = new Bailleur();
    Bailleur mef = new Bailleur();
    Bailleur pnls = new Bailleur();
    Bailleur fondZ = new Bailleur();
    //cr�er une liste des bailleurs de ce programme
    List<Bailleur> bailcadredevie = new ArrayList<>();

    //cr�ation des fournisseurs
    Fournisseur onasa = new Fournisseur();
    Fournisseur frs1 = new Fournisseur();
    Fournisseur frs2 = new Fournisseur();
    Fournisseur frs3 = new Fournisseur();
    //cr�er une liste des fournisseurs de ce progarmme
    List<Fournisseur> frscadredevie = new ArrayList<>();

    //creation des beneficiaires
    Beneficiaire benef1 = new Beneficiaire();
    Beneficiaire benef2 = new Beneficiaire();
    Beneficiaire benef3 = new Beneficiaire();
    Beneficiaire benef4 = new Beneficiaire();
    Beneficiaire benef5 = new Beneficiaire();
    //cr�er une liste des b�n�ficiaires de ce programmes
    List<Beneficiaire> benefcadredevie = new ArrayList<>();



    //indicateurs
    IndicateurPerformance indicateur1 = new IndicateurPerformance();
    IndicateurPerformance indicateur2 = new IndicateurPerformance();

    //cr�ations de nouveaux projets
    Projet luttenutrition = new Projet();
    Projet emancipation = new Projet();
    Projet educationfille = new Projet();

    Projet amenagement = new Projet();
    Projet espacevert = new Projet();
    Projet eaupotable = new Projet();
    
     List<Projet> projetcadredevie = new ArrayList<>();
 //cr�ation de deux nouveaux programmes
//    Programme firstp = new Programme();

    //le second programme
    //cr�ation de deux nouveaux programmes
    Programme cadredevie = new Programme();

    public LoadTestData(String persisUnit) throws SQLException {
        this.persisUnit=persisUnit;

    }
     

    public void loadDataSample() throws SQLException {
        //Chargement de Bailleurs

        fmd.setNom("Fonds Mondial");
        fmd.setTypeDeBailleur(TypeDeBailleur.INTER);

        usaid.setNom("USAID");
        usaid.setTypeDeBailleur(TypeDeBailleur.INTER);

        onusida.setNom("ONU SIDA");
        onusida.setTypeDeBailleur(TypeDeBailleur.INTER);

        mef.setNom("Ministere de l'�conomie et des finances");
        mef.setTypeDeBailleur(TypeDeBailleur.GOVMENT);

        pnls.setNom("PNLS");
        pnls.setTypeDeBailleur(TypeDeBailleur.INTER);

        fondZ.setNom("Fondation ZZZ");
        fondZ.setTypeDeBailleur(TypeDeBailleur.PRIVE);
        
            //d�finir les indicateurs de performance
        indicateur1.setLibelle("Performance Financiere");
        indicateur1.setNature("Quantit�");
        indicateur1.setValeur("Valeur de l'indicateur");
        indicateur2.setLibelle("Performance Manag�riale");
        indicateur2.setNature("Cervelle");
        indicateur2.setValeur("Valeur de l'indicateur");

        IndicateurPerformanceRepository donIndicateurs = new IndicateurPerformanceRepository(persisUnit);

        donIndicateurs.create(indicateur1);
        donIndicateurs.create(indicateur2);
        
        cadredevie.setBudgetEffectif(50000);
        cadredevie.setBudgetPrevisionnel(60000);
        cadredevie.setDateDeDebut(java.sql.Date.valueOf("2017-01-01"));
        cadredevie.setDateDeFin(java.sql.Date.valueOf("2017-12-01"));
        cadredevie.setNom("Projet Cadre de vie");
        cadredevie.setObjectif("Am�liorer la condition de la femme");
        cadredevie.setIndicateurPerformance(indicateur2);
        
        
        ProgrammeRepository donneesProgrammes = new ProgrammeRepository(persisUnit);

        donneesProgrammes.create(cadredevie);
        
     
        
        
        BailleurRepository donneesBailleurs = new BailleurRepository(persisUnit);

        donneesBailleurs.create(fmd);
        donneesBailleurs.create(usaid);
        donneesBailleurs.create(onusida);
        donneesBailleurs.create(pnls);
        donneesBailleurs.create(fondZ);
              
        Bailleur_Programme bp1=new Bailleur_Programme();
        bp1.setBailleur(usaid);
        bp1.setProgramme(cadredevie);
        bp1.setCapital("Valeur du Capital");
        
        Bailleur_Programme bp2=new Bailleur_Programme();
        bp2.setBailleur(onusida);
        bp2.setProgramme(cadredevie);
        bp2.setCapital("Valeur du Capital 2");
        
        Bailleur_Programme bp3=new Bailleur_Programme();
        bp3.setBailleur(fmd);
        bp3.setProgramme(cadredevie);
        bp3.setCapital("Valeur du Capital 3");
       
        Bailleur_ProgrammeRepository donneesBP=new Bailleur_ProgrammeRepository(persisUnit);
        
        donneesBP.create(bp1);
        donneesBP.create(bp2);
        donneesBP.create(bp3);
        
        //Chargement de fournisseurs
        onasa.setNom("ONASA");
        frs1.setNom("FOURNISSEUR 1");
        frs2.setNom("FOURNISSEUR 2");
        frs3.setNom("FOURNISSEUR 3");
        FournisseurRepository donFournisseur = new FournisseurRepository(persisUnit);
        donFournisseur.create(onasa);
        donFournisseur.create(frs1);
        donFournisseur.create(frs2);
        donFournisseur.create(frs3);

        
        //Chargement de B�nificiaire
        benef1.setNom("Commune du Zou");
        benef2.setNom("Commune du Littoral");
        benef3.setNom("Commune du Borgou");
        benef4.setNom("Commune de l'ATLTANTIQUE");//
        benef5.setNom("Commune du MONO");
        BeneficiaireRepository donBeneficiaires = new BeneficiaireRepository(persisUnit);

        donBeneficiaires.create(benef1);
        donBeneficiaires.create(benef2);
        donBeneficiaires.create(benef3);
        donBeneficiaires.create(benef4);
        donBeneficiaires.create(benef5);
        
       
        

        
        //cr�ations de nouveaux projets
        amenagement.setDateDeDebut(java.sql.Date.valueOf("2017-06-01"));
        amenagement.setDateDeFin(java.sql.Date.valueOf("2017-09-31"));
        amenagement.setNom("Am�nager le cadre de vie");
        amenagement.setObjectif("100% de rues balay�es");
        amenagement.setBudgetEffectif(100000);
        amenagement.setBudgetPrevisionnel(150000);
        amenagement.setIndicateurPerformance(indicateur2);

        amenagement.setProgramme(cadredevie);
       

        espacevert.setDateDeDebut(java.sql.Date.valueOf("2016-01-01"));
        espacevert.setDateDeFin(java.sql.Date.valueOf("2017-09-31"));
        espacevert.setNom("Espace vert pour l'ozone");
        espacevert.setObjectif("100% des espaces non habit�s verts");
        espacevert.setBudgetEffectif(100000);
        espacevert.setBudgetPrevisionnel(150000);
        espacevert.setIndicateurPerformance(indicateur2);
         espacevert.setProgramme(cadredevie);
        

        eaupotable.setDateDeDebut(java.sql.Date.valueOf("2017-02-01"));
        eaupotable.setDateDeFin(java.sql.Date.valueOf("2017-12-31"));
        eaupotable.setNom("Eau potable pour tous");
        eaupotable.setObjectif("100% des villages aliment�s en eau potable");
        eaupotable.setBudgetEffectif(100000);
        eaupotable.setBudgetPrevisionnel(150000);
        eaupotable.setIndicateurPerformance(indicateur1);
        eaupotable.setProgramme(cadredevie);

        ProjetRepository donProjets = new ProjetRepository(persisUnit);

        donProjets.create(amenagement);
        donProjets.create(espacevert);
        donProjets.create(eaupotable);
        
        //////////////////////******************second programme////////////////////////
        bailcadredevie.add(fondZ);
        bailcadredevie.add(pnls);
        bailcadredevie.add(usaid);
//        cadredevie.bailcadredevie);

        benefcadredevie.add(benef2);
        benefcadredevie.add(benef4);
        benefcadredevie.add(benef5);
//        cadredevie.setBeneficiaires(benefcadredevie);

        frscadredevie.add(frs1);
        frscadredevie.add(frs2);
//        cadredevie.setFournisseurs(frscadredevie);
        
          
       
        //ajouter la liste des projets de ce programme
        projetcadredevie.add(amenagement);
        projetcadredevie.add(espacevert);
        projetcadredevie.add(eaupotable);
        cadredevie.setProjets(projetcadredevie);
       
    }

  
      
//        ProjetRepository donProjet2=new ProjetRepository();
//        try {
//            donProjet2.addProjet(emancipation);
//            donProjet2.addProjet(luttenutrition);
//            donProjet2.addProjet(educationfille);
//        } catch (Exception ex) {
//            Logger.getLogger(LoadTestData.class.getName()).log(Level.SEVERE, null, ex);
//        }
   
      
 
    }
 
 
