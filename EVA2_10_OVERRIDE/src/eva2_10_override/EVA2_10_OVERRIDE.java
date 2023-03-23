package eva2_10_override;

public class EVA2_10_OVERRIDE {

    public static void main(String[] args) {
        
        Persona perso1 = new Persona(); //instanciar 
        Persona perso2 = new Persona("Pancho Pistolas",69);
                
        System.out.println(perso1);
        System.out.println(perso2);
        
        
    }
    
}

class Persona{
    
    private String nombre;
    private int edad;

    public Persona(){
        this.edad = -1;
        this.nombre = "--";
    }
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        
        //NO ESTAMOS INVOCANDO AL METODO DE LA SUPER CLASE
        //AQUI ESTAMOS REEMPLAZANDO EL METODO TOTALMENTE
        
        String st = "Datos: \n" + "Nombre: " + nombre + "\n" 
                + "Edad: " + edad + "\n";
        return st;
    }
}