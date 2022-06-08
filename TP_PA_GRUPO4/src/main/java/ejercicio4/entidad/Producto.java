package ejercicio4.entidad;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Productos")
public class Producto implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	private int id;
	@Column
	private String nombre;
	@ManyToMany(mappedBy = "productos", fetch= FetchType.EAGER)
	private List<Mercado> mercados;
	public Producto() {
		super();
	}
	public Producto(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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
	public List<Mercado> getMercados() {
		return mercados;
	}

	@Override
	public String toString() {
		if( mercados == null || mercados.isEmpty()) {
			return "Producto [id=" + id + ", nombre=" + nombre + "]";
		}
		return "Producto [id=" + id + ", nombre=" + nombre + ", mercados=" + mercados + "]";
	} 	
}
