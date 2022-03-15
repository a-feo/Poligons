package programacio.uf4.Model;

public class PoligonRegular extends Poligon {
    int nCostats;
    float lCostat, apotema;

    public PoligonRegular(String nom, int nCostats, float lCostat, float apotema) {
        super(nom);
        this.nCostats = nCostats;
        this.lCostat = lCostat;
        this.apotema = apotema;
    }

    // Mètodes
    @Override
    public float calcularArea() {
        return (nCostats * lCostat * apotema) / 2;
    }

    @Override
    public float calcularPerimetre() {
        return nCostats * lCostat;
    }

    @Override
    public String toString() {
        return "PoligonRegular{" +
                "nom=" + getNom() +
                ", nCostats=" + nCostats +
                ", lCostat=" + lCostat +
                ", apotema=" + apotema +
                ", area=" + getArea() +
                ", perímetre=" + getPerimetre() +
                '}';
    }

    // Getters
    public int getnCostats() {
        return nCostats;
    }

    public float getlCostat() {
        return lCostat;
    }

    public float getApotema() {
        return apotema;
    }

    // Setters
    public void setnCostats(int nCostats) {
        this.nCostats = nCostats;
    }

    public void setlCostat(float lCostat) {
        this.lCostat = lCostat;
    }

    public void setApotema(float apotema) {
        this.apotema = apotema;
    }
}
