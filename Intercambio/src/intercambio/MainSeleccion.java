package intercambio;

import java.util.*;
public class MainSeleccion {
    
    public static void main(String[] args){
        MainSeleccion m=new MainSeleccion();
        ArrayList<PersonaI> lp = m.inicializaLista();
        //PersonaI [] lp = m.inicializaLista(4);
        m.imprimeLista(lp);
        
        System.out.println("");
        Seleccion.seleccionFNacimiento(lp);
        System.out.println("Ordenado por fecha de nacimiento.");
        m.imprimeLista(lp);
        
        System.out.println("");
        Seleccion.seleccionAPaterno(lp);
        System.out.println("Ordenado por apellido paterno.");
        m.imprimeLista(lp);
        
        System.out.println("");
        Seleccion.seleccionNombre(lp);
        System.out.println("Ordenado por nombre.");
        m.imprimeLista(lp);
        
        System.out.println("");
        Seleccion.seleccionAMaterno(lp);
        System.out.println("Ordenado por apellido materno.");
        m.imprimeLista(lp);
        
        System.out.println("");
        Seleccion.seleccionTel(lp);
        System.out.println("Ordenado por telefono.");
        m.imprimeLista(lp);
    }
    
    private ArrayList<PersonaI> inicializaLista(){
        ArrayList<PersonaI> lp = new ArrayList<PersonaI>();
        Scanner lectura=new Scanner(System.in);
        int tam;
        String nombre, aP, aM, tel;
        int fN;
        
        System.out.println("Escriba el numero de personas: ");
        tam=lectura.nextInt();
        //Solicitar al usuario datos
        for (int i = 0; i < tam; i++) {
            System.out.println("Persona "+(i+1));
            System.out.println("Nombre: ");
            nombre=lectura.next();
            System.out.println("Apellido Paterno: ");
            aP=lectura.next();
            System.out.println("Apellido Materno: ");
            aM=lectura.next();
            System.out.println("Telefono: ");
            tel=lectura.next();
            System.out.println("Anio de nacimiento: ");
            fN=lectura.nextInt();
            
            PersonaI p1=new PersonaI(nombre, aP, aM, tel, fN);
            
            lp.add(i, p1);
            
        }
        
        return lp;
    }
    
    private void imprimeLista(ArrayList<PersonaI> lp){
        for (int i = 0; i < lp.size(); i++) {
            System.out.println(lp.get(i));
        }        
    }
}
