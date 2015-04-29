package renders;


public class ASCIIRender extends DecoradorRender {
	 
    public ASCIIRender(FiguraRender c) {
        super(c);
    }
 
    @Override
    public void dibujar(){
    	figurarender.assemble();
        System.out.print(" Pintamos el tablero en ascii.");
    }
}