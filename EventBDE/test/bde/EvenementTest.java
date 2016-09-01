package bde;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bde.Evenement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author lorietta
 */
public class EvenementTest {

    /**
     * Test of getNom method, of class Evenement.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Evenement instance = new Evenement("test", "test");
        String expResult = "test";
        String result = instance.getNom();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDateDebut method, of class Evenement.
     */
    @Test
    public void testGetDateDebut() {
        System.out.println("getDateDebut");
        Evenement instance = new Evenement("test", new GregorianCalendar(2016,8,10,10,0), new GregorianCalendar(2016,8,10,10,0), "test");
        Calendar expResult = new GregorianCalendar(2016,8,10,10,0);
        Calendar result = instance.getDateDebut();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDateFin method, of class Evenement.
     */
    @Test
    public void testGetDateFin() {
        System.out.println("getDateFin");
        Evenement instance = new Evenement("test", new GregorianCalendar(2016,8,10,10,0), new GregorianCalendar(2016,8,10,10,0), "test");
        Calendar expResult = new GregorianCalendar(2016,8,10,10,0);
        Calendar result = instance.getDateFin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class Evenement.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Evenement instance = new Evenement();
        instance.setDescription("test");
        String expResult = "test";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNom method, of class Evenement.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "test";
        Evenement instance = new Evenement();
        instance.setNom(nom);
        assertEquals(instance.getNom(), "test");
    }

    /**
     * Test of setDateDebut method, of class Evenement.
     */
    @Test
    public void testSetDateDebut() {
        System.out.println("setDateDebut");
        Calendar dateDebut = new GregorianCalendar(2016,8,10,10,0);
        Evenement instance = new Evenement();
        instance.setDateDebut(dateDebut);
        assertEquals(instance.getDateDebut(), new GregorianCalendar(2016,8,10,10,0));
    }

    /**
     * Test of setDateFin method, of class Evenement.
     */
    @Test
    public void testSetDateFin() {
       System.out.println("setDateFin");
        Calendar dateFin = new GregorianCalendar(2016,8,10,10,0);
        Evenement instance = new Evenement();
        instance.setDateFin(dateFin);
        assertEquals(instance.getDateFin(), new GregorianCalendar(2016,8,10,10,0));
    }

    /**
     * Test of setDescription method, of class Evenement.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "test";
        Evenement instance = new Evenement();
        instance.setDescription(description);
        assertEquals(instance.getDescription(), "test");
    }

    /**
     * Test of toString method, of class Evenement.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Evenement instance = new Evenement("nom", "desc");
        String expResult = "Evenement: nom\n";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of avecDescription method, of class Evenement.
     */
    @Test
    public void testAvecDescription() {
        System.out.println("avecDescription");
        Evenement instance = new Evenement("nom", "desc");
        String expResult = "Evenement: nom\ndescription: desc\n";
        String result = instance.avecDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of dateFormat method, of class Evenement.
     */
    @Test
    public void testDateFormat() {
        System.out.println("dateFormat");
        Calendar date = new GregorianCalendar(2016,8,10,10,0);
        Evenement instance = new Evenement();
        String expResult = "10/8/2016";
        String result = instance.dateFormat(date);
        assertEquals(expResult, result);
    }
    
}
