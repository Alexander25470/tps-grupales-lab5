package packageTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import frgp.utn.edu.ar.main.MatrizAdyacencia;

class MatrizAdyacenciaTest {
	
	MatrizAdyacencia _matrizAdyacencia = new MatrizAdyacencia(5);
	
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
		_matrizAdyacencia.agregarElemento(1, 4);
		_matrizAdyacencia.agregarElemento(1, 2);
		int resultado = _matrizAdyacencia.getCantidadElementos();
		assertEquals(3, resultado);
	}
	
	@Test
	void existenTodosLosElementosTest() {}
	
	@Test
	void agregarElementoFilaNegativaTest() {}
	
	@Test
	void agregarElementoColumnaNegativaTest() {}
	
	@Test
	void agregarElementoFueraDeRangoTest() {}
	
}
