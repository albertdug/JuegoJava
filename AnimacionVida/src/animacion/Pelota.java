/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package animacion;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;
import panimador.*;

/**
 *
 * @author parmaia
 */
public class Pelota extends Animable{
  private int _radio;
  private int _dx,_dy;
  private int _vel;
  private int _ancho,_alto;
  private int _vida;
  private boolean _rebotando;

  public Pelota(int ancho, int alto){
    Random gen = new Random();
    _ancho = ancho;
    _alto  = alto;
    _radio = gen.nextInt(10) + 5;

    setX(gen.nextInt(_ancho - 2 * _radio) + _radio);
    setY(gen.nextInt(_alto - 2 * _radio) + _radio);

    _vel = gen.nextInt(5)+2;
    _dx = gen.nextBoolean() ? 1 : -1;
    _dy = gen.nextBoolean() ? 1 : -1;
    _vida = 100;
    setActivo(true);
    setVisible(true);
    _rebotando = false;
  }

  public void simular() {
    _rebotando = false;
    if ((x() + _dx * _vel)-_radio < 0 ||
        (x() + _dx * _vel)+_radio>_ancho){
      _dx *= -1;
      _vida-=10;
      _rebotando = true;
    }

    if ((y() + _dy * _vel)-_radio < 0 ||
        (y() + _dy * _vel)+_radio>_alto){
      _dy *= -1;
      _vida-=10;
      _rebotando = true;
    }

    if (_vida<=0){
      terminarAnimacion();
    }else{
      setX(x() + _dx * _vel);
      setY(y() + _dy * _vel);
    }
  }

  public void renderizar(Graphics2D g) {
    g.setColor(Color.blue);
    g.fillOval(x()-_radio, y()-_radio, 2*_radio,2*_radio);
    int a=8;
    g.setColor(Color.red);
    g.fillRect(x()-a, y()-_radio-3, 2*a+1, 3);
    g.setColor(Color.green);
    g.fillRect(x()-a, y()-_radio-3, 1+2*a*_vida/100 , 3);
    if (_rebotando){
      g.setColor(new Color(255,0,0,128));
      g.fillOval(x()-_radio-4, y()-_radio-4, 2*_radio+8,2*_radio+8);
    }
  }
}
