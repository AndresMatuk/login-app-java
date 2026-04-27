package com.first.proyect.login;

import com.first.proyect.login.model.Conexion;
import java.sql.Connection;

public class TestConexion {

	public static void main(String[] args) {
		Connection con = Conexion.getConnection();

		if (con != null) {
			System.out.println("✅ Conectado correctamente a MySQL");
		} else {
			System.out.println("❌ Error al conectar");
		}
	}
}
