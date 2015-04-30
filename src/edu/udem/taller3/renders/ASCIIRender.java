package edu.udem.taller3.renders;


/**
 * Clase concreta para visualizaci�n de los tetrominos en ASCII.
 *
 */
public class ASCIIRender extends DecoradorRender {

	public ASCIIRender(FiguraRender c) {
		super(c);
	}

	/* 
	 * M�todo heredado de DecoradorRender usado para implementar la funci�n
	 * de dibujar un tetromino en formato ASCII.
	 */
	@Override
	public void dibujar() {
		// Se pintan los tetrominos en formato ASCII.
		System.out.println("Pintamos el tablero en ASCII.");
	}
}