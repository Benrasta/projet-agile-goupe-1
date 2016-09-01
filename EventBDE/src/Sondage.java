/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rucartt
 */
public class Sondage extends Evenement {
    
    private int compteur;
    
    Sondage(){
        super();
        compteur =0;
     }
    
    Sondage(String nom){
        super(nom);
        compteur =0;
    }
    Sondage(String nom, String description){
        super(nom,description);
        compteur =0;
    }
    
    public void ajouterPoint(){
        compteur ++;
    }
    
    public void supprimerPoint(){
        if(compteur >0)
            compteur --;        
    }
    
    public String toString(){
       return  super.toString();
        
    }
    
    public int getCompteur(){
        return compteur;
    }
}
