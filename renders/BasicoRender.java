package renders;

/* clase que implementa el tetris por defecto del sistema y representa a la implementacion del componente
 * en el patron decorador*/
public class RenderBasico extends FiguraRender {
	 
    @Override
    public void dibujar() {
        System.out.print("Tetris normal.");
    }
 
}