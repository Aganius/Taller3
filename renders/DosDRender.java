package renders;

public class DosDRender extends DecoradorRender {
	 
    public DosDRender(FiguraRender c) {
        super(c);
    }
 
    @Override
    public void dibujar(){
    	figurarender.assemble();
        System.out.print(" Pintamos el tablero en 2D.");
    }
}