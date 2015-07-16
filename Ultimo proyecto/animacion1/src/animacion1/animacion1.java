
package animacion1;


import panimador.PAnimador;

/**
 *
 * @author estudiante
 */
public class animacion1 extends javax.swing.JFrame {
    private PAnimador animador;
     private pelota pelota;
    public animacion1() {
        initComponents();
        animador = new PAnimador(lienso);
        animador.antialiasing(true);
        
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lienso = new javax.swing.JPanel();
        iniciar = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lienso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(50, 97, 254)));
        lienso.setName("lienso"); // NOI18N
        lienso.setLayout(null);
        getContentPane().add(lienso);
        lienso.setBounds(0, 0, 540, 340);
        lienso.getAccessibleContext().setAccessibleName("lienso");

        iniciar.setText("iniciar");
        iniciar.setName("iniciar"); // NOI18N
        iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarMouseClicked(evt);
            }
        });
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        getContentPane().add(iniciar);
        iniciar.setBounds(0, 340, 80, 27);

        Agregar.setText("Aceptar");
        Agregar.setName("Aceptar"); // NOI18N
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar);
        Agregar.setBounds(410, 340, 100, 27);
        Agregar.getAccessibleContext().setAccessibleName("Aceptar");

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-542)/2, (screenSize.height-390)/2, 542, 390);
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
                    // TODO add your handling code here:
}//GEN-LAST:event_iniciarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_AgregarActionPerformed

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked
       pelota = new pelota();
       animador.agregarAnimable(pelota);         // TODO add your handling code here:
    }//GEN-LAST:event_AgregarMouseClicked

    private void iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarMouseClicked
        animador.iniciar();
    }//GEN-LAST:event_iniciarMouseClicked

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new animacion1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton iniciar;
    private javax.swing.JPanel lienso;
    // End of variables declaration//GEN-END:variables

}
