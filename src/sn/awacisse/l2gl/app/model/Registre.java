package sn.awacisse.l2gl.app.model;

public class Registre<T extends Identifiable> {
    private final T[] elements;
    private int taille;

    public Registre(T[] elements, int taille) {
        this.elements = elements;
        this.taille = 0;
    }
    public void ajouter(T e){
        if(e==null){
            throw new IllegalArgumentException("L'élément ne doit par être null !");
        }
        for(T element : elements){
            if (element.equals(e)){
                throw new IllegalArgumentException("Doublons inexpectable!");
            }
        }
        if (taille >= elements.length) {
            throw new IllegalStateException("On peut pas ajouter c'est plein!");
        }
        elements[taille++] = e;
    }

    public T chercherParId(String id){

        if(id==null){
            throw new IllegalArgumentException("L'id ne doit pas être vide");
        }
       for(T element :elements){
           if(element.identifiant().equals(id)){
               return element;
           }
       }
       return null;
    }
    public int taille(){
        return taille;
    }
}
