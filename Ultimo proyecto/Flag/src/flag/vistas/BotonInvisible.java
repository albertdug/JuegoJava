
package flag.vistas;

import javax.swing.JButton;


public class BotonInvisible extends JButton {

   
        @Override
        public boolean isBorderPainted() {
            return false;
        }

        @Override
        public String getText() {
            return "";
        }

        @Override
        public boolean isContentAreaFilled() {
            return false;
        }

        /*@Override
        public Dimension getPreferredSize() {
            return new Dimension(100,50);
        }*/
    }


