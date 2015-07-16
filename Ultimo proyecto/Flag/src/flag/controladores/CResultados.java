
package flag.controladores;

import flag.vistas.VResultados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CResultados implements ActionListener{

    private VResultados vResul;
    public CResultados(VResultados g){
        vResul=g;

    }
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Cerrar")){
            vResul.dispose();
        }
    }

}
