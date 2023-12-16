package Kerakedev.test;

import Kerakedev.entidades.Curso;
import Kerakedev.entidades.Estudiante;

public class TestEstudiante {


    public static void main(String[] args) {
        Curso curso = new Curso();

        
        Estudiante estudiante1 = new Estudiante("Juan", "Perez", "123456789");
        Estudiante estudiante2 = new Estudiante("Maria", "Lopez", "987654321");

        curso.agregarEstudiante(estudiante1);
        curso.agregarEstudiante(estudiante2);

        
        System.out.println("Información del curso después de agregar estudiantes:");
        curso.mostrar();
        System.out.println();

        
        Estudiante estudianteBusqueda = new Estudiante("Carlos", "Gomez", "123456789");
        String resultadoBusqueda = curso.buscarEstudiantePorCedula(estudianteBusqueda);
        System.out.println(resultadoBusqueda);
        System.out.println();

       
        double promedioCurso = curso.calcularPromedioCurso();
        System.out.println("Promedio del curso: " + promedioCurso);
    }
    
}
