
package eva2_13_figuras_abstractas;

public class Triangulo extends Figura{
    
    private double base;
    private double altura;
    
    public Triangulo(){
        this.base = 0;
        this.altura = 0; 
    }
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
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
    public double Area(){
          
        return (base*altura) / 2;
    }
    @Override
    public double Per(){
        
        double hip = Math.hypot(base, altura);
        
        return base + hip + altura;
        
        
    }
}
