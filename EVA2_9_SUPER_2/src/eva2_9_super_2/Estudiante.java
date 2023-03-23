package eva2_9_super_2;

public class Estudiante extends Persona {
	   private String noControl;

           public Estudiante(){
               super();//llamada al constructor de la super clase
               this.noControl = "00000000";
           }
    public Estudiante(String nombre, String apellido, int edad, String noControl){
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }
           
	    public String getNoControl() {
	        return noControl;
	    }

	    public void setNoControl(String noControl) {
	        this.noControl = noControl;
	    }
            
    @Override
    //Reemplaza al metodo de la super clase
    //que tiene la misma firma
    //en este caso ocultamos a ImprimirDatos()
    public void imprimirDatos(){
            
        super.imprimirDatos(); //persona
        System.out.println("No.Control: " + noControl);
        /*
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        
        */
    }
}