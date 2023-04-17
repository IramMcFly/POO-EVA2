package eva2_19_interfaces_figuras;

public class EVA2_19_INTERFACES_FIGURAS {

    public static void main(String[] args) {
        
        //no se pueden crear objetos de Interfaces;
        //Figura f = new Figura();
        
        Circulo C = new Circulo(7);
        C.imprimirDatos();
        
        Triangulo T = new Triangulo();
        T.setAltura(8);
        T.setBase(5);
        T.imprimirDatos();
      
        
    }

}
