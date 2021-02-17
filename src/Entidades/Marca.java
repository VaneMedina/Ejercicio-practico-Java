package Entidades;

public class Marca {
    private String nombre;
    private String servicioReparacion;

    public Marca(String nombre, String servicioReparacion) {
        this.nombre = nombre;
        this.servicioReparacion = servicioReparacion;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getServicioReparacion() {
		return servicioReparacion;
	}

	public void setServicioReparacion(String servicioReparacion) {
		this.servicioReparacion = servicioReparacion;
	}
    
    
}
