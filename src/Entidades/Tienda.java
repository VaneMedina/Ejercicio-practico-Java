package Entidades;


/*La tienda alquila cámaras fotográficas analógicas.
Las cámaras se caracterizan por su marca, modelo y soporte flash (si, no).
Cada cámara es compatible con uno o más tipos de películas.
Las películas se caracterizan por su marca, nombre, sensibilidad ISO (50, 100, 200, 400, 800, 1600) y formato (35mm, 110mm, 120mm).
Para cada marca con la que trabaja la tienda se conoce la dirección del servicio de reparación más cercano.
La tienda dispone de varios ítems de cada modelo de cámara.
Cada ítem tiene una pegatina con una referencia, y puede estar en la tienda, alquilado, con retraso o en reparación.
Los clientes pueden tener un máximo de 1 cámara en alquiler.
Cada cámara se alquila un máximo de 7 días, por cada día de retraso, se impone una “multa” de un mes sin posibilidad de coger una nueva cámara. */

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String duenio;
    private String direccion;
    private int telefono;
    List<Item> items;

    public Tienda(String duenio, String direccion, int telefono) {
        this.duenio = duenio;
        this.direccion = direccion;
        this.telefono = telefono;
        this.items = new ArrayList<>();
    }

    public void agregarItems(Item item){
        items.add(item);
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
