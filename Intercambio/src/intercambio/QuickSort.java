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
public class QuickSort {
    protected static void quickSortFNacimiento(ArrayList<PersonaI> lp, int limInf, int limSup){
        int q;
        if(limInf<limSup){
            q=particionFNacimiento(lp, limInf, limSup);
            quickSortFNacimiento(lp, limInf, q-1);
            quickSortFNacimiento(lp, q+1, limSup);
            
        }
    }
    
    protected static int particionFNacimiento(ArrayList<PersonaI> lp, int limInf, int limSup){
        int i, j, c, p;
        PersonaI temp3, temp4;
        boolean est=true;
        i=limInf;
        j=limSup-1;
        c=(limInf+limSup)/2;
        if(lp.get(limInf).getfNacimiento()>lp.get(c).getfNacimiento()){
            PersonaI lp1=lp.get(c);
            lp.set(c, lp.get(limInf));
            lp.remove(limInf);
            lp.add(limInf, lp1);
        }
        if(lp.get(limInf).getfNacimiento()>lp.get(limSup).getfNacimiento()){
            PersonaI lp1=lp.get(limSup);
            lp.set(limSup, lp.get(limInf));
            lp.remove(limInf);
            lp.add(limInf, lp1);
        }
        if(lp.get(c).getfNacimiento()>lp.get(limSup).getfNacimiento()){
            PersonaI lp1=lp.get(limSup);
            lp.set(limSup, lp.get(c));
            lp.remove(c);
            lp.add(c, lp1);
        }
        PersonaI lp2=lp.get(limSup-1);
        lp.set(limSup-1, lp.get(c));
        lp.remove(c);
        lp.add(c, lp2);
        p=lp.get(limSup-1).getfNacimiento();
        
        if((limSup-limInf+1)>3){
            while(est){
            do{
                i+=1;
            }while(lp.get(i).getfNacimiento()<p);
            do{
                j-=1;
            }while(lp.get(j).getfNacimiento()>p);
            if(i<j){
                temp3=lp.get(j);
                lp.set(j, lp.get(i));
                lp.remove(i);
                lp.add(i, temp3);
            }
            else{
                est=false;
            } 
            }
            temp4=lp.get(limSup-1);
            lp.set(limSup-1, lp.get(i));
            lp.remove(i);
            lp.add(i, temp4);
            return i;
        }
        else{
            return c;
        }
    }
}
