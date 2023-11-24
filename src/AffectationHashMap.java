import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {

    private Map<Departement, Employe> affectations;


    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }

    public void affecterEmploye(Employe employe, Departement departement) {
        //verif
        if (!affectations.containsKey(employe)) {
            affectations.put(departement, employe);
            System.out.println("L'employé " + employe + " affected " + departement + ".");
        } else {
            System.out.println("Error: L'employé " + employe + " est déjà affecté au département " + affectations.get(employe) + ".");
        }
    }

    public void ajouterEmployeDepartement(Employe employe, Departement departement) {
        affecterEmploye(employe, departement);
    }

    public void afficherEmployesEtDepartements() {
        System.out.println("Employés et départements :");
        for (Map.Entry<Departement, Employe> entry : affectations.entrySet()) {
            System.out.println("Employé " + entry.getKey() + " -> Département " + entry.getValue());
        }
    }

    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
        System.out.println(e + " has been removed");
    }

    public void supprimerEmployeEtDepartement (Employe e,Departement d){
    affectations.remove(d);
     System.out.println(d + " has been removed.");
    }

    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (Map.Entry<Departement, Employe> entry : affectations.entrySet()) {
            Employe employe = entry.getValue();
            System.out.println("ID: " + employe.getId() + ", Nom: " + employe.getNom());
        }
    }
    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        for (Map.Entry<Departement, Employe> entry : affectations.entrySet()) {
            Departement departement = entry.getKey();
            System.out.println("Name: " + departement.getName());
        }
    }
    public boolean rechercherEmploye(Employe employe) {
        for (Map.Entry<Departement, Employe> entry : affectations.entrySet()) {
            if (entry.getValue().equals(employe)) {
                return true;
            }
        }
        return false;
    }

    public boolean rechercherDepartement(Departement departement) {
        for (Map.Entry<Departement, Employe> entry : affectations.entrySet()) {
            if (entry.getValue().equals(departement)) {
                return true;
            }
        }
        return false;
    }



    public TreeMap<Departement,Employe> trierMap() {
        Comparator<Employe> ByIdComparator= new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                return e1.compareTo(e2);
            }
        };

        TreeMap<Departement,Employe> treemap = new TreeMap<>(ByIdComparator);
        treemap.putAll(affectations);
        return treemap;
    }
    }
