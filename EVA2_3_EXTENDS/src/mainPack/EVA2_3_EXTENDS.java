package mainPack;

public class EVA2_3_EXTENDS {

	public static void main(String[] args) {
		
		Estudiante estu = new Estudiante();
        //estu.
        estu.setNombre("Iram");
        estu.setApellido("Ballesteros");
        estu.setEdad(18);
        estu.setNoControl("22550289");
        System.out.println("Imprimir datos estudiante:");
        System.out.println("Nombre: "+estu.getNombre());
        System.out.println("Apellido: "+estu.getApellido());
        System.out.println("Edad: "+estu.getEdad());
        System.out.println("Numero de control: "+estu.getNoControl());
        
        Proveedores prov = new Proveedores();
        prov.setNombre("Jean");
        prov.setApellido("Lopez");
        prov.setEdad(18);
        prov.setRfc("LOLJ040726GN7");
        System.out.println("Imprimir datos proveedor:");
        System.out.println("Nombre: "+prov.getNombre());
        System.out.println("Apellido: "+prov.getApellido());
        System.out.println("Edad: "+prov.getEdad());
        System.out.println("RFC: "+prov.getRfc());
		
	}

}
