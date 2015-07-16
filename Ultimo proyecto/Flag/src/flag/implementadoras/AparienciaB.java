

package flag.implementadoras;

import flag.interfaces.IApariencia;
import java.awt.Image;
import javax.swing.ImageIcon;

public class AparienciaB implements IApariencia {

    public AparienciaB(){}

    public Image Mostrar() {
        Image img;
        System.out.println(" me pinte del tipo B");
        img = new ImageIcon(getClass().getResource("/flag/recursos/Tanque1.png")).getImage();
        return img;
    }

}
