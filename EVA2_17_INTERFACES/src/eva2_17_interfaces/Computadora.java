/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_17_interfaces;

/**
 *
 * @author iramb
 */
public class Computadora extends Producto implements mostrarDatos{
    
    private String CPU;
    private int RAM;

    public Computadora(){
    }
    public Computadora(int RAM,String CPU,double precio, String nombre ){
        super(nombre,precio);
        this.RAM = RAM;
        this.CPU = CPU;
    }
    
    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("RAM: " + RAM);
        System.out.println("CPU: " + CPU);
    }
    
}
