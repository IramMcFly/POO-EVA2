package eva2_22_polimorfismofiguuras;

public class Circulo implements Figuras,printdatos{
    
    private double radio;
    final private double pi = Math.PI;

    public Circulo() {
    }
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    
    public double getPi() {
        return pi;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return pi*radio*radio;
    }

    @Override
    public double calcularPer() {
        return 2*pi*radio;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Circulo");
        System.out.println("Radio: " + radio);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPer());
    }
    
    
}
