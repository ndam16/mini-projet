
package projet;


public abstract class    Employe {
    private String nom;
    private String prenom;
    private String age;
    private String matricule;
    private int date;
    protected static double  salairedebase = 110000;
   
    public abstract double calculerSalaire();
   
    public String getNom(){
       
       return("L employe " + nom +" "+ prenom +" "+ age +" "+ date +" "+ matricule);}
        public Employe(String nom, String prenom, String matricule, String age, int date){
            this.nom = nom;
            this.prenom = prenom;
            this.matricule = matricule;
            this.age = age;
            this.date = date;
        }
   public double getSalaire(){
       return salairedebase;
   }
       
       
   
   
    
}
