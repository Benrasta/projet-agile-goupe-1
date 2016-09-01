package bde;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import bde.Evenement;
import bde.ListEvenements;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author duquesnr
 */
public class ListEvenementsTest {
    
    public ListEvenementsTest() {
    }
    
  
    @Test
    public void testAjouterEvenement() {
        ListEvenements liste = new ListEvenements();
        liste.ajouterEvenement(new Evenement("nom",new GregorianCalendar(2016,8,31),new GregorianCalendar(2016,8,31),"desc"));
        assertEquals(1, liste.size());
        
        
    }
    
        @Test
    public void testAjouter2Evenements() {
        ListEvenements liste = new ListEvenements();
        liste.ajouterEvenement(new Evenement("vt1",new GregorianCalendar(2016,8,31),new GregorianCalendar(2016,8,31),"desc"));
        liste.ajouterEvenement(new Evenement("vt2",new GregorianCalendar(2016,8,31),new GregorianCalendar(2016,8,31),"desc"));
        assertEquals(2, liste.size());
        
        
    }
    
         @Test
    public void testnomDejaPresent() {
        ListEvenements liste = new ListEvenements();
        liste.ajouterEvenement(new Evenement("test"));
        liste.ajouterEvenement(new Evenement("test"));
        
        assertTrue(liste.nomDejaPresent("test"));
    }
    
    
      @Test
    public void testSupprimerEvenement() {
        ListEvenements liste = new ListEvenements();
        Evenement e2 = new Evenement();
        Evenement e1 = new Evenement();
        liste.ajouterEvenement(e2);
        assertEquals(1, liste.size());
        liste.supprimerEvenement(e2);
        assertEquals(0, liste.size());
    }
    
       @Test
    public void testAffichageEvenement() {
        ListEvenements liste = new ListEvenements();
        liste.ajouterEvenement(new Evenement("test",new GregorianCalendar(2016,8,3),new GregorianCalendar(2016,8,3),"desc"));
        liste.ajouterEvenement(new Evenement("test 2",new GregorianCalendar(2016,9,3),new GregorianCalendar(2016,9,3),"desc"));
        System.out.println(liste.toString());
        assertEquals("Evenement: test\ndate debut:3/8/2016\nEvenement: test 2\ndate debut:3/9/2016\n", liste.toString());
        System.out.println(liste.toString());
       
    }
    
    @Test
    public void testSupprimerEvenementAvecLeNom() {
        ListEvenements liste = new ListEvenements();
        Evenement e2 = new Evenement("test");
        liste.ajouterEvenement(new Evenement("test 1"));
        liste.ajouterEvenement(e2);
        assertEquals(2,liste.size());
        liste.supprimerEvenementAvecLeNom("test");
        assertEquals(1,liste.size());
    }
    
    
    
}
