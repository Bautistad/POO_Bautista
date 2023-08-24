
package Frame;
public class Menu extends javax.swing.JFrame {
    
    
    public Menu() {
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

        EscritorioJuego = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        EditMenu1 = new javax.swing.JMenu();
        EditMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioJuegoLayout = new javax.swing.GroupLayout(EscritorioJuego);
        EscritorioJuego.setLayout(EscritorioJuegoLayout);
        EscritorioJuegoLayout.setHorizontalGroup(
            EscritorioJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );
        EscritorioJuegoLayout.setVerticalGroup(
            EscritorioJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        EditMenu1.setText("Jugador");
        EditMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMenu1MouseClicked(evt);
            }
        });
        EditMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMenu1ActionPerformed(evt);
            }
        });
        jMenuBar2.add(EditMenu1);

        EditMenu2.setText("Game");
        EditMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMenu2MouseClicked(evt);
            }
        });
        EditMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMenu2ActionPerformed(evt);
            }
        });
        jMenuBar2.add(EditMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EscritorioJuego)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(EscritorioJuego)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditMenu2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_EditMenu2ActionPerformed

    private void EditMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditMenu1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_EditMenu1ActionPerformed

    private void EditMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMenu2MouseClicked
        // TODO add your handling code here:
    Principal gameForm = new Principal();
    gameForm.setLocation(0,0);
    EscritorioJuego.removeAll();
    EscritorioJuego.add(gameForm);
    EscritorioJuego.revalidate();
    EscritorioJuego.repaint();
    gameForm.setVisible(true);
  
        
    }//GEN-LAST:event_EditMenu2MouseClicked

    private void EditMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMenu1MouseClicked
        // TODO add your handling code here:
    Jugador jugador = new Jugador();
    jugador.setLocation(0,0);
    EscritorioJuego.removeAll();
    EscritorioJuego.add(jugador);
    EscritorioJuego.revalidate();
    EscritorioJuego.repaint();
    jugador.setVisible(true);
  
    }//GEN-LAST:event_EditMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu EditMenu1;
    private javax.swing.JMenu EditMenu2;
    private javax.swing.JDesktopPane EscritorioJuego;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}