package ejercicio4.entidad;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="Mercados")
public class Mercado implements Serializable{
	
private static final long serialVersionUID = 1L;	
	@Id
	@Column
	private int id;
	@Column
	private String nombre;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="productosPorMercado", joinColumns = {@JoinColumn(name  = "idMercado")}, inverseJoinColumns = {@JoinColumn(name  = "idProducto")})
	private List<Producto> productos;
	public Mercado() {
		super();
	}
	public Mercado(int id, String nombre, List<Producto> productos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.productos = productos;
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
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	@Override
	public String toString() {
		return "Mercado [id=" + id + ", nombre=" + nombre + ", productos=" + productos + "]";
	}
}
