package edu.udem.taller3.renders;

/*clase concreta para visualizacion en 2d*/
public class DosDRender extends DecoradorRender {

	public DosDRender(FiguraRender c) {
		super(c);
	}

	@Override
	public void dibujar() {
		figuraRender.assemble();
		System.out.print(" Pintamos el tablero en 2D.");
	}
}