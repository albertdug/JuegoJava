package flag.modelos;

import flag.interfaces.*;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.util.Vector;
import panimador.Animable;

public class MTanque extends Animable {

    //atributos
    private String nombre;
    private int angulo;
    private int velocidad;
    private int energia;
    private int vida;
    private int posX;
    private int posY;
    private IApariencia apariencia;
    private IMovimiento movimiento;
    private IDisparo disparo;
    private Vector<MTanque> listaTanques;
    private int dy, radio, dx;

   private Image apa;
    public MTanque(){
    System.out.println("me hice");
    vida = 100;
    }

    public int getAngulo() {
        return angulo;
    }

    public void setAngulo(int angulo) {
        this.angulo = angulo;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public Vector<MTanque> getListaTanques() {
        return listaTanques;
    }

    public void setListaTanques(Vector<MTanque> listaTanques) {
        this.listaTanques = listaTanques;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public IApariencia getApariencia() {
        return apariencia;
    }

    public void setApariencia(IApariencia apariencia) {
        this.apariencia = apariencia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public IDisparo getDisparo() {
        return disparo;
    }

    public void setDisparo(IDisparo disparo) {
        this.disparo = disparo;
    }

    public IMovimiento getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(IMovimiento movimiento) {
        this.movimiento = movimiento;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    

    @Override
    public void simular() {

        setY(y()+8*dy);
        System.out.println("Y: " + y());
        if((y()>= Animador().alto() -20) || (y() <20 )){
        dy *= -1;
        vida -= 10;
        }
         if((x()>= Animador().ancho() -20) || (x() <20 )){
        dx *= -1;
        vida -= 10;
        }
        if (vida<=0){
      terminarAnimacion();
    }else{
      setX(x() + dx * velocidad);
      setY(y() + dy * velocidad);
    }
    }

    @Override
    public void renderizar(Graphics2D grafico) {
        //apa= new ImageIcon(getClass().getResource("/flag/recursos/Tanque0.png")).getImage();
        apa = apariencia.Mostrar();
        grafico.drawImage(apa, (x() - 20),(y()- 20),40,40, null);
        //grafico.drawImage(null, x()-20 ,y()-20, null);
        int a =19;
        int b= 12;
        grafico.setColor(Color.red);
        grafico.fillRect(x()-a,y()-b , a-2, 3);
        grafico.setColor(Color.GREEN );
        grafico.fillRect(x()-a,y()-b , a*vida/100, 3);
        
    }

    @Override
    public void inicializarAnimable() {
       dy=1;
       setY(20);
       setX(Math.random()*(Animador().ancho()-40)+20);
       setY(Math.random()*(Animador().alto()-40)+20);
       setPosX(x());
       setPosY(y());
    }

    @Override
    public Shape silueta() {
       return null;
    }

    //metodos de tanque por medio de las interfaces

    public void TanqueDisplay(){
        apariencia.Mostrar();
    }

    public void TanqueMove(){
        movimiento.Moverse();
    }

    public void TanqueDispara(){
        disparo.Disparar();
    }
}
