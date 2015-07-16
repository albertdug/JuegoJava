
package flag.controladores;

import flag.vistas.VResultados;
import flag.vistas.VTerreno;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CTerreno implements ActionListener{

    private VTerreno vTerre;
    public CTerreno(VTerreno v){
        vTerre = v;
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Finalizar juego")){
               vTerre.dispose();
               new VResultados();
        }else if(e.getActionCommand().equals("Salir")){
                vTerre.dispose();
        }else if(e.getActionCommand().equals("Pausar")){
                System.out.println("Juego en pausa");
        }else if(e.getActionCommand().equals("Reanudar")){
                System.out.println("Se reanuda el juego");
        }
    }

}
