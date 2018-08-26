/*
Ruben Sanchez
A01021759
*/

//En esta clase se encuentran todos los componentes del salario
public class Salario{
  private double sB; //Salario Base
  private double pA; //Prima de antiguedad
  private double inP;//Incentivo a la productividad
  private double inA;//Incentivo a la puntualidad

  public Salario(double sB, double pA){
    this.sB=sB;
    this.pA=pA;
    this.inP=0;
    this.inA=0;
  }
  public Salario(double pA){
    this.sB=5000;
    this.pA=pA;
    this.inP=0;
    this.inA=0;
  }

  public void setPA(double pA){
    this.pA=pA;
  }

  public void setInA(double inA){
    this.inA=inA;
  }

  public void setInP(double inP){
    this.inP=inP;
  }

  //Con este metodo se calcula el salario neto
  public double salarioNeto(){
    double total;
    total=sB+pA+inP+inA;

    return total;
  }

  //Con este metodo se calculan las retenciones
  public double totRet(){
    double total=0;
    if(sB>=6000){
      total+=sB*.09;
    }
    else{
      total+=sB*.07;
    }
    total+=sB*.05;

    return total;
  }

  //Este metodo regresa los detalles del salario
  public String compSal(){
    return "Salario Base: "+sB+", Prima de antiguedad: "+pA+"\nIncentivo a la productividad: "+inP+", Incentivo a la puntualidad: "+inA;
  }
}
