package eva2_21_polimorfismo;

public class EVA2_21_POLIMORFISMO {

    public static void main(String[] args) {
        
        Estudiante est = new Estudiante("Pancho", "Pistolas", 13, "1535086328");
        est.imprimirDatos();
        
        
        Docentes doc = new Docentes("Ricardo", "Nevarez", 43, "7468912");
        doc.imprimirDatos();
        //puedo tratar a los objetos de las subclases
        //como objetos de la superclase
        //al reves no se puede
        //Estoy asignando un objeto de tipo estudiante
        //a una variable de tipo persona;        
        Persona perso = est;
        //estoy simplificando (Generalizando)
        Persona perso2 = doc;
        
        //es imposible convertir una persona en un estudiante;
        //no podemos agregar cosas, simplemente ocultamos propiedades
        Persona perso3 = new Persona();
        //Docentes doc2 = perso3;
        
        
    }

}
