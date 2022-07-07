package frgp.utn.edu.ar.dao;

import java.util.List;

public interface IdaoGenerico<T> {
	public List<T> getAll();
	public List<T> getAll(String consultaAdicional);
	public T getOne(int id);
	public boolean create(T t);
	public boolean delete(T t);
	public boolean update(T t);
}
