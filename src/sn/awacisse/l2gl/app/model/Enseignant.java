package sn.awacisse.l2gl.app.model;

public class Enseignant extends Personne{
    private final String numeroSomme;

    public Enseignant(String nom, String email, String numeroSomme){
        super(nom,email);
        if (numeroSomme==null || numeroSomme.isEmpty()){
            throw new IllegalArgumentException("NumeroSomme ne doit pas être vide !");
        }
        this.numeroSomme=numeroSomme;
    }

    public String getNumeroSomme() {
        return numeroSomme;
    }

    @Override
    public String role(){
        return("Enseignant");
    }


}
