package eva2_20_vehiculos;

public class Auto extends Vehiculo implements Controles{

    private int puertas;
    
    
    public Auto() {
        super();
        puertas = 0;
    }
    
    public Auto(String marca, String ruedas, String tipo, String tamano, int puertas){
        super(marca, ruedas, tipo, tamano);
        this.puertas = puertas;
    }
    
    
    
    
    @Override
    public void acelerar() {
        super.acelerar();
    }

    @Override
    public void detener() {
        super.detener();
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Numero de puertas: " + puertas);
    }
    
    
}
