
package projet;

public class representant extends commercial{
     public representant(String nom, String prenom, String matricule, String age,int date, double chiffredaffaire){
        super(nom, prenom, matricule, age, date);
        this.chiffredaffaire = chiffredaffaire;
    }
     public double calculerSalaire(){
          return((salairedebase + 0.2*(chiffredaffaire)) + 200);
     }
         
     
}
