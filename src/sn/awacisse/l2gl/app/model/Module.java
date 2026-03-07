package sn.awacisse.l2gl.app.model;

import java.util.Objects;


// Identité de Module = code uniquement
public class Module implements Affichable,Identifiable{
    private final String code;
    private final String libelle;
     public Module(String code, String libelle) {
         if (code == null || code.isEmpty()) {
             throw new IllegalArgumentException("Le code ne doit pas être vide !");
         }
         this.code=code;
         if (libelle == null || libelle.isEmpty()) {
             throw new IllegalArgumentException("Le libelle ne doit pas être vide !");
         }
         this.libelle=libelle;
     }

    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }
    @Override
    public String afficher(){
        return ("Module: " +code+ " " + libelle);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Module module = (Module) o;
        return Objects.equals(code, module.code) && Objects.equals(libelle, module.libelle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, libelle);
    }

    @Override
    public String identifiant() {
        return "Code";
    }

}
