//Ruben Sanchez
//A01021759
package listasdobles;

import java.util.Scanner;


public class Reproductor {
    public static void main(String[] args) {
        Cancion c1=new Cancion("Beat It", "Michael Jackson");
        Cancion c2=new Cancion("Faith", "George Michael");
        Cancion c3=new Cancion("Thunderstruck", "AC/DC");
        Cancion c4=new Cancion("Free Bird", "Lynyrd Skynyrd");
        Cancion c5=new Cancion("Always", "Erasure");
        Cancion c6=new Cancion("Touch", "Daft Punk");
        Cancion c7=new Cancion("Creep", "Radiohead");
        Cancion cabeza=new Cancion();
        Cancion ac = new Cancion();
        Scanner lectura=new Scanner(System.in);
        int opcion=0;
        String titulo;
        String artista;
        
        cabeza.setSiguiente(c1);
        c1.setSiguiente(c2);
        c2.setSiguiente(c3);
        c3.setSiguiente(c4);
        c4.setSiguiente(c5);
        c6.setSiguiente(c7);
        c5.setSiguiente(c6);
        
        c7.setPrevio(c6);
        c6.setPrevio(c5);
        c5.setPrevio(c4);
        c4.setPrevio(c3);
        c3.setPrevio(c2);
        c2.setPrevio(c1);
        c1.setPrevio(cabeza);
        
        ac=c4;
        
        //printCanciones(c3);
        System.out.println("");
        //printCanciones2(c4, cabeza);
        
        do{
            System.out.println("Reproductor de canciones.");

            System.out.println("Elija el numero de la opcion deseada");
            
            System.out.println("\t1-Imprimir cancion actual.");
            System.out.println("\t2-Pasar a la siguiente cancion.");
            System.out.println("\t3-Pasar a la cancion anterior.");
            System.out.println("\t4-Imprimir playlist.");
            System.out.println("\t5-Eliminar cancion actual.");
            System.out.println("\t6-Agregar cancion despues de la actual.");
            System.out.println("\t7-Salir.");
            
            opcion=lectura.nextInt();
            System.out.println();
            switch(opcion){
                case 1:
                    System.out.println("La cancion actual es: ");
                    System.out.println(ac);
                    break;
                case 2:
                    ac=pasarASiguiente(ac);
                    System.out.println("La cancion actual es: ");
                    System.out.println(ac);
                    break;
                case 3:
                    ac=pasarAAnterior(ac, cabeza);
                    System.out.println("La cancion actual es: ");
                    System.out.println(ac);
                    break;  
                case 4:
                    printPlayList(cabeza);
                    break;
                case 5:
                    ac=eliminarCancion(ac, cabeza);
                    System.out.println("Ahora, la cancion actual es: ");
                    System.out.println(ac);
                    break;
                case 6:
                    System.out.println("Escriba el nombre de la nueva cancion: ");
                    lectura.nextLine();
                    titulo=lectura.nextLine();
                    System.out.println();
                    System.out.println("Escriba el artista de la nueva cancion: ");
                    
                    artista=lectura.nextLine();
                    Cancion n=new Cancion(titulo, artista);
                    agregar(ac, n);
                    System.out.println("La nueva cancion es: ");
                    System.out.println(n);
                    break;
                case 7:
                    System.out.println("Hasta luego.");
                    break;
                default:
                    System.out.println("Seleccion no valida.");
                    break;
            }
            System.out.println("");
        }while(opcion!=7);
        
    }
    
    private static void printCanciones(Cancion c) {
        
        System.out.println(c);
        
        while(c.getSiguiente()!=null){
            c=c.getSiguiente();
            System.out.println(c);
        }
    }
    private static void printCanciones2(Cancion c, Cancion cabeza){
        System.out.println(c);
        
        while(c.getPrevio() != cabeza){
            c=c.getPrevio();
            System.out.println(c);
        }
        
    }
    
    private static Cancion pasarASiguiente(Cancion c){
        if(c.getSiguiente()==null){
            System.out.println("No hay mas canciones despues.");
            return c;
        }
        else{
            return c.getSiguiente();
        }
        
    }
    
    private static Cancion pasarAAnterior(Cancion c, Cancion cabeza){
        if(c.getPrevio()==cabeza){
            System.out.println("No hay mas canciones antes.");
            return c;
        }
        else{
            return c.getPrevio();
        }
        
    }
    
    
    
    private static void printPlayList(Cancion cabeza){
        System.out.println("Las canciones de la playlist son:");
        Cancion c=cabeza;
        while(c.getSiguiente() != null){
            c=c.getSiguiente();
            System.out.println(c);
        }
        
    }
    
    private static void agregar(Cancion ac, Cancion n){
        
        if(ac.getSiguiente()==null){
            ac.setSiguiente(n);
            n.setPrevio(ac);
        }
        else{
            ac.getSiguiente().setPrevio(n);
            n.setSiguiente(ac.getSiguiente());
            n.setPrevio(ac);
            ac.getSiguiente().setPrevio(n);
            ac.setSiguiente(n);
        }
        
    }
    
    private static Cancion eliminarCancion(Cancion ac, Cancion cabeza){
        if(ac.getSiguiente()==null && ac.getPrevio()==cabeza){
            System.out.println("La playlist no se puede quedar sin canciones.");
            return ac;
        }
        Cancion c;
        if(ac.getPrevio()==cabeza){
            c=ac.getSiguiente();
        }
        else{
            c=ac.getPrevio();
        }
        
        if(ac.getSiguiente()==null){
            ac.getPrevio().setSiguiente(ac.getSiguiente());
            ac.setPrevio(null);
        }
        else{
            ac.getPrevio().setSiguiente(ac.getSiguiente());
            ac.getSiguiente().setPrevio(ac.getPrevio());
            ac.setPrevio(null);
            ac.setSiguiente(null);
        }
        
        
        return c;
    }

}
