

package flag.implementadoras;

import flag.interfaces.IApariencia;
import java.awt.Image;
import javax.swing.ImageIcon;

public class AparienciaC implements IApariencia{
    public AparienciaC(){}

    public Image Mostrar() {
        Image img;
        System.out.println(" me pinte del tipo C");
        img = new ImageIcon(getClass().getResource("/flag/recursos/Tanque2.png")).getImage();
        return img;
    }

}
