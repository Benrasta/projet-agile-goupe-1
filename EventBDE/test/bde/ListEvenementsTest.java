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
        liste.ajouterEvenement(new Evenement());
        liste.ajouterEvenement(e2);
        assertEquals(2, liste.size());
        liste.supprimerEvenement(e2);
        assertEquals(1, liste.size());
    }
    
       @Test
    public void testAffichageEvenement() {
        ListEvenements liste = new ListEvenements();
        Evenement e2 = new Evenement("test",new GregorianCalendar(2016,8,31),new GregorianCalendar(2016,8,31),"desc");
        liste.ajouterEvenement(new Evenement("test 2",new GregorianCalendar(2016,9,31),new GregorianCalendar(2016,9,31),"desc"));
        liste.ajouterEvenement(e2);
        System.out.println(liste.toString());
        assertEquals("Evenement: test\ndate debut:31/8/2016\nEvenement: test 2\ndate debut:31/9/2016", liste.toString());
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
