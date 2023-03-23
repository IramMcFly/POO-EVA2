package mainPack;

public class EVA2_8_SUPER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Animal("PAncho" ,7);
		Mamifero mamifero = new Mamifero("cafe","Pepe",87);
		Canes can = new Canes();
	}

}

class Animal {
	private String nombre;
	private int peso;
	
	
	public Animal() {
		System.out.println("ITS ALIVE");
	}
	public Animal(String nombre, int peso) {
		this.nombre = nombre;
		this.peso = peso;
		
		System.out.println("ITS ALIVE,  Constructor 2");
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}public int getPeso() {
		return peso;
	}
	
	
	public void respirar() {
		System.out.println("Estoy respirando");
	}
}

class Mamifero extends Animal{
	
	private String colorPelo;
	
	
	public Mamifero() {
		//super -> apuntador a superclase
		//lo primero a llamar en un constructor es llamar
		//al constructor de la super clase
		super();
		System.out.println("mamifero");
	}
	
	public Mamifero(String colorPelo, String nombre, int peso) {
		
		super(nombre,peso); //llamada al constructor de la super clase
		this.colorPelo = colorPelo;
		System.out.println("mamifero - constructor 2");
	}
	
	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}
	public String getColorPelo() {
		return colorPelo;
	}
}

class Canes extends Mamifero{
	public Canes() {
		super();
		System.out.println("Soy un perro");
	}
}

