package Entidades;

import java.util.ArrayList;
import java.util.List;


public class Item {
    private Camara camara;
    private Estado estado;
    private List<Historial> historialAlquileres;
    private double costoAlquiler;

    public Item(Camara camara, Estado estado, double costoAlquiler) {
        this.camara = camara;
        this.estado = estado;
        this.historialAlquileres = new ArrayList<>();
        this.costoAlquiler = costoAlquiler;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public List<Historial> getHistorialAlquileres() {
        return historialAlquileres;
    }

    public void setHistorialAlquilers(List<Historial> historialAlquilers) {
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
