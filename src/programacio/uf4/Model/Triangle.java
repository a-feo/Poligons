package programacio.uf4.Model;

public class Triangle extends Poligon {
    float base, altura;

    public Triangle(float base, float altura) {
        super("Triangle");
        this.base = base;
        this.altura = altura;
    }

    // Mètodes
    @Override
    public float calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public float calcularPerimetre() {
        return base * 3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "nom=" + getNom() +
                ", base=" + base +
                ", altura=" + altura +
                ", area=" + getArea() +
                ", perímetre=" + getPerimetre() +
                '}';
    }

    // Getters
    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }
}
