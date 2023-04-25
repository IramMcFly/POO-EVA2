package eva2_25_has.a.direction;

public class EVA2_25_HASADIRECTION {

    public static void main(String[] args) {
            
        Personas p = new Personas();
        p.setApellido("Pistolas");
        p.setEdad(69);
        p.setNombre("pancho");
        
        /*
        Direccion d = new Direccion("Tusa", 2042, "La Revo", "31135", "Neza", "Establo De Mexico");
        
        p.setDireccion(d);
        */
        p.imprimirDatos();
    }

}

class Direccion {

    private String calle;
    private int numero;
    private String colonia;
    private String cp;
    private String ciudad;
    private String estado;

    public Direccion(String calle, int numero, String colonia, String cp, String ciudad, String estado) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public Direccion() {
        this.calle = "calle";
        this.numero = 0;
        this.colonia = "colonia";
        this.cp = "cp";
        this.ciudad = "ciudad";
        this.estado = "estado";
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public String getColonia() {
        return colonia;
    }

    public String getCp() {
        return cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void imprimirDatos(){
        System.out.println("Direccion:");
        System.out.println(calle + "#" + numero + " " + colonia);
        System.out.println("CP: " + cp + " " + ciudad + " " + estado);
    }
    
}

class Personas{
    private String nombre;
    private String apellido;
    private int edad; 
    private Direccion direccion;

    public Personas() {
    }

    public Personas(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
    public void imprimirDatos(){
        System.out.println("Persona: ");
        System.out.println(nombre + " " + apellido + " " + edad);
        
        if(direccion == null){
            System.out.println("no tiene direccion");
        }
        else{
            direccion.imprimirDatos();
        }
    }
    
    
}
