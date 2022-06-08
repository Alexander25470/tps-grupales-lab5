package ejercicio2.entidad;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Clientes")
public class Cliente implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	private int id;
	@Column
	private String nombre;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id_persona")
	private List<Compra> compras;
	public Cliente() {
		super();
	}
	public Cliente(int id, String nombre, List<Compra> compras) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.compras = compras;
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
	public List<Compra> getCompras() {
		return compras;
	}
	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", compras=" + compras + "]";
	}
}
