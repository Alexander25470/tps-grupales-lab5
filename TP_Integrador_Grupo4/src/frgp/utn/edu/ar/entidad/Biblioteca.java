package frgp.utn.edu.ar.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Bibliotecas")
public class Biblioteca implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	private int id;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "libro")
	private Libro libro;
	@Column
	private Date fechaDeAlta;
	@Column int Estado;

	public Biblioteca() {
	
	}

	public Biblioteca(int id, Libro libro, Date fechaDeAlta, int estado) {
		super();
		this.id = id;
		this.libro = libro;
		this.fechaDeAlta = fechaDeAlta;
		Estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
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
		return "Biblioteca [id=" + id + ", libro=" + libro + ", fechaDeAlta=" + fechaDeAlta + ", Estado=" + Estado + "]";
	}
}