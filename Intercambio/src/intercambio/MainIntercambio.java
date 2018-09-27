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
import java.util.Scanner;
public class MainIntercambio {
    
    
    public static void main(String[] args){
        MainIntercambio m=new MainIntercambio();
        PersonaI [] lp = m.inicializaLista();
        m.imprimeLista(lp);
        
        System.out.println("");
        Intercambio.intercambioFNacimiento(lp);
        System.out.println("Ordenado por fecha de nacimiento.");
        m.imprimeLista(lp);
        
        System.out.println("");
        Intercambio.intercambioAPaterno(lp);
        System.out.println("Ordenado por apellido paterno.");
        m.imprimeLista(lp);
        
        System.out.println("");
        Intercambio.intercambioAMaterno(lp);
        System.out.println("Ordenado por apellido materno.");
        m.imprimeLista(lp);
        
        System.out.println("");
        Intercambio.intercambioNombre(lp);
        System.out.println("Ordenado por nombre.");
        m.imprimeLista(lp);
        
        System.out.println("");
        Intercambio.intercambioTelefono(lp);
        System.out.println("Ordenado por telefono.");
        m.imprimeLista(lp);
    }
    
    private PersonaI[] inicializaLista(){
        Scanner lectura=new Scanner(System.in);
        int tam;
        String nombre, aP, aM, tel;
        int fN;
        
        System.out.println("Escriba el numero de personas: ");
        tam=lectura.nextInt();
        
        PersonaI [] lp=new PersonaI[tam];
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
            
            lp[i]=p1;
            
        }
        
        return lp;
    }
    
    private void imprimeLista(PersonaI[] lp){
        for (int i = 0; i < lp.length; i++) {
            System.out.println(lp[i]);
        }        
    }
}
