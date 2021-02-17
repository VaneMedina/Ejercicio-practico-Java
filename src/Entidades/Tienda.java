package Entidades;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String duenio;
    private String direccion;
    private int telefono;
    private List<Item> items;

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
    
    public String alquilarItem(Cliente cliente, Item item) {
		if (item.getEstado() != Estado.Disponible){
		    return "El item se encuentra alquilado.";
        }else{
		    item.setEstado(Estado.Alquilada);
		    item.getHistorialAlquileres().add(new HistorialItem(cliente, LocalDate.now(), LocalDate.now().plusDays(7)));
		    cliente.getHistorialAlquileres().add(new HistorialCliente(item, LocalDate.now(), LocalDate.now().plusDays(7)));
        }
		return "El item se ha alquilado correctamente.";
	}
    
    public void personalizar() {
		
	}
    
    public void obtenerCamarasDisponibles() {
		
	}
    
    public void obtenerCamarasConRetraso() {
		
	}
    
    public void repararCamara() {
		
	}
    
    public void obtenerCamaraEnReparacion() {
		
	}
}

