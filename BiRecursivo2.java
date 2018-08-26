/*
Ruben Sanchez
A01021759
*/
import java.util.Scanner;
public class BiRecursivo2{

  public static void main(String[] args){
    int[] lista = {1, 2, 5, 7, 10, 13, 15, 16, 18, 21, 24, 28, 28, 31, 32, 37, 39, 43, 45, 46, 50, 52, 57, 63, 75, 77, 80, 84};
    Scanner lectura=new Scanner(System.in);
    int num;

    System.out.println("Escribe el numero que buscas.");
    num=lectura.nextInt();
    System.out.println(buscadorR(lista, num, 0, lista.length-1));
  }

  public static String buscadorR(int a [], int numero, int linf, int lsup){
    int pmedio=0;

    if(linf!=lsup){
      pmedio=(linf+lsup)/2;
      if(a[pmedio]==numero){
        return "El numero existe en el espacio "+pmedio;
      }
      else if(a[pmedio]>numero){
        lsup=pmedio-1;
        return buscadorR(a, numero, linf, lsup);
      }
      else{
        linf=pmedio+1;
        return buscadorR(a, numero, linf, lsup);
      }

    }
    else{
      if(a[linf]==numero){
        return "El numero existe en el espacio "+linf;
      }
      else{
        return "El numero no existe en el arreglo.";
      }
    }
}
}
