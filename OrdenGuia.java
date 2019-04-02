import java.util.ArrayList;

public class OrdenGuia{
  public static void main(String[] args){
    ArrayList<Integer> lp= new ArrayList<Integer>();

    lp.add(1);
    lp.add(4);
    lp.add(5);
    lp.add(7);
    lp.add(8);
    lp.add(11);
    lp.add(14);

    for(int i=0; i<lp.size(); i++){
      System.out.println(lp.get(i));
    }
    System.out.println();

    lp=ordenar(lp);

    for(int i=0; i<lp.size(); i++){
      System.out.println(lp.get(i));
    }
  }

  public static ArrayList<Integer> ordenar(ArrayList<Integer> lp){
    int pos;
        for (int i = 0; i < lp.size()-1; i++) {
            Integer p1 = lp.get(i);
            pos=i;
            for (int j = i+1; j < lp.size(); j++) {
                if(p1<lp.get(j)){
                    p1=lp.get(j);
                    pos=j;
                }

            }
            lp.remove(pos);
            lp.add(0+i, p1);

        }
    return lp;
  }
}
