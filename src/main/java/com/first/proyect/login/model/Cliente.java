package com.first.proyect.login.model;

public class Cliente {
	private TipoDocumento tipoID;
	private String nroID;
	private String nombre;
	private String apellido;
	private String usuario;
	private String contrasena;
	private String noCelular;
	private String correo;

	public Cliente() {
	}

	// Getters and Setters

	public TipoDocumento getTipoID() {
	    return tipoID;
	}

	public void setTipoID(TipoDocumento tipoID) {
	    this.tipoID = tipoID;
	}

	public String getNroID() {
		return nroID;
	}

	public void setNroID(String nroID) {
		this.nroID = nroID;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getNoCelular() {
		return noCelular;
	}

	public void setNoCelular(String noCelular) {
		this.noCelular = noCelular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
}
