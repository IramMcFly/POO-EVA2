
package eva2_17_interfaces;

public class EVA2_17_INTERFACES {

    public static void main(String[] args) {
        
        //no se puede generar un objeto de una interfaz
        //mostrarDatos c = new mostrarDatos();
        
        Persona s = new Persona(13, "Enriqueta Nates");
        s.imprimirDatos();
        
        Computadora c = new Computadora(12, "i7",3500,"Computadora");
        c.imprimirDatos();
        
    }
    
}

