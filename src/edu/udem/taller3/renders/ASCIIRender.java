package edu.udem.taller3.renders;

/*clase concreta para visualizacion en ascii*/
public class ASCIIRender extends DecoradorRender {
	 
    public ASCIIRender(FiguraRender c) {
        super(c);
    }
 
    @Override
    public void dibujar(){
    	figuraRender.assemble();
        System.out.print(" Pintamos el tablero en ascii.");
    }
}