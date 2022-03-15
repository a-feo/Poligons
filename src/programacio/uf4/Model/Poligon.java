package programacio.uf4.Model;

public abstract class Poligon implements Comparable<Poligon> {
    // Atributs
    private String nom;

    // Constructor
    public Poligon(String nom) {
        this.nom = nom;
    }

    // Mètodes
    public abstract float calcularArea();

    public abstract float calcularPerimetre();

    // Comparators
    public int compareTo(Poligon p) {
        return Float.compare(this.calcularArea(), p.calcularArea());
//        if (this.calcularArea() < p.calcularArea()) return -1;
//        if (this.calcularArea() > p.calcularArea()) return 1;
//        else return 0;
    }

    boolean equals(Poligon poligon) {
        return poligon.getArea() == this.getArea();
    }

    static boolean equals(Poligon poligon1, Poligon poligon2) {
        return poligon1.getArea() == poligon2.getArea();
    }

    static int compare(Poligon poligon1, Poligon poligon2) {
        return Float.compare(poligon1.calcularArea(), poligon2.calcularArea());
    }

    // Setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public float getArea() {
        return calcularArea();
    }

    public float getPerimetre() {
        return calcularPerimetre();
    }
}
