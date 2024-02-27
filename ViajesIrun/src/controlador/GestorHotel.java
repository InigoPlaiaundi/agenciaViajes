package controlador;

import java.util.Scanner;

import modelo.Cliente;
import modelo.GestorBBDD;
import vista.Formulario;
import vista.Menu;
import vista.Visor;

public class GestorHotel {

	public static void main(String[] args) {
		run();
	}

	public static void run() {

		Scanner scan = new Scanner(System.in);
		int option;
		int cif;
		GestorBBDD gestorBBDD = new GestorBBDD();
		Cliente cliente = new Cliente();

		do {

			Menu.MostrarMenuPrincipal();
			option = Integer.parseInt(scan.nextLine());

			switch (option) {

			case Menu.VER_CLIENTES:
				gestorBBDD.conectar();
				Visor.mostrarClientes(gestorBBDD.getClientes());
				break;

			case Menu.REGISTRAR_CLIENTE:
				gestorBBDD.conectar();
				Formulario.pedirDatosCliente(scan, cliente);
				gestorBBDD.registrarCliente(cliente);
				Visor.clienteRegistrado();
				break;

			case Menu.VER_HOTEL:
				gestorBBDD.conectar();
				cif = Formulario.pedirCifHotel(scan);
				Visor.mostrarHotel(gestorBBDD.getHotel(cif));

			default:
				break;
			}

		} while (option != 0);

	}

}
