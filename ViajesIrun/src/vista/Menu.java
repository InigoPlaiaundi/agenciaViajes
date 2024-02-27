package vista;

public class Menu {
	
	public static final int VER_CLIENTES=1;
	public static final int REGISTRAR_CLIENTE=2;
	public static final int VER_HOTEL=3;

	public static void MostrarMenuPrincipal () {
		
		System.out.println("---Menu Principal---");
		System.out.println(VER_CLIENTES + "- ver clientes");
		System.out.println(REGISTRAR_CLIENTE + "- registrar cliente");
		System.out.println(VER_HOTEL + "- ver hotel y sus habitaciones");
	}
}
