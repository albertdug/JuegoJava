
package flag.implementadoras;

import flag.interfaces.IApariencia;
import java.awt.Image;
import javax.swing.ImageIcon;

public class AparienciaA implements IApariencia{

    public AparienciaA(){}
   
    public Image Mostrar() {
        Image img;
        System.out.println(" me pinte del tipo A");
        img = new ImageIcon(getClass().getResource("/flag/recursos/Tanque0.png")).getImage();
        return img;
    }

}
