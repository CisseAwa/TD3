package sn.awacisse.l2gl.app;

import sn.awacisse.l2gl.app.model.*;
import sn.awacisse.l2gl.app.model.Module;

public class Main {
    public static void main(String[] args) {
        // Test Personne
        Personne p = new Etudiant("CISSE", "cawa9903@gmail.com", "2026-001");
        System.out.println(p.identite());
        ///System.out.println(p.identite("X"));

        // Test Affichable
        Affichable e = new Etudiant("CISSE", "cawa9903@gmail.com", "2026-001");
        Affichable m = new Module("JVOO1", "Java POO");
        Affichable[] elements = {e, m};
        for (Affichable elem : elements) {
            System.out.println(elem.afficher());
        }

        //Test Note
        Etudiant e1 = new Etudiant("CISSE", "cawa9903@gmail.com","2026-001");
        Etudiant e2 = new Etudiant("NDIAYE", "ndiayem@gmail.com", "2026-002");
        Etudiant e3 = new Etudiant("DIOUF", "lemoud04@gmail.com", "2026-002");
        Etudiant e4 = e1;
        Module m1 = new Module("JVOO1", "Java POO");
        Module m2 = new Module("PHPOO1", "PHP");
        Module m3 = new Module("M001", "Maths");
        Note n = new Note(e1, m1, 12.5);
        Note n1 = new Note(e1, m1, 17.0);
        Note n2 = new Note(e3, m3, 8.5);
        System.out.println(n.estValide());
        System.out.println(n.mention());
        System.out.println(n1.estValide());
        System.out.println(n1.mention());
        ///System.out.println(n2.estValide());
        System.out.println(n2.mention());

    // Test d'égualité
        System.out.println(e4==e1);
        System.out.println(e2.equals(e3));
        System.out.println(n.equals(n1));

    // Test avec la méthode carte
        System.out.println(e1.Carte());

    // Test avec Duo
        Double note= 18d;
        Duo d= new Duo(m1,n1);
        Duo d1= new Duo("Clé" , e1);
        Duo d2= new Duo(e1, "Clé");
        System.out.println(d1.equals(d2));
        //Test avec TableauxUtils
        Etudiant[] etu = {e1,e2,e3,e4};
        Module[] mod= {m1,m2,m3};
        String[] str={"Bella","Fluterdraw","AC"};
        System.out.println(TableauxUtils.indexOf(etu,e2));
        System.out.println(TableauxUtils.indexOf(mod,m3));
        System.out.println(TableauxUtils.indexOf(str,"Bella"));
        // Test avec Registre
        Registre<Etudiant> Retu= new Registre<>(etu,100);
        Registre<Module> Rmod= new Registre<>(mod,20);
        System.out.println(Retu.chercherParId("2026-002").afficher());



    }


}
