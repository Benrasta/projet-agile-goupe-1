package bde;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author HOLQUIN  Benjamin ,AVANESSOVA Mariam
 */
public class Login {
    private String pseudo;
    private String mdp;
   // private boolean log;
    
    
    
    
    public Login (String pseudo ,String mdp){
     //   this.log =false;
        this.pseudo=pseudo;
        this.mdp=mdp;
        
    }
    
    public String getpseudo(){
        return pseudo;
    }
     public String getmdp(){
        return mdp;
    }
    public void setPseudo(String np){
        this.pseudo=np;
    }
    
    public void setmdp(String nmdp){
        this.mdp=nmdp;
    }
        
    public boolean verifier(){

        ArrayList<Login> list =new ArrayList<>();
        try {
            
            String csv = "logins.csv";
            BufferedReader fichierlog= new BufferedReader(new FileReader(csv));
            String chaine;
            
           
            
            while((chaine = fichierlog.readLine())!= null){
            
                String[] tabligne= chaine.split(",");
                list.add(new Login(tabligne[0], tabligne[1]));
                
            }
            fichierlog.close();
            
            
            
        } catch (IOException ex) {
            
        }
        for(int i =0 ; i < list.size(); i++){
            
                if(this.equalsL(list.get(i))){
                    return true;
                }
        }
        return false;
    }
    
    public boolean equalsL(Login log){
        if(this.mdp.equals(log.getmdp()) && this.pseudo.equals(log.getpseudo())){
            return true;
        }
        return false;
    }
}
