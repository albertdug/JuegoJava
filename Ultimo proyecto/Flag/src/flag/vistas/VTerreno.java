
package flag.vistas;

import flag.controladores.CTerreno;
import flag.modelos.MTanque;
import flag.modelos.MTerreno;
import flag.modelos.MTorneo;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import panimador.PAnimador;


public class VTerreno extends JFrame {

    private CTerreno control;
    private JPanel panelTerre;
    private JLabel labNroM;
    private JLabel labNroR;
    private JPanel panelDerecha;
    private Vector<MTanque> tanquesReci;
    private JLabel terreno;
    private MTorneo torneo;
    private  JPanel panelIzquierda;
    private JPanel panelBotones;
   
   
    public VTerreno(){
        control = new CTerreno(this);
        tanquesReci = new Vector();
        terreno = new JLabel();
        panelTerre = new JPanel();
        panelBotones = new JPanel();
        JButton bPausar = new JButton("Pausar");
        bPausar.addActionListener(control);
        JButton bReanudar = new JButton("Reanudar");
        bReanudar.addActionListener(control);
        JButton bFinalizar = new JButton("Finalizar juego");
        bFinalizar.addActionListener(control);
        JButton bSalir = new JButton("Salir");
        bSalir.addActionListener(control);
        panelBotones.add(bPausar);
        panelBotones.add(bReanudar);
        panelBotones.add(bFinalizar);
        panelBotones.add(bSalir);
        panelDerecha = new JPanel(new GridLayout(2, 6));
        panelIzquierda = new JPanel(new GridLayout(2, 2));
        panelTerre.setBounds(5, 5, 800, 600);
        this.add(panelTerre, BorderLayout.CENTER);
        this.add(panelBotones, BorderLayout.SOUTH);
        this.add(panelDerecha, BorderLayout.EAST);
        this.add(panelIzquierda, BorderLayout.WEST);
        torneo = new MTorneo();
        setTitle("Flag Battle");
        setSize(900,600);
        setLocation(20, 20);
        setResizable(false);
    }

     public void setLabNroM(String m) {
        JLabel labRondas = new JLabel("   Rondas: ");
        labNroR = new JLabel();
        panelDerecha.add(labRondas);
        labNroM = new JLabel(m);
        panelDerecha.add(labNroM);
    }

    public void setLabNroR(String m) {
        JLabel labMinas = new JLabel("   Minas: ");
        labNroM = new JLabel();
        panelDerecha.add(labMinas);
        labNroR = new JLabel(m);
        panelDerecha.add(labNroR);
    }

    public Vector<MTanque> getTanquesReci() {
        return tanquesReci;
    }

    public void setTanquesReci(Vector<MTanque> tanques) {
        this.tanquesReci = tanques;
    }


    public int getTamanoTanquesReci(){
       return tanquesReci.size();
    }

    public MTanque getUnTanque(int id) {
        return tanquesReci.get(id);
    }

    public void AnimarTanque(MTanque ta, PAnimador anima){
         anima.iniciar();
         anima.agregarAnimable(ta);
    }

    public void AnimarTerreno(MTerreno mt, PAnimador anima){
         anima.iniciar();
         anima.agregarAnimable(mt);
    }

    public void setTerreno(ImageIcon img) {
        img = new ImageIcon(getClass().getResource("/flag/recursos/Terreno.png"));
        terreno.setIcon(img);
    }

    public JPanel getPanelTerre() {
        return panelTerre;
    }

    public MTorneo getTorneo() {
        return torneo;
    }

   



}
