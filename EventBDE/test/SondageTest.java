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
        Sondage instance = new Sondage("test","test");
        String expResult = "Evenement: test\nnombre de vote(s) pour : 0\n";
        String result = instance.toString();
        assertEquals(expResult, result);
        System.out.println(result+"lol");
        
        
        Sondage s1 = new Sondage("test");
        String res1 = "Evenement: test\nnombre de vote(s) pour : 0\n";
        String result1 = s1.toString();
        assertEquals(result1, res1);    
    }        
}
