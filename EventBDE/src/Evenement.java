
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author boreec
 */
public class Evenement {
    private String nom;
    private Calendar dateDebut;
    private Calendar dateFin;
    private String description;
    
    public Evenement(){
    }
    
    public Evenement(String nom){
        this();
        this.nom = nom;
    }
    
    public Evenement(String nom, String description){
        this(nom);
        this.description = description;
    }
    
    public Evenement(String nom, Calendar dateDebut, Calendar dateFin, String description) {
        this(nom);
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.description = description;
    }
    
    public String getNom() {
        return nom;
    }

    public Calendar getDateDebut() {
        return dateDebut;
    }

    public Calendar getDateFin() {
        return dateFin;
    }

    public String getDescription() {
        return description;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDateDebut(Calendar dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Calendar dateFin) {
        this.dateFin = dateFin;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String toString(){
        String returnMessage = "";
        returnMessage += "Evenement: " + nom + "\n";
        if(dateDebut != null){
            returnMessage += "date debut:" + dateFormat(dateDebut); 
        }
        if(dateFin != null){
            returnMessage += "date fin: " + "\n" + dateFormat(dateFin);
        }
        if(description != null){
         returnMessage += description + "\n" ;   
        }
        return returnMessage;
    }
    
    
    public String dateFormat(Calendar date){
        String message = "";
        message += date.DAY_OF_MONTH + "/" + date.MONTH + "/" + date.YEAR;
        return message;
    }
    
}
