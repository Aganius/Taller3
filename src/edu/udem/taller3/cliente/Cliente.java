package edu.udem.taller3.cliente;

import edu.udem.taller3.renders.ASCIIRender;
import edu.udem.taller3.renders.BasicoRender;
import edu.udem.taller3.renders.DosDRender;
import edu.udem.taller3.renders.FiguraRender;
import edu.udem.taller3.renders.TresDRender;

/**
 * Clase usada para probar la funcionalidad del c�digo implementado.
 *
 */
public class Cliente {

	public static void main(String[] args) {
		
		System.out.println("Probando pintado de figura en modo ASCII");
		FiguraRender figura = new ASCIIRender(new BasicoRender());
		figura.dibujar();
		
		System.out.println("********************************************");

		System.out.println("Probando pintado de figura en modo 3D");
		FiguraRender figura2 = new TresDRender(new DosDRender(
				new BasicoRender()));
		figura2.dibujar();
	}

}