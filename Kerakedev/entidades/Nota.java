package Kerakedev.entidades;

public class Nota {

    private Materia materia;
    private double calificacion;

    public Materia getMateria() {
        return this.materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getCalificacion() {
        return this.calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public Nota(Materia materia, double calificacion) {
        this.materia = materia;
        this.calificacion = calificacion;
    }

  

    public void mostrar() {
        System.out.println("Clase Nota[materia=" + materia.getCodigo() + ", calificacion=" + calificacion + "]");
    }


    @Override
    public String toString() {
        return "Clase Nota[materia=" + materia + ", calificacion=" + calificacion + "]";
    }
    
}
