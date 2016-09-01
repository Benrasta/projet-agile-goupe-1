package bde;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lorietta
 */
public class ListEvenements {
    List<Evenement> liste = new ArrayList();
    
    
    
    public void ajouterEvenement(Evenement e){
        liste.add(e);
    }
    
    public void supprimerEvenement(Evenement e){
        liste.remove(e);
    }
    
    public String toString(){
        String affichage = "";
        for(int i=0; i<liste.size();i++){
            affichage += liste.get(i).toString();
        }
        
        
    return affichage;
    }
    
    public void supprimerEvenementAvecLeNom(String nom){
        for(int i = 0; i<liste.size();i++){
            if(liste.get(i).getNom().equals(nom)){
                liste.remove(i);
            }
        }
    } 

    public int size(){
        return liste.size();
    }

}

