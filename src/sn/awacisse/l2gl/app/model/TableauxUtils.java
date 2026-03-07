package sn.awacisse.l2gl.app.model;

public class TableauxUtils {
    public static <T> int indexOf(T[] tab, T cible){
        if(cible ==null){
            throw new IllegalArgumentException("La cible ne doit pas être nulle!");
        }
        for(int i = 0; i< tab.length; i++){
            if(tab[i].equals(cible)){
                return i;
            }

        }
        return -1;
    }

    }





