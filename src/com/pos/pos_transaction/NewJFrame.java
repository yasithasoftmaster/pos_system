/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.pos_transaction;

import java.awt.BorderLayout;
import javax.swing.JRootPane;

/**
 *
 * @author user
 */
public class NewJFrame extends javax.swing.JFrame {

    private GUIPos designPanel;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        initOthers();
    }

    public void initOthers() {
        this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        designPanel = new GUIPos();
        dispose();
        this.setLayout(new BorderLayout());
        this.add(designPanel, BorderLayout.CENTER);
        this.setExtendedState(NewJFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        pack();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                try {
//                    try {
//                        UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
//                    } catch (ParseException ex) {
//                        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                } catch (UnsupportedLookAndFeelException ex) {
//                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
//                }
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
