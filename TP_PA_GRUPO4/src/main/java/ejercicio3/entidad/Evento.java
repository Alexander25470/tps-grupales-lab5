package ejercicio3.entidad;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Eventos")

public class Evento implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	private int id;
	@Column
	String nombre;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idArtista")
	private Artista artista;
	public Evento() {
		super();
	}
	public Evento(int id, String nombre, Artista artista) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.artista = artista;
	}
	@Override
	public String toString() {
		return "Evento [id=" + id + ", nombre=" + nombre + ", artista=" + artista + "]";
	}

}
