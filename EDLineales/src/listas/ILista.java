package listas;

public interface ILista<T> {

    public void insertar(T elemento);

    public void insertar(int pos, T elemento);

    public int buscar(T elemento);

    public T obtener(int pos);

    public void eliminar(int pos);

    public void eliminar(T elemento);

    public T siguiente(int pos);

    public T siguiente(T elemento);

    public T previo(T elemento);

    public T previo(int pos);

    public void vaciar();

    public void imprimir();

    public T inicio();
}
