package edu.udem.taller3.renders;


/**
 * Clase que implementa el tetris por defecto del sistema y representa a la implementacion del componente
 * en el patrón decorador.
 *
 */
public class BasicoRender extends FiguraRender {

	@Override
	public void dibujar() {
		System.out.print("Tetris normal.");
	}

}