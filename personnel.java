
package projet;

import java.util.List;
import java.util.ArrayList;

public class personnel {
private List<Employe> Liste;    

public personnel(){
    this.Liste=new ArrayList();
}

public double SalaireMoyen(){
    double a=0;
    int e=0;
        
    for(int i=0; i<Liste.size(); i++){
        a=Liste.get(i).calculerSalaire()+a;
        e++;
    }
        return(a/e);
    }
    
    public void calculerSalaire(){
        for(int i=0; i<Liste.size(); i++){
         System.out.println(Liste.get(i).getNom()+" a un salaire de "+ Liste.get(i).calculerSalaire()+" francs");
        }
    }
       public void ajouterEmploye(Employe e){
           Liste.add(e);
       }
       
}
