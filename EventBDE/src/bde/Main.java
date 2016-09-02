package bde;


import java.util.ArrayList;
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
        
        
        
        
        
         ListEvenements le =new ListEvenements();
       

         //System.out.println(le.toString());
        
         while(true){
         System.out.println("que voulez vous faire ?");
         System.out.println("1 : afficher les evenements ");
         System.out.println("2 : se connecter ");
         System.out.println("3 : s'inscrire");
         System.out.println("4 : quitter ");
         Scanner sctmp = new Scanner(System.in);
        
         int cl = sctmp.nextInt();
         sctmp.nextLine();
        
         if( cl == 1){
             le.trierList();
             //System.out.println(le.toString());
                le.afficherCSV();
             System.out.println("\nQue voulez-vous faire ?");
             System.out.println("\n1 - visualiser la description d'un evenement");
             System.out.println("2 - revenir au menu");
             
            int ck = sctmp.nextInt();
            sctmp.nextLine();
             
            if(ck == 1 ){
                System.out.println("Entrez le numero d'un evenement");
                int cn = sctmp.nextInt();
                sctmp.nextLine();
                if(cn>0 && cn<le.liste.size())
                    System.out.println(le.liste.get(cn-1).avecDescription());
            }
        }else {
             if(cl == 2){
             System.out.println("pseudo : ");
             String pseu =sctmp.nextLine();
             System.out.println("appuyer sur entrée pour continuer");
             sctmp.nextLine();
             
             
             System.out.println(pseu);
             
             System.out.println("mdp : ");
             String mdp =sctmp.nextLine();
             System.out.println("appuyer sur entrée pour continuer");
              sctmp.nextLine();
             
              
              Login log = new Login(pseu,mdp);
             
             
             if(log.verifier()){
                 while (true){
                    le.trierList();
                    System.out.println("que voulez vous faire ?");
                    System.out.println("1 : afficher les evenements ");
                    if(log.EstAdmin()){
                        System.out.println("2 : ajouter un evenement");
                        System.out.println("3 : supprimer un evenement ");
                        System.out.println("4 : modifier un evenement ");
                        System.out.println("5 : creer sondage ");
                        System.out.println("6 : quitter "); 
                    }
                    else {
                        System.out.println("2 : quitter ");
                    }

         
                    int cm =sctmp.nextInt(); 
                    sctmp.nextLine();
                    
                    if(cm == 1){

                        le.trierList();
                        System.out.println(le.toString());
                        System.out.println("\nQue voulez-vous faire ?");
                        System.out.println("\n1 - visualiser la description d'un evenement");
                        System.out.println("2 - revenir au menu");

                        int ck = sctmp.nextInt();
                        sctmp.nextLine();

                        if(ck == 1 ){
                            System.out.println("Entrez le numero d'un evenement");
                            int cn = sctmp.nextInt();
                            sctmp.nextLine();
                            
                            if(cn>0 && cn<=le.liste.size()){
                                System.out.println(le.liste.get(cn-1).avecDescription());
                                if(le.liste.get(cn-1) instanceof Sondage){
                                    System.out.println("\n1 - Votez pour le sondage\n2 - Revenir au menu\n");
                                    int cf = sctmp.nextInt();
                                    sctmp.nextLine();
                                    if(cf == 1){
                                     
                                    }
                                        
                                }
                            }
                            else
                                System.out.println("Numero de l'evenement invalide\n");
                        }
                       System.out.println("appuyer sur entrée pour continuer");
                    }
                    else if(cm == 2 && log.EstAdmin()){
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
                            le.afficherCSV();
                        }                                
                    }
                     else if(cm ==3 && log.EstAdmin() ){
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
                            le.afficherCSV();
                            System.out.println("appuyer sur entrée pour continuer");
                        }                 
                    }else if(cm == 4 && log.EstAdmin()){
                        
                        System.out.println(le.toString());
                        System.out.println("Quelle événement voulait vous modifier?");
                        String name = sctmp.nextLine();
                        
                        if(le.nomDejaPresent(name)){
                            System.out.println("1: Modifier le nom");
                            System.out.println("2: Modifier la date de début (aaaa,mm,jj)");
                            System.out.println("3: Modifier la date de fin (aaaa,mm,jj)");
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
                                le.afficherCSV();
                            }else if(choix == 3){

                                System.out.println("Saisissez l'année :");
                                int aaaa = sctmp.nextInt();
                                System.out.println("Saisissez le mois :");
                                int m = sctmp.nextInt() -1;
                                 System.out.println("Saisissez le jour :");
                                int jj = sctmp.nextInt();
                                le.retourneEvenement(name).setDateFin(new GregorianCalendar(aaaa,m,jj));
                                le.afficherCSV();
                            }else if(choix == 4){

                                System.out.println("Entrée une nouvelle description : ");
                                String description = sctmp.nextLine();
                                le.retourneEvenement(name).setDescription(description);
                            }
                        }else{
                            System.out.println("Evénement introuvable!");
                     }                                              
                     
                    }
                     else if(cm == 5 && log.EstAdmin()){
                        System.out.println(" voulez vous créer vraiment un sondage ?");                        
                        System.out.println("1 :oui ");
                        System.out.println("2 :non ");
       
                        int r =sctmp.nextInt();          
                        sctmp.nextLine();

                        if(r == 1){
                            System.out.println("entrer le nom du sondage");                        
                            String name = sctmp.nextLine();
                            System.out.println("appuyer sur entrée pour continuer"); 
                            sctmp.nextLine();

                            Sondage e3 = new Sondage(name);
                            le.ajouterEvenement(e3);
                            System.out.println(le);
                        } 
                    }
                    else if (cm == 6 || (cm == 2 && !log.EstAdmin())){
                        System.exit(0);
                    }

                    sctmp.nextLine();
                }                                                   
            }
        }else{
            if(cl == 3){
                boolean estins =false;
                
                while(!estins){
                System.out.println("entrer le pseudo voulu :");
                String ipseu  = sctmp.nextLine();
                 System.out.println("appuyer sur entrée pour continuer");
                sctmp.nextLine();
                System.out.println("entrer le mdp voulu ( ne doit pas contenire le carractère ';' :");
                String imdp =sctmp.nextLine();
                
                Inscription inscription = new Inscription(ipseu, imdp);
                
                if(inscription.valformulaire(inscription)){
                    estins = true;
                }else{
                    System.out.println("pseudo ou mot de passe incorecte !");
                }
                
                }
                
                
            }else {
                if(cl == 4 ){
                   System.exit(0); 
                }
            }
            }
        }
        }
    }
}