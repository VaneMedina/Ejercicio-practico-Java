package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Historial {
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;

    public Historial(LocalDate fechaAlquiler, LocalDate fechaDevolucion) {
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
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

}
