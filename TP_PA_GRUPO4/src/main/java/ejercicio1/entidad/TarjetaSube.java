package ejercicio1.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TarjetasSube")
public class TarjetaSube implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	private int id;
	@Column
	private String codigo;
	
	public TarjetaSube() {
	}

	public TarjetaSube(int id, String codigo) {
		super();
		this.id = id;
		this.codigo = codigo;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String descripcion) {
		this.codigo = descripcion;
	}
	@Override
	public String toString() {
		return "Nacionalidad [id=" + id + ", codigo=" + codigo + "]";
	}
}
