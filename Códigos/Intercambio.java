package intercambio;

import java.util.ArrayList;

public class Intercambio {

    protected static void intercambioFNacimiento(ArrayList<PersonaI> lp){
        for (int i = 0; i < lp.size() - 1; i++) {
            for (int j = i+1; j < lp.size(); j++) {
                PersonaI p1 = lp.get(i);
                PersonaI p2 = lp.get(j);
                if(p1.getfNacimiento()> p2.getfNacimiento()){
                    lp.set(i, p2);
                    lp.set(j, p1);
                }
            }
            
        }
    }
    
    protected static void intercambioAPaterno(ArrayList<PersonaI> lp){
        for (int i = 0; i < lp.size() - 1; i++) {
            for (int j = i+1; j < lp.size(); j++) {
                PersonaI p1 = lp.get(i);
                PersonaI p2 = lp.get(j);
                if(p1.getaP().compareToIgnoreCase(p2.getaP())>0){
                    lp.set(i, p2);
                    lp.set(j, p1);
                }
            }
            
        }
    }
    
    protected static void intercambioAMaterno(ArrayList<PersonaI> lp){
        for (int i = 0; i < lp.size() - 1; i++) {
            for (int j = i+1; j < lp.size(); j++) {
                PersonaI p1 = lp.get(i);
                PersonaI p2 = lp.get(j);
                if(p1.getaM().compareToIgnoreCase(p2.getaM())>0){
                    lp.set(i, p2);
                    lp.set(j, p1);
                }
            }
            
        }
    }
    
    protected static void intercambioNombre(ArrayList<PersonaI> lp){
        for (int i = 0; i < lp.size() - 1; i++) {
            for (int j = i+1; j < lp.size(); j++) {
                PersonaI p1 = lp.get(i);
                PersonaI p2 = lp.get(j);
                if(p1.getNombre().compareToIgnoreCase(p2.getNombre())>0){
                    lp.set(i, p2);
                    lp.set(j, p1);
                }
            }
            
        }
    }
    
    protected static void intercambioTelefono(ArrayList<PersonaI> lp){
        for (int i = 0; i < lp.size() - 1; i++) {
            for (int j = i+1; j < lp.size(); j++) {
                PersonaI p1 = lp.get(i);
                PersonaI p2 = lp.get(j);
                if(p1.getTelefono().compareToIgnoreCase(p2.getTelefono())>0){
                    lp.set(i, p2);
                    lp.set(j, p1);
                }
            }
            
        }
    }
}
