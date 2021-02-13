package Tarea;

import Entidades.Camara;
import Entidades.Cliente;

public class Main {

	public static void main(String[] args) {
		Camara cam = new Camara ("Canon", "Eos Rebel T7", true);	
		System.out.println(cam.getMarca());
		System.out.println(cam.getModelo());
		System.out.println(cam.getSoporte());
		
		Cliente cliente = new Cliente("Micaela","Alsina", 1213, "sadas", 1423);
		System.out.println(cliente.getNombre());
		System.out.println(cliente.getDireccion());
		System.out.println(cliente.getHistorialAlquiler());
		System.out.println(cliente.getMesesPenalizacion());
		System.out.println(cliente.getTelefono());
	}
	
}
