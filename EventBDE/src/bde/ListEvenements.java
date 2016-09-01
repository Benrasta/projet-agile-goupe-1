package bde;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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
        if(e.getDateDebut()!=null){
            boolean var = false;            
            List<Evenement> liste2 = liste;
             if(liste.isEmpty()){
                liste.add(e);
            }
             else {
                liste.add(e);
                int o = liste.size();
                for(int j=0; j<o;j++){
                    if(liste.get(j).getDateDebut().before(e.getDateDebut()) || var){
                            liste2.add(liste.get(j));
                    }
                    else {
                        liste2.add(e);
                        liste2.add(liste.get(j));
                        var=true;
                    }
                }
                
            }
        } 
         else{
            if(!nomDejaPresent(e.getNom())){
                liste.add(e);
            }else{
                System.out.println("Nom déjà pris !!");
            }
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
  public Evenement retourneEvenement(String nom){
        for(int i = 0; i<liste.size();i++){
            if(liste.get(i).getNom().equals(nom)){
                return liste.get(i);
            }
        }
        return null;
    }
        /**
     * Affiche le contenu d'un fichier CSV vers l'entree standard
     */
    public void afficherCSV(){
        String fichier = "evenement.csv";
        String line = "";
        String separateur = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(fichier))) {

            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] data = line.split(separateur);
                System.out.println("evenement: " + data[0] + " debut: " + data[1] + " fin: " + data[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


