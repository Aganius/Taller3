package renders;

/*
 *  es el decorador que nos permitir� ampliar la funcionalidad */
public class DecoradorRender extends FiguraRender {
	 
    protected FiguraRender figurarender;
     
    public DecoradorRender(FiguraRender c){
        this.figurarender=c;
    }
     
    @Override
    public void dibujar() {
        this.figurarender.dibujar();
    }
 
}