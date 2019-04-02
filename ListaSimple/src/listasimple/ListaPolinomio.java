//Ruben Sanchez
//A01021759
package listasimple;

public class ListaPolinomio {
    public static void main(String[] args) {
        Polinomio pPol1=new Polinomio(0, 10);
        Polinomio pPol2=new Polinomio(2, 4);
        Polinomio pPol3=new Polinomio(40, 20);
        Polinomio pPol4=new Polinomio(86, 7);
        Polinomio pPol5=new Polinomio(88, -11);
        
        Polinomio sPol1=new Polinomio(1, 7);
        Polinomio sPol2=new Polinomio(2, 10);
        Polinomio sPol3=new Polinomio(86, -8);
        Polinomio sPol4=new Polinomio(88, 11);
        Polinomio sPol5=new Polinomio(89, 5);
        
        pPol1.setSiguiente(pPol2);
        pPol2.setSiguiente(pPol3);
        pPol3.setSiguiente(pPol4);
        pPol4.setSiguiente(pPol5);
        
        sPol1.setSiguiente(sPol2);
        sPol2.setSiguiente(sPol3);
        sPol3.setSiguiente(sPol4);
        sPol4.setSiguiente(sPol5);
        
        System.out.println("Primer polinomio.");
        printPolinomio(pPol1);
        System.out.println();
        System.out.println("Segundo polinomio.");
        printPolinomio(sPol1);
        Polinomio tPol1=suma(pPol1, sPol1);
        System.out.println();
        System.out.println("Polinomio final.");
        printPolinomio(tPol1);
    }
    
    private static void printPolinomio(Polinomio pol) {
        
        System.out.println(pol);
        
        while(pol.getSiguiente()!=null){
            pol=pol.getSiguiente();
            System.out.println(pol);
        }
    }
    
    private static Polinomio suma(Polinomio pPol, Polinomio sPol){
        Polinomio sumado=new Polinomio();
        if(pPol!=null && sPol!=null){
            if(pPol.getPotencia()<sPol.getPotencia()){
                sumado=pPol;
                Polinomio temporal;
                temporal=suma(pPol.getSiguiente(), sPol);
                sumado.setSiguiente(temporal);
            }
            if(pPol.getPotencia()>sPol.getPotencia()){
                sumado=sPol;
                Polinomio temporal;
                temporal=suma(pPol, sPol.getSiguiente());
                sumado.setSiguiente(temporal);
            }
            if(pPol.getPotencia()==sPol.getPotencia()){
                sumado=pPol;
                int coefF=pPol.getCoeficiente()+sPol.getCoeficiente();
                sumado.setCoeficiente(coefF);
                if(sumado.getCoeficiente()==0){
                    Polinomio temporal;
                    temporal=suma(pPol.getSiguiente(), sPol.getSiguiente());
                    sumado=temporal;
                    pPol=null;
                }
                else{
                    Polinomio temporal;
                    temporal=suma(pPol.getSiguiente(), sPol.getSiguiente());
                    sumado.setSiguiente(temporal);
                }
                sPol=null;
            }
        }
        else if(pPol==null && sPol==null){
            sumado=null;
        }
        else if(pPol==null){
            sumado=sPol;
            Polinomio temporal;
            temporal=suma(pPol, sPol.getSiguiente());
            sumado.setSiguiente(temporal);
        }
        else if(sPol==null){
            sumado=pPol;
            Polinomio temporal;
            temporal=suma(pPol.getSiguiente(), sPol);
            sumado.setSiguiente(temporal);
        }
        return sumado;
    }
}
