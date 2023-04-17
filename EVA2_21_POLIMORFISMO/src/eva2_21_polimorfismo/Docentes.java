package eva2_21_polimorfismo;

public class Docentes extends Persona {

    private String plaza;

    public Docentes() {
        super();
        this.plaza = "00000000";
    }

    public Docentes(String nombre, String apellido, int edad, String plaza) {
        super(nombre, apellido, edad);
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

    @Override
    //Reemplaza al metodo de la super clase
    //que tiene la misma firma
    //en este caso ocultamos a ImprimirDatos()
    public void imprimirDatos() {

        super.imprimirDatos(); //persona
        System.out.println("Plaza: " + plaza);
    }
}
