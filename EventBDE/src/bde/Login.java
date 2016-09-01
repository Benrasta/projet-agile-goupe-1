package bde;

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
    private boolean log;
    
    public Login (String pseudo ,String mdp){
        this.log =false;
        this.pseudo=pseudo;
        this.mdp=mdp;
        
    }
    
    public String getpseudo(){
        return pseudo;
    }
     public String getmdp(){
        return pseudo;
    }
    public void setPseudo(String np){
        this.pseudo=np;
    }
    
        public void setmdp(String nmdp){
        this.mdp=nmdp;
    }
        
        public void verifier(){
            
        }
}
