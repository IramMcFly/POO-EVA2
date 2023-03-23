/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_protect;

/**
 *
 * @author iramb
 */
public class EVA2_16_PROTECT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Superclase objs = new Superclase();
        
        objs.dato = 100;
        
    }
    
}

class Superclase{
    protected int dato;
    
    
    
}

class SubClase extends Superclase{
    
    public void Imprimir(){
        System.out.println("Dato: " + dato);
    }
    
}