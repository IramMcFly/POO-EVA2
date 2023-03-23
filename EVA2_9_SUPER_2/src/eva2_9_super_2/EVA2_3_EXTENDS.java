package eva2_9_super_2;

public class EVA2_3_EXTENDS {

    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante("pepe","garza",34,"113243"); 
        estudiante.imprimirDatos();
        
        Docentes doc = new Docentes("Pancho", "Pistolas", 69, "324123");
        doc.imprimirDatos();
        System.out.println("No.Plaza: " + doc.getPlaza());
        
        Proveedores pro = new Proveedores("Juan", "Camaney", 43, "CAPJ1234442");
        pro.imprimirDatos();
        System.out.println("RFC: " + pro.getRfc());
    }
}
