/*
Ruben Sanchez
A01021759
*/
import java.util.Arrays;
public class Combinaciones{
  public static void main (String[] args){
    int[] vector = {1, 2, 3, 4, 5};
    int k=3;

    for(int i=0; i<vector.length; i++){
      System.out.println(comb(vector, k, i, i, true, ""));
    }
  }

  public static String comb(int a[], int k, int n, int x, boolean est, String acc){
    if((n+k)>a.length){
      return "";
    }
    else if(k==1){
      return acc+a[x]+"}, ";
    }
    else if((x+k)>a.length){
      String texto="";
      return texto;
    }
    else if(est==false){
      String texto="";
      for(int i=(x); i<a.length-1; i++){
        texto+=comb(a, k-1, i+1, i+1, false, acc+a[n]+", ");
      }
      return texto+"";
    }
    else{
      String texto="";
      for(int i=(x); i<a.length-1; i++){
        texto+=comb(a, k-1, i+1, i+1, false, "{"+a[n]+", ");
      }
      return texto+"";
    }
  }


}
