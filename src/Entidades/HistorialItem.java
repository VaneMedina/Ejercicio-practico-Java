package Entidades;

import java.time.LocalDate;

public class HistorialItem extends Historial{
    private Cliente cliente;
    public HistorialItem(Cliente cliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion) {
        super(fechaAlquiler, fechaDevolucion);
        this.cliente = cliente;

    }
}
