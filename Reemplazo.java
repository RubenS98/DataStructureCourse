/*
Ruben Sanchez
A01021759
*/
import java.util.*;
public class Reemplazo{

  public static void main(String[] args){
    int[] vector = {1, 2, 3, 4, 5};
    int[] vector2 = new int [vector.length];

    System.out.println(Arrays.toString(vector));

    System.out.println();

    for(int i=0; i<vector.length; i++){
      vector2[i]=calculo(vector, i, vector.length-1);
    }

    System.out.print(Arrays.toString(vector2));


  }

  private static int calculo(int[] a, int n, int s){
    if(s<1){
      return a[s];
    }
    else{
      if(s==n){
        return a[s] * calculo(a, n, s-1)/a[n];
      }
      else{
        return a[s] * calculo(a, n, s-1);
      }
    }
  }
}
