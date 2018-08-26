/*
Ruben Sanchez
A01021759
*/
import java.util.Scanner;
public class Exponente{
  public static void main(String[] args){
    Scanner lectura = new Scanner(System.in);
    double base=0;
    double exp=0;

    System.out.println("Escribe el numero base.");
    base=lectura.nextDouble();
    System.out.println("Escribe el exponente.");
    exp=lectura.nextDouble();

    System.out.println(expon(base, exp));
  }

  public static double expon(double x, double n){
    if(n==0 && x==0){
      return 0;
    }
    else if(n<=0){
      return 1;
    }
    else{
      return x * expon(x, n-1);
    }
  }
}
