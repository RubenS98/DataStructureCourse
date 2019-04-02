/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdobles;

public class ListaDoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1= new Persona("Antonio", 13);
        Persona p2= new Persona("Isaac", 42);
        Persona p3= new Persona("He-man", 3000);
        
        
        p1.setSiguiente(p2);
        p2.setPrevio(p1);
        
        p2.setSiguiente(p3);
        p3.setPrevio(p2);
        
        
        //printSiguientePersona(p1);
        
        //p1.getSiguiente().setSiguiente(null);
        
        //p1.setSiguiente(p1.getSiguiente().getSiguiente());
        
        //printSiguientePersona(p1);
        printPrevioPersona(p3);
    }

    private static void printSiguientePersona(Persona p1) {
        
        System.out.println(p1);
        
        while(p1.getSiguiente()!=null){
            p1=p1.getSiguiente();
            System.out.println(p1);
        }
    }
    private static void printPrevioPersona(Persona pN){
        System.out.println(pN);
        
        while(pN.getPrevio() != null){
            pN=pN.getPrevio();
            System.out.println(pN);
        }
        
    }
    
}
