package bde;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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
    
    
    public void setcompteur(int cpt){
        this.compteur=cpt;
    }
    
    public void supprimerPoint(){
        if(compteur >0)
            compteur --;        
    }
    
    public String toString(){
       return  super.toString()+"nombre de vote(s) pour : "+compteur+"\n"; 
        
    }
    
  
    
    
    public int getCompteur(){
        return compteur;
    }
}
