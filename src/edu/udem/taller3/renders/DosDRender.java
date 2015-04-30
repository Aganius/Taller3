package edu.udem.taller3.renders;


/**
 * Clase concreta para visualizaci�n en 2D.
 *
 */
public class DosDRender extends DecoradorRender {

	public DosDRender(FiguraRender c) {
		super(c);
	}

	/* 
	 * M�todo heredado de DecoradorRender usado para implementar la funci�n
	 * de dibujar un tetromino en formato 2D.
	 */
	@Override
	public void dibujar() {
		// Se pintan los tetrominos en formato 2D.
		System.out.println("Pintamos el tablero en 2D.");
	}
}