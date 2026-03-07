package sn.awacisse.l2gl.app.model;

import java.util.Objects;

public final class Etudiant extends Personne implements Affichable, Identifiable{
    private final String matricule;
    public Etudiant(String nom, String email,String matricule){
        super(nom,email);
        if (matricule == null || matricule.isEmpty()) {
            throw new IllegalArgumentException("Le matricule ne peut pas être vide!");
        }
        if (!matricule.matches("\\d{4}-\\d{3}")) {
            throw new IllegalArgumentException("Format matricule invalide! Attendu: YYYY-NNN (ex: 2025-123)");
        }
        this.matricule = matricule;
    }

    public String getMatricule() {
        return matricule;
    }
    @Override
    public String role(){
        return ("Etudiant");
    }
    @Override
    public String identite(){
        return super.identite()+ matricule;
    }
    public String indentite(String prefixe){
        return prefixe + super.identite()+ matricule ;
    }
    @Override
    public String afficher(){
        return ("Etudiant: " +matricule+ " " + getNom());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return Objects.equals(matricule, etudiant.matricule);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricule);
    }

    @Override
    public String identifiant() {
        return "Matricule";
    }

}
