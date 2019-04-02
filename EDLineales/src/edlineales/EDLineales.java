/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edlineales;
import listas.Persona;
import listas.NodoListaLigada;
import listas.ListaLigada;
/**
 *
 * @author thepo
 */
public class EDLineales {

    public static void main(String[] args) {
        ListaLigada<Persona> lista = new ListaLigada<>();
        lista.insertar(new NodoListaLigada<>(new Persona("Manish", 0)));
        lista.insertar(new NodoListaLigada<>(new Persona("Pandit", 1)));
        lista.insertar(new NodoListaLigada<>(new Persona("Tanvi", 2)));
        lista.insertar(new NodoListaLigada<>(new Persona("Monika", 3)));
        lista.imprimir();
        lista.eliminar();
        System.out.println("Despues de eliminar el ultimo elemento insertado...");
        lista.imprimir();
        System.out.println("Despues de insertar en 0...");
        lista.insertarDespues(0, new NodoListaLigada<>(new Persona("Despues0", 50)));
        lista.imprimir();
        System.out.println("La posicion de la persona siguiente al inicio es:");
        System.out.println(lista.buscar(lista.inicio().getSiguiente()));
        lista.vaciar();
        System.out.println("Despues de vaciar la lista...");
        lista.imprimir();
    }
}
