package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class HistorialAlquiler {

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    private Cliente cliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;

    public HistorialAlquiler(Cliente cliente1, LocalDate fechaAlquiler1,LocalDate fechaDevolucion1) {
        this.cliente = cliente1;
        this.fechaAlquiler = fechaAlquiler1;
        this.fechaDevolucion = fechaDevolucion1;
    }


}
