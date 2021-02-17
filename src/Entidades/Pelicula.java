package Entidades;

public class Pelicula {
    private String marca;
    private String nombre;
    private String sensibilidad;
    private String formato;
	
    
    public Pelicula(String marca, String nombre, String sensibilidad, String formato) {
		super();
		this.marca = marca;
		this.nombre = nombre;
		this.sensibilidad = sensibilidad;
		this.formato = formato;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getSensibilidad() {
		return sensibilidad;
	}


	public void setSensibilidad(String sensibilidad) {
		this.sensibilidad = sensibilidad;
	}


	public String getFormato() {
		return formato;
	}


	public void setFormato(String formato) {
		this.formato = formato;
	}
    
    

    
    

}
