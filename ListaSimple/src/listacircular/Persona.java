package listacircular;

public class Persona {
    
   private static int nElementos=0;
   
   private String nombre;
   private int edad;
   private Persona siguiente;
   private Persona previo;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        nElementos++;
    }
    
    public int getNElementos(){
       return nElementos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Persona siguiente) {
        this.siguiente = siguiente;
        System.gc();
    }

    public Persona getPrevio() {
        return previo;
    }

    public void setPrevio(Persona previo) {
        this.previo = previo;
    }
    
    public void personaMenos(){
        nElementos--;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", tiene siguiente = "+(siguiente==null?"No":"Si")+ ", tiene previo = "+(previo==null?"No":"Si")+'}';
    }

    

   
   
    
}
