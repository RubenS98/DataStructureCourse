/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercambio;

/**
 *
 * @author thepo
 */
public class Intercambio {

    protected static void intercambioFNacimiento(PersonaI[] lp){
        for (int i = 0; i < lp.length - 1; i++) {
            for (int j = i+1; j < lp.length; j++) {
                PersonaI p1 = lp[i];
                PersonaI p2 = lp[j];
                if(p1.getfNacimiento()> p2.getfNacimiento()){
                    lp[i] = p2;
                    lp[j] = p1;
                }
            }
            
        }
    }
    
    protected static void intercambioAPaterno(PersonaI[] lp){
        for (int i = 0; i < lp.length - 1; i++) {
            for (int j = i+1; j < lp.length; j++) {
                PersonaI p1 = lp[i];
                PersonaI p2 = lp[j];
                if(p1.getaP().compareToIgnoreCase(p2.getaP())>0){
                    lp[i] = p2;
                    lp[j] = p1;
                }
            }
            
        }
    }
    
    protected static void intercambioAMaterno(PersonaI[] lp){
        for (int i = 0; i < lp.length - 1; i++) {
            for (int j = i+1; j < lp.length; j++) {
                PersonaI p1 = lp[i];
                PersonaI p2 = lp[j];
                if(p1.getaM().compareToIgnoreCase(p2.getaM())>0){
                    lp[i] = p2;
                    lp[j] = p1;
                }
            }
            
        }
    }
    
    protected static void intercambioNombre(PersonaI[] lp){
        for (int i = 0; i < lp.length - 1; i++) {
            for (int j = i+1; j < lp.length; j++) {
                PersonaI p1 = lp[i];
                PersonaI p2 = lp[j];
                if(p1.getNombre().compareToIgnoreCase(p2.getNombre())>0){
                    lp[i] = p2;
                    lp[j] = p1;
                }
            }
            
        }
    }
    
    protected static void intercambioTelefono(PersonaI[] lp){
        for (int i = 0; i < lp.length - 1; i++) {
            for (int j = i+1; j < lp.length; j++) {
                PersonaI p1 = lp[i];
                PersonaI p2 = lp[j];
                if(p1.getTelefono().compareToIgnoreCase(p2.getTelefono())>0){
                    lp[i] = p2;
                    lp[j] = p1;
                }
            }
            
        }
    }
}
