package listas;

public class ListaLigada<T> {

    private NodoListaLigada<T> cabeza = null;

    public void insertar(NodoListaLigada<T> nodo) {
        if (cabeza == null) {
            cabeza = nodo;
        } else {
            fin().setSiguiente(nodo);
        }
    }

    public boolean insertarDespues(int pos, NodoListaLigada<T> nodo) {
        if (cabeza == null) {
            return false;
        }

        NodoListaLigada<T> temp = cabeza;
        NodoListaLigada<T> siguiente = null;
        int i = 0;

        while (temp != null && i < pos) {
            if (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
                i++;
            }
        }

        if (i == pos) {
            siguiente = temp.getSiguiente();
            nodo.setSiguiente(siguiente);
            temp.setSiguiente(nodo);
            return true;
        }

        return false;
    }

    public boolean eliminar() {
        if (cabeza != null) {
            previo(fin()).setSiguiente(null);
            return true;
        }
        return false;
    }

    private void imprimirLista(NodoListaLigada<T> nodo) {
        if (cabeza != null) {
            System.out.println("El valor del nodo es: " + nodo.getValor());
            if (nodo.getSiguiente() != null) {
                imprimirLista(nodo.getSiguiente());
            }
        } else {
            System.out.println("Lista vacia...");
        }
    }

    public NodoListaLigada<T> inicio() {
        return cabeza;
    }

    public NodoListaLigada<T> fin() {
        if (cabeza != null) {
            NodoListaLigada<T> temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            return temp;
        }
        return cabeza;
    }

    public void imprimir() {
        imprimirLista(cabeza);
    }

    public int buscar(NodoListaLigada<T> nodo) {
        NodoListaLigada<T> temp = cabeza;
        int i = -1;

        while (temp != null) {
            i++;
            if (temp != nodo && temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            } else {
                break;
            }
        }

        if (temp != nodo && temp.getSiguiente() == null) {
            i = -1;
        }

        return i;
    }

    public NodoListaLigada<T> previo(NodoListaLigada<T> nodo) {
        if (cabeza != null) {
            NodoListaLigada<T> temp = cabeza;
            while (temp.getSiguiente() != null) {
                if (temp.getSiguiente() == nodo) {
                    break;
                } else {
                    temp = temp.getSiguiente();
                }
            }
            return temp;
        }
        return cabeza;
    }

    public void vaciar() {
        while (cabeza.getSiguiente() != null) {
            eliminar();
        }
        cabeza = null;
    }
}

