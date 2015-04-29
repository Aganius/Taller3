package renders;

public class TresDRender extends DecoradorRender {
	 
    public TresDRender(FiguraRender c) {
        super(c);
    }
 
    @Override
    public void dibujar(){
    	figurarender.assemble();
        System.out.print(" Pintamos el tablero en 3D.");
    }
}