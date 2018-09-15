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
import java.util.*;
public class MainSeleccion {
    
    public static void main(String[] args){
        MainSeleccion m=new MainSeleccion();
        ArrayList<PersonaI> lp = m.inicializaLista();
        //PersonaI [] lp = m.inicializaLista(4);
        m.imprimeLista(lp);
        
        System.out.println("");
        Seleccion.seleccionFNacimiento(lp);
        m.imprimeLista(lp);
        
        System.out.println("");
        Seleccion.seleccionAPaterno(lp);
        m.imprimeLista(lp);
        
        System.out.println("");
        Seleccion.seleccionNombre(lp);
        m.imprimeLista(lp);
        
        System.out.println("");
        Seleccion.seleccionAMaterno(lp);
        m.imprimeLista(lp);
        
        System.out.println("");
        Seleccion.seleccionTel(lp);
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
    
    private void imprimeLista(ArrayList<PersonaI> lp){
        for (int i = 0; i < lp.size(); i++) {
            System.out.println(lp.get(i));
        }        
    }
}
