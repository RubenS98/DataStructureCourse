import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Partition{
  public static void main(String[] args){
    ArrayList<Integer> arr=new ArrayList<Integer>();
    Random r=new Random();
    for(int i=0; i<31;i++){
      int x=r.nextInt(200);
      arr.add(x);
    }
    for(int i=0; i<arr.size();i++){
      System.out.println(arr.get(i));
    }
    System.out.println();
    quickSort(arr, 0, arr.size()-1, 15);
    for(int i=0; i<arr.size();i++){
      System.out.println(arr.get(i));
    }
  }

  public static int part(ArrayList<Integer> lp, int limInf, int limSup){
    int i, j, c, p, temp3;
    boolean est=true;
    i=limInf;
    j=limSup-1;
    c=(limInf+limSup)/2;
    System.out.println();
    if(lp.get(limInf)>lp.get(c)){
      int temp=lp.get(c);
      lp.set(c, lp.get(limInf));
      lp.remove(limInf);
      lp.add(limInf, temp);
    }
    if(lp.get(limInf)>lp.get(limSup)){
      int temp=lp.get(limSup);
      lp.set(limSup, lp.get(limInf));
      lp.remove(limInf);
      lp.add(limInf, temp);
    }
    if(lp.get(c)>lp.get(limSup)){
      int temp=lp.get(limSup);
      lp.set(limSup, lp.get(c));
      lp.remove(c);
      lp.add(c, temp);
    }
    int temp2=lp.get(limSup-1);
    lp.set(limSup-1, lp.get(c));
    lp.remove(c);
    lp.add(c, temp2);

    System.out.println("Arreglo que se partio");
    for(int i2=limInf; i2<limSup+1;i2++){
      System.out.println(lp.get(i2));
    }
    System.out.println();
    System.out.println(limSup-limInf+1);
    p=lp.get(limSup-1);
    System.out.println(p);
    System.out.println();

    if((limSup-limInf+1)>3){
      while(est){
        do{
          i+=1;
        }while(lp.get(i)<p);
        do{
          j-=1;
        }while(lp.get(j)>p);
        if(i<j){
          temp3=lp.get(j);
          lp.set(j, lp.get(i));
          lp.remove(i);
          lp.add(i, temp3);
        }
        else{
          est=false;
        }
      }
      int temp4=lp.get(limSup-1);
      lp.set(limSup-1, lp.get(i));
      lp.remove(i);
      lp.add(i, temp4);

      return i;
    }
    else{
      return c;
    }


  }

  public static void quickSort(ArrayList<Integer> lp, int limInf, int limSup, int round){
        int q;
        if(limInf<limSup && round>0){
            q=part(lp, limInf, limSup);
            System.out.println();
            System.out.println("Arreglo que se va a sortear.");
            for(int i=limInf; i<limSup+1;i++){
              System.out.println(lp.get(i));
            }
            System.out.println();
            quickSort(lp, limInf, q-1, round-1);
            quickSort(lp, q+1, limSup, round-1);

        }
    }

}
