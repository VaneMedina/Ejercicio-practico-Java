package Tarea;

import Entidades.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Cliente cliente = new Cliente("Micaela","Alsina", 1213);

		Tienda tienda1 = new Tienda("pepito", "pepe", 123456789);
		Camara camara1 = new Camara("cannon", "gerger", true);
		tienda1.agregarItems(new Item(camara1, Estado.Alquilada,null,100));
		tienda1.agregarItems(new Item(camara1, Estado.Disponible,null,200));

		cliente.alquilarItem(tienda1.getItems().get(0));
		
		
		Scanner entrada = new Scanner(System.in);
		
		int op ; 
		
		
		do {
			ImprimirMenuPrincipal();
			
			op = entrada.nextInt();
			
			switch (op) {
			case 1:
				///
				do {
					ImprimirOpcionCamaras();
					
					op = entrada.nextInt();
					
					switch (op) {
					case 1:
						System.out.println("INGRESO A ALQUILAR");
							break;
					case 2:
						System.out.println("INGRESO A CAMARAS DISPONIBLES ");
							break;
					case 3:
						System.out.println("INGRESO A CAMARAS CON RETRASO ");
							break;
					//case 4:
						//System.out.println("INGRESO A SERVICIO TECNICO1 ");
							//break;
					case 4:
							break;	
					default:
						System.out.println(" ");
							break;
				}
					
				} while (op != 4);
				
				///
					break;
			case 2:
				///
				do {
					ImprimirOpcionClientes();
					
					op = entrada.nextInt();
					
					switch (op) {
					case 1:
						System.out.println("INGRESO A AGREGAR UN CLIENTE ");
							break;
					case 2:
						System.out.println("INGRESO A PENALIZAR UN CLIENTE ");
							break;
					case 3:
						System.out.println("INGRESO A DESPENALIZAR UN CLIENTE ");
							break;
					//case 4:
						//System.out.println("INGRESO A SERVICIO TECNICO2 ");
							//break;
					case 4:
							break;	
					default:
						System.out.println(" ");
							break;
				}
					
				} while (op != 4);
				///
					break;
			case 3:
				///
				do {

					ImprimirOpcionItems();

					op = entrada.nextInt();
					
					switch (op) {
					case 1:
						System.out.println("INGRESO A COSTO DE ALQUILER ");
							break;
					case 2:
						System.out.println("INGRESO A FECHA DE DEVOLUCIONCODIGO ");
							break;
					case 3:
						System.out.println("INGRESO A ESTADO DE LA CAMARA ");
							break;
					case 4:
						System.out.println("INGRESO A HISTORIAL DE ALQUILER ");
							break;
					case 5:
						System.out.println("INGRESO A CODIGO DE REFERENCIA");
							break;	
					case 6:
						System.out.println("");
							break;
					default:
						System.out.println(" ");
							break;
				}
					
				} while (op != 6);
				///
					break;
			case 4:
				///
				do {
					ImprimirOpcionServicioTecnico();
					
					op = entrada.nextInt();
					
					switch (op) {
					case 1:
						System.out.println("INGRESO A CAMARAS EN REPARACION ");
							break;
					case 2:
						System.out.println("INGRESO A HISTORIAL DE CAMARAS REPARADAS ");
							break;
					//case 3:
						//System.out.println("INGRESO A ITEMS4 ");
							//break;
					//case 4:
						//System.out.println("INGRESO A SERVICIO TECNICO4 ");
							//break;
					case 3:
							break;	
					default:
						System.out.println(" ");
							break;
				}
					
				} while (op != 3);
				///
					break;
				
			default:
				System.out.println(" ");
					break;
		}
			
		} while (op != 5);
		
		System.out.println("Saliendo del programa...");
		
		
			
			
		}

		public static void ImprimirMenuPrincipal(){
			System.out.println("------MENU PRINCIPAL------\n");
			System.out.println("Ingrese la opcion deseada:");
			System.out.println("1- Camaras");
			System.out.println("2- Clientes");
			System.out.println("3- Items");
			System.out.println("4- Servicio Tecnico");
			System.out.println("5- Salir del programa");
		}

		public static void ImprimirOpcionCamaras() {
			System.out.println("------MENU CAMARAS------\n");
			System.out.println("Ingrese la opcion deseada:");
			System.out.println("1- Alquilar");
			System.out.println("2- Camaras disponibles");
			System.out.println("3- Camaras con retraso");
			//System.out.println("4- Servicio Tecnico1");
			System.out.println("4- Regresar al menu principal");
		}

	public static void ImprimirOpcionClientes() {
		System.out.println("------MENU CLIENTES------\n");
		System.out.println("Ingrese la opcion deseada:");
		System.out.println("1- Agregar un cliente");
		System.out.println("2- Penalizar un cliente");
		System.out.println("3- Despenalizar un cliente");
		//System.out.println("4- Servicio Tecnico2");
		System.out.println("4- Regresar al menu principal");
	}

	public static void ImprimirOpcionItems() {
		System.out.println("------MENU ITEMS------\n");
		System.out.println("Ingrese la opcion deseada:");
		System.out.println("1- Costo de alquiler");
		System.out.println("2- Fecha de devolucion");
		System.out.println("3- Estado de la Camara");
		System.out.println("4- Historial de alquiler");
		System.out.println("5- Codigo de referencia");
		System.out.println("6- Regresar al menu principal");
	}

	public static void ImprimirOpcionServicioTecnico() {
		System.out.println("------MENU SERVICIO TECNICO------\n");
		System.out.println("Ingrese la opcion deseada:");
		System.out.println("1- Camaras en reparacion");
		System.out.println("2- Historial de camaras reparadas");
		//System.out.println("3- Items4");
		//System.out.println("4- Servicio Tecnico4");
		System.out.println("3- Regresar al menu principal");
	}

		
	}

