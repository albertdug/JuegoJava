/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package control;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.util.Vector;
import panimador.Animable;

/**
 *
 * @author parmaia
 */
public class Juego extends Animable {
  private Vector<Jugador> _jugadores;
  private int _turno;
  private int _contador;
  private boolean _contando;

  public Juego(){
    _jugadores = new Vector<Jugador>();
    _turno = 0;
    _contador = 0;
    _contando = false;
  }

  public void inicializar(){
    _jugadores.add(new Jugador("Uno",this));
    _jugadores.add(new Jugador("Dos",this));
    Animador().agregarAnimable(_jugadores.elementAt(0));
    Animador().agregarAnimable(_jugadores.elementAt(1));
    _jugadores.elementAt(_turno).juega();
  }

  @Override
  public void simular() {
    if (_contando){
      if (_contador==0){
        _turno = (_turno + 1) % _jugadores.size();
        _jugadores.elementAt(_turno).juega();
        _contando = false;
      }else{
        _contador--;
      }
    }
  }

  @Override
  public void renderizar(Graphics2D g) {
    g.setPaint(Color.green);
    g.drawString("Turno del jugador: "+_jugadores.elementAt(_turno).nombre(), 150, 10);
    if (_contando){
      g.setPaint(Color.darkGray);
      g.fillRoundRect(10, 10, 70, 30, 10, 10);
      g.setPaint(Color.white);
      g.drawString(_jugadores.elementAt(_turno).nombre(), 13, 20);
      g.drawString("Falta: "+_contador, 13, 32);
    }
  }

  @Override
  public void inicializarAnimable() {}

  public void colocarContador(){  
    _contando = true;
    _contador = 40;
  }

  @Override
  public Shape silueta() {
    return null;
  }
}
