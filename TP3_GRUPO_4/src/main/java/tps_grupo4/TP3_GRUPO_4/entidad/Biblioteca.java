package tps_grupo4.TP3_GRUPO_4.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class Biblioteca implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column
	private int id;
	
	
	
}
