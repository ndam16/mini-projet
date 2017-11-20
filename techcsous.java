
package projet;

public class techcsous extends techc implements nmmsublime{
    
    public techcsous(String nom,String prenom, String matricule, String age,int date, double i){
        super(nom, prenom, matricule, age, date, i);
        
    }
    
    public double calculerSalaire(){
        return(((unite*5) + salairedebase)+prime);
    }
   
}

 

