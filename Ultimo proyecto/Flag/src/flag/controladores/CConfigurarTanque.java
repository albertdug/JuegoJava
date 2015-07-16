
package flag.controladores;

import flag.modelos.MTanque;
import flag.vistas.VConfigurarJuego;
import flag.vistas.VConfigurarTanque;
import flag.implementadoras.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class CConfigurarTanque implements ActionListener{

    private VConfigurarTanque vTanque;
    private MTanque t;
    private int numero;
    private VConfigurarJuego vJuego;
    
    public CConfigurarTanque(VConfigurarTanque f, VConfigurarJuego g) {
        this.vTanque=f;
        this.vJuego= g;
        numero =0;
    }

    public void actionPerformed(ActionEvent e ) {
        if(e.getActionCommand().equals("Siguiente")){
            numero++;
            //System.out.println("valor de número" + numero);
            vTanque.AsignarImagen(numero);
        }else if(e.getActionCommand().equals("Anterior")){
            numero--;
            //System.out.println("valor de número" + numero);
            vTanque.AsignarImagen(numero);
        }else if(e.getActionCommand().equals("Guardar")){
            if(vTanque.gettNombre().equals("")){
                JOptionPane.showMessageDialog(vTanque,"El nombre del tanque no puede estar vacío","Mensaje",JOptionPane.ERROR_MESSAGE);
            }
                else{
                    t= new MTanque();
                    t.setNombre(vTanque.gettNombre().trim());
                    //configurando el tanque de acuerdo a la seleccion
                    //la apariencia
                     if(vTanque.getIdxApar() == 0){
                        AparienciaA aa= new AparienciaA();
                        t.setApariencia(aa);
                    }else if(vTanque.getIdxApar() == 1){
                        AparienciaB ab= new AparienciaB();
                        t.setApariencia(ab);
                    }else if(vTanque.getIdxApar() == 2){
                        AparienciaC ac= new AparienciaC();
                        t.setApariencia(ac);
                    }else{
                        AparienciaD ad= new AparienciaD();
                        t.setApariencia(ad);
                    }
                    //el disparo
                    if(vTanque.getCBDisparos() == 0){
                        DisparoA da= new DisparoA();
                        t.setDisparo(da);
                    }else if(vTanque.getCBDisparos() == 1){
                        DisparoB db= new DisparoB();
                        t.setDisparo(db);
                    }else{
                        DisparoC dc= new DisparoC();
                        t.setDisparo(dc);
                    }
                    //el movimiento
                    if(vTanque.getCBMovimientos() == 0){
                        MovimientoA ma= new MovimientoA();
                        t.setMovimiento(ma);
                    }else if(vTanque.getCBMovimientos() == 1){
                        MovimientoB mb= new MovimientoB();
                        t.setMovimiento(mb);
                    }else{
                        MovimientoC mc= new MovimientoC();
                        t.setMovimiento(mc);
                    }
                    //Comprobando seleccion guardada
                    System.out.print("Nombre: " + t.getNombre());
                    t.TanqueDisplay();
                    t.TanqueDispara();
                    t.TanqueMove();
                    //terMina la configuracion, y se agrega el tanque a la lista y al vector
                    vJuego.CrearLista(t);
                    vJuego.setTanque(t);
                    vTanque.dispose();
                }
        }else if(e.getActionCommand().equals("Cancelar")){
            vTanque.dispose();
        }  
     }
}

    


 


