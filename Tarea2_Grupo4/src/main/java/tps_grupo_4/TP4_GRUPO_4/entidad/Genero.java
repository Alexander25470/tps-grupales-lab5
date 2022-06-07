package tps_grupo_4.TP4_GRUPO_4.entidad;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Generos")
public class Genero implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	private int id;
	@Column
	private String descripcion;
	
	@ManyToMany(mappedBy = "generos", fetch= FetchType.EAGER)
	private List<Libro> libros; 
	
	public Genero() {
	}
	
	public Genero(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public List<Libro> getLibros() {
		return libros;
	}

	@Override
	public String toString() {
		return "Genero [id=" + id + ", descripcion=" + descripcion + "]";
	}
	
	
}
