package MisClases;

public class persona {
	private int ID;
	private String name;
	private int age;
	
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setID(int d) {
		ID = d;
	}
	public void setName(String d) {
		name = d;
	}
	public void setAge(int d) {
		age = d;
	}
	
	public void imprimirDatos() {
		System.out.println("ID: " + ID);
		System.out.println("Nombre: " + name);
		System.out.println("Edad: " + age);
	}
	
	
}
