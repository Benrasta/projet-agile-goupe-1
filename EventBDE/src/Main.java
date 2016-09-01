
import java.util.Calendar;
import java.util.GregorianCalendar;

//Audrey

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author boreec
 */
public class Main {
    public static void main(String args[]){
        Evenement e =new Evenement("yolo", "on va faire du yolo swag");
        Calendar date = new GregorianCalendar(2017,2,20);
        Evenement e2 =new Evenement("soiré frite",date ,date , "on va faire une frite chez momo");
         ListEvenements le =new ListEvenements();
         le.ajouterEvenement(e);
         le.ajouterEvenement(e2);
         System.out.println(le.toString());
        
        
    }
}
