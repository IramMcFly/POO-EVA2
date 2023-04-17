package eva2_23_polimorfismo_vehiculos;

public class EVA2_23_POLIMORFISMO_VEHICULOS {

    public static void main(String[] args) {
        
        Auto a = new Auto("RedBull", "RB19", 2023);
        cambiarVelocidad(a, 340);
        
        Bicicleta bike = new Bicicleta("19'", "BMX", "Petronas", "PET56A");
        cambiarVelocidad(bike, 50);
        
        // Clase Object --> 
    }
    
    public static void cambiarVelocidad(Controles vehi, int vel){
        vehi.acelerar(vel);
        vehi.tablero();
    }
    
}
