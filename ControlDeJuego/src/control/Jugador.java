/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import panimador.Animable;

/**
 *
 * @author parmaia
 */
public class Jugador extends Animable{
  private String _nombre;
  private boolean _jugando;
  private Juego _juego;

  public Jugador(String nombre,Juego juego){
    _nombre = nombre;
    _jugando = false;
    _juego = juego;
    setY(250);
    setX(Math.random()*430);
  }

  @Override
  public void simular() {
    
  }

  @Override
  public void renderizar(Graphics2D g) {
    if (_jugando)
      g.setPaint(Color.red);
    else
      g.setPaint(Color.white);
    g.drawString(_nombre, x(), y()-5);
    g.fillRect(x(), y(), 40, 40);
  }

  @Override
  public void inicializarAnimable() {
    setInteractivo(true); //Si lo coloco en el constructor daria error
                          // porque Jugador aun no se agrega al animable.
  }

  public String nombre(){
    return _nombre;
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    System.out.println(_nombre+" juega: "+_jugando);
    if (_jugando){
      _jugando = false;
      _juego.colocarContador();
    }
  }

  public void juega(){
    System.out.println(_nombre+" Jugando");
    _jugando = true;
  }

  @Override
  public Shape silueta() {
    Rectangle2D rect = new Rectangle(x(),y()-15,40,40+15);
    return rect;
  }

}
