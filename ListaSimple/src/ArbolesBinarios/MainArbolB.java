/*
Rubén Sánchez
A01021759
 */
package ArbolesBinarios;

/**
 *
 * @author thepo
 */
public class MainArbolB {
    public static void main(String[] args) {
        //Nodo e1=new Nodo(94);
        Nodo e1=new Nodo(10);
        Nodo.insertar(e1, 5);
        Nodo.insertar(e1, 7);
        Nodo.insertar(e1, 6);
        Nodo.insertar(e1, 1);
        Nodo.insertar(e1, 40);
        Nodo.insertar(e1, 50);
        
        
        
        System.out.println("Pre orden:");
        Nodo.preOrden(e1);
        System.out.println("");
        System.out.println("In orden:");
        Nodo.inOrden(e1);
        System.out.println("");
        System.out.println("Pos orden:");
        Nodo.posOrden(e1);
        System.out.println("");
        System.out.println("Impresion por nivel");
        Nodo.nivelF(e1);
        System.out.println("");
        System.out.println("");
        Nodo.eliminar(e1, 5);
        System.out.println("5 eliminado");
        System.out.println("Pre orden:");
        Nodo.preOrden(e1);
        System.out.println("");
        System.out.println("In orden:");
        Nodo.inOrden(e1);
        System.out.println("");
        System.out.println("Pos orden:");
        Nodo.posOrden(e1);
        System.out.println("");
        System.out.println("Impresion por nivel");
        Nodo.nivelF(e1);
        Nodo.insertar(e1, 5);
        System.out.println("");
        System.out.println("");
        System.out.println("5 insertado");
        System.out.println("");
        
        System.out.println("Pre orden:");
        
        Nodo.preOrden(e1);
        System.out.println("");
        System.out.println("In orden:");
        Nodo.inOrden(e1);
        System.out.println("");
        System.out.println("Pos orden:");
        Nodo.posOrden(e1);
        System.out.println("");
        System.out.println("Impresion por nivel");
        Nodo.nivelF(e1);
    }
}
