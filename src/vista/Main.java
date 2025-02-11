package vista;

import modelo.Estudiante;
import modelo.Persona;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Persona persona = new Persona(null, 0);
       
        persona.setNombre("Juan");
        persona.setEdad(25);


        persona.mostrarInformacion();

        Persona persona2 = new Persona("Manolo", 30);

        persona2.mostrarInformacion();

        if (persona.equals(persona2)) {
            System.out.println("Los objetos son iguales");
        } else {
            System.out.println("Los objetos son diferentes");
        }

        System.out.println("-------------------");
        System.out.println("Este es la clase Estudiante");

        Estudiante estudiante = new Estudiante("Juan", 25);

        estudiante.mostrarInformacion();

        



        

        


    }
}
