package eva2_11_overridefiguras;

public class EVA2_11_OVERRIDEFIGURAS {

    public static void main(String[] args) {
        
        Circulo cir = new Circulo();
        Circulo cir2 = new Circulo(4);
        
        System.out.println(cir.Area());
        System.out.println(cir2.Per());
        
        Triangulo tr = new Triangulo();
        Triangulo tr2 = new Triangulo(4,6);
        
        System.out.println(tr.Area());
        System.out.println(tr2.Per());
        
        
        //las clases abtractas no sirven para crear objetos 
        //pero sirve para ser superclases
        
        //metodo abstracto, metodos con cabecera pero no implementacion
        
        //Interfaces: es un tipo de dato abstracto pero solo solo 
        //tiene metodos abstractos
        
    }
    
}
