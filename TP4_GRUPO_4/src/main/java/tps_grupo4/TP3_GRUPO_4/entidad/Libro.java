package tps_grupo4.TP3_GRUPO_4.entidad;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Libros")
public class Libro implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	private String ISBN;
	@Column
	private String titulo;
	@Column
	private Date  fechaDeLanzamiento;
	@Column
	private String idioma;
	@Column
	private int cantidadDePaginas;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idAutor")
	private Autor autor;
	@Column
	private String descripcion;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="generosPorLibro", joinColumns = {@JoinColumn(name  = "idLibro")}, inverseJoinColumns = {@JoinColumn(name  = "idGenero")})
	private List<Genero> generos;
	public Libro() {
	}
	
	public Libro(String iSBN, String titulo, Date fechaDeLanzamiento, String idioma, int cantidadDePaginas, Autor autor,
			String descripcion, List<Genero> generos) {
		ISBN = iSBN;
		this.titulo = titulo;
		this.fechaDeLanzamiento = fechaDeLanzamiento;
		this.idioma = idioma;
		this.cantidadDePaginas = cantidadDePaginas;
		this.autor = autor;
		this.descripcion = descripcion;
		this.generos = generos;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getFechaDeLanzamiento() {
		return fechaDeLanzamiento;
	}
	public void setFechaDeLanzamiento(Date fechaDeLanzamiento) {
		this.fechaDeLanzamiento = fechaDeLanzamiento;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public int getCantidadDePaginas() {
		return cantidadDePaginas;
	}
	public void setCantidadDePaginas(int cantidadDePaginas) {
		this.cantidadDePaginas = cantidadDePaginas;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<Genero> getGeneros() {
		return generos;
	}
	public void setGeneros(List<Genero> generos) {
		this.generos = generos;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", fechaDeLanzamiento=" + fechaDeLanzamiento + ", idioma="
				+ idioma + ", cantidadDePaginas=" + cantidadDePaginas + ", descripcion=" + descripcion + "]";
	}
	
	
}
