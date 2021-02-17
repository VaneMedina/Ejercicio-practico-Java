package Entidades;

import java.time.LocalDate;
import java.util.List;


public class Item {
    private Camara camara;

    private Estado estado;
    public List<HistorialAlquiler> historialAlquileres;

    private double costoAlquiler;

    public Item(Camara camara, Estado estado, HistorialAlquiler historial, double costoAlquiler) {
        this.camara = camara;
        this.estado = estado;
        this.historialAlquileres.add(historial);
        this.costoAlquiler = costoAlquiler;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }


    public List<HistorialAlquiler> getHistorialAlquilers() {
        return historialAlquileres;
    }

    public void setHistorialAlquilers(List<HistorialAlquiler> historialAlquilers) {
        this.historialAlquileres = historialAlquilers;
    }

    public double getCostoAlquiler() {
        return costoAlquiler;
    }

    public void setCostoAlquiler(double costoAlquiler) {
        this.costoAlquiler = costoAlquiler;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
