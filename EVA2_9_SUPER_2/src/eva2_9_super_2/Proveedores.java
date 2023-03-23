package eva2_9_super_2;

public class Proveedores extends Persona {
    private String rfc;

    public Proveedores(){
        super();
        this.rfc = "XXXX000000";
    }
    
    public Proveedores(String nombre, String apellido, int edad, String rfc){
        super(nombre, apellido, edad);
        this.rfc = rfc;
    }
    
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    @Override
    //Reemplaza al metodo de la super clase
    //que tiene la misma firma
    //en este caso ocultamos a ImprimirDatos()
    public void imprimirDatos(){
            
        super.imprimirDatos(); //persona
        System.out.println("RFC: " + rfc);
    }
}
