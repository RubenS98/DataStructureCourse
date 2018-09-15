package intercambio;

import java.util.ArrayList;

/**
 *
 * @author thepo
 */
public class Insercion {
    protected static ArrayList<PersonaI> insercionFNacimiento(ArrayList<PersonaI> lp){
        ArrayList<PersonaI> rem = new ArrayList<PersonaI>();
        rem.add(lp.get(0));
        int pos=rem.size();
        for (int i = 1; i < lp.size(); i++) {
            pos=rem.size();
            PersonaI p1 = lp.get(i);
            for (int j = 0; j < rem.size(); j++) {
                if(p1.getfNacimiento()<rem.get(j).getfNacimiento()){
                    pos=j;
                    break;
                }
            }
            if(pos==rem.size()){
                rem.add(rem.size(), p1);
                
            }
            else{
                rem.add(pos, p1);
            } 
        }
        return rem;
    }
    
    protected static ArrayList<PersonaI> insercionAPaterno(ArrayList<PersonaI> lp){
        ArrayList<PersonaI> rem = new ArrayList<PersonaI>();
        rem.add(lp.get(0));
        int pos=rem.size();
        for (int i = 1; i < lp.size(); i++) {
            pos=rem.size();
            PersonaI p1 = lp.get(i);
            for (int j = 0; j < rem.size(); j++) {
                if(p1.getaP().compareToIgnoreCase(rem.get(j).getaP())<0){
                    pos=j;
                    break;
                }
            }
            if(pos==rem.size()){
                rem.add(rem.size(), p1);   
            }
            else{
                rem.add(pos, p1);
            }   
        }
        return rem;
    }
    
    protected static ArrayList<PersonaI> insercionAMaterno(ArrayList<PersonaI> lp){
        ArrayList<PersonaI> rem = new ArrayList<PersonaI>();
        rem.add(lp.get(0));
        int pos=rem.size();
        for (int i = 1; i < lp.size(); i++) {
            pos=rem.size();
            PersonaI p1 = lp.get(i);
            for (int j = 0; j < rem.size(); j++) {
                if(p1.getaM().compareToIgnoreCase(rem.get(j).getaM())<0){
                    pos=j;
                    break;
                }
            }
            if(pos==rem.size()){
                rem.add(rem.size(), p1);   
            }
            else{
                rem.add(pos, p1);
            }   
        }
        return rem;
    }
    
    protected static ArrayList<PersonaI> insercionNombre(ArrayList<PersonaI> lp){
        ArrayList<PersonaI> rem = new ArrayList<PersonaI>();
        rem.add(lp.get(0));
        int pos=rem.size();
        for (int i = 1; i < lp.size(); i++) {
            pos=rem.size();
            PersonaI p1 = lp.get(i);
            for (int j = 0; j < rem.size(); j++) {
                if(p1.getNombre().compareToIgnoreCase(rem.get(j).getNombre())<0){
                    pos=j;
                    break;
                }
            }
            if(pos==rem.size()){
                rem.add(rem.size(), p1);   
            }
            else{
                rem.add(pos, p1);
            }   
        }
        return rem;
    }
    
    protected static ArrayList<PersonaI> insercionTel(ArrayList<PersonaI> lp){
        ArrayList<PersonaI> rem = new ArrayList<PersonaI>();
        rem.add(lp.get(0));
        int pos=rem.size();
        for (int i = 1; i < lp.size(); i++) {
            pos=rem.size();
            PersonaI p1 = lp.get(i);
            for (int j = 0; j < rem.size(); j++) {
                if(p1.getTelefono().compareToIgnoreCase(rem.get(j).getTelefono())<0){
                    pos=j;
                    break;
                }
            }
            if(pos==rem.size()){
                rem.add(rem.size(), p1);   
            }
            else{
                rem.add(pos, p1);
            }   
        }
        return rem;
    }
}
