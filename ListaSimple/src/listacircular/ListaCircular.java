package listacircular;

public class ListaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1= new Persona("Juan", 15);
        Persona p2= new Persona("Colombia", 19);
        Persona p3= new Persona("Cesar", 20);
        
        
        p1.setSiguiente(p2);
        p2.setPrevio(p1);
        
        p2.setSiguiente(p3);
        p3.setPrevio(p2);
        
        p3.setSiguiente(p1);
        p1.setPrevio(p3);
        
        System.out.println(p1.getNElementos());
        
        printSiguientePersona(p1, 1);
        System.out.println("");
        eliminarPersona(p2);
    }

    private static void printSiguientePersona(Persona p1, int cont) {
        
        System.out.println(p1);
        
        cont = p1.getNElementos();
        
        while(p1.getSiguiente()!=null && cont-->1){
            p1=p1.getSiguiente();
            System.out.println(p1);
        }
    }
    private static void printPrevioPersona(Persona pN){
        System.out.println(pN);
        
        while(pN.getPrevio() != null){
            pN=pN.getPrevio();
            System.out.println(pN);
        }
        
    }
    
    private static void eliminarPersona(Persona pN){
        Persona pT=pN.getSiguiente();
        pN.getSiguiente().setPrevio(pN.getPrevio());
        
        pN.getPrevio().setSiguiente(pT);
        
        pN.personaMenos();
        
        printSiguientePersona(pT, 1);
        
    }
    
}
