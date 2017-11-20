package projet;


public class  commercial extends Employe  {
    protected double chiffredaffaire;
    public commercial(String nom, String prenom, String matricule, String age, int date){
        super( nom, prenom, matricule, age, date);
        
    }
    public double calculerSalaire(){
        return(salairedebase + 0.2*(chiffredaffaire));
        
    }
}
