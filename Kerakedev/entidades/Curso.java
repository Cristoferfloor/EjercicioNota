

package Kerakedev.entidades;

import java.util.ArrayList;

public class Curso {


    private ArrayList<Estudiante> estudiantes;


    public Curso(){
        this.estudiantes= new ArrayList<>();
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    public String buscarEstudiantePorCedula(Estudiante estudiante) {
        for (Estudiante e : estudiantes) {
            if (e.getCedula().equals(estudiante.getCedula())) {
                
                return "El estudiante con cédula " + estudiante.getCedula() + " ya está en el curso.";
            }
        }

        
        return null;
    }

    public double calcularPromedioCurso() {
        if (estudiantes.isEmpty()) {
            
            return 0.0;
        }

        double sumaPromedios = 0.0;

        for (Estudiante estudiante : estudiantes) {
            sumaPromedios += estudiante.calcularPromedioNotasEstudiante();
        }

        
        double promedioCurso = sumaPromedios / estudiantes.size();

        return promedioCurso;
    }
    public void mostrar() {
        System.out.println("Clase Curso[estudiantes=[ ");

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.mostrar());
        }

        System.out.println("]]");
    }


    @Override
    public String toString() {
        return "Clase Curso[estudiantes=" + estudiantes + "]";
    }
    

    
}