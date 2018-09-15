/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intercambio;

import java.util.ArrayList;

/**
 *
 * @author thepo
 */
public class Seleccion {
    protected static void seleccionFNacimiento(ArrayList<PersonaI> lp){
        int pos;
        for (int i = 0; i < lp.size()-1; i++) {
            PersonaI p1 = lp.get(i);
            pos=i;
            for (int j = i+1; j < lp.size(); j++) {
                if(p1.getfNacimiento()>lp.get(j).getfNacimiento()){
                    p1=lp.get(j);
                    pos=j;
                }
                
            }
            lp.remove(pos);
            lp.add(0+i, p1);
            
        }
    }
    
    protected static void seleccionAPaterno(ArrayList<PersonaI> lp){
        int pos;
        for (int i = 0; i < lp.size()-1; i++) {
            PersonaI p1 = lp.get(i);
            pos=i;
            for (int j = i+1; j < lp.size(); j++) {
                if(p1.getaP().compareToIgnoreCase(lp.get(j).getaP())>0){
                    p1=lp.get(j);
                    pos=j;
                }
            }
            lp.remove(pos);
            lp.add(0+i, p1);
        }
    }
    
    protected static void seleccionAMaterno(ArrayList<PersonaI> lp){
        int pos;
        for (int i = 0; i < lp.size() - 1; i++) {
            PersonaI p1 = lp.get(i);
            pos=i;
            for (int j = i+1; j < lp.size(); j++) {
                if(p1.getaM().compareToIgnoreCase(lp.get(j).getaM())>0){
                    p1=lp.get(j);
                    pos=j;
                }
            }
            lp.remove(pos);
            lp.add(0+i, p1);
        }
    }
    
    protected static void seleccionNombre(ArrayList<PersonaI> lp){
        int pos;
        for (int i = 0; i < lp.size() - 1; i++) {
            PersonaI p1 = lp.get(i);
            pos=i;
            for (int j = i+1; j < lp.size(); j++) {
                if(p1.getNombre().compareToIgnoreCase(lp.get(j).getNombre())>0){
                    p1=lp.get(j);
                    pos=j;
                }
            }
            lp.remove(pos);
            lp.add(0+i, p1);
        }
    }
    
    protected static void seleccionTel(ArrayList<PersonaI> lp){
        int pos;
        for (int i = 0; i < lp.size() - 1; i++) {
            PersonaI p1 = lp.get(i);
            pos=i;
            for (int j = i+1; j < lp.size(); j++) {
                if(p1.getTelefono().compareToIgnoreCase(lp.get(j).getTelefono())>0){
                    p1=lp.get(j);
                    pos=j;
                }
            }
            lp.remove(pos);
            lp.add(0+i, p1);
        }
    }
}
