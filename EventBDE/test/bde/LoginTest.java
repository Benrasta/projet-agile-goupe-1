package bde;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bde.Login;
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
    @Test
    public void testequalsL(){
        Login l = new  Login("t1", "t1");
        Login l2 = new  Login("t1", "t1");
        assertTrue(l.equalsL(l2));
    }    
    
    @Test
    public void testVerifier() {
        Login login = new Login("admin", "admin");
        assertTrue(login.verifier());
    }
     @Test
    public void testVerifier2() {
        Login login1 = new Login("root", "root");
        //System.out.println(login1.getmdp()+" "+ login1.getpseudo());
        assertTrue(login1.verifier());
    }
     @Test
    public void testVerifier3() {
        Login login2 = new Login("yolo", "yolo");
         assertFalse(login2.verifier());
      
    }
}

