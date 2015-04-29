package cliente;
import renders;

public class cliente {
	 
    public static void main(String[] args) {
        FiguraRender figura = new ASCIIRender(new BasicoRender());
        sportsCar.dibujar();
        System.out.println("\n*****");
         
        FiguraRender figura2 = new TresDRender(new DosDRender(new BasicoRender()));
        figura2.dibujar();
    }
 
}