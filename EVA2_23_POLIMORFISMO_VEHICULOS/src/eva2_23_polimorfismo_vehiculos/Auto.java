package eva2_23_polimorfismo_vehiculos;

public class Auto extends Vehiculo implements Controles{
    
    private int anno;

    public Auto() {
    }

    public Auto(String marca, String modelo, int anno) {
        super(marca,modelo);
        this.anno = anno;
    }

    

    public int getAnno() {
        return anno;
    }

    

    public void setAnno(int anno) {
        this.anno = anno;
    }

    @Override
    public void acelerar(int cambio) {
        int camb = cambio + velocidad;
        if((camb) >= 0 ){ //acepta solo velocidades positivas
            velocidad = camb; //acumulador
        }
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad actual del Auto: " + getVelocidad() + "Km/H");
    }
    
    
    
}
