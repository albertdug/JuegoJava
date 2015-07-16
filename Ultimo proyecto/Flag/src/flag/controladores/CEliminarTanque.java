//FUERA DE USO
package flag.controladores;

import flag.vistas.VConfigurarJuego;
import flag.vistas.VDialogo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CEliminarTanque implements ActionListener{
    private VDialogo vista;
     private VConfigurarJuego vista2;

    public CEliminarTanque(VDialogo v, VConfigurarJuego z){
        vista = v;
        vista2= z;
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Si")){
            System.out.println("hice esto");
            vista.setResp(true);
            vista.dispose();
        }else if(e.getActionCommand().equals("No")){
            vista.setResp(false);
            vista.dispose();
        }
    }

}
