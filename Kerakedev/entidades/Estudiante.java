package Kerakedev.entidades;

import java.util.ArrayList;

public class Estudiante {

     private String nombre;
    private String apellido;
    private String cedula;
    private ArrayList<Nota> notas;

    public Estudiante(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.notas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

  

    public void agregarNota(Nota nuevaNota) {
        
        for (Nota notaExistente : notas) {
            if (notaExistente.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
                System.out.println("Ya existe una calificación para la materia " + nuevaNota.getMateria().getCodigo());
                return; 
            }
        }

        
        if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
            notas.add(nuevaNota);
            System.out.println("Nueva calificación agregada: " + nuevaNota);
        } else {
            System.out.println("La calificación debe estar en el rango de 0 a 10.");
        }
    }

    public void modificarNota(String codigoMateria, double nuevaCalificacion) {
        
        for (Nota nota : notas) {
            if (nota.getMateria().getCodigo().equals(codigoMateria)) {
               
                if (nuevaCalificacion >= 0 && nuevaCalificacion <= 10) {
                   
                    nota.setCalificacion(nuevaCalificacion);
                    System.out.println("Calificación modificada: " + nota);
                } else {
                    System.out.println("La nueva calificación debe estar en el rango de 0 a 10.");
                }
                return; 
            }
        }

        System.out.println("No se encontró una materia con el código " + codigoMateria);
    }


    public double calcularPromedioNotasEstudiante() {
        if (notas.isEmpty()) {
            return 0.0;
        }

        double sumaNotas = 0.0;
        int totalMaterias = notas.size();

        for (Nota nota : notas) {
            sumaNotas += nota.getCalificacion();
        }

        double promedio = sumaNotas / totalMaterias;

        return promedio;
    }

    public String mostrar() {
        StringBuilder resultado = new StringBuilder();

        resultado.append("Clase Estudiante[nombre=").append(nombre)
                .append(", apellido=").append(apellido)
                .append(", cedula=").append(cedula)
                .append(", notas=[ ");

        for (Nota nota : notas) {
            resultado.append("Clase Nota[materia=").append(nota.getMateria().getCodigo())
                    .append(", calificacion=").append(nota.getCalificacion())
                    .append("] ");
        }

        resultado.append("]]");

        return resultado.toString();
    }

    @Override
    public String toString() {
        return "Clase Estudiante[nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", notas=" + notas + "]";
    }
    
}
