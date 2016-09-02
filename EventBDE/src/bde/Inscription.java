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
import java.io.PrintWriter;
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
            
                String[] tabligne= chaine.split(";");
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
              try{
                StringBuilder sb = new StringBuilder();
                String csv = "logins.csv";
                PrintWriter pw = new PrintWriter(new File(csv));
                for(int i =0 ; i< li.size();i++){
                    sb.append(li.get(i).getlnom());
                    sb.append(";");
                    sb.append(li.get(i).getlmdp());
                    sb.append("\n");
                }
		sb.append(ins.getlnom());
                sb.append(";");
                sb.append(ins.getlmdp());
                sb.append("\n");
                pw.write(sb.toString());
                pw.close();
           
                
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
