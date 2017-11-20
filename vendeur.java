
package projet;


public class vendeur extends commercial {
    
    public vendeur(String nom, String prenom, String matricule, String age, int date, double chiffredaffaire){
        super(nom, prenom, matricule, age, date);
        this.chiffredaffaire = chiffredaffaire;
    }
    public double calculerSalaire(){
        return((salairedebase + 0.2*(chiffredaffaire)) + 100);
    }
       
    
}
