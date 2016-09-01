/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
        Evenement instance = new Evenement();
        Calendar expResult = null;
        Calendar result = instance.getDateDebut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateFin method, of class Evenement.
     */
    @Test
    public void testGetDateFin() {
        System.out.println("getDateFin");
        Evenement instance = new Evenement();
        Calendar expResult = null;
        Calendar result = instance.getDateFin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Evenement.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Evenement instance = new Evenement();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Evenement.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Evenement instance = new Evenement();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateDebut method, of class Evenement.
     */
    @Test
    public void testSetDateDebut() {
        System.out.println("setDateDebut");
        Calendar dateDebut = null;
        Evenement instance = new Evenement();
        instance.setDateDebut(dateDebut);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateFin method, of class Evenement.
     */
    @Test
    public void testSetDateFin() {
        System.out.println("setDateFin");
        Calendar dateFin = null;
        Evenement instance = new Evenement();
        instance.setDateFin(dateFin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Evenement.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Evenement instance = new Evenement();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Evenement.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Evenement instance = new Evenement();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of avecDescription method, of class Evenement.
     */
    @Test
    public void testAvecDescription() {
        System.out.println("avecDescription");
        Evenement instance = new Evenement();
        String expResult = "";
        String result = instance.avecDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dateFormat method, of class Evenement.
     */
    @Test
    public void testDateFormat() {
        System.out.println("dateFormat");
        Calendar date = null;
        Evenement instance = new Evenement();
        String expResult = "";
        String result = instance.dateFormat(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
