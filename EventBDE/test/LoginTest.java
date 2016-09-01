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
 * @author HOLQUIN  Benjamin ,AVANESSOVA Mariam
 */
public class LoginTest {
    
    public LoginTest() {
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
     * Test of getpseudo method, of class Login.
     */
    @Test
    public void testGetpseudo() {
        System.out.println("getpseudo");
        Login instance = null;
        String expResult = "";
        String result = instance.getpseudo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getmdp method, of class Login.
     */
    @Test
    public void testGetmdp() {
        System.out.println("getmdp");
        Login instance = null;
        String expResult = "";
        String result = instance.getmdp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPseudo method, of class Login.
     */
    @Test
    public void testSetPseudo() {
        System.out.println("setPseudo");
        String np = "";
        Login instance = null;
        instance.setPseudo(np);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setmdp method, of class Login.
     */
    @Test
    public void testSetmdp() {
        System.out.println("setmdp");
        String nmdp = "";
        Login instance = null;
        instance.setmdp(nmdp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
