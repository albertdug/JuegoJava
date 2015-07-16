/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package animacion1;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;
import panimador.Animable;


public class pelota extends Animable {
    private int dy;
    private Color color;
    @Override
    public void simular() {
        setY(y()+9*dy);
        if(y()>= Animador().alto()-20){
            dy = dy*-1;
        }
        if(y() < 20){
            dy = dy * -1;
        }
    }

    @Override
    public void renderizar(Graphics2D g) {
        g.setColor(color);
        //g.setXORMode(Color.WHITE);
        g.fillOval(x()-20, y()-20, 40, 40);
    }

    @Override
    public void inicializarAnimable() {
        dy=1;
        setY(20);
        setX(Math.random()*(Animador().ancho()-100)+50 );
        switch ( (int)(Math.random()*4)){
            case 0: color = Color.BLUE; break;
            case 1: color = Color.PINK; break;
            case 2: color = Color.ORANGE; break;
            case 3: color = Color.MAGENTA; break;
        }
        }

    @Override
    public Shape silueta() {
        return null;
    }
    }

 
   