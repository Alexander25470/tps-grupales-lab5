package frgp.utn.edu.ar.daoImp;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import frgp.utn.edu.ar.dao.IdaoGenerico;

public class DaoGenerico<T> implements IdaoGenerico<T>{
	@Autowired
	private Conexion conexion;
	private Class<T> type;
	public DaoGenerico() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
        System.out.println(type);
        System.out.println(type.getClass());
        System.out.println(type.getName());
    }
	@Override
	public List<T> getAll() {
		Session session = conexion.abrirConexion();
		List<T> listT = (List<T>)session.createQuery("from " + type.getName()).list();
		session.close();
		return listT;
	}
	
	@Override
	public List<T> getAll(String consultaAdicional) {
		Session session = conexion.abrirConexion();
		List<T> listT = (List<T>)session.createQuery("from " + type.getName() + " " +consultaAdicional).list();
		session.close();
		return listT;
	}

	@Override
	public boolean create(T t) {
		Session session = conexion.abrirConexion();
		Transaction tx= session.beginTransaction();
		boolean aux = true;
		try
		{
			session.save(t); 
			tx = session.getTransaction();
			tx.commit();
		}
		catch (Exception e) {
			System.out.println(e);
			aux=false;
			tx.rollback();
		}
		conexion.cerrarSession();
		
		return aux;
	}
	@Override
	public boolean delete(T t) {
		Session session = conexion.abrirConexion();
		Transaction tx= session.beginTransaction();
		boolean aux = true;
		try
		{
			session.save(t); 
			tx = session.getTransaction();
			tx.commit();
		}
		catch (Exception e) {
			System.out.println(e);
			aux=false;
			tx.rollback();
		}
		conexion.cerrarSession();
		return aux;
	}
	@Override
	public boolean update(T t) {
		Session session = conexion.abrirConexion();
		Transaction tx= session.beginTransaction();
		boolean aux = true;
		try
		{
			session.delete(t); 
			tx = session.getTransaction();
			tx.commit();
		}
		catch (Exception e) {
			System.out.println(e);
			aux=false;
			tx.rollback();
		}
		conexion.cerrarSession();
		return aux;
	}
	@Override
	public T getOne(int id) {
		Session session = conexion.abrirConexion();
		T entidad = (T)session.get(type.getName(), id);
		session.close();
		return entidad;
	}

}
