/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import SuperClases.Ropa;

/**
 *
 * @author iramb
 */
public class Playera extends Ropa{
    
    private String talla;
    private String tipo;
    
    public Playera(){
        this.talla = "--";
        this.tipo = "----";
    }
    public Playera(String talla, String tipo){
        this.talla = talla;
        this.tipo = tipo;
    }
    

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }
    
    @Override
    public double precioVenta(int cant){
        return precio * cant;
    }
    
    @Override
    public String toString(){
        super.toString();
        return "Talla: " + talla + "Tipo: " + tipo;
        
    }
}
