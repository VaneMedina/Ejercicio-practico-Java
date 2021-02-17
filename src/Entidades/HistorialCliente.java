package Entidades;

import java.time.LocalDate;

public class HistorialCliente extends Historial{
    private Item item;
    public HistorialCliente(Item item,LocalDate fechaAlquiler, LocalDate fechaDevolucion) {
        super(fechaAlquiler, fechaDevolucion);
        this.item = item;
    }
}
