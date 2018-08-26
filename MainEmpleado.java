/*
Ruben Sanchez
A01021759
*/
public class MainEmpleado{
  public static void main (String[] args){
    Empleado e = new Empleado("Ruben Sanchez", 7);

    System.out.print(e);

    e.llegaATiempo();

    System.out.print(e);

    e.esProductivo();

    System.out.print(e);

    e.unAnioMas();

    System.out.print(e);
    System.out.println(e.detalleSalario());

    Empleado e2 = new Empleado("Rodrigo Sanchez", 5, 7000);

    System.out.print(e2);

    e2.llegaATiempo();

    System.out.print(e2);

    e2.llegaTarde();

    System.out.print(e2);
  }
}
