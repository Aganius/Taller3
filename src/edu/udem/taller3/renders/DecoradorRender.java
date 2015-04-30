package edu.udem.taller3.renders;


/**
 * �sta clase es el decorador que nos permitir� ampliar la funcionalidad de 
 * renderizaci�n en la aplicaci�n.
 *
 */
public class DecoradorRender extends FiguraRender {

	protected FiguraRender figuraRender;

	public DecoradorRender(FiguraRender c) {
		this.figuraRender = c;
	}

	/* 
	 * M�todo implementado de la clase padre FiguraRender para extender la 
	 * funcionalidad de dibujar a los decoradores espec�ficos que hereden
	 * de FiguraRender.
	 */
	@Override
	public void dibujar() {
		this.figuraRender.dibujar();
	}

}