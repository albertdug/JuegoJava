
package flag.vistas;

import flag.controladores.CEliminarTanque;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VDialogo extends JDialog {


    private boolean resp;
    private CEliminarTanque control;


    public VDialogo(String preg, String titu, VConfigurarJuego z){
        control = new CEliminarTanque(this,z);

        JButton bAceptar, bCancelar;
        JLabel labPregunta;
        JPanel panelPreg, panelBot, contenedor;

        labPregunta= new JLabel(preg);
        bAceptar = new JButton("Si");
        bAceptar.addActionListener(control);
        bCancelar= new JButton("No");
        bCancelar.addActionListener(control);

        panelPreg = new JPanel();
        panelPreg.add(labPregunta);

        panelBot= new JPanel(new FlowLayout());
        panelBot.add(bAceptar);
        panelBot.add(bCancelar);

        contenedor = new JPanel(new GridLayout(2,1));
        contenedor.add(panelPreg);
        contenedor.add(panelBot);
        this.add(contenedor);
        
        setSize(500,200);
        setLocation(200, 100);
        setTitle(titu);
        setResizable(false);
        setVisible(true);


    }

    public void setResp(boolean resp) {
        this.resp = resp;
    }

    public boolean isResp() {
        return resp;
    }



}
