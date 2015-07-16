
package flag.vistas;

import flag.controladores.CAcerca;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VAcerca extends JFrame {

    private CAcerca control;

    public VAcerca(){
        control = new CAcerca(this);
        JPanel panelDes = new JPanel(new GridLayout(5, 5));
        JPanel panelBoton = new JPanel();
        JLabel lDes = new JLabel("          Desarrolladores:");
        JLabel lSabrina = new JLabel("    Sabrina Carolina Torres Díaz");
        JLabel lAlbert = new JLabel("    Albert Rafael Durán Guanipa");
        JLabel lFecha = new JLabel("    Marzo 2010");
        JLabel lVersion = new JLabel("    Version 1.0");
        JButton bCerrar = new JButton("Cerrar");
        bCerrar.addActionListener(control);

        panelDes.add(lDes);
        panelDes.add(lSabrina);
        panelDes.add(lAlbert);
        panelDes.add(lFecha);
        panelDes.add(lVersion);
        panelBoton.add(bCerrar, CENTER_ALIGNMENT);

        this.add(panelDes, BorderLayout.CENTER);
        this.add(panelBoton, BorderLayout.SOUTH);

    
        setVisible(true);
        setTitle("Acerca de");
        pack();
	setSize(300,300);
        setLocation(200, 100);
        setResizable(false);
        
    }

}
