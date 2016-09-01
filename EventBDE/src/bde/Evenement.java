package bde;


import java.util.Calendar;
import java.util.GregorianCalendar;

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
        nom = "";
        description = "";
        dateDebut = new GregorianCalendar();
        dateFin = new GregorianCalendar();
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
            returnMessage += "date debut:" + dateFormat(dateDebut) + "\n"; 
        }
        if(dateFin != null && dateFin != dateDebut){
            returnMessage += "date fin: " + dateFormat(dateFin) + "\n";
        }
        return returnMessage;
    }
    
    public String avecDescription(){
        return this.toString() + "description: " + this.description + "\n";
    }
    
    /**
     *  Retourne une string de la date sous la forme jj/mm/yyyy
     *  @param date La date que l'on souhaite formater
     * 
     * */
    public String dateFormat(Calendar date){
        String message = "";
        message += date.get(GregorianCalendar.DAY_OF_MONTH) + "/" + date.get(GregorianCalendar.MONTH) + "/" + date.get(GregorianCalendar.YEAR);
        return message;
    }
    
    
    
}
