/*
Ruben Sanchez
A01021759
 */
package pilascolas;

import java.util.Scanner;

public class TareaPilaCola {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        String exp;
        System.out.println("Escribe la expresion que quieras validar (solo se pueden validar parentesis, corchetes y llaves).");
        exp=lectura.next();
        
        char[] arr;
        int tam=exp.length();
        String res;
        
        //System.out.println(exp);
        
        //arr=exp.toCharArray();
        
        for(int i=0; i<exp.length(); i++){
            //System.out.println(exp.charAt(i));
        }
        PilaT p=new PilaT(tam);
        
        res=validar(p, exp);
        System.out.println("");
        System.out.println(res);
    }
    
    public static String validar(PilaT p, String exp){
        char x;
        
        for(int i=0; i<exp.length(); i++){
            if(exp.charAt(i)=='(' || exp.charAt(i)=='{'||  exp.charAt(i)=='['){
                p.push(exp.charAt(i));
                //System.out.println(p);
            }
            if(exp.charAt(i)==')'){
                x=p.pop();
                if(x!='('){
                    return "Expresion es invalida.";
                }
                
            }
            if(exp.charAt(i)=='}'){
                x=p.pop();
                if(x!='{'){
                    return "Expresion es invalida.";
                }
                
            }
            if(exp.charAt(i)==']'){
                x=p.pop();
                if(x!='['){
                    return "Expresion es invalida.";
                }
                
            }
        }
        
        //System.out.println(p+" si");
        if(p.esVacia()){
            return "Expresion es valida.";
        }
        return "Expresion es invalida.";
        
    }
            
}
