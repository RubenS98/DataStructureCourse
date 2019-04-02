//Ruben Sanchez
//A01021759
package listacircular;

import java.util.Scanner;

public class ParesyNones {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        String nombre;
        String opcion="si";
        Jugador ac=new Jugador();
        int seleccion=0;
        String pr, resultado;
        int jugada;
        
        System.out.println("Escriba el nombre del primer jugador.");
        nombre=lectura.nextLine();
        Jugador j1=new Jugador(nombre);
        System.out.println("Escriba el nombre del segundo jugador.");
        nombre=lectura.nextLine();
        Jugador j2=new Jugador(nombre);
        
        j1.setSiguiente(j2);
        j1.setPrevio(j2);
        j2.setSiguiente(j1);
        j2.setPrevio(j1);
        
        ac=j1;
        
        System.out.println("");
        do{
            System.out.println("Bienvenido a 'Pares o nones'.");
            System.out.println("");
            System.out.println("Escriba el numero del jugador que intentara pronosticar el resultado.");
            System.out.println("1- "+ac.getNombre());
            System.out.println("2- "+ac.getSiguiente().getNombre());
            seleccion=lectura.nextInt();
            
            while(seleccion!=1 && seleccion!=2){
                System.out.println("Seleccion invalida. Escriba ya sea 1 o 2.");
                seleccion=lectura.nextInt();
            }
            if(seleccion==1){
                System.out.println(ac.getNombre()+" intentara pronosticar el resultado.");
            }
            else{
                System.out.println(ac.getSiguiente().getNombre()+" intentara pronosticar el resultado.");
            }
            System.out.println("");
            System.out.println("Empieza el juego.");
            System.out.println("");
            System.out.println(ac.getNombre()+", escribe '1' o '2' dependiendo de cuantos dedos quieras poner.");
            jugada=lectura.nextInt();
            while(jugada!=1 && jugada!=2){
                System.out.println("Seleccion invalida. Escriba ya sea '1' o '2'.");
                jugada=lectura.nextInt();
            }
            ac.setJugada(jugada);
            jugada=0;
            ac=ac.getSiguiente();
            System.out.println("");
            System.out.println(ac.getNombre()+", escribe '1' o '2' dependiendo de cuantos dedos quieras poner.");
            jugada=lectura.nextInt();
            while(jugada!=1 && jugada!=2){
                System.out.println("Seleccion invalida. Escriba ya sea '1' o '2'.");
                jugada=lectura.nextInt();
            }
            ac.setJugada(jugada);
            System.out.println("");
            if(seleccion==1){
                System.out.println(ac.getPrevio().getNombre()+", llego la hora de decir tu pronostico. Escribe 'p' si crees que el resultado será par o 'n' si crees que sera non.");
                pr=lectura.next();
                while(!pr.equalsIgnoreCase("p") && !pr.equalsIgnoreCase("n")){
                    System.out.println("Seleccion invalida. Escriba ya sea 'p' o 'n'.");
                    pr=lectura.next();
                }
                if(pr.equals("p")){
                    System.out.println(ac.getPrevio().getNombre()+", elegiste par. Si el resultado es par ganas, de lo contrario pierdes.");
                }
                else{
                    System.out.println(ac.getPrevio().getNombre()+", elegiste non. Si el resultado es non ganas, de lo contrario pierdes.");
                }
            }
            else{
                System.out.println(ac.getNombre()+", llego la hora de decir tu pronostico. Escribe 'p' si crees que el resultado será par o 'n' si crees que sera non.");
                pr=lectura.next();
                while(!pr.equalsIgnoreCase("p") && !pr.equalsIgnoreCase("n")){
                    System.out.println("Seleccion invalida. Escriba ya sea 'p' o 'n'.");
                    pr=lectura.next();
                }
                if(pr.equals("p")){
                    System.out.println(ac.getNombre()+", elegiste par. Si el resultado es par ganas, de lo contrario pierdes.");
                }
                else{
                    System.out.println(ac.getNombre()+", elegiste non. Si el resultado es non ganas, de lo contrario pierdes.");
                }
            }
            System.out.println("");
            System.out.println("Jugadas de los jugadores.");
            printSiguientePersona(ac);
            resultado=resultadoJ(ac);
            System.out.println("");
            if(seleccion==1){
                if(resultado.equals(pr)){
                    System.out.println(ac.getPrevio().getNombre()+" adivino correctamente y es el ganador.");
                }
                else{
                    System.out.println(ac.getPrevio().getNombre()+" no adivino correctamente. "+ac.getNombre()+" gana.");
                }
            }
            else{
                if(resultado.equals(pr)){
                    System.out.println(ac.getNombre()+" adivino correctamente y es el ganador.");
                }
                else{
                    System.out.println(ac.getNombre()+" no adivino correctamente. "+ac.getPrevio().getNombre()+" gana.");
                }
            }
            System.out.println("");
            System.out.println("Escriba 'si' si quiere jugar otra vez. Escriba cualquier cosa si se quiere salir.");
            opcion=lectura.next();
            
            seleccion=0;
            jugada=0;
            resultado="";
            ac=ac.getSiguiente();
            
        }while(opcion.equalsIgnoreCase("Si"));
        
        System.out.println("Gracias por jugar.");
        
    }
    
    private static void printSiguientePersona(Jugador j) {
        
        System.out.println(j);
        int cont=j.getElementos();
        
        while(j.getPrevio() != null && cont-->1){
            j=j.getPrevio();
            System.out.println(j);
        }
    }
    
    private static String resultadoJ(Jugador j) {
        int acc=0;
        int cont=j.getElementos();
        acc+=j.getJugada();
        
        while(j.getPrevio() != null && cont-->1){
            j=j.getPrevio();
            acc+=j.getJugada();
        }
        if(acc%2==0){
            return "p";
        }
        else{
            return "n";
        }
    }
    
}
