package controlador;

import java.util.Scanner;

import modelo.GestorBBDD;
import vista.Menu;

public class GestorHotel {

	public static void main(String[] args) {
		run();
	}

	public static void run() {

		Scanner scan = new Scanner(System.in);
		int option;
		GestorBBDD gestorBBDD = new GestorBBDD();

		do {

			Menu.MostrarMenuPrincipal();
			option = Integer.parseInt(scan.nextLine());

			switch (option) {
			case Menu.VER_CLIENTES:
				
				gestorBBDD.conectar();
				gestorBBDD.verClientes();

				break;

			default:
				break;
			}

		} while (option != 0);

	}

}
