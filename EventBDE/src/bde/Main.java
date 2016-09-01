package bde;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

//Audrey

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
         le.trierList();
         System.out.println("que voulez vous faire ?");
         System.out.println("1 :afficher les evenements ");
         System.out.println("2 : ajouter un evenement");
         System.out.println("3 : supprimer un evenement ");
         System.out.println("4 : modifier un evenement ");
         System.out.println("5 : quitter ");
         
         Scanner sctmp = new Scanner(System.in);
         int cm =sctmp.nextInt(); 
         sctmp.nextLine();         
         if(cm == 1){
               System.out.println(le.toString());
                System.out.println("appuyer sur entrée pour continuer");
         }else if(cm == 2){
                  System.out.println(" voulez vous créer vraiment un évenement ?");
           System.out.println("1 :oui ");
            System.out.println("2 :non ");
       
         
        
            int r =sctmp.nextInt(); 
         
              sctmp.nextLine();
                if(r == 1){
                    System.out.println("entrer le nom de l'evenement");
             
           
                    String name = sctmp.nextLine();
                    System.out.println("appuyer sur entrée pour continuer"); 
                    sctmp.nextLine();
           
                    Evenement e3 = new Evenement(name);
                    le.ajouterEvenement(e3);
                    System.out.println(le.toString());
                     
                }
                
                
             }else if(cm ==3 ){
                      System.out.println(" voulez vous  vraiment supprimer un  évenement ?");
         System.out.println("1 :oui ");
         System.out.println("2 :non ");
              
         int r2 =sctmp.nextInt(); 
         
        sctmp.nextLine();
         if(r2 == 1){
             System.out.println("entrer le nom de l'evenement");
             
           
               String name = sctmp.nextLine();
              // sctmp.nextLine();
               System.out.println(name);
               
            
             le.supprimerEvenementAvecLeNom(name);
             System.out.println(le.toString());
              System.out.println("appuyer sur entrée pour continuer");
         }
         
         
                 }else if(cm == 4){
                     System.out.println(le.toString());
                     System.out.println("Quelle événement voulait vous modifier?");
                     String name = sctmp.nextLine();
                     if(le.nomDejaPresent(name)){
                         System.out.println("1: Modifier le nom");
                         System.out.println("2: Modifier la date de début (aaaa,m,jj)");
                         System.out.println("3: Modifier la date de fin (aaaa,m,jj)");
                         System.out.println("4: Modifier la description");
                         
                         
                         
                         int choix = sctmp.nextInt();
                         sctmp.nextLine();
                         if(choix == 1){
                             System.out.println("Saisissez un nouveau nom :");
                             String nom = sctmp.nextLine();
                             le.retourneEvenement(name).setNom(nom);
                         }else if(choix == 2){
                             System.out.println("Saisissez l'année :");
                             int aaaa = sctmp.nextInt();
                             System.out.println("Saisissez le mois :");
                             int m = sctmp.nextInt() -1;
                              System.out.println("Saisissez le jour :");
                             int jj = sctmp.nextInt();
                             le.retourneEvenement(name).setDateDebut(new GregorianCalendar(aaaa,m,jj));
                             System.out.println(le.toString());
                         }else if(choix == 3){
                             System.out.println("Saisissez l'année :");
                             int aaaa = sctmp.nextInt();
                             System.out.println("Saisissez le mois :");
                             int m = sctmp.nextInt() -1;
                              System.out.println("Saisissez le jour :");
                             int jj = sctmp.nextInt();
                             le.retourneEvenement(name).setDateFin(new GregorianCalendar(aaaa,m,jj));
                             System.out.println(le.toString());
                         }else if(choix == 4){
                             System.out.println("Entrée une nouvelle description : ");
                             String description = sctmp.nextLine();
                             le.retourneEvenement(name).setDescription(description);
                         }
                     }else{
                         System.out.println("Evénement introuvable !!");
                     }
                     
                         
                     }else if (cm == 5){
                             System.exit(0);
                         }
         
          sctmp.nextLine();
                     }
                 }
             }
         
         
     
     
          
         
         
        
        
    
