/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package comportamientos.parmaia.apariencia;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import interfaces.IApariencia;
import interfaces.ITanque;

/**
 *
 * @author parmaia
 */
public class Normal implements IApariencia{

  public void dibujar(ITanque tanque, Graphics2D g) {
    int x = tanque.getPosicion().x;
    int y = tanque.getPosicion().y;
    AffineTransform f = g.getTransform();

    AffineTransform rotacion = new AffineTransform();
    rotacion.rotate(-tanque.getAnguloMovimiento(),x,y);
    g.setTransform(rotacion);

    g.setColor(Color.BLUE);
    g.fillRoundRect(x-20, y-20, 41, 41, 5, 5);
    g.setColor(new Color(0,50,250).darker().darker().darker().darker());
    g.fillRoundRect(x-15, y-10, 21, 21, 7, 7);

    g.setStroke(new BasicStroke(3));
    g.setColor(Color.black);
    g.drawRoundRect(x-15, y-10, 21, 21, 7, 7);
    g.drawRoundRect(x-20, y-20, 41, 41, 5, 5);
    g.drawLine(x-5, y, x+25, y);

    g.setTransform(f);
  }

  public String getDescripcion() {
    return "Apariencia normal";
  }

}
