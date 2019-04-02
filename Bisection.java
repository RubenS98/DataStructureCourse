import java.lang.Math;
import java.util.Scanner;


public class Bisection{
  public static void main(String[] args){
    System.out.println(bis(.004, .02, 300, 0.0001));
  }

  public static double FunctionF(int a, int p, int n, double i){
    return p/i * (1-(1/Math.pow(1+i, n)))-a;
  }

  public static double bis(double linf, double lsup, int imax, double tolerancia){
    double medio=0;
    double medioAnterior=0;
    int contador=0;
    double errorAbs=0;
    double test;

    while(errorAbs>tolerancia || contador<imax){
      medioAnterior=medio;
      medio=(linf+lsup)/2;
      contador++;
      if(medio!=0){
        errorAbs=Math.abs((medio-medioAnterior)/medio)*100;
      }
      test=FunctionF(179000, 9000, 24, linf)*FunctionF(179000, 9000, 24, lsup);
      if(test>0){
        lsup=medio;
      }
      else if(test<0){
        linf=medio;
      }
      else{
        errorAbs=0;
      }
      //System.out.println(medio);
    }
    return medio;


  }

}
