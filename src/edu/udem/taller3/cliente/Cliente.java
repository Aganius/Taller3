package edu.udem.taller3.cliente;

import edu.udem.taller3.renders.ASCIIRender;
import edu.udem.taller3.renders.BasicoRender;
import edu.udem.taller3.renders.DosDRender;
import edu.udem.taller3.renders.FiguraRender;
import edu.udem.taller3.renders.TresDRender;


public class Cliente {
	 
    public static void main(String[] args) {
        FiguraRender figura = new ASCIIRender(new BasicoRender());
        figura.dibujar();
        System.out.println("\n*****");
         
        FiguraRender figura2 = new TresDRender(new DosDRender(new BasicoRender()));
        figura2.dibujar();
    }
 
}