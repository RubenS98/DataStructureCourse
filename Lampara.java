/*
Ruben Sanchez
A01021759
*/
public class Lampara{
  private boolean encendido;
  private int intensidad;

  public Lampara (boolean enc, int intensidad){
    encendido = enc;
    this.intensidad = intensidad;
  }

  public void setE(boolean encendido){
    this.encendido=encendido;
  }

  //Para controlar la intensidad.
  //Si se pone en 0, la lampara se apaga.
  public void setI(int intensidad){
    if(intensidad<=0){
      this.intensidad=0;
      encendido=false;
    }
    else{
      this.intensidad=intensidad;
      encendido=true;
    }
  }

  public boolean getEnc(){
    return encendido;
  }

  public int getInt(){
    return intensidad;
  }

  //Se apaga la lampara y la intensidad baja a 0
  public void apagar(){
    encendido=false;
    intensidad=0;
  }

  //Se prende la lampara y la intensidad sube a 50
  public void prender(){
    encendido=true;
    intensidad=50;
  }
}
