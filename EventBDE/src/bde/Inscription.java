/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bde;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author holquinb
 */
public class Inscription {
    private String nom;
    private String mdp;
    
    
    
    
    public Inscription(String nom,String mdp){
        this.nom=nom;
        this.mdp= mdp;
        
    }
    
    public boolean valformulaire(Inscription ins){
        ArrayList<Inscription> li = new ArrayList<>();
        
        try {
            
            String csv = "logins.csv";
            BufferedReader fichierlog= new BufferedReader(new FileReader(csv));
            String chaine;
            
           
            
            while((chaine = fichierlog.readLine())!= null){
            
                String[] tabligne= chaine.split(",");
                li.add(new Inscription(tabligne[0], tabligne[1]));
                
            }
            fichierlog.close();
            
            
            
        } catch (IOException ex) {
            
        }
        boolean valid = true;
         
        for(Inscription i : li){
            if(ins.getlnom().equals(i.getlnom()) && ins.getlmdp().contains(",")){
                valid=false;
            }
        }
        
        if(valid){
            li.add(ins);
            try{
                File save = new File("logins.csv");
                FileWriter s = new FileWriter(save);
		String res ="";
                for(Inscription i : li){
                    res=i.getlnom()+","+i.getlmdp()+"\n";
                }
			
			
		s.write(res);
		s.close();
                
                
                
            }catch (IOException exe){
                
            }
            
        }
        
        
        
        return valid;
    }
    
    
    
    public String getlnom(){
        return this.nom;
    }
     public String getlmdp(){
        return this.mdp;
    }
    
    
    
}
