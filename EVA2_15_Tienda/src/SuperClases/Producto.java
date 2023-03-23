/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperClases;

/**
 *
 * @author iramb
 */
public abstract class Producto {
    
    private String nombre;
    protected double precio;
    private String unidad;
    
    //protected nos permite tener visibilidad entre clases relacionadas con herencia
    //atributos y metodos
    //funciona como default a nivel de paquete y permite a las subclases acceso;
    //public, default, private, protected;

    public Producto (){
        this.nombre = "";
        this.precio = 0;
        this.unidad = "";
    }
    public Producto (String nombre,double precio,String unidad){
        this.nombre = nombre;
        this.precio = precio;
        this.unidad = unidad;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getUnidad() {
        return unidad;
    }
    
    public double precioVenta(int cant){
        return 0;
    }
    
    public String toString(){
        
        return "Nommbre " + nombre + "Precio "+ precio + "Unidades "+ unidad;
        
    }
}
