// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AffectationHashMap affectationHashMap = new AffectationHashMap();

        Employe employe1 = new Employe(1, "yass");
        Employe employe2 = new Employe(2, "eren");
        Employe employe3 = new Employe(3, "mikasa");

        Departement departementA = new Departement("A");
        Departement departementB = new Departement("B");


        affectationHashMap.ajouterEmployeDepartement(employe1, departementA);
        affectationHashMap.ajouterEmployeDepartement(employe2, departementB);
        affectationHashMap.ajouterEmployeDepartement(employe3, departementA);

        affectationHashMap.afficherEmployesEtDepartements();


        affectationHashMap.afficherEmployesEtDepartements();

    }
}