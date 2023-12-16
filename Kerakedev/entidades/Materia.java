package Kerakedev.entidades;
public class Materia {

    private String codigo;
    private String nombre;

    public Materia(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Clase Materia[codigo=" + codigo + ", nombre=" + nombre + "]";
    }
}
