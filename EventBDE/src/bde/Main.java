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
         System.out.println(le.toString());
        
         
         System.out.println(" voulez vous crée un  évenement ?");
         System.out.println("1 :oui ");
         System.out.println("2 :non ");
       
         
         Scanner sctmp = new Scanner(System.in);
         int r =sctmp.nextInt(); 
         
        sctmp.nextLine();
         if(r == 1){
             System.out.println("entrer le nom de l'evenement");
             
           
               String name = sctmp.nextLine();
               sctmp.close();
           
             Evenement e3 = new Evenement(name);
             le.ajouterEvenement(e3);
         }
         
        
         System.out.println(" voulez vous suprimer un  évenement ?");
         System.out.println("1 :oui ");
         System.out.println("2 :non ");
        
    }
}
