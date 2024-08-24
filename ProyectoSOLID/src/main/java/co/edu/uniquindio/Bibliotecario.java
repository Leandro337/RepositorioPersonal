package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.List;

public class Bibliotecario extends Empleado implements GestionInventario {

    private List<Libro> libros = new ArrayList<>();
    private List<Prestamo> prestamos = new ArrayList<>();

    public Bibliotecario(String nombre, double idEmpleado) {
        super(nombre, idEmpleado);
    }

    @Override
    public void gestionarItem() {

    }
}
