package edu.udem.taller3.renders;

/*clase concreta para visualizacion en 3d*/
public class TresDRender extends DecoradorRender {

	public TresDRender(FiguraRender c) {
		super(c);
	}

	@Override
	public void dibujar() {
		figuraRender.assemble();
		System.out.print(" Pintamos el tablero en 3D.");
	}
}