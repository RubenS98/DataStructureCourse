package pilascolas;

public class PilasColas {

public static void main(String[] args) {
        Pila p=new Pila();
        
        p.push(1);
        p.push("jaja");
        p.push(25);
        System.out.println(p.top());
        p.pop();
        System.out.println(p.top());
        p.push("ola k ase");
        System.out.println(p);
    }
    
}
