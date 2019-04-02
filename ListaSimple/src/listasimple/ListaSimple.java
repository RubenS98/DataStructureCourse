/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimple;

/**
 *
 * @author thepo
 */
public class ListaSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1= new Persona("Antonio", 13);
        
        Persona p2= new Persona("Isaac", 42);
        p1.setSiguiente(p2);
        
        p1.getSiguiente().setSiguiente(new Persona("He-man", 3000));
        
        
        printPersonaLigada(p1);
        
        //p1.getSiguiente().setSiguiente(null);
        
        p1.setSiguiente(p1.getSiguiente().getSiguiente());
        
        printPersonaLigada(p1);
    }

    private static void printPersonaLigada(Persona p1) {
        
        System.out.println(p1);
        
        while(p1.getSiguiente()!=null){
            p1=p1.getSiguiente();
            System.out.println(p1);
        }
    }
    
}
