/*
Ruben Sanchez
A01021759
*/
public class Semaforo{
  private Lampara focoV;//Foco verde
  private Lampara focoA;//Foco amarillo
  private Lampara focoR;//Foco rojo

  //Se crea un semaforo usando lamparas con sus respectivos valores de intensidad.
  //No se pueden determinar los valores del foco amarillo porque este solo es un punto transitorio entre verde y rojo.
  //Si la intensidad es mayor a 0, el foco esta prendido.
  public Semaforo(int intV, int intR){
    if(intV<=0){
      this.focoV=new Lampara(false, 0);
    }
    else{
      this.focoV=new Lampara(true, intV);
    }
    this.focoA=new Lampara(false, 0);
    if(intR<=0){
      this.focoR=new Lampara(false, 0);
    }
    else{
      this.focoR=new Lampara(true, intR);
    }
  }

  //Semaforo con valores predeterminados
  public Semaforo(){
    this.focoV=new Lampara(true, 50);
    this.focoA=new Lampara(false, 0);
    this.focoR=new Lampara(false, 0);
  }

  //Semaforo cambia a rojo
  public void cambiaARojo(){
    focoV.apagar();
    focoA.prender();
    focoA.apagar();
    focoR.prender();
  }

  //Semaforo cambia a verde
  public void cambiaAVerde(){
    focoR.apagar();
    focoV.prender();
  }

  //Este metodo regresa el estado del semaforo
  public String toString(){
    return "Verde: "+focoV.getEnc()+", Amarillo: "+focoA.getEnc()+", Rojo: "+focoR.getEnc();
  }
}
