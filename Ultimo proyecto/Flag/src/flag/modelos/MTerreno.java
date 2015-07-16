
package flag.modelos;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import panimador.Animable;

public class MTerreno extends Animable{

    private Image terreno;
    private int dy;

    public MTerreno(){}
    @Override
    public void simular() {
      /*  setY(y()+8*dy);
        if((y()>= Animador().alto() -20) || (y() <20 )){
        dy *= -1;
        }*/
    
    }


    @Override
    public void renderizar(Graphics2D grafico) {
       
        grafico.drawImage(getTerreno(), 0,0, null);
        //grafico.drawImage(null, dy, dy, null);
    }

    public void establecerTerreno(Image img){
        terreno=img;
    }

    public Image getTerreno() {
        return terreno;
    }

    @Override
    public void inicializarAnimable() {

    }

    @Override
    public Shape silueta() {
        return null;
    }

}
