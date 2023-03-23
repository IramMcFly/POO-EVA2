package eva2_18_interfaces_herencia;

public class EVA2_18_INTERFACES_HERENCIA {

    public static void main(String[] args) {
        
        Prueba B = new Prueba();
        
        B.A();
    }

}

interface intA{
    void A();
}

interface intB{
    void B();
}

interface intC extends intA,intB{
    public abstract void C();
}

class Prueba implements intC{

    @Override
    public void A() {
        System.out.println("A");
    }

    @Override
    public void B() {
        System.out.println("B");
    }

    @Override
    public void C() {
        System.out.println("C");
    }
    
}