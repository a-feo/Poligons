package programacio.uf4.Model;

public class Trapezi extends Poligon {
    float bMajor, bMenor, altura;

    public Trapezi(float bMajor, float bMenor, float altura) {
        super("Trapezi");
        this.bMajor = bMajor;
        this.bMenor = bMenor;
        this.altura = altura;
    }

    // Mètodes
    @Override
    public float calcularArea() {
        return ((bMajor + bMenor) / 2) * altura;
    }

    @Override
    public float calcularPerimetre() {
        // Per trapezi isòsceles
        return bMajor + bMenor + calcularHipotenusa((bMajor - bMenor) / 2, altura) * 2;
    }

    private float calcularHipotenusa(float catet1, float catet2) {
        return (float) Math.sqrt(Math.pow(catet1, 2) + Math.pow(catet2, 2));
    }

    @Override
    public String toString() {
        return "Trapezi{" +
                "nom=" + getNom() +
                ", bMajor=" + bMajor +
                ", bMenor=" + bMenor +
                ", altura=" + altura +
                ", area=" + getArea() +
                ", perímetre=" + getPerimetre() +
                '}';
    }

    // Getters
    public float getbMajor() {
        return bMajor;
    }

    public float getbMenor() {
        return bMenor;
    }

    public float getAltura() {
        return altura;
    }

    // Setters
    public void setbMajor(float bMajor) {
        this.bMajor = bMajor;
    }

    public void setbMenor(float bMenor) {
        this.bMenor = bMenor;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
