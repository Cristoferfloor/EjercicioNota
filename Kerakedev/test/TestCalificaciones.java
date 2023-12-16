package Kerakedev.test;

import Kerakedev.entidades.Materia;
import Kerakedev.entidades.Nota;

public class TestCalificaciones {

    public static void main(String[] args) {
         Materia matematicas = new Materia("MAT123", "Matemáticas");

        
        Nota nota = new Nota(matematicas, 90.5);

        
        System.out.println("Información de la nota:");
        nota.mostrar();
        System.out.println();

       
        nota.setCalificacion(95.0);

       
        System.out.println("Información de la nota después de la modificación:");
        nota.mostrar();
    }
    
}
