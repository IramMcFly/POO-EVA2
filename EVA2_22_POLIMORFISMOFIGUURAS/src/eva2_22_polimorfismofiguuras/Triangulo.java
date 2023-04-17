package eva2_22_polimorfismofiguuras;

public class Triangulo implements Figuras,printdatos{

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPer() {
        double hip = Math.hypot(base, altura);

        return base + hip + altura;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Triangulo");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPer());
    }
    
    
}
