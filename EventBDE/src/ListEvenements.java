
import java.util.ArrayList;

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
    ArrayList<Evenement> liste = new ArrayList();
    
    
    
    public void ajouterEvenement(Evenement e){
        liste.add(e);
    }
    
    public void supprimerEvenement(Evenement e){
        liste.remove(e);
    }

      public int size(){
        return liste.size();
    }

}

