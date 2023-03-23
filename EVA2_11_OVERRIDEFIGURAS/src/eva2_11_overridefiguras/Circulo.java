package eva2_11_overridefiguras;

public class Circulo extends Figura{
    
    private double radio;

    public Circulo (){
        this.radio = 0;
    }
    public Circulo(double radio){
        this.radio = radio;
        
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    
    @Override
    public double Area(){
          
        return Math.PI * (radio*radio);
    }
    @Override
    public double Per(){
        
        return Math.PI * (radio *2);
        
    }
    
}
