/*
Ruben Sanchez
A01021759
*/
import java.util.Scanner;
public class Binario2{

  public static void main(String[] args){
    int[] lista = {1, 2, 5, 7, 10, 13, 15, 16, 18, 21, 24, 28, 29, 31, 32, 37, 39, 43, 45, 46, 50, 52, 57, 63, 75, 77, 80, 84};
    Scanner lectura=new Scanner(System.in);
    int num;

    System.out.println("Escribe el numero que buscas.");
    num=lectura.nextInt();
    System.out.println(buscador(lista, num));
  }

  public static String buscador(int a [], int num){
    boolean est=false;
    int linf=0;
    int lsup=a.length-1;
    int pmedio=0;
    String texto="El numero no existe en el arreglo.";

    do{
      //System.out.println(""+linf+" "+lsup);
      if(linf!=lsup){
        pmedio=(linf+lsup)/2;
        if(a[pmedio]==num){
          texto="El numero existe en el espacio "+pmedio;
          est=true;
        }
        else if(a[pmedio]>num){
          lsup=pmedio-1;
        }
        else{
          linf=pmedio+1;
        }

      }
      else{
        if(a[linf]==num){
          texto="El numero existe en el espacio "+linf;
        }
        est=true;
      }
    }while(est==false);

    return texto;
  }
}
