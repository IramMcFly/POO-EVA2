package eva2_20_vehiculos;

import java.util.Iterator;


public class EVA2_20_VEHICULOS {

    public static void main(String[] args) {
        
        Auto a = new Auto("Red Bull", "4", "F1", "2M", 0);
        
        for (int i = 0; i<=30; i++) {
            a.acelerar();
        }
        System.out.println("velocidad actual: " + a.getVelocidad() + "Km/H");
        a.imprimirDatos();
        
        System.out.println("");
        
        Bicicleta baika = new Bicicleta("Walmart", "2", "BMX", "1M", "Disco", 5);
        baika.acelerar();
        System.out.println("velocidad actual: " + baika.getVelocidad() + "Km/H");
        baika.imprimirDatos();

    }

}
