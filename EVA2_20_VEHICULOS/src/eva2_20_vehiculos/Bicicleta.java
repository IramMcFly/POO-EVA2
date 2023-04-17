package eva2_20_vehiculos;

public class Bicicleta extends Vehiculo implements Controles{

    private String tipoFrenos;
    private int velocidades;
    
    public Bicicleta() {
    }

    public Bicicleta(String marca, String ruedas, String tipo, String tamano, String tipoFrenos, int velocidades) {
        super(marca,ruedas,tipo,tamano);
        this.tipoFrenos = tipoFrenos;
        this.velocidades = velocidades;
    }

    public String getTipoFrenos() {
        return tipoFrenos;
    }

    public int getVelocidades() {
        return velocidades;
    }

    public void setTipoFrenos(String tipoFrenos) {
        this.tipoFrenos = tipoFrenos;
    }

    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
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
        System.out.println("Tipo de frenos: " + tipoFrenos);
        System.out.println("Numero de Cambios (Velocidades): " + velocidades);
    }
}
