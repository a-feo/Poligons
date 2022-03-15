package programacio.uf4.Model;

public class Quadrat extends Poligon {
    float lCostat;

    public Quadrat(float lCostat) {
        super("Quadrat");
        this.lCostat = lCostat;
    }

    @Override
    public float calcularArea() {
        return lCostat * lCostat;
    }

    @Override
    public float calcularPerimetre() {
        return lCostat * 4;
    }

    @Override
    public String toString() {
        return "Quadrat{" +
                "lCostat=" + lCostat +
                ", area=" + getArea() +
                ", perímetre=" + getPerimetre() +
                '}';
    }

    // Getters
    public float getlCostat() {
        return lCostat;
    }

    // Setters
    public void setlCostat(float lCostat) {
        this.lCostat = lCostat;
    }
}
