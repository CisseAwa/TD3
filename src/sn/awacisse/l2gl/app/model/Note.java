package sn.awacisse.l2gl.app.model;

import java.util.Objects;

// Identité de Note = (etudiant.matricule,module.code)
public class Note  {
    private final Etudiant etudiant;
    private final Module module;
    private Double valeur;

    public Note(Etudiant etudiant,Module module,Double valeur){
        VerifierNote(valeur == null || valeur < 0 || valeur > 20);
        this.etudiant=etudiant;
        this.module=module;
        this.valeur=valeur;
    }

    public void setValeur(Double valeur) {
        VerifierNote(valeur == null || valeur < 0 || valeur > 20);
        this.valeur = valeur;
    }

    private static void VerifierNote(boolean valeur) {
        if (valeur) {
            throw new IllegalArgumentException("Erreur veuillez resaisir !");
        }
    }

    public boolean estValide() {
        VerifierNote(valeur < 10);
        return true ;
    }
    public String mention() {
        if (valeur < 10) {
            return "Ajournée";
        } else if (valeur >= 10 && valeur < 12) {
            return "Passable";
        } else if (valeur >= 12 && valeur < 14) {
            return "Assez-Bien";
        } else if (valeur >= 14 && valeur < 16) {
            return "Bien";
        } else if (valeur >= 16) {
            return "Très-Bien";
        } else {
            return "Valeur invalide";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(etudiant, note.etudiant) && Objects.equals(module, note.module);
    }

    @Override
    public int hashCode() {
        return Objects.hash(etudiant, module);
    }
}

