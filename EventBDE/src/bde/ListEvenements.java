package bde;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
         if(!nomDejaPresent(e.getNom())){
             try {
                 liste.add(e);
                 listToCSV();
             } catch (FileNotFoundException ex) {
                 Logger.getLogger(ListEvenements.class.getName()).log(Level.SEVERE, null, ex);
             }
        }else{
            System.out.println("Nom déjà pris !!");
        }
      
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
    
       public boolean nomDejaPresent(String nom){
        for(int i = 0; i<liste.size();i++){
            if(liste.get(i).getNom().equals(nom)){
                return true;
            }
        }
        return false;
    }
       
        public Evenement retourneEvenement(String nom){
        for(int i = 0; i<liste.size();i++){
            if(liste.get(i).getNom().equals(nom)){
                return liste.get(i);
            }
        }
        return null;
    }
    public void trierList(){
        List<Evenement> liste2 = new ArrayList();
        int cpt=0;
        int size = liste.size();
        while(!liste.isEmpty()){
            for(int i=0 ; i<liste.size() ;i++){
                if(liste.get(i).getDateDebut().before(liste.get(cpt).getDateDebut())){
                    cpt = i;
                }
            }
            liste2.add(liste.get(cpt));
            liste.remove(cpt);
            cpt=0;
        }
        liste = liste2;
    }   
    
    public void listToCSV() throws FileNotFoundException{
        String fichier = "evenement.csv";
        boolean fichierExisteDeja = new File(fichier).exists();
        
        StringBuilder sb = new StringBuilder();
        try {
            PrintWriter pw = new PrintWriter(new File(fichier));
            // si le fichier n'existe pas encore
            if (!fichierExisteDeja){
                sb.append("nom");
                sb.append(',');
                sb.append("debut");
                sb.append(",");
                sb.append("fin");
                sb.append(",");
                sb.append("description");
                sb.append('\n');
            }
            for(int i=0; i<liste.size();i++){
                sb.append(liste.get(i).getNom());
                sb.append(",");
                sb.append(liste.get(i).dateFormat(liste.get(i).getDateDebut()));
                sb.append(",");
                sb.append(liste.get(i).dateFormat(liste.get(i).getDateFin()));
                sb.append(",");
                sb.append(liste.get(i).getDescription());
                sb.append("\n");
            }
            pw.write(sb.toString());
            pw.close();
            
	} catch (IOException e) {
            e.printStackTrace();
	}
    }

}

