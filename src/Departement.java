public class Departement {
    private String name;

    public Departement(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Departement that = (Departement) obj;
        return name.equals(that.name);
    }


}
