
package flag.vistas;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Fondo extends JPanel{

    public Fondo(){

    this.setSize(600, 600);

    }

    @Override
    public void paintComponent(Graphics g){

        Dimension tamano = getSize();
        ImageIcon imagen = new ImageIcon(getClass().getResource("/flag/recursos/final.png"));
        g.drawImage(imagen.getImage(), 0, 0, tamano.width, tamano.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }

}
