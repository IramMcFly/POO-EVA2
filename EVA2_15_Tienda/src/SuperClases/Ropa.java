
package SuperClases;

/**
 *
 * @author iramb
 */
public abstract class Ropa extends Producto {
    
    private String marca;
    private String color;
    
    
    public Ropa(){
        this.color = "--";
        this.marca = "---";
        
    }
    public Ropa(String marca, String color){
        this.color = color;
        this.marca = marca;
        
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }
    
    @Override
    public String toString(){
        
        return "Marca: " + marca + "Color: "+color;
        
    }
}


