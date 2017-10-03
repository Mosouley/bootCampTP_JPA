package tpjpa;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author soul
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Charger les données dans la bdd MySql
        String persistOne = "TpJpaPU";
        String persistTwo="tpPostgresJPA";
        try {
            //Charger dans la base Postgres
           LoadTestData charger= new LoadTestData(persistTwo);
         //Charger les donnees
           charger.loadDataSample();
         //  Charger dans la base MySql
           charger= new LoadTestData(persistOne);
     //Charger les donnees
           charger.loadDataSample();
         

        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

        //requ?te pour retourner tous les bailleurs du programme cadre de vie
//        ProgrammeRepository donneesProgramme = new ProgrammeRepository(persistOne);
//        ProjetRepository donneesProjet = new ProjetRepository(persistOne);
//        //programme sur lequel faire la recherche
//        Programme leprogramme = new Programme();
//        Projet leprojet = new Projet();
//        try {
//            leprogramme = donneesProgramme.findByProperty("id", 1);
//            //projet sur lequel faire la recherche
//            leprojet = donneesProjet.findByProperty("id", 4);
//        } catch (SQLException ex) {
//            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        for (Bailleur bail : leprogramme.getBailleurs()) {
//            JOptionPane.showMessageDialog(null, "\t La liste des bailleurs du programme "
//                    + leprogramme.getNom() + "\t est: \n"
//                    + bail.getNom() + " \n", "Listes des bailleurs", JOptionPane.INFORMATION_MESSAGE);
//
//        }
//
//        for (Fournisseur fourn : leprogramme.getFournisseurs()) {
//            JOptionPane.showMessageDialog(null, "\t La liste des fournisseurs du programme "
//                    + leprogramme.getNom() + "\t est: \n"
//                    + fourn.getNom() + " \n", "Listes des fournisseurs", JOptionPane.INFORMATION_MESSAGE);
//
//        }
//        for (Beneficiaire benef : leprogramme.getBeneficiaires()) {
//            JOptionPane.showMessageDialog(null, "\t La liste des beneficiaires du programme "
//                    + leprogramme.getNom() + "\t est: \n"
//                    + benef.getNom() + " \n", "Listes des beneficiaires", JOptionPane.INFORMATION_MESSAGE);
//
//        }
//
//        ///Affichage des informations sur le projet
//        JOptionPane.showMessageDialog(null, "\t Attention pour verrez les informations sur le projet "
//                + leprojet.getNom() + "\t ", "Extraction des informations", JOptionPane.INFORMATION_MESSAGE);
//
//        for (Bailleur bail : leprojet.getBailleurs()) {
//            JOptionPane.showMessageDialog(null, "\t La liste des bailleurs du projet "
//                    + leprojet.getNom() + "\t est: \n"
//                    + bail.getNom() + " \n", "Listes des bailleurs", JOptionPane.INFORMATION_MESSAGE);
//
//        }
//
//        for (Fournisseur fourn : leprojet.getFournisseurs()) {
//            JOptionPane.showMessageDialog(null, "\t La liste des fournisseurs du projet "
//                    + leprojet.getNom() + "\t est: \n"
//                    + fourn.getNom() + " \n", "Listes des fournisseurs", JOptionPane.INFORMATION_MESSAGE);
//
//        }
//        for (Beneficiaire benef : leprojet.getBeneficiaires()) {
//            JOptionPane.showMessageDialog(null, "\t La liste des beneficiaires du projet "
//                    + leprojet.getNom() + "\t est: \n"
//                    + benef.getNom() + " \n", "Listes des beneficiaires", JOptionPane.INFORMATION_MESSAGE);
//
//        }
//
    }

   
}
