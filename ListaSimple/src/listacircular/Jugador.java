//Ruben Sanchez
//A01021759
package listacircular;

public class Jugador {
    private static int nElementos=0;
    
    private int jugada;
    private String nombre;
    private Jugador previo;
    private Jugador siguiente;

    public Jugador(String nombre) {
        this.nombre = nombre;
        nElementos++;
    }
    
    public Jugador(){
        
    }

    public int getJugada() {
        return jugada;
    }

    public void setJugada(int jugada) {
        this.jugada = jugada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jugador getPrevio() {
        return previo;
    }

    public void setPrevio(Jugador previo) {
        this.previo = previo;
    }

    public Jugador getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Jugador siguiente) {
        this.siguiente = siguiente;
    }
    
    public int getElementos(){
        return nElementos;
    }

    @Override
    public String toString() {
        return "Jugador{" + "jugada=" + jugada + ", nombre=" + nombre + '}';
    }
    
    
}
