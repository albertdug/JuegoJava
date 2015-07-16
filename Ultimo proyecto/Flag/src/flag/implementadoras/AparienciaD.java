
package flag.implementadoras;

import flag.interfaces.IApariencia;
import java.awt.Image;
import javax.swing.ImageIcon;

public class AparienciaD implements IApariencia{

    public AparienciaD(){}

    public Image Mostrar() {
        Image img;
        System.out.println(" me pinte del tipo D");
        img = new ImageIcon(getClass().getResource("/flag/recursos/Tanque3.png")).getImage();
        return img;
    }
}
