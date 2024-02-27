package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GestorBBDD extends ConectorViajes {

	public ArrayList<Cliente> getClientes() {

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();

		try {
			// CREAR STATEMENT
			Statement st = con.createStatement();

			// EJECUTAR CONSULTA
			ResultSet result = st.executeQuery("SELECT * FROM clientes");

			while (result.next()) {

				Cliente cliente = new Cliente();

				cliente.setDni((result.getInt("dni")));
				cliente.setNombre((result.getString("nombre")));
				cliente.setApellido((result.getString("apellidos")));
				cliente.setDireccion((result.getString("direccion")));
				cliente.setLocalidad((result.getString("localidad")));

				clientes.add(cliente);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clientes;
	}

	public void registrarCliente(Cliente cliente) {

		// consulta
		String sentenciaSql = "INSERT INTO `clientes`(`dni`, `nombre`, `apellidos`, `direccion`, `localidad`) VALUES (?,?,?,?,?)";

		// CREAR EL PREPAREDSTATMENT
		PreparedStatement pst;

		try {
			pst = con.prepareStatement(sentenciaSql);

			pst.setInt(1, cliente.getDni());
			pst.setString(2, cliente.getNombre());
			pst.setString(3, cliente.getApellido());
			pst.setString(4, cliente.getDireccion());
			pst.setString(5, cliente.getLocalidad());

			pst.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public Hotel getHotel(int cif) {
		
		Hotel hotel = new Hotel();

		try {

			// CREAR STATEMENT
			Statement st = con.createStatement();

			// EJECUTAR CONSULTA
			ResultSet result = st.executeQuery("SELECT * FROM hoteles WHERE cif=" + cif);
			
			hotel.setCif((result.getInt("cif")));
			hotel.setId_hotel((result.getInt("id_hotel")));
			hotel.setNumero((result.getInt("numero")));
			hotel.setDescripcion((result.getString("descripcion")));
			hotel.setPrecio((result.getInt("precio")));
			

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return hotel;

	}

}
