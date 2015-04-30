package edu.udem.taller3.renders;


/**
 * Clase concreta para visualización de los tetrominos en ASCII.
 *
 */
public class ASCIIRender extends DecoradorRender {

	public ASCIIRender(FiguraRender c) {
		super(c);
	}

	/* 
	 * Método heredado de DecoradorRender usado para implementar la función
	 * de dibujar un tetromino en formato ASCII.
	 */
	@Override
	public void dibujar() {
		// Se pintan los tetrominos en formato ASCII.
		System.out.println("Pintamos el tablero en ASCII.");
	}
}