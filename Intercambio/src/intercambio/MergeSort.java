package intercambio;
import java.util.ArrayList;

public class MergeSort {
    protected static void mergeSortFNacimiento(ArrayList<PersonaI> lp, int limInf, int limSup){
      int centro;
      if(limSup>limInf){
        centro = (limInf+limSup)/2;
        mergeSortFNacimiento(lp, limInf, centro);
        mergeSortFNacimiento(lp, centro+1, limSup);
        merging(lp, limInf, limSup, centro);
      }
    }

    protected static void merging(ArrayList<PersonaI> lp, int limInf, int limSup, int c){
      ArrayList<PersonaI> lpT=new ArrayList<PersonaI>();
      int pos = 0;
      int i = limInf;
      int j = c + 1;
      while (i<=c && j<=limSup) {
        if (lp.get(i).getfNacimiento() <= lp.get(j).getfNacimiento()) {
          lpT.add(pos, lp.get(i));
          i+= 1;
        }
        else {
          lpT.add(pos, lp.get(j));
          j+= 1;
        }
        pos+=1;
      }

      if (i > c)
        while (j <= limSup) {
          lpT.add(pos, lp.get(j));
          j+= 1;
          pos+= 1;
      }
      else{
        while (i <= c) {
          lpT.add(pos, lp.get(i));
          i+= 1;
          pos+=1;
        }
      }

      for (int i2 = 0; i2< lpT.size(); i2++){
        lp.set(i2+limInf, lpT.get(i2));
      }
    }
}