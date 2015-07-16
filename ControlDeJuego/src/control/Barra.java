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
import panimador.Animable;

/**
 *
 * @author parmaia
 */
public class Barra extends Animable {

  private boolean _presionado;
  private double _valor;
  private int _maximo;
  private int _ancho, _alto;

  public Barra(){
    _maximo = 100;
    _valor = 0;
    _ancho = 200;
    _alto = 15;
  }

  @Override
  public void simular() {
    if (_presionado)
      _valor+=1.5;
    if (_valor >= _maximo)
      _presionado = false;
  }

  @Override
  public void renderizar(Graphics2D g) {
    g.setPaint(Color.green);
    g.fillRect(x(), y(), _ancho, _alto);
    g.setPaint(Color.red);
    g.fillRect(x(), y(), (int)_valor*_ancho/_maximo, _alto);
  }

  @Override
  public void inicializarAnimable() {
    
    setX((Animador().ancho()-_ancho)/2);
    setY(15);
    setInteractivo(true);
  }

  @Override
  public Shape silueta() {
    Rectangle r = new Rectangle(x(),y(),_ancho,_alto);
    return r;
  }

  public void mousePressed(MouseEvent e){
    _valor=0;
    _presionado = true;
  }

  public void mouseReleased(MouseEvent e){
    _presionado = false;
  }
}
