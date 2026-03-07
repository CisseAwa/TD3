package sn.awacisse.l2gl.app.model;

public abstract class Personne {
        private final String nom;
        private final String email;

        public  Personne(String nom, String email){
            if(nom==null  || nom.isBlank()){
                throw new IllegalArgumentException("Le nom ne peut pas être vide.");
            }
            this.nom=nom;
            if(email==null  || email.isBlank() || !email.contains("@")){
                throw new IllegalArgumentException("L'email ne peut pas être vide.");
            }
            this.email=email;
        }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }
    public abstract String role();
     public String identite(){
         return("Nom:" +nom+ "Email:" +email);
    }

    public final String Carte() {
        return "---------------------------\n" +
                "Rôle     : " + role() + "\n" +
                "Identité : " + identite() + "\n" +
                "Contacts : " + getEmail() + "\n" +
                "---------------------------";
    }

    @Override
    public String toString() {
        return Carte();
    }

}
