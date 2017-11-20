
package projet;

public class manusous extends manuten implements nmmsublime {
   public manusous(String nom, String prenom, String matricule, String age,int date, double h){
       super(nom, prenom, matricule, age, date, h);
   
   } 
   public double calculerSalaire(){
       return(heure*65 + salairedebase);
       
   }
}
