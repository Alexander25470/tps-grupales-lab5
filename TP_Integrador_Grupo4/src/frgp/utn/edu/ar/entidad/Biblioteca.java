package frgp.utn.edu.ar.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="Bibliotecas")
public class Biblioteca implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name = "libro")
	private Libro libro;
	@Column
	private Date fechaDeAlta;
	@Column int estado;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cliente")
	private List<Prestamo> prestamos;

	public Biblioteca() {
	
	}

	public Biblioteca(int id, Libro libro, Date fechaDeAlta, int estado) {
		super();
		this.id = id;
		this.libro = libro;
		this.fechaDeAlta = fechaDeAlta;
		this.estado = estado;
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
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	

	public List<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	@Override
	public String toString() {
		return "Biblioteca [id=" + id + ", libro=" + libro + ", fechaDeAlta=" + fechaDeAlta + ", Estado=" + estado + "]";
	}
}