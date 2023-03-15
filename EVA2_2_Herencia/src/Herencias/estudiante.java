package Herencias;

public class estudiante {

	private String name;
	private String lname;
	private String ncont;
	private int age;
	
	public estudiante() {
	}
	
    public int getAge() {
        return age;
    }
	public String getName() {
        return name;
    }
    public String getLname() {
        return lname;
    }
	public String getNcont() {
        return ncont;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNcont(String ncont) {
        this.ncont = ncont;
    }
}
