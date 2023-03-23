package mainPack;

public class EVA2_7_THIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//imprimir() no es estatic
		//this no se puede usar en un contexto static
	}
	
	public void imprimir() {
		//aqui es visible this
	}

}


//todos los objetos tienen this
//
class Persona{
	
	private String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
		//this.nombre pertenece a la clase
		//
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void imprimirDatos() {
		System.out.println("El nombre es: " + this.nombre);
	}
	
}