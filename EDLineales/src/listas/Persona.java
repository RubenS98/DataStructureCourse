package listas;

public class Persona {

    private String nombre;
    private int fNacimiento;

    public Persona(String nom, int nac) {
        this.nombre = nom;
        this.fNacimiento = nac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(int fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fNacimiento=" + fNacimiento + '}';
    }
}
