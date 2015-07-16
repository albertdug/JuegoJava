
package flag.vistas;

import flag.controladores.CResultados;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VResultados extends JFrame{


    private CResultados control;
    public VResultados(){
        control = new CResultados(this);
        JPanel panelTabla = new JPanel();
        JLabel tabla = new JLabel("Resultados del juego");
        panelTabla.add(tabla);
        this.add(panelTabla, BorderLayout.CENTER);
        JPanel panelBoton = new JPanel();
        JButton bCerrar = new JButton("Cerrar");
        panelBoton.add(bCerrar);
        bCerrar.addActionListener(control);
        this.add(panelBoton, BorderLayout.SOUTH);
        setTitle("Resultados");
        setSize(600,400);
        setLocation(200, 100);
        setResizable(false);
        setVisible(true);
    }

}
