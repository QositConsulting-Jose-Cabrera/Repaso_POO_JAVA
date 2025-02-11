package modelo;

public class Estudiante extends Persona {

    public Estudiante(String nombre, int edad) {
        super(nombre, edad);
        
        String nombreClase = this.getClass().getSimpleName();
        System.out.println("Este es la clase " + nombreClase);

        String carrera = "Ingeniería en Sistemas";
        System.out.println("Carrera: " + carrera);


    }

}
