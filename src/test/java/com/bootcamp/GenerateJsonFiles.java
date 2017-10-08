
package com.bootcamp;

import com.bootcamp.maventpjpa.entities.Bailleur;
import com.bootcamp.maventpjpa.entities.Beneficiaire;
import com.bootcamp.maventpjpa.entities.Fournisseur;
import com.bootcamp.maventpjpa.entities.IndicateurPerformance;
import com.bootcamp.maventpjpa.entities.Programme;
import com.bootcamp.maventpjpa.entities.Projet;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modele.FileHandle;
import modele.JsonUtils;
import modele.TypeDeBailleur;
import org.json.JSONArray;
import org.json.JSONObject;

import org.testng.annotations.Test;

/**
 *
 * @author soul
 */
public class GenerateJsonFiles {
    
    @Test
    public void parseEntitiesToJson(){
    
    
    Bailleur fmd = new Bailleur();
    Bailleur usaid = new Bailleur();
    Bailleur onusida = new Bailleur();
    Bailleur mef = new Bailleur();
    Bailleur pnls = new Bailleur();
    Bailleur fondZ = new Bailleur();


//    //création des fournisseurs
//    Fournisseur onasa = new Fournisseur();
//    Fournisseur frs1 = new Fournisseur();
//    Fournisseur frs2 = new Fournisseur();
//    Fournisseur frs3 = new Fournisseur();
//    //créer une liste des fournisseurs de ce progarmme
//    List<Fournisseur> frscadredevie = new ArrayList<>();

//    //creation des beneficiaires
//    Beneficiaire benef1 = new Beneficiaire();
//    Beneficiaire benef2 = new Beneficiaire();
//    Beneficiaire benef3 = new Beneficiaire();
//    Beneficiaire benef4 = new Beneficiaire();
//    Beneficiaire benef5 = new Beneficiaire();
//    //créer une liste des bénéficiaires de ce programmes
//    List<Beneficiaire> benefcadredevie = new ArrayList<>();



    //indicateurs
    IndicateurPerformance indicateur1 = new IndicateurPerformance();
    IndicateurPerformance indicateur2 = new IndicateurPerformance();

 


        //création de jeu de données bailleurs

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
        
        // Create the outer container
JSONArray dataBailleurs = new JSONArray();



        List<Bailleur> instances=new ArrayList<>();
        instances.add(fmd);
        instances.add(usaid);
        instances.add(onusida);
        instances.add(mef);
        instances.add(pnls);
        instances.add(fondZ);
        dataBailleurs.put(instances);
       //Créer un nouveau fichier .json pour serialiser les bailleurs
       File fileBailleur=new File("Bailleur.json");
       //Methode statique d'écriture dans un fichier Json
       JsonUtils.convertJavaToJson(fileBailleur, fmd);


        //        //
        //            //définir les indicateurs de performance
        indicateur1.setLibelle("Performance Financiere");
        indicateur1.setNature("Quantité");
        indicateur1.setValeur("Valeur de l'indicateur");
        indicateur2.setLibelle("Performance Managériale");
        indicateur2.setNature("Cervelle");
        indicateur2.setValeur("Valeur de l'indicateur");


        List<IndicateurPerformance> instancesIndic=new ArrayList<>();
        instancesIndic.add(indicateur1);
        instancesIndic.add(indicateur2);
      
       //Créer un nouveau fichier .json pour serialiser les indicateurs
       File indicateurFile=new File("IndicateurPerformance.json");
        //Methode statique d'écriture dans un fichier Json
        JsonUtils.convertJavaToJson(indicateurFile, indicateur1);
    }
    
    @Test
    public void parseJsonToentities(){
        //retourner le string json depuis le fichier indiqué
        File fileBailleur=new File("Bailleur.json");
//        JSONArray listBailleurs=new JSONArray();
//        listBailleurs.
        Bailleur b=JsonUtils.convertJsonToJava(fileBailleur, Bailleur.class);
        System.out.println(b.getNom());
        
          //retourner le string json depuis le fichier indiqué
        File fileIndicateur=new File("IndicateurPerformance.json");
//        JSONArray listBailleurs=new JSONArray();
//        listBailleurs.
        IndicateurPerformance ind=JsonUtils.convertJsonToJava(fileIndicateur, IndicateurPerformance.class);
        System.out.println(ind.getLibelle());
    }
    
}
