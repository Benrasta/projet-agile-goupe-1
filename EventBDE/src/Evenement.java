
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
    
    
}
