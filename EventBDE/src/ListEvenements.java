
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
            affichage += liste.get(i).toString()+"\n";
        }
        
        
    return affichage;
    }
    
    public void modifierEvenement(Evenement e, String nom, String description){}

    public int size(){
        return liste.size();
    }

}

