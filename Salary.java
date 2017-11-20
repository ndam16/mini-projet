
package projet;


public class Salary {

    public static void main(String[] args) {
        personnel p=new personnel();
        techc a=new techc("ndam","mouhamed","16b018fs","20 ans", 2016, 5000);
        manuten b=new manuten("don","divin","16b005fs","20 ans",2016, 100);
        techcsous c=new techcsous("tsinda","ismael","12a631fs","25 ans",2012, 150);
        manusous d=new manusous("tbak","derozan","16f347eg","20 ans",2016, 200);
        vendeur e=new vendeur("NMM","sublime","16a017fs","19 ans",2017, 1000);
        p.SalaireMoyen();
        p.ajouterEmploye(e);
        p.calculerSalaire();       
        p.SalaireMoyen();
        p.ajouterEmploye(d);
        p.calculerSalaire();
        p.SalaireMoyen();
        p.calculerSalaire();
        p.ajouterEmploye(c);
        p.ajouterEmploye(a);
        p.calculerSalaire();
        p.SalaireMoyen();
        p.ajouterEmploye(b);
        p.calculerSalaire();
        p.SalaireMoyen();
        
    }
    
}
