//Ruben Sanchez
//A01021759
package listasimple;

public class Polinomio {
    private int coeficiente;
    private int potencia;
    private Polinomio siguiente;

    public Polinomio(int potencia, int coeficiente) {
        this.coeficiente = coeficiente;
        this.potencia = potencia;
    }
    
    public Polinomio() {
        
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Polinomio getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Polinomio siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Polinomio{" + "coeficiente= " + coeficiente + ", potencia= " + potencia + ", tiene siguiente = "+(siguiente==null?"No":"Si")+ '}';
    }
    
    
}
