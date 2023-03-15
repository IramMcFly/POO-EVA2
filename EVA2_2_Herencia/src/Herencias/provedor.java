package Herencias;

public class provedor {
	
	private String name;
    private String lname;
    private int age;
    private String RFC;

    public void setAge(int age) {
        this.age = age;
    }public void setLname(String lname) {
        this.lname = lname;
    }
    public void setName(String name) {
        this.name = name;
    }public void setRFC(String rFC) {
        RFC = rFC;
    }

    public int getAge() {
        return age;
    }public String getLname() {
        return lname;
    }public String getName() {
        return name;
    }public String getRFC() {
        return RFC;
    }
}
