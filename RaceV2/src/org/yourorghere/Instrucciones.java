/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

/**
 *
 * @author EddySantiago
 */
public class Instrucciones extends javax.swing.JFrame {

    /**
     * Creates new form Instrcciones
     */
    public Instrucciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(640, 460));
        setMinimumSize(new java.awt.Dimension(640, 460));
        setPreferredSize(new java.awt.Dimension(640, 460));
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Aharoni", 0, 48)); // NOI18N
        jLabel4.setText("Movimineto");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 50, 280, 49);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\EddySantiago\\Documents\\NetBeansProjects\\Ejercicio1\\RaceV2\\movimiento.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 130, 150, 93);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/yourorghere/Imagenes/teclac.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 300, 75, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("A: Giro Izquierda");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(330, 180, 210, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("D: Giro Derecha");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 210, 210, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("C: Cambio de Vista");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(330, 310, 210, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("S: Desacelerar");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(330, 150, 210, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("W: Adelante- Acelerar");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(330, 120, 210, 30);

        jLabel13.setFont(new java.awt.Font("Aharoni", 0, 48)); // NOI18N
        jLabel13.setText("Instrcciones");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(210, 10, 270, 49);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\EddySantiago\\Documents\\NetBeansProjects\\Ejercicio1\\RaceV2\\space.png")); // NOI18N
        jLabel9.setText("jLabel3");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(160, 240, 150, 50);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel11);
        jLabel11.setBounds(140, 110, 180, 250);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Espacio: Frenar");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(330, 250, 210, 30);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.setOpaque(false);
        jButton1.setPreferredSize(new java.awt.Dimension(125, 50));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 360, 125, 50);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 110, 220, 250);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\EddySantiago\\Documents\\NetBeansProjects\\Ejercicio1\\RaceV2\\pista.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-40, -90, 998, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
       Inicio inicio = new Inicio();
       inicio.setVisible(rootPaneCheckingEnabled);
        this.dispose();

    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instrucciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
