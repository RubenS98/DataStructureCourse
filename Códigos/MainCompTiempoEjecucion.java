package intercambio;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author thepo
 */
public class MainCompTiempoEjecucion {
    public static void main(String[] args){
        MainCompTiempoEjecucion m=new MainCompTiempoEjecucion();
        ArrayList<PersonaI> lp = m.inicializaLista2();
        //m.imprimeLista(lp);
        
        System.out.println("");
        
        long startT=System.nanoTime();
        
        //Intercambio.intercambioFNacimiento(lp);
        //Seleccion.seleccionFNacimiento(lp);
        //lp=Insercion.insercionFNacimiento(lp);
        //Burbuja.burbujaFNacimiento(lp);
        //QuickSort.quickSortFNacimiento(lp, 0, lp.size()-1);
        MergeSort.mergeSortFNacimiento(lp, 0, lp.size()-1);
        
        long endT=System.nanoTime();
        
        long totalT=endT-startT;
        
        System.out.println("Tiempo transcurrido en nanosegundos: "+totalT);
        
        System.out.println("Ordenado por fecha de nacimiento.");
        //m.imprimeLista(lp);
        
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
