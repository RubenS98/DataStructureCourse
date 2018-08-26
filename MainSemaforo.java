/*
Ruben Sanchez
A01021759
*/
public class MainSemaforo{
  public static void main (String[] args){
    Semaforo s = new Semaforo(0, 70);
    System.out.println(s);
    s.cambiaAVerde();

    System.out.println(s);

    s.cambiaARojo();

    System.out.println(s);

    System.out.println();

    Semaforo s2=new Semaforo();

    System.out.println(s2);

    s2.cambiaARojo();

    System.out.println(s2);
  }
}
