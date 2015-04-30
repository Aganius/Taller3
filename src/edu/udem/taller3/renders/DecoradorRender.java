package edu.udem.taller3.renders;


/**
 * Ésta clase es el decorador que nos permitirá ampliar la funcionalidad de 
 * renderización en la aplicación.
 *
 */
public class DecoradorRender extends FiguraRender {

	protected FiguraRender figuraRender;

	public DecoradorRender(FiguraRender c) {
		this.figuraRender = c;
	}

	/* 
	 * Método implementado de la clase padre FiguraRender para extender la 
	 * funcionalidad de dibujar a los decoradores específicos que hereden
	 * de FiguraRender.
	 */
	@Override
	public void dibujar() {
		this.figuraRender.dibujar();
	}

}