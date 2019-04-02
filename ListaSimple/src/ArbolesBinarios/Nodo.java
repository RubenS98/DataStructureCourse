/*
Rubén Sánchez
A01021759
 */
package ArbolesBinarios;
import java.util.ArrayList;
import java.util.Arrays;
public class Nodo {
    private int valor;
    private Nodo izquierda;
    private Nodo derecha;
    
    public Nodo() {
        this.valor = -1;
        this.izquierda=null;
        this.derecha=null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.izquierda=null;
        this.derecha=null;
    }
    
    public Nodo(int valor, Nodo izquierda, Nodo derecha) {
        this.valor = valor;
        this.izquierda=izquierda;
        this.derecha=derecha;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    @Override
    public String toString() {
        return "EnteroArbol{" + "valor=" + valor + '}';
    }
    
    public static Nodo insertar (Nodo nodo, int x){
        if(nodo==null){
            nodo=new Nodo(x);
            return nodo;
        }
        if(nodo.getValor()==x){
            //System.out.println(nodo);
            return nodo;
        }
        if(nodo.getValor()>x){
            //System.out.println(nodo);
            nodo.setIzquierda(insertar(nodo.getIzquierda(), x));
        }
        //System.out.println(nodo);
        if(nodo.getValor()<x){
            nodo.setDerecha(insertar(nodo.getDerecha(), x));
        }
        
        return nodo;
    }
    
    public static Nodo eliminar (Nodo nodo, int x){
        if(nodo==null){
            //System.out.println("Nodo no existe");
            return nodo;
        }
        if(nodo.getValor()==x){
            //System.out.println(nodo);
            if(nodo.getIzquierda()==null && nodo.getDerecha()==null){
                nodo=null;
            }
            else if(nodo.getIzquierda()==null){
                nodo=nodo.getDerecha();
            }
            else if(nodo.getDerecha()==null){
                nodo=nodo.getIzquierda();
            }
            else{
                Nodo t=nodo.getDerecha();
                int x2=buscarMin(t).getValor();
                eliminar(nodo, x2);
                nodo.setValor(x2);
            }
            return nodo;
        }
        if(nodo.getValor()>x){
            //System.out.println(nodo);
            nodo.setIzquierda(eliminar(nodo.getIzquierda(), x));
        }
        //System.out.println(nodo);
        if(nodo.getValor()<x){
            nodo.setDerecha(eliminar(nodo.getDerecha(), x));
        }
        
        return nodo;
    }
    
    public static void preOrden (Nodo n){
        if(n!=null){
            System.out.print(n.getValor()+", ");
            preOrden(n.getIzquierda());
            preOrden(n.getDerecha());
        }
    }
    
    public static void inOrden (Nodo n){
        if(n!=null){
            inOrden(n.getIzquierda());
            System.out.print(n.getValor()+", ");
            inOrden(n.getDerecha());
        }
    }
    
    public static void posOrden (Nodo n){
        if(n!=null){
            posOrden(n.getIzquierda());
            posOrden(n.getDerecha());
            System.out.print(n.getValor()+", ");
        }
    }
    
    public static void nivelF(Nodo n){
        ArrayList p=new ArrayList<Nodo>();
        while(n!=null){

            System.out.print(n.getValor()+", ");
            if(n.getIzquierda()!=null){
                p.add(n.getIzquierda());
            }
            if(n.getDerecha()!=null){
                p.add(n.getDerecha());
            }
            
            if(p.size()==0){
                n=null;
            }
            else{
                n=(Nodo)p.get(0);
            }
            
            if(p.size()>0){
              p.remove(0);  
            }
             
            
        }
    }
    
    public static Nodo buscar(Nodo nodo, int x){
        if(nodo==null){
            System.out.println("No existe.");
            return nodo;
        }
        if(nodo.getValor()==x){
            System.out.println("El numero "+x+" si existe.");
            return nodo;
        }
        if(nodo.getValor()>x){
            return buscar(nodo.getIzquierda(), x);
        }
        return buscar(nodo.getDerecha(), x);
    }
    
    public static Nodo buscarMin(Nodo nodo){
        if(nodo==null){
            return nodo;
        }
        if(nodo.getIzquierda()==null){
            return nodo;
        }
        return buscarMin(nodo.getIzquierda());
    }
    
    public static Nodo buscarMax(Nodo nodo){
        if(nodo==null){
            return nodo;
        }
        if(nodo.getDerecha()==null){
            return nodo;
        }
        return buscarMax(nodo.getDerecha());
    }
    
}
