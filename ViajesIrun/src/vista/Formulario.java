package vista;

import java.util.Scanner;

import modelo.Cliente;

public class Formulario {

	public static Cliente pedirDatosCliente(Scanner scan, Cliente cliente) {

		System.out.println("dni del cliente");
		int dni = Integer.parseInt(scan.nextLine());
		cliente.setDni(dni);

		System.out.println("nombre del cliente");
		String nombre = scan.nextLine();
		cliente.setNombre(nombre);

		System.out.println("apellido del cliente");
		String apellido = scan.nextLine();
		cliente.setApellido(apellido);

		System.out.println("direccion del cliente");
		String direccion = scan.nextLine();
		cliente.setDireccion(direccion);

		System.out.println("localidad del cliente");
		String localidad = scan.nextLine();
		cliente.setLocalidad(localidad);

		return cliente;
	}

	public static  int pedirCifHotel(Scanner scan) {

		System.out.println("Introduce cif del hotel");
		int cif = Integer.parseInt(scan.nextLine());
		return cif;
		
	}
}
