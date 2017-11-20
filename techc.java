
package projet;


public class techc extends Employe {
     protected double unite;
     
     public techc(String nom, String prenom, String matricule, String age,int date, double v){
         super( nom, prenom, matricule, age, date);
         unite=v;
     }
        
        public double calculerSalaire(){
          return((unite*5) + salairedebase );
        
    }
        
}
