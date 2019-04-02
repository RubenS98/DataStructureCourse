package intercambio;

import java.util.ArrayList;


public class QuickSort2 {
    protected static void quickSortFNacimiento(ArrayList<String> lp, int limInf, int limSup){
        int pP;
        if(limInf<limSup){
            pP=particionFNacimiento(lp, limInf, limSup);
            quickSortFNacimiento(lp, limInf, pP-1);
            quickSortFNacimiento(lp, pP+1, limSup);

        }
    }

    protected static int particionFNacimiento(ArrayList<String> lp, int limInf, int limSup){
        int i, j, c;
        String p;
        String temp3, temp4;
        boolean est=true;
        i=limInf;
        j=limSup-1;
        c=(limInf+limSup)/2;
        if(lp.get(limInf).comparetoIgnoreCase(lp.get(c))>0){
            String lp1=lp.get(c);
            lp.set(c, lp.get(limInf));
            lp.remove(limInf);
            lp.add(limInf, lp1);
        }
        if(lp.get(limInf).comparetoIgnoreCase(lp.get(limSup))>0){
            String lp1=lp.get(limSup);
            lp.set(limSup, lp.get(limInf));
            lp.remove(limInf);
            lp.add(limInf, lp1);
        }
        if(lp.get(c).comparetoIgnoreCase(lp.get(limSup))>0){
            String lp1=lp.get(limSup);
            lp.set(limSup, lp.get(c));
            lp.remove(c);
            lp.add(c, lp1);
        }
        String lp2=lp.get(limSup-1);
        lp.set(limSup-1, lp.get(c));
        lp.remove(c);
        lp.add(c, lp2);
        p=lp.get(limSup-1);

        if((limSup-limInf+1)>3){
            while(est){
            do{
                i+=1;
            }while(lp.get(i).comparetoIgnoreCase(p)<0);
            do{
                j-=1;
            }while(lp.get(j).comparetoIgnoreCase(p)>0);
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
