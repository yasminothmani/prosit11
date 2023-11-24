import java.util.Objects;

public class Employe {
    private int id;
    private String nom;

    public Employe(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id && Objects.equals(nom, employe.nom);
    }

    public int compareTo(Employe e2) {
        return this.id- e2.getId();
    }

   /* @Override
    public int hashCode() {
        return Objects.hash(id, nom);
    }*/
}
