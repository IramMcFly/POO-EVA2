
package eva2_20_vehiculos;

public class Vehiculo implements Controles{

    private String marca;
    private String ruedas;
    private String tipo;
    private String tamano;
    private int velocidad;

    public Vehiculo(String marca, String ruedas, String tipo, String tamano) {
        this.marca = marca;
        this.ruedas = ruedas;
        this.tipo = tipo;
        this.tamano = tamano;
    }

    public Vehiculo() {
        this.marca = "----";
        this.ruedas = "----";
        this.tipo = "----";
        this.tamano = "----";
    }

    @Override
    public void acelerar() {
        this.velocidad += 10;
    }

    @Override
    public void detener() {
        this.velocidad = 0;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Numero de ruedas: " + ruedas);
        System.out.println("Tipo: " + tipo);
        System.out.println("Largo del vehiculo: " + tamano);
    }
    
    
    

    public int getVelocidad() {
        return velocidad;
    }
   
    public String getMarca() {
        return marca;
    }

    public String getRuedas() {
        return ruedas;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    
    
    
}
