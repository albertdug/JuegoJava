

package flag.vistas;

import flag.controladores.CConfigurarJuego;
import flag.modelos.MTanque;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class VConfigurarJuego extends JFrame {

    private CConfigurarJuego control;
    private JPanel panelTanques;
    private Vector<String> nombres;
    private JList lista;
    private int idx;
    private JButton bEliminar;
    private JTextField tNroRondas;
    private JTextField tNroMinas;
    private JButton bderecha;
    private JButton bizquierda;
    private Vector<MTanque> tanques;
    private JLabel labImg;
    private JPanel panelTerreno;
    private JPanel contenedor;
    private int idxApar;
    private JPanel panelBotones;
    private JPanel panelFlechas;


    public VConfigurarJuego(){

        tanques = new Vector();

        idx=0;
        control = new CConfigurarJuego(this);
        nombres = new Vector();
        JPanel panelJuego2 = new JPanel();
        JPanel panelJuego3 = new JPanel();
        JPanel panelJuego4 = new JPanel();

        panelTanques = new JPanel(new FlowLayout());

        panelBotones = new JPanel(new FlowLayout());

        contenedor = new JPanel(new GridLayout(7, 4));
        JLabel labRondas = new JLabel("Número de rondas: ");
        tNroRondas = new JTextField(2);

        JLabel labMinas = new JLabel("Número de minas: ");
        tNroMinas = new JTextField(2);

    
       
        JButton bAgregar = new JButton("Agregar tanque");
        bAgregar.addActionListener(control);
        bEliminar = new JButton("Eliminar tanque");
        bEliminar.addActionListener(control);
        JButton bVolver = new JButton("Menú inicial");
        bVolver.addActionListener(control);
        JButton bIniciar = new JButton("Iniciar");
        bIniciar.addActionListener(control);
//parte nueva
        panelTerreno = new JPanel();
        JLabel labTerreno = new JLabel("Terreno: ");
        labImg = new JLabel();
        ImageIcon modelo = new ImageIcon(getClass().getResource("/flag/recursos/Terreno1m.png"));
        labImg.setIcon(modelo);
        panelJuego4.add(labTerreno);
        panelTerreno.add(labImg);
        panelFlechas = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bderecha = new JButton("Siguiente");
        bderecha.addActionListener(control);
        bizquierda = new JButton("Anterior");
        bizquierda.addActionListener(control);
        panelFlechas.add(bizquierda);
        panelFlechas.add(bderecha);

        panelJuego2.add(labRondas);
        panelJuego2.add(tNroRondas);
        panelJuego3.add(labMinas);
        panelJuego3.add(tNroMinas);

    
        JLabel labLista = new JLabel("Lista de tanques: ");
        panelTanques.add(labLista);
        lista = new JList();
        lista.setListData(nombres);
        panelTanques.add(lista);

        //Agregando elementos a PANELBOTONES

         panelBotones.add(bAgregar);
         panelBotones.add(bIniciar);
         panelBotones.add(bVolver);
        

         contenedor.add(panelJuego2);   
         contenedor.add(panelJuego3);
         contenedor.add(panelJuego4);
         contenedor.add(panelTerreno);
         contenedor.add(panelFlechas);
         contenedor.add(panelTanques);
         contenedor.add(panelBotones, BorderLayout.SOUTH);

         this.add(contenedor);
        
        setVisible(true);
        setTitle("Configurar juego");
	
        //pack();
        setSize(400,600);
        setLocation(200, 100);
        setResizable(false);
    }

   

    public void CrearLista(MTanque tanq){

        nombres.add(idx, tanq.getNombre());
        idx= idx+1;
        lista.setListData(nombres);
        panelTanques.add(bEliminar);
              
    }

    public void RemoverElemento(int elem) {

         if(lista.getSelectedValue()==null){
            JOptionPane.showMessageDialog(this,"Debe seleccionar el tanque que desea eliminar de la lista","Mensaje",JOptionPane.ERROR_MESSAGE);
         }else{
            nombres.remove(elem);
            idx= idx-1;
            lista.setListData(nombres);
            panelTanques.add(bEliminar);
            }
    }

    public JList getLista() {
        return lista;
    }

    public String gettNroMinas() {
        return tNroMinas.getText();
    }

    public String gettNroRondas() {
        return tNroRondas.getText();

    }

    public int getTamanoNombres() {
        return nombres.size();
    }

        public MTanque getTanque(int index) {
        return tanques.get(index);
    }

    public void setTanque(MTanque tanq) {
       tanques.add(tanq);
    }


   public int getTamanoTanques(){
        return tanques.size();
   }

    public Vector<MTanque> getTanques() {
        return tanques;
    }

    public int getIdxApar() {
        return idxApar;
    }


    public void AsignarTerreno(int i){
       int valorNeg =0;

       ImageIcon modelo1 = new ImageIcon(getClass().getResource("/flag/recursos/Terreno1m.png"));
       ImageIcon modelo2 = new ImageIcon(getClass().getResource("/flag/recursos/Terreno2m.png"));
       ImageIcon modelo3 = new ImageIcon(getClass().getResource("/flag/recursos/Terreno3m.png"));
       ImageIcon modelo4 = new ImageIcon(getClass().getResource("/flag/recursos/Terreno4m.png"));
       ImageIcon modelo5 = new ImageIcon(getClass().getResource("/flag/recursos/Terreno5m.png"));
       ImageIcon modelo6 = new ImageIcon(getClass().getResource("/flag/recursos/Terreno6m.png"));
       ImageIcon modelo7 = new ImageIcon(getClass().getResource("/flag/recursos/Terreno7m.png"));
       ImageIcon modelo8 = new ImageIcon(getClass().getResource("/flag/recursos/Terreno8m.png"));
       ImageIcon modelo9 = new ImageIcon(getClass().getResource("/flag/recursos/Terreno9m.png"));
       ImageIcon modelo10 = new ImageIcon(getClass().getResource("/flag/recursos/Terreno10m.png"));
       ImageIcon modelo11 = new ImageIcon(getClass().getResource("/flag/recursos/Terreno11m.png"));
       ImageIcon modelo12 = new ImageIcon(getClass().getResource("/flag/recursos/Terreno12m.png"));
       ImageIcon modelo13 = new ImageIcon(getClass().getResource("/flag/recursos/Terreno13m.png"));
        valorNeg= i;
        if(i <0){
            i= i*(-1);

        }

       if(valorNeg ==(-12)){
            bizquierda.setEnabled(false);

            }else if(valorNeg ==(12)){
                bderecha.setEnabled(false);

            }
       if(valorNeg >(-12)){
            bizquierda.setEnabled(true);
            }
        if(valorNeg <12){
                bderecha.setEnabled(true);
       }

       if((i>=0) && (i<=12)){
            if(i==0){

                labImg.setIcon(modelo1);
                panelTerreno.add(labImg);
            }else if(i==1){

                labImg.setIcon(modelo2);
                panelTerreno.add(labImg);
            }else if(i==2){

                labImg.setIcon(modelo3);
                panelTerreno.add(labImg);
            }else if(i==3){

                labImg.setIcon(modelo4);
                panelTerreno.add(labImg);
            }else  if(i==4){

                labImg.setIcon(modelo5);
                panelTerreno.add(labImg);
            }else if(i==5){

                labImg.setIcon(modelo6);
                panelTerreno.add(labImg);
            }else if(i==6){

                labImg.setIcon(modelo7);
                panelTerreno.add(labImg);
            }else if(i==7){

                labImg.setIcon(modelo8);
                panelTerreno.add(labImg);
            }else  if(i==8){

                labImg.setIcon(modelo9);
                panelTerreno.add(labImg);
            }else if(i==9){

                labImg.setIcon(modelo10);
                panelTerreno.add(labImg);
            }else if(i==10){

                labImg.setIcon(modelo11);
                panelTerreno.add(labImg);
            }else if(i==11){

                labImg.setIcon(modelo12);
                panelTerreno.add(labImg);
            }else{

                labImg.setIcon(modelo13);
                panelTerreno.add(labImg);
            }
       }
           contenedor.add(panelTerreno);
           contenedor.add(panelFlechas);
           contenedor.add(panelTanques);
           contenedor.add(panelBotones);
           
           idxApar = i;


       }


   
}


