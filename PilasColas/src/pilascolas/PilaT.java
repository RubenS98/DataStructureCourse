/*
Ruben Sanchez
A01021759
 */
package pilascolas;

import java.util.Arrays;

public class PilaT {
    //private static final int TAM_MAX;
    private int tope;
    private char[] elem;

    public PilaT(int TAM_MAX) {
        tope=TAM_MAX;
        elem=new char[TAM_MAX];
    }
    
    public boolean push(char elemento) {
        if(tope==0){
            return false;
        }
        tope--;
        elem[tope]=elemento;
        return true;
    }

    
    public char pop() {
        if(esVacia()){
            return '0';
        }
        char x=elem[tope];
        elem[tope]='0';
        tope++;
        return x;
    }

    
    public char top() {
        if(esVacia()){
            return '0';
        }
        return elem[tope];
    }

    
    public boolean vaciar() {
        tope = elem.length;
        elem= new char[elem.length];
        return true;
    }

    
    public boolean esVacia() {
        return tope==elem.length;
    }

    
    public String toString() {
        return "Pila{" + "elem=" + Arrays.toString(elem) + '}';
    } 
}
