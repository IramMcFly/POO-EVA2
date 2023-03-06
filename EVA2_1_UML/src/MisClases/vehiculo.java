package MisClases;

public class vehiculo {
	
	private String marca;
	private String model;
	private int anno;
	
	public String getMarca() {
		return marca;
	}
	public String getModel() {
		return model;
	}
	public int getAno() {
		return anno;
	} 
	
	public void setMarca(String d) {
		marca = d;
	}
	public void setModel(String d) {
		model = d;
	}
	public void setAno(int d) {
		anno = d;
	}
	
	public void imprimirDatos() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + model);
		System.out.println("Ano: " + anno);
	}
	
}
