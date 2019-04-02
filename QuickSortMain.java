//Ruben Sanchez
//A01021759
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;



public class QuickSortMain {
    public static void main(String[] args){
        QuickSortMain m=new QuickSortMain();
        ArrayList<String> lp = new ArrayList<String>();
        lp.add("Ruben");
        lp.add("Rodrigo");
        lp.add("Pamela");
        lp.add("Ana");
        lp.add("Diana");
        lp.add("Jorge");
        lp.add("Luis");
        lp.add("Pedro");
        lp.add("Sergio");

        System.out.println("");
        quickSortNom(lp, 0, lp.size()-1);
        System.out.println("Ordenado por nombre de nacimiento.");

        for (int i = 0; i < lp.size(); i++) {
                    System.out.println(lp.get(i));
                }
    }

    public static void quickSortNom(ArrayList<String> lp, int limInf, int limSup){
        int pP;
        if(limInf<limSup){
            pP=particionNom(lp, limInf, limSup);
            quickSortNom(lp, limInf, pP-1);
            quickSortNom(lp, pP+1, limSup);

        }
    }

    public static int particionNom(ArrayList<String> lp, int limInf, int limSup){
        int i, j, c;
        String p;
        String temp3, temp4;
        boolean est=true;
        i=limInf;
        j=limSup-1;
        c=(limInf+limSup)/2;
        if(lp.get(limInf).compareToIgnoreCase(lp.get(c))>0){
            String lp1=lp.get(c);
            lp.set(c, lp.get(limInf));
            lp.remove(limInf);
            lp.add(limInf, lp1);
        }
        if(lp.get(limInf).compareToIgnoreCase(lp.get(limSup))>0){
            String lp1=lp.get(limSup);
            lp.set(limSup, lp.get(limInf));
            lp.remove(limInf);
            lp.add(limInf, lp1);
        }
        if(lp.get(c).compareToIgnoreCase(lp.get(limSup))>0){
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
            }while(lp.get(i).compareToIgnoreCase(p)<0);
            do{
                j-=1;
            }while(lp.get(j).compareToIgnoreCase(p)>0);
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
