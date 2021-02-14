package Entidades;

public class Camara {
	private String marca;
	private String modelo;
	private Boolean soporte;

	public Camara(String marca, String modelo, Boolean soporte) {
		this.marca = marca;
		this.modelo = modelo;
		this.soporte = soporte;
}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Boolean getSoporte() {
		return soporte;
	}
	public void setSoporte(Boolean soporte) {
		this.soporte = soporte;
	}
}

