package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GestorBBDD extends ConectorViajes {

	public ArrayList<Cliente> verClientes() {
		
		ArrayList<Cliente> clientes = new ArrayList <Cliente> ();
		
		try {
			//CREAR STATEMENT
			Statement st = con.createStatement();
			
			//EJECUTAR CONSULTA
			ResultSet result = st.executeQuery("SELECT * FROM hotel");
			
			while(result.next()) {
				
				Cliente cliente = new Cliente();
				
				cliente.setDni((result.getInt("id")));
				cliente.setNombre((result.getString("nombre")));
				cliente.setApellido((result.getString("apellido")));
				cliente.setDireccion((result.getString("direccion")));
				cliente.setLocalidad((result.getString("localidad")));
				
				clientes.add(cliente);
				
				
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clientes;
	}
}
