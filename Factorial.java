/*
Ruben Sanchez
A01021759
*/
import java.util.Scanner;
public class Factorial{
  public static void main (String[] args){
    Scanner lectura = new Scanner(System.in);
    int num=0;

    System.out.println("Escribe el numero del cual quieres calcular el factorial.");
    num=lectura.nextInt();
    System.out.println(fact(num));
  }

  public static int fact(int n){
    if(n<=1){
      return 1;
    }
    else{
      return n * fact(n-1);
    }
  }
}
