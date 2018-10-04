package intercambio;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class MainMergeSort {
    public static void main(String[] args){
        MainMergeSort m=new MainMergeSort();
        ArrayList<PersonaI> lp = m.inicializaLista2();
        m.imprimeLista(lp);
        
        System.out.println("");
        MergeSort.mergeSortFNacimiento(lp, 0, lp.size()-1);
        System.out.println("Ordenado por fecha de nacimiento.");
        m.imprimeLista(lp);
        
    }
    
    private ArrayList<PersonaI> inicializaLista(){
        ArrayList<PersonaI> lp = new ArrayList<PersonaI>();
        Scanner lectura=new Scanner(System.in);
        int tam;
        String nombre, aP, aM, tel;
        int fN;
        
        System.out.println("Escriba el numero de personas: ");
        tam=lectura.nextInt();
        //Solicitar al usuario datos
        for (int i = 0; i < tam; i++) {
            System.out.println("Persona "+(i+1));
            System.out.println("Nombre: ");
            nombre=lectura.next();
            System.out.println("Apellido Paterno: ");
            aP=lectura.next();
            System.out.println("Apellido Materno: ");
            aM=lectura.next();
            System.out.println("Telefono: ");
            tel=lectura.next();
            System.out.println("Anio de nacimiento: ");
            fN=lectura.nextInt();
            
            PersonaI p1=new PersonaI(nombre, aP, aM, tel, fN);
            
            lp.add(i, p1);
            
        }
        
        return lp;
    }
    
    private ArrayList<PersonaI> inicializaLista2(){
        ArrayList<PersonaI> lp = new ArrayList<PersonaI>();
        Scanner lectura=new Scanner(System.in);
        int fN, tam;
        Random r=new Random();
        
        System.out.println("Escriba el numero de personas: ");
        tam=lectura.nextInt();
        //Solicitar al usuario datos
        for (int i = 0; i < tam; i++) {
            fN=r.nextInt(87)+1930;
            PersonaI p1=new PersonaI(fN);
            
            lp.add(i, p1);
            
        }
        
        return lp;
    }
    
    private void imprimeLista(ArrayList<PersonaI> lp){
        for (int i = 0; i < lp.size(); i++) {
            System.out.println(lp.get(i));
        }        
    }   
}
