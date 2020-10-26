package campoMinado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CampoTest {

	
	private Campo campo = new Campo(3,3);
	
	@Test
	void testeVizinhoRealDistancia1_1() 
	{
		Campo vizinho = new Campo(3,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistancia1_2() 
	{
		Campo vizinho = new Campo(2,3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistancia1_3() 
	{
		Campo vizinho = new Campo(3,4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistancia1_4() 
	{
		Campo vizinho = new Campo(4,3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	
	@Test
	void testeVizinhoRealDistancia2_1() 
	{
		Campo vizinho = new Campo(4,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistancia2_2() 
	{
		Campo vizinho = new Campo(2,4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistancia2_3() 
	{
		Campo vizinho = new Campo(4,4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeVizinhoRealDistancia2_4() 
	{
		Campo vizinho = new Campo(2,2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeValorPadraoMarcado() 
	{
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacao() 
	{
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacaoDuasCamadas() 
	{	
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testeAbrirNaoMinadoNaoMarcado() 
	{	
		
		assertTrue(campo.abrir());
	}
	
	@Test
	void testeAbrirNaoMinadoMarcado() 
	{	
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoMarcado() 
	{	
		campo.minar();
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	void testeAbrirMinadoNaoMarcado() 
	{	
		campo.minar();
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir();	
		});
		
	}
	
	

}
