package eva2_23_polimorfismo_vehiculos;

public class Bicicleta extends Vehiculo implements Controles{
    
    private String rodada;
    private String tipo;

    public Bicicleta(String rodada, String tipo, String marca, String modelo) {
        super(marca, modelo);
        this.rodada = rodada;
        this.tipo = tipo;
    }

    public Bicicleta() {
        this.rodada = "----";
        this.tipo = "----";
    }

    public String getRodada() {
        return rodada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        System.out.println("Velocidad actual de la Bicicleta: " + getVelocidad() + "Km/H");
    }
    
    
    
}
