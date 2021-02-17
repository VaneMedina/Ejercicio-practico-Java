package Entidades;



public class Cliente {
	private String nombre;
	private String direccion;
	private int telefono;
	private String historialAlquiler;
	private int mesesPenalizacion;
	private Item item;
	
	public Cliente(String nombre, String direccion, int telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.historialAlquiler = historialAlquiler;
		this.mesesPenalizacion = mesesPenalizacion;
	}


	public void alquilarItem(Item item){
		if (item.getEstado() == "disponible") {
			this.item = item;
			this.item.alquilar();
		}else
			System.out.println("La cámara se encuentra"+item.getEstado());
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

	public String getHistorialAlquiler() {
		return historialAlquiler;
	}
	public void setHistorialAlquiler(String historialAlquiler) {
		this.historialAlquiler = historialAlquiler;
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
