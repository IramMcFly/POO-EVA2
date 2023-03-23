package eva2_14_clases_abstractas2;

public abstract class Persona {
    
    private int edad;
    private String nombre;

    public Persona(){
        this.edad = -1;
        this.nombre = "-----";
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
    
    //los metodos abstractos se pueden mezclar
    //con los metodos normales;
    public abstract void imprimirDatos();
    
}
