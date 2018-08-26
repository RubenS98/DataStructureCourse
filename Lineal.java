/*
Ruben Sanchez
A01021759
*/
public class Lineal{
  public static void main (String[] args){
    int[] lista = {1, 2, 5, 7, 10, 13, 15, 16, 18, 21, 31, 32, 43, 50, 57};
    int num=14;

    System.out.println(buscador(lista, num));
  }

  public static String buscador(int a [], int num){
    String est="El numero no está en el arreglo.";

    for(int i=0; i<a.length; i++){
        if(num==a[i]){
            est="El numero esta en el espacio "+i+".";
            break;
        }
        else if(num<a[i]){
            //System.out.println(a[i]);
            break;
        }
    }
    return est;
  }

}
