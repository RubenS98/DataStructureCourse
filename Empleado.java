/*
Ruben Sanchez
A01021759
*/
public class Empleado{
  private String nombre;
  private int numero;
  private Salario s;
  private int anios;

  private static int count=0; //Esta variable aumenta cada vez que se crea un empleado

  //Se crea un objeto empleado con su nombre, numero de anios trabajando y su salario base
  //Los anios se usan para sacar la prima de antiguedad, que es de 500 extra por cada anio
  public Empleado(String nombre, int anios, double sB){
    this.nombre=nombre;
    count++;
    this.numero=count;
    this.anios=anios;
    s=new Salario(sB, (anios*500));
  }

  //Se crea un objeto empleado con su nombre, numero de anios trabajando
  //El salario que se le pone al empleado es un predeterminado
  public Empleado(String nombre, int anios){
    this.nombre=nombre;
    count++;
    this.numero=count;
    this.anios=anios;
    s=new Salario(anios*500);
  }

  public void setNombre(String nombre){
    this.nombre=nombre;
  }
  public void setAnios(int anios){
    this.anios=anios;
  }
  public String getNombre(){
    return nombre;
  }
  public int getAnios(){
    return anios;
  }

  //Si el empleado llega a tiempo, se le da un incentivo a la puntualidad
  public void llegaATiempo(){
    s.setInA(500);
  }

  //Si el empleado llega tarde, se le quita su incentivo a la puntualidad
  public void llegaTarde(){
    s.setInA(0);
  }

  //Si ek empleado es productivo, se le da un incentivo
  public void esProductivo(){
    s.setInP(500);
  }

  //Si el empleado no es poductivo, se le quita su incentivo
  public void noEsProductivo(){
    s.setInP(0);
  }

  //Se le agrega un anio al empleado
  public void unAnioMas(){
    anios++;
    s.setPA(anios*500);
  }

  //Con este metodo se imprimen la nomina del empleado
  public String toString(){
    return "Nombre: "+nombre+", Numero del empleado: "+numero+"\nSalario Neto mensual: "+s.salarioNeto()+", Total retenciones: "+s.totRet()+"\n";
  }

  public String detalleSalario(){
    return s.compSal();
  }

}
