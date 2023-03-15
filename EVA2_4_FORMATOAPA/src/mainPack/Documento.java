package mainPack;

public class Documento {

	private String autor;
	private String titulo;
    private int ano;
    private String mes;
    private String dia;
    private String ciudad;
    
    
    public String getTitulo() {
    	return titulo;
    }
    public int getAno() {
        return ano;
    }public String getAutor() {
        return autor;
    }public String getCiudad() {
        return ciudad;
    }public String getDia() {
        return dia;
    }public String getMes() {
        return mes;
    }

    public void setTitulo(String titulo) {
    	this.titulo = titulo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }public void setAutor(String autor) {
        this.autor = autor;
    }public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }public void setDia(String dia) {
        this.dia = dia;
    }public void setMes(String mes) {
        this.mes = mes;
    }
	
}
