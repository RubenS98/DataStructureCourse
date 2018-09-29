package intercambio;

public class PersonaI {

    private String nombre;
    private String aM;
    private String aP;
    private String telefono;
    private int fNacimiento;

    public PersonaI(String nombre, String aP, String aM, String telefono, int fNacimiento) {
        this.nombre = nombre;
        this.aM = aM;
        this.aP = aP;
        this.telefono = telefono;
        this.fNacimiento = fNacimiento;
    }
    
    public PersonaI(int fNacimiento) {
        this.nombre = "Ruben";
        this.aM = "Rodriguez";
        this.aP = "Sanchez";
        this.telefono = "5554183354";
        this.fNacimiento = fNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaM() {
        return aM;
    }

    public void setaM(String aM) {
        this.aM = aM;
    }

    public String getaP() {
        return aP;
    }

    public void setaP(String aP) {
        this.aP = aP;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(int fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "PersonaI{" + "Nombre=" + nombre + " " + aP + " " + aM + ", Telefono=" + telefono + ", fNacimiento=" + fNacimiento + '}';
    }
    
}
