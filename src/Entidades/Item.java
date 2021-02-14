package Entidades;

import java.time.LocalDate;

/*
Cada item se alquila un máximo de 7 días, por cada día de retraso, se impone una “multa” de un mes sin posibilidad de obtener una nueva cámara. */

public class Item {
    private Camara camara;
    private String estado;
    private LocalDate fechaAlquiler;

    public Item(Camara camara, String estado) {
        this.camara = camara;
        this.estado = estado;
    }

    public void alquilar(){
        fechaAlquiler = LocalDate.now();
        this.setEstado("alquilada");
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }
}
