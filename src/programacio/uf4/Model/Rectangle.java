package programacio.uf4.Model;

public class Rectangle extends Poligon {
    float base, altura;

    public Rectangle(float base, float altura) {
        super("Rectangle");
        this.base = base;
        this.altura = altura;
    }

    // Mètodes
    @Override
    public float calcularArea() {
        return base * altura;
    }

    @Override
    public float calcularPerimetre() {
        return 2 * base + 2 * altura;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
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

    // Setter
    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}