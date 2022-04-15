package packageTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import frgp.utn.edu.ar.main.MatrizAdyacencia;

public class MatrizAdyacenciaTest {
	
	MatrizAdyacencia _matrizAdyacencia = new MatrizAdyacencia(4);
	
	@Test
	void agregarElementoTest() 
	{
		_matrizAdyacencia.agregarElemento(1, 1);
		boolean resultado = _matrizAdyacencia.existeElemento(1, 1);
		assertEquals(true, resultado);
	}
	
	@Test
	void agregarElementoSimetriaTest() 
	{
		_matrizAdyacencia.agregarElemento(3, 2);
		boolean resultado = _matrizAdyacencia.existeElemento(2, 3);
		assertEquals(true, resultado);
	}
	
	@Test
	void eliminarElementoTest() 
	{
		_matrizAdyacencia.eliminarElemento(1, 1);
		boolean resultado = _matrizAdyacencia.existeElemento(1, 1);
		assertEquals(false, resultado);
	}
	
	@Test
	void eliminarElementoSimetriaTest() 
	{
		_matrizAdyacencia.eliminarElemento(3, 2);
		boolean resultado = _matrizAdyacencia.existeElemento(2, 3);
		assertEquals(false, resultado);
	}
	
	@Test
	void contarRelacionesTest() 
	{
		_matrizAdyacencia.agregarElemento(2, 3);
		_matrizAdyacencia.agregarElemento(1, 3);
		_matrizAdyacencia.agregarElemento(1, 2);
		int resultado = _matrizAdyacencia.getCantidadElementos();
		assertEquals(3, resultado);
	}
	
	@Test
	void existenTodosLosElementosTest() {
		_matrizAdyacencia = new MatrizAdyacencia(2);
		_matrizAdyacencia.agregarElemento(0, 0);
		_matrizAdyacencia.agregarElemento(0, 1);
		_matrizAdyacencia.agregarElemento(1, 1);
		
		int originales = 0;
		int simetricos = 0;
		//originales
		originales += _matrizAdyacencia.existeElemento(0, 0)?1:0;
		originales += _matrizAdyacencia.existeElemento(0, 1)?1:0;
		originales += _matrizAdyacencia.existeElemento(1, 1)?1:0;
		
		//simetricos
		simetricos += _matrizAdyacencia.existeElemento(0, 0)?1:0;
		simetricos += _matrizAdyacencia.existeElemento(1, 0)?1:0;
		simetricos += _matrizAdyacencia.existeElemento(1, 1)?1:0;
		
		assertEquals(true, originales==3 && simetricos == 3);
	}
	
	@Test
	void agregarElementoFilaNegativaTest() {
		boolean ocurrioExcepcion = false;
		try {			
			_matrizAdyacencia.agregarElemento(-1, 1);
		} catch (Exception ex){
			ocurrioExcepcion = true;
		}
		assertEquals(true, ocurrioExcepcion);
	}
	
	@Test
	void agregarElementoColumnaNegativaTest() {
		boolean ocurrioExcepcion = false;
		try {			
			_matrizAdyacencia.agregarElemento(1, -1);
		} catch (Exception ex){
			ocurrioExcepcion = true;
		}
		assertEquals(true, ocurrioExcepcion);
	}
	
	@Test
	void agregarElementoFueraDeRangoTest() {
		_matrizAdyacencia = new MatrizAdyacencia(2);
		boolean ocurrioExcepcion = false;
		try {			
			_matrizAdyacencia.agregarElemento(3, 3);
		} catch (Exception ex){
			ocurrioExcepcion = true;
		}
		assertEquals(true, ocurrioExcepcion);
	}
	
}
