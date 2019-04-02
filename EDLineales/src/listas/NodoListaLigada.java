package listas;

/**
 *
 * @author thepo
 */
public class NodoListaLigada<T> {

    private final T valor;
    private NodoListaLigada<T> siguiente;

    public NodoListaLigada(T valor) {
        this.valor = valor;
    }

    public void setSiguiente(NodoListaLigada<T> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoListaLigada<T> getSiguiente() {
        return siguiente;
    }

    public T getValor() {
        return valor;
    }
}

