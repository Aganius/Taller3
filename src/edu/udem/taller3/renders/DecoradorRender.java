package edu.udem.taller3.renders;

/*
 *  es el decorador que nos permitirá ampliar la funcionalidad */
public class DecoradorRender extends FiguraRender {

	protected FiguraRender figuraRender;

	public DecoradorRender(FiguraRender c) {
		this.figuraRender = c;
	}

	@Override
	public void dibujar() {
		this.figuraRender.dibujar();
	}

}