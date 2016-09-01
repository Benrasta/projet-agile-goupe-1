/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rucartt
 */
public class SondageTest {
    
    public SondageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ajouterPoint method, of class Sondage.
     */
    @Test
    public void testAjouterPoint() {
        System.out.println("ajouterPoint");
        Sondage instance = new Sondage();
        assertEquals(0,instance.getCompteur());
        instance.ajouterPoint();        
        assertEquals(1,instance.getCompteur());        
        instance.ajouterPoint();
        assertEquals(2,instance.getCompteur());
                
    }

    /**
     * Test of supprimerPoint method, of class Sondage.
     */
    @Test
    public void testSupprimerPoint() {
        System.out.println("supprimerPoint");
        Sondage instance = new Sondage();
        assertEquals(0,instance.getCompteur());
        instance.ajouterPoint();        
        assertEquals(1,instance.getCompteur());                        
        instance.supprimerPoint();
        assertEquals(0,instance.getCompteur());                        
        instance.supprimerPoint();
        assertEquals(0,instance.getCompteur());   
    }

    /**
     * Test of toString method, of class Sondage.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Sondage instance = new Sondage();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

 
}
