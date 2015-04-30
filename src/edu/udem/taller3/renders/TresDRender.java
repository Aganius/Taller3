package edu.udem.taller3.renders;


/**
 * Clase concreta para visualizaci�n en 3D.
 *
 */
public class TresDRender extends DecoradorRender {

	public TresDRender(FiguraRender c) {
		super(c);
	}

	/* 
	 * M�todo heredado de DecoradorRender usado para implementar la funci�n
	 * de dibujar un tetromino en formato 3D.
	 */
	@Override
	public void dibujar() {
		// Se pintan los tetrominos en formato 3D.
		System.out.print(" Pintamos el tablero en 3D.");
	}
}