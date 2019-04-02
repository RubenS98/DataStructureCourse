//Ruben Sanchez
//A01021759
package listasdobles;

public class Cancion {
    private String titulo;
    private String artista;
    private Cancion previo;
    private Cancion siguiente;

    public Cancion(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }
    
    public Cancion(){
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Cancion getPrevio() {
        return previo;
    }

    public void setPrevio(Cancion previo) {
        this.previo = previo;
    }

    public Cancion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Cancion siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Cancion{" + titulo + ", de " + artista + ", tiene siguiente = "+(siguiente==null?"No":"Si")+ ", tiene previo = "+(previo==null?"No":"Si")+'}';
    }
    
    
}
