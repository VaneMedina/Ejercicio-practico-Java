package Tarea;

import Entidades.Camara;
import Entidades.Cliente;
import Entidades.Item;
import Entidades.Tienda;

public class Main {

	public static void main(String[] args) {
		/*Camara cam = new Camara ("Canon", "Eos Rebel T7", true);
		System.out.println(cam.getMarca());
		System.out.println(cam.getModelo());
		System.out.println(cam.getSoporte());
		
		Cliente cliente = new Cliente("Micaela","Alsina", 1213);
		System.out.println(cliente.getNombre());
		System.out.println(cliente.getDireccion());
		System.out.println(cliente.getHistorialAlquiler());
		System.out.println(cliente.getMesesPenalizacion());
		System.out.println(cliente.getTelefono());*/

		Cliente cliente = new Cliente("Micaela","Alsina", 1213);


		Tienda tienda1 = new Tienda("pepito", "pepe", 123456789);
		Camara camara1 = new Camara("cannon", "gerger", true);
		tienda1.agregarItems(new Item(camara1, "alquilada"));
		tienda1.agregarItems(new Item(camara1, "en la tienda"));

		cliente.alquilarItem(tienda1.getItems().get(0));
	}
}
