/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
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
    public void testAjouter() {
        ListEvenements liste = new ListEvenements();
        liste.ajouterEvenement(new Evenement());
        assertEquals(1, liste.size());
    }
    
}
