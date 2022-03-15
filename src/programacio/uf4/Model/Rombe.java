package programacio.uf4.Model;

public class Rombe extends Poligon {
    float dMajor, dMenor;

    public Rombe(float dMajor, float dMenor) {
        super("Rombe");
        this.dMajor = dMajor;
        this.dMenor = dMenor;
    }

    // Mètodes
    @Override
    public float calcularArea() {
        return (dMajor * dMenor) / 2;
    }

    @Override
    public float calcularPerimetre() {
        return 4 * calcularHipotenusa(dMajor, dMenor);
    }

    private float calcularHipotenusa(float catet1, float catet2) {
        return (float) Math.sqrt(Math.pow(catet1, 2) + Math.pow(catet2, 2));
    }

    @Override
    public String toString() {
        return "Rombe{" +
                "nom=" + getNom() +
                ", dMajor=" + dMajor +
                ", dMenor=" + dMenor +
                ", area=" + getArea() +
                ", perímetre=" + getPerimetre() +
                '}';
    }

    // Getters
    public float getdMajor() {
        return dMajor;
    }

    public float getdMenor() {
        return dMenor;
    }

    // Setters
    public void setdMajor(float dMajor) {
        this.dMajor = dMajor;
    }

    public void setdMenor(float dMenor) {
        this.dMenor = dMenor;
    }
}
