import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    private String nom;
    private Integer  age;

    public Etudiant() {
    }

    public Etudiant(String nom, Integer age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static List<Etudiant> getList() {
        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant("Jean", 18));
        etudiants.add(new Etudiant("Ali", 19));
        etudiants.add(new Etudiant("Omar", 20));
        etudiants.add(new Etudiant("Juan", 22));
        etudiants.add(new Etudiant("Karima", 23));
        etudiants.add(new Etudiant("Laila", 20));
        etudiants.add(new Etudiant("Badr", 24));

        return  etudiants;
    }
}
