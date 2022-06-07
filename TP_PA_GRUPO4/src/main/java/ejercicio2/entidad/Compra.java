package ejercicio2.entidad;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Compras")
public class Compra  implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	@Column
	private String producto;
	public Compra() {
		super();
	}
	public Compra(int id, String producto) {
		super();
		this.id = id;
		this.producto = producto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	@Override
	public String toString() {
		return "Compra [id=" + id + ", descripcion=" + producto + "]";
	}
	
	
}
