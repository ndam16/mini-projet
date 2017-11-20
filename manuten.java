
package projet;


public class manuten extends Employe{ 

    protected double heure;

    public manuten(String nom, String prenom, String matricule, String age,int date, double h){
        super( nom, prenom, matricule, age, date);
        heure=h;
} 
public double calculerSalaire(){
        return(heure*65 + salairedebase);
        
    }
}