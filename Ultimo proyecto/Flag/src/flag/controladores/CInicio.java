
package flag.controladores;

import flag.vistas.VAcerca;
import flag.vistas.VConfigurarJuego;
import flag.vistas.VInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class CInicio implements ActionListener{

    private VInicio vIni;
   
    public CInicio(VInicio v){
        vIni=v;
    }
    public void actionPerformed(ActionEvent e) {
       // vIni.Reproducir();
        //System.out.println("e.getSource() = " + ((JButton)e.getSource()).getName());
        if(((JButton)e.getSource()).getName().equals("bInicio")){
        vIni.dispose();
        new VConfigurarJuego();
        }else if (((JButton)e.getSource()).getName().equals("bSalir")){
        vIni.dispose();
        }else if(((JButton)e.getSource()).getName().equals("bAcerca")){
        new VAcerca();
        }
    }

}
