

package flag.vistas;

import flag.controladores.CInicio;
import java.applet.AudioClip;
import javax.swing.JButton;
import javax.swing.JFrame;
import sun.applet.AppletAudioClip;



public class VInicio extends JFrame{


    private CInicio control;


   public VInicio(){
        control= new CInicio(this);
      
        Fondo f = new Fondo();
        
      //  JPanel panelBotones = new JPanel(new GridLayout(3,1));
  
        JButton bInicio = new BotonInvisible();
        JButton bAcerca = new BotonInvisible();
        JButton bSalir = new BotonInvisible();

       // JButton bInicio = new JButton("jugar");

        bInicio.setName("bInicio");
        bAcerca.setName("bAcerca");
        bSalir.setName("bSalir");



        bInicio.addActionListener(control);
        bAcerca.addActionListener(control);
        bSalir.addActionListener(control);

        bInicio.setBounds( 100,508,130,40);
        bAcerca.setBounds( 350,508,130,40);
        bSalir.setBounds( 580,508,130,40);

        

        f.setLayout(null);


        f.add(bInicio);
        f.add(bAcerca);
        f.add(bSalir);
        
           
        this.add(f);
        setVisible(true);
        setTitle("Flag Battle");
	setSize(800,600);
        setLocation(200, 100);
        setResizable(false);
    }


   public void Reproducir(){
//    AudioClip musica = new AppletAudioClip(getClass().getResource("/flag/recursos/DavidGuetta.mp3"));
//    musica.play();
     
   }
}
