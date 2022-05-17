package tps_grupo4.TP3_GRUPO_4.entidad;

import java.io.Serializable;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Bibliotecas")
public class Biblioteca implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	private int id;
	@Column
	private String Libro;
	@Column
	private Date fechaDeAlta;
	@Column int Estado;

	public Biblioteca() {
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibro() {
		return Libro;
	}

	public void setLibro(String libro) {
		Libro = libro;
	}

	public Date getFechaDeAlta() {
		return fechaDeAlta;
	}

	public void setFechaDeAlta(Date fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}

	public int getEstado() {
		return Estado;
	}

	public void setEstado(int estado) {
		Estado = estado;
	}

	@Override
	public String toString() {
		return "Biblioteca [id=" + id + ", Libro=" + Libro + ", fechaDeAlta=" + fechaDeAlta + ", Estado=" + Estado
				+ "]";
	}
	
	
	
	
	
}
