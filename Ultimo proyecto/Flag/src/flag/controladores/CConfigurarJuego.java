
package flag.controladores;

import flag.modelos.MTerreno;
import flag.vistas.VConfigurarJuego;
import flag.vistas.VConfigurarTanque;
import flag.vistas.VInicio;
import flag.vistas.VTerreno;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import panimador.PAnimador;

public class CConfigurarJuego implements ActionListener{

    private VConfigurarJuego vJuego;
    private int numero;
    private VTerreno vTerre;

    public CConfigurarJuego(VConfigurarJuego f){
        vJuego= f;
        numero =0;
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Siguiente")){
            numero++;
            vJuego.AsignarTerreno(numero);
        }else if(e.getActionCommand().equals("Anterior")){
            numero--;
            vJuego.AsignarTerreno(numero);
        }
        if(e.getActionCommand().equals("Agregar tanque")){
        new VConfigurarTanque(vJuego);
        }
        else if(e.getActionCommand().equals("Menú inicial")){
            vJuego.dispose();
            new VInicio();
        }
        else if(e.getActionCommand().equals("Iniciar")){
           if((vJuego.gettNroMinas().equals("")) || (vJuego.gettNroRondas().equals(""))){
                 JOptionPane.showMessageDialog(vJuego,"El número de minas y el número de rondas no pueden estar vacios","Mensaje",JOptionPane.ERROR_MESSAGE);

           }else{
                String temporalM, temporalR;
                temporalM= vJuego.gettNroMinas();
                temporalR= vJuego.gettNroRondas();
                int nroMin =Integer.parseInt(temporalM);
                int nroRon =Integer.parseInt(temporalR);

            if(nroMin<=0){
                 JOptionPane.showMessageDialog(vJuego,"Debe ingresar un número de minas mayor que 0","Mensaje",JOptionPane.ERROR_MESSAGE);
            }else if(nroRon<=0){
                 JOptionPane.showMessageDialog(vJuego,"Debe ingresar un número de rondas mayor que 0","Mensaje",JOptionPane.ERROR_MESSAGE);
                }else if(vJuego.getTamanoNombres()<=1){
                     JOptionPane.showMessageDialog(vJuego,"Debe agregar como mínimo 2 tanques al torneo","Mensaje",JOptionPane.ERROR_MESSAGE);
                }
                else{
                //si todo fino
                     
                    Image terre;
                    System.out.print("valor de indice para decidir terreno: " + vJuego.getIdxApar());
                     if(vJuego.getIdxApar() == 0){
                        terre = new ImageIcon(getClass().getResource("/flag/recursos/Terreno1.png")).getImage();
                    }else if(vJuego.getIdxApar() == 1){
                        terre = new ImageIcon(getClass().getResource("/flag/recursos/Terreno2.png")).getImage();
                        
                    }else if(vJuego.getIdxApar() == 2){
                        terre = new ImageIcon(getClass().getResource("/flag/recursos/Terreno3.png")).getImage();

                    }else if(vJuego.getIdxApar() == 3){
                        terre = new ImageIcon(getClass().getResource("/flag/recursos/Terreno4.png")).getImage();

                    }else if(vJuego.getIdxApar() == 4){
                        terre = new ImageIcon(getClass().getResource("/flag/recursos/Terreno5.png")).getImage();

                    }else if(vJuego.getIdxApar() == 5){
                        terre = new ImageIcon(getClass().getResource("/flag/recursos/Terreno6.png")).getImage();

                    }else if(vJuego.getIdxApar() == 6){
                        terre = new ImageIcon(getClass().getResource("/flag/recursos/Terreno7.png")).getImage();

                    }else if(vJuego.getIdxApar() == 7){
                        terre = new ImageIcon(getClass().getResource("/flag/recursos/Terreno8.png")).getImage();

                    }else if(vJuego.getIdxApar() == 8){
                        terre = new ImageIcon(getClass().getResource("/flag/recursos/Terreno9.png")).getImage();

                    }else if(vJuego.getIdxApar() == 9){
                        terre = new ImageIcon(getClass().getResource("/flag/recursos/Terreno10.png")).getImage();

                    }else if(vJuego.getIdxApar() == 10){
                        terre = new ImageIcon(getClass().getResource("/flag/recursos/Terreno11.png")).getImage();

                    }else if(vJuego.getIdxApar() == 11){
                        terre = new ImageIcon(getClass().getResource("/flag/recursos/Terreno12.png")).getImage();

                    }else{
                        terre = new ImageIcon(getClass().getResource("/flag/recursos/Terreno13.png")).getImage();

                    }
                    MTerreno mt= new MTerreno();
                    mt.establecerTerreno(terre);
                    vTerre = new VTerreno();
                    PAnimador animador = new PAnimador(vTerre.getPanelTerre());
                    vTerre.AnimarTerreno(mt, animador);
                    vTerre.getTorneo().setNroMinas(nroMin);
                    vTerre.getTorneo().setNroRondas(nroRon);
                
                    for(int i=0; i<vJuego.getTamanoTanques(); i++){
                      
                        vTerre.AnimarTanque(vJuego.getTanque(i), animador);
                        
                    }
                    
                    vJuego.dispose();
                    vTerre.setVisible(true);
                    //System.out.print("tamano de tanquesReci: " +vista2.getTamanoTanquesReci());
                    vTerre.setLabNroM(temporalM);
                    vTerre.setLabNroR(temporalR);
                    }
           }
        }else if(e.getActionCommand().equals("Eliminar tanque")){
            int indice;
           //VDialogo  vis= new VDialogo("¿Está seguro de que desea eliminar este tanque?", "Confirmar eliminación");
           //if(vis.isResp()==true){
            indice= vJuego.getLista().getSelectedIndex();
            //System.out.println("indice: " + indice);
            vJuego.RemoverElemento(indice);
          // }
        }


    }


    
  

}
