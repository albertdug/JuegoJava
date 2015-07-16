
package flag.vistas;

import flag.controladores.CConfigurarTanque;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class VConfigurarTanque extends JFrame {
    private CConfigurarTanque control;
    private JLabel tanq;
    private JPanel panelImagen;
    private  JPanel contenedor;
    private JTextField tNombre;
    private JComboBox CBMovimientos;
    private JComboBox CBDisparos;
    private JButton bderecha;
    private JButton bizquierda;
    private int idxApar;

  
    public VConfigurarTanque(VConfigurarJuego k){

        control = new CConfigurarTanque(this, k);

	panelImagen = new JPanel();
        tanq = new JLabel();
        ImageIcon modelo = new ImageIcon(getClass().getResource("/flag/recursos/Tanque3.png"));
        tanq.setIcon(modelo);
        panelImagen.add(tanq);

        JPanel panelFlechas = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bderecha = new JButton("Siguiente");
        bderecha.addActionListener(control);
        bizquierda = new JButton("Anterior");
        bizquierda.addActionListener(control);
        
        panelFlechas.add(bizquierda);
        panelFlechas.add(bderecha);

        JLabel labNombre = new JLabel("     Nombre del tanque: ");
        JLabel labApa = new JLabel("     Apariencia: ");
        JLabel labMov = new JLabel("     Movimiento: ");
        JLabel labDis = new JLabel("     Disparo: ");

        tNombre = new JTextField(20);

        CBMovimientos = new JComboBox();
        CBMovimientos.addItem("Perseguir a un enemigo");
        CBMovimientos.addItem("Caminar por los bordes");
        CBMovimientos.addItem("Quedarse en el punto de inicio");

        CBDisparos = new JComboBox();
        CBDisparos.addItem("Evaluar nivel de vida");
        CBDisparos.addItem("Evaluar nivel de energía");
        CBDisparos.addItem("Disparar al de vida más baja");

        JPanel panelConfi = new JPanel(new GridLayout(5, 2));
        panelConfi.add(labNombre);
        panelConfi.add(tNombre);
        panelConfi.add(labMov);
        panelConfi.add(CBMovimientos);
        panelConfi.add(labDis);
        panelConfi.add(CBDisparos);
        panelConfi.add(labApa);
        

        JPanel panelMenu = new JPanel();
        JButton bGuardar = new JButton("Guardar");
        bGuardar.addActionListener(control);
        JButton bCancelar = new JButton("Cancelar");
        bCancelar.addActionListener(control);
        panelMenu.add(bGuardar);
        panelMenu.add(bCancelar);
        contenedor = new JPanel(new GridLayout(2, 1));
        this.add(panelConfi, BorderLayout.NORTH);
        contenedor.add(panelImagen);
        contenedor.add(panelFlechas);
        JPanel contenedor2 = new JPanel();
        contenedor2.add(panelMenu, BorderLayout.SOUTH);
        this.add(contenedor);
        this.add(contenedor2, BorderLayout.SOUTH);
        setTitle("Configuraciones del tanque");
        setSize(500,500);
        setLocation(200, 100);
        setResizable(false);
        setVisible(true);
        pack();
    }

    public int getCBDisparos() {
        return CBDisparos.getSelectedIndex();
    }

    public int getCBMovimientos() {
        return CBMovimientos.getSelectedIndex();
    }
 
    public String gettNombre() {
        return tNombre.getText();
    }

    public void AsignarImagen(int i){
       int valorNeg =0;

       ImageIcon modelo0 = new ImageIcon(getClass().getResource("/flag/recursos/Tanque0.png"));
       ImageIcon modelo1 = new ImageIcon(getClass().getResource("/flag/recursos/Tanque1.png"));
       ImageIcon modelo2 = new ImageIcon(getClass().getResource("/flag/recursos/Tanque2.png"));
       ImageIcon modelo3 = new ImageIcon(getClass().getResource("/flag/recursos/Tanque3.png"));
       ImageIcon modelo4 = new ImageIcon(getClass().getResource("/flag/recursos/Tanque4.png"));
       ImageIcon modelo5 = new ImageIcon(getClass().getResource("/flag/recursos/Tanque5.png"));
       ImageIcon modelo6 = new ImageIcon(getClass().getResource("/flag/recursos/Tanque6.png"));
       ImageIcon modelo7 = new ImageIcon(getClass().getResource("/flag/recursos/Tanque7.png"));
       ImageIcon modelo8 = new ImageIcon(getClass().getResource("/flag/recursos/Tanque8.png"));
       ImageIcon modelo9 = new ImageIcon(getClass().getResource("/flag/recursos/Tanque9.png"));
       ImageIcon modelo10 = new ImageIcon(getClass().getResource("/flag/recursos/Tanque10.png"));
        valorNeg= i;
        if(i <0){
            i= i*(-1);
          
        }

       if(valorNeg ==(-3)){
            bizquierda.setEnabled(false);
           
            }else if(valorNeg ==(3)){
                bderecha.setEnabled(false);
                  
            }
       if(valorNeg >(-3)){
            bizquierda.setEnabled(true);
            }
        if(valorNeg <3){
                bderecha.setEnabled(true);
       }

       if((i>=0) && (i<=3)){
            if(i==0){

                tanq.setIcon(modelo0);
                panelImagen.add(tanq);
            }else if(i==1){
          
                tanq.setIcon(modelo1);
                panelImagen.add(tanq);
            }else if(i==2){
            
                tanq.setIcon(modelo2);
                panelImagen.add(tanq);
            }else if(i==3){

                tanq.setIcon(modelo3);
                panelImagen.add(tanq);
            }else if(i==4){

                tanq.setIcon(modelo4);
                panelImagen.add(tanq);
            }else if(i==5){

                tanq.setIcon(modelo5);
                panelImagen.add(tanq);
            }else if(i==6){

                tanq.setIcon(modelo6);
                panelImagen.add(tanq);
            }else if(i==7){

                tanq.setIcon(modelo7);
                panelImagen.add(tanq);
            }else if(i==8){

                tanq.setIcon(modelo8);
                panelImagen.add(tanq);
            }else if(i==9){

                tanq.setIcon(modelo9);
                panelImagen.add(tanq);
            }else if(i==10){

                tanq.setIcon(modelo10);
                panelImagen.add(tanq);
            }


       }
           contenedor.add(panelImagen);
           idxApar = i;
         

       }

    public int getIdxApar() {
        return idxApar;
    }

}
    



