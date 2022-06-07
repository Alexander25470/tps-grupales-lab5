package ejercicio1.entidad;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Personas")
public class Persona implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	private int id;
	@Column
	private String nombre;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "tarjetaSube")
	private TarjetaSube tarjetaSube;
	public Persona(int id, String nombre, TarjetaSube tarjetaSube) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tarjetaSube = tarjetaSube;
	}
	public Persona() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public TarjetaSube getTarjetaSube() {
		return tarjetaSube;
	}
	public void setTarjetaSube(TarjetaSube tarjetaSube) {
		this.tarjetaSube = tarjetaSube;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", tarjetaSube=" + tarjetaSube + "]";
	}
	
	
	
}
