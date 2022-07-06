package frgp.utn.edu.ar.dao;

import java.util.List;

public interface IdaoGenerico<T> {
	public List<T> getAll();
	public boolean create(T t);
}
