package com.first.proyect.login.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClienteDao {

	public Cliente obtenerUsuario(String usuario, String contrasena) {

	    Cliente cliente = null;

	    String sql = "SELECT * FROM Cliente WHERE Usuario = ? AND Contrasena = ?";

	    try {
	        Connection con = Conexion.getConnection();
	        PreparedStatement ps = con.prepareStatement(sql);

	        ps.setString(1, usuario);
	        ps.setString(2, contrasena);

	        ResultSet rs = ps.executeQuery();

	        if (rs.next()) {
	            cliente = new Cliente();
	            cliente.setTipoID(TipoDocumento.valueOf(rs.getString("TipoID")));
	            cliente.setNroID(rs.getString("NroID"));
	            cliente.setNombre(rs.getString("Nombre"));
	            cliente.setApellido(rs.getString("Apellido"));
	            cliente.setUsuario(rs.getString("Usuario"));
	            cliente.setNoCelular(rs.getString("NoCelular"));
	            cliente.setCorreo(rs.getString("Correo"));
	        }

	    } catch (Exception e) {
	        System.out.println("Error: " + e.getMessage());
	    }

	    return cliente;
	}
	
	public void insertarCliente(String tipoID, String nroID, String nombre, String apellido, String usuario,
			String contrasena, String noCelular, String correo) {

		String sql = "INSERT INTO Cliente VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			Connection con = Conexion.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, tipoID);	
			ps.setString(2, nroID);
			ps.setString(3, nombre);
			ps.setString(4, apellido);
			ps.setString(5, usuario);
			ps.setString(6, contrasena);
			ps.setString(7, noCelular);
			ps.setString(8, correo);

			ps.executeUpdate();

		} catch (Exception e) {
			System.out.println("Error insertando: " + e.getMessage());
		}
	}
}