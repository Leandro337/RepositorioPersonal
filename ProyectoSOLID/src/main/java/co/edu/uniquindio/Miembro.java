package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class Miembro {

    private String nombre;
    private double idMiembro;
    private List<Prestamo> prestamo = new ArrayList<>();

    public Miembro(String nombre, double idMiembro) {
        this.nombre = nombre;
        this.idMiembro = idMiembro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIdMiembro() {
        return idMiembro;
    }

    public void setIdMiembro(double idMiembro) {
        this.idMiembro = idMiembro;
    }

    public List<Prestamo> getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(List<Prestamo> prestamo) {
        this.prestamo = prestamo;
    }
}
