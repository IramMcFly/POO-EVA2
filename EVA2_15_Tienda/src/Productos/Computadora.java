/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import SuperClases.Electronica;

/**
 *
 * @author iramb
 */
final public class Computadora extends Electronica {
    
    private String tamano;
    private int DD;
    private String CPU;
    private int RAM;
    
    public Computadora(){
        this.tamano = "--";
        this.DD = 0;
        this.CPU = "--";
        this.RAM = 0;
    }
    
    public Computadora(String tamano,int DD,String CPU,int RAM){
        this.tamano = tamano;
        this.DD = DD;
        this.CPU = CPU;
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public int getDD() {
        return DD;
    }

    public int getRAM() {
        return RAM;
    }

    public String getTamano() {
        return tamano;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public void setDD(int DD) {
        this.DD = DD;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
    
    @Override
    public double precioVenta(int cant){
        return precio * cant;
    }
    
    @Override
    public String toString(){
        super.toString();
        return "Tamano: " + tamano + "Disco Duro: " +DD + "CPU: "+ CPU + "RAM: " + RAM;
        
    }
    
}

//Computadora es una clase final:
//Ya no se puede heredar de una clase final;
/*class laptop  extends Computadora{
}
*/