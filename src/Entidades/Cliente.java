package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nombre;
	private String direccion;
	private int telefono;
	private List<Historial> historialAlquileres;
	private LocalDate mesesPenalizacion;


	public Cliente(String nombre, String direccion, int telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.historialAlquileres = new ArrayList<>();
	}


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

	public LocalDate getFechaDespenalizacion() {
		return mesesPenalizacion;
	}
	public void setMesesPenalizacion(LocalDate mesesPenalizacion) {
		this.mesesPenalizacion = mesesPenalizacion;
	}

}
