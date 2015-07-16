
package flag.controladores;

import flag.vistas.VAcerca;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CAcerca implements ActionListener{

    private VAcerca vAcer;

    public CAcerca(VAcerca v){
        vAcer= v;
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Cerrar")){
        vAcer.dispose();
        }
    }
}
