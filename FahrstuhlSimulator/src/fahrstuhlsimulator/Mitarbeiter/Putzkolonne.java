/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrstuhlsimulator.Mitarbeiter;
import java.util.ArrayList;
import fahrstuhlsimulator.Gebaeude.Etage;
/**
 *
 * @author schueler
 */
public class Putzkolonne extends Mitarbeiter{
      public Putzkolonne(String name) {   
        super(name);
        ArrayList<String> liste = new ArrayList();
        liste.add("EG");
        liste.add("Cafeteria");
        liste.add("Bibliothek");
        liste.add("Test");
        liste.add("Entwicklung");
        liste.add("Besprechung");
        liste.add("IT");
        setErlaubteEtagen(liste); 
    }
    
}
