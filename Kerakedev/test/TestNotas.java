package Kerakedev.test;

import Kerakedev.entidades.Estudiante;
import Kerakedev.entidades.Materia;
import Kerakedev.entidades.Nota;

public class TestNotas {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan", "Perez", "123456789");

      
        Nota nota1 = new Nota(new Materia("MAT123", "Matemáticas"), 90.5);
        Nota nota2 = new Nota(new Materia("PHY456", "Física"), 85.0);

        estudiante.agregarNota(nota1);
        estudiante.agregarNota(nota2);

     
        System.out.println("Información del estudiante después de agregar notas:");
        System.out.println(estudiante.mostrar());
        System.out.println();

        
        estudiante.modificarNota("MAT123", 95.0);

        
        System.out.println("Información del estudiante después de modificar nota:");
        System.out.println(estudiante.mostrar());
        System.out.println();

        
        double promedioEstudiante = estudiante.calcularPromedioNotasEstudiante();
        System.out.println("Promedio del estudiante: " + promedioEstudiante);
    }
    
}
