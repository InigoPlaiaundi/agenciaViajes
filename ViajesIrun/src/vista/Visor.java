package vista;

import java.util.ArrayList;

import modelo.Cliente;
import modelo.Hotel;

public class Visor {

	public static void mostrarClientes(ArrayList<Cliente> clientes) {

		for (Cliente cliente :clientes) {
			
			System.out.println(cliente);
		}
	}
	
	public static void clienteRegistrado() {
		
		System.out.println("Cliente registrado");
	}
	
	public static void mostrarHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		
		System.out.println(hotel);
	}

}
