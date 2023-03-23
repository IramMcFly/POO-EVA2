/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperClases;

/**
 *
 * @author iramb
 */
public abstract class Electronica extends Producto{
    private String fabricante;
    private String modelo;
    private int garantia;
    
    public Electronica(){
        this.fabricante = "---";
        this.garantia = 0;
        this.modelo = "----";
    }
    
    public Electronica(String fabricante,String modelo,int garantia){
        this.fabricante = "---";
        this.garantia = 0;
        this.modelo = "----";
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getGarantia() {
        return garantia;
    }

    public String getModelo() {
        return modelo;
    }
    
    @Override
    public String toString(){
        
        return "Fabricante: " + fabricante + "Modelo: "+ modelo + "Garantia: "+ garantia;
        
    }
    
}
