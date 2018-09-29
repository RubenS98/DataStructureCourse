import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Merge{
  public static void main(String[] args){
    ArrayList<Integer> arr=new ArrayList<Integer>();
    Random r=new Random();
    for(int i=0; i<10;i++){
      int x=r.nextInt(200);
      arr.add(x);
    }
    for(int i=0; i<arr.size();i++){
      System.out.println(arr.get(i));
    }
    System.out.println();
    mergeSort(arr, 0, arr.size()-1);
    for(int i=0; i<arr.size();i++){
      System.out.println(arr.get(i));
    }
  }
//Jaja
  public static void mergeSort(ArrayList<Integer> lp, int limInf, int limSup){
      int c;
      if(limSup>limInf){
        c = (limInf+limSup)/2;
        mergeSort(lp, limInf, c);
        mergeSort(lp, c+1, limSup);
        merging(lp, limInf, limSup, c);
      }
    }

  public static void merging(ArrayList<Integer> lp, int limInf, int limSup, int c){
      ArrayList<Integer> lpT=new ArrayList<Integer>();
      int p = 0;
      int i = limInf;
      int j = c + 1;
      while (i<=c && j<=limSup) {
        if (lp.get(i) <= lp.get(j)) {
          lpT.add(p, lp.get(i));
          i+= 1;
        }
        else {
          lpT.add(p, lp.get(j));
          j+= 1;
        }
        p+=1;
      }

      if (i > c)
        while (j <= limSup) {
          lpT.add(p, lp.get(j));
          j+= 1;
          p+= 1;
      }

      else{
        while (i <= c) {
          lpT.add(p, lp.get(i));
          i+= 1;
          p+=1;
        }
      }

      for (p = 0; p< lpT.size(); p++){
        lp.set(limInf+p, lpT.get(p));
      }
    }
}
