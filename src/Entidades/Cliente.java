package Entidades;


import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
	private String direccion;
	private int telefono;
	private List<Historial> historialAlquileres;
	private int mesesPenalizacion;


	public Cliente(String nombre, String direccion, int telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.historialAlquileres = new ArrayList<>();
		this.mesesPenalizacion = mesesPenalizacion;
	}

	/*public void alquilarItem(Item item){
		if (item.getEstado() == "disponible") {
			this.item = item;
			//this.item.alquilar();
		}else
			System.out.println("La cámara se encuentra"+item.getEstado());
	}*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public List<Historial> getHistorialAlquileres() {
		return historialAlquileres;
	}

	public void setHistorialAlquileres(List<Historial> historialAlquileres) {
		this.historialAlquileres = historialAlquileres;
	}

	public int getMesesPenalizacion() {
		return mesesPenalizacion;
	}
	public void setMesesPenalizacion(int mesesPenalizacion) {
		this.mesesPenalizacion = mesesPenalizacion;
	}
	
	public void fechaDespenalizacion() {
		
	}
	
}
