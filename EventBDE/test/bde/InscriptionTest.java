/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bde;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author holquinb
 */
public class InscriptionTest {
    
    public InscriptionTest() {
    }
    
   
    @Test
    public void testval(){
        Inscription i = new Inscription("admin", "admin");
        assertFalse(i.valformulaire(i));
        
        
    }
    @Test
    public void testval2(){
        Inscription i = new Inscription("juanito", "admin");
        assertTrue(i.valformulaire(i));
        
        
    }
     @Test
    public void testvalmdp(){
        Inscription i = new Inscription("yolo", "adm,in");
        assertFalse(i.valformulaire(i));
        
        
    }
    
    
}
