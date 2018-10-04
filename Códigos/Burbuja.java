package intercambio;

import java.util.ArrayList;

public class Burbuja {
    protected static void burbujaFNacimiento(ArrayList<PersonaI> lp){
        int pos;
        for (int i = 0; i < lp.size(); i++) {
            pos=i;
            for (int j = 0; j < (lp.size()-i-1); j++) {
                if(lp.get(j).getfNacimiento()>lp.get(j+1).getfNacimiento()){
                    PersonaI p1=lp.get(j);
                    lp.remove(j);
                    lp.add(j+1, p1);
                }
            }
        }
    }
    
    protected static void burbujaAPaterno(ArrayList<PersonaI> lp){
        int pos;
        for (int i = 0; i < lp.size(); i++) {
            pos=i;
            for (int j = 0; j < (lp.size()-i-1); j++) {
                if(lp.get(j).getaP().compareToIgnoreCase(lp.get(j+1).getaP())>0){
                    PersonaI p1=lp.get(j);
                    lp.remove(j);
                    lp.add(j+1, p1);
                }
            }
        }
    }
    
    protected static void burbujaAMaterno(ArrayList<PersonaI> lp){
        int pos;
        for (int i = 0; i < lp.size(); i++) {
            pos=i;
            for (int j = 0; j < (lp.size()-i-1); j++) {
                if(lp.get(j).getaM().compareToIgnoreCase(lp.get(j+1).getaM())>0){
                    PersonaI p1=lp.get(j);
                    lp.remove(j);
                    lp.add(j+1, p1);
                }
            }
        }
    }
    
    protected static void burbujaNombre(ArrayList<PersonaI> lp){
        int pos;
        for (int i = 0; i < lp.size(); i++) {
            pos=i;
            for (int j = 0; j < (lp.size()-i-1); j++) {
                if(lp.get(j).getNombre().compareToIgnoreCase(lp.get(j+1).getNombre())>0){
                    PersonaI p1=lp.get(j);
                    lp.remove(j);
                    lp.add(j+1, p1);
                }
            } 
        }
    }
    
    protected static void burbujaTel(ArrayList<PersonaI> lp){
        int pos;
        for (int i = 0; i < lp.size(); i++) {
            pos=i;
            for (int j = 0; j < (lp.size()-i-1); j++) {
                if(lp.get(j).getTelefono().compareToIgnoreCase(lp.get(j+1).getTelefono())>0){
                    PersonaI p1=lp.get(j);
                    lp.remove(j);
                    lp.add(j+1, p1);
                }
            }
        }
    }
}
