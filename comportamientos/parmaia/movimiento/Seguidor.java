/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package comportamientos.parmaia.movimiento;

import java.awt.Point;
import interfaces.IMovimiento;
import interfaces.ITanque;

/**
 *
 * @author parmaia
 */
public class Seguidor implements IMovimiento {
  private ITanque objetivo;

  public Seguidor(){
    objetivo = null;
  }

  private double distancia(Point p1, Point p2){
    return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));
  }

  public void calcularMovimiento(ITanque tanque) {
    double min = 10000;
    double dist;
    if (objetivo == null || objetivo.getVida() <=0 ||
        distancia(tanque.getPosicion(),objetivo.getPosicion())>300){
      for (int i=0;i<tanque.getListaTanques().size();i++){
        dist = distancia(tanque.getPosicion(),tanque.getListaTanques().elementAt(i).getPosicion());
        if (dist < min && dist>0){
          min = dist;
          objetivo = tanque.getListaTanques().elementAt(i);
        }
      }
    }
    double ang = -Math.atan2(objetivo.getPosicion().y-tanque.getPosicion().y,
                            objetivo.getPosicion().x-tanque.getPosicion().x);
    tanque.setVelocidad(3);
    tanque.setAnguloMovimiento(ang);
  }

  public String getDescripcion() {
    return "Seguidor";
  }

}
