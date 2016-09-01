package bde;


import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lo
 */
public  class Main {
    public static String Scan(){
        Scanner sc = new Scanner(System.in);
        String res = sc.toString();
        sc.close();
        System.out.println(res);
        return res;
    }
    
    
    
    
    public static void main(String args[]){
        Evenement e =new Evenement("yolo", "on va faire du yolo swag");
        Calendar date = new GregorianCalendar(2017,2,20);
        Evenement e2 =new Evenement("soiré frite",date ,date , "on va faire une frite chez momo");
        ListEvenements le =new ListEvenements();
        le.ajouterEvenement(e);
        le.ajouterEvenement(e2);
        //System.out.println(le.toString());
         while (true){
        System.out.println("Que voulez vous faire ?");
        System.out.println("1 : Afficher les evenements ");
        System.out.println("2 : Ajouter un evenement");
        System.out.println("3 : Supprimer un evenement ");
        System.out.println("4 : Modifier un evenement ");
        System.out.println("5 : Quitter ");     
        Scanner sctmp = new Scanner(System.in);
        int cm =sctmp.nextInt(); 
        sctmp.nextLine();         
        if(cm == 1){
            le.afficherCSV();
            System.out.println("Appuyer sur entrer pour continuer");
         }else {
             if(cm == 2){
                System.out.println("Voulez vous vraiment créer un évenement ?");
                System.out.println("1 :oui ");
                System.out.println("2 :non ");
                int r =sctmp.nextInt(); 
                sctmp.nextLine();
                if(r == 1){
                    System.out.println("Entrer le nom de l'evenement");
                    String name = sctmp.nextLine();
                    sctmp.nextLine();
                    le.ajouterEvenement(new Evenement(name));
                    try {
                        le.listToCSV();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    le.afficherCSV();
                     System.out.println("Appuyer sur entrer pour continuer");
                }
             }else{
                 if(cm ==3 ){
                    System.out.println("Voulez vous  vraiment supprimer un  évenement ?");
                    System.out.println("1 :oui ");
                    System.out.println("2 :non ");
                    int r2 =sctmp.nextInt(); 
                    sctmp.nextLine();
                if(r2 == 1){
                System.out.println("Entrer le nom de l'evenement");
                String name = sctmp.nextLine();
              // sctmp.nextLine();
                System.out.println(name);
                le.supprimerEvenementAvecLeNom(name);
                le.afficherCSV();
                System.out.println("Appuyer sur entrer pour continuer");
                }
                }else{
                    if(cm == 4){
                         
                    }else {
                        if (cm == 5){
                            System.exit(0);
                        }
                     }
                 }
             }
         }
    sctmp.nextLine();
     } 
         
         
        
        
    }
}
