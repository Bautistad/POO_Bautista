package Frame;

import Methods.Match;
import Methods.Utilities;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Principal extends javax.swing.JInternalFrame {
    
    int clic =0;
    
    Utilities u = new Utilities();
    
    List<Integer> next = u.rowsTableAll();
    
    public Principal() {
        initComponents();
        this.setTitle("Memory Game");
        //this.setLocationRelativeTo(this);
        //ImageIcon image = new ImageIcon("memoria.png");
        //setIconImage(image.getImage());
        u.imgStart();
        desactivarFiguras();
        setVisible(true);
    }
    public void desactivarFiguras(){
    btn01.setVisible(false);
    btn02.setVisible(false);
    btn03.setVisible(false);
    btn04.setVisible(false);
    btn05.setVisible(false);
    btn06.setVisible(false);
    btn07.setVisible(false);
    btn08.setVisible(false);}
    public void activarFiguras(){
    btn01.setVisible(true);
    btn02.setVisible(true);
    btn03.setVisible(true);
    btn04.setVisible(true);
    btn05.setVisible(true);
    btn06.setVisible(true);
    btn07.setVisible(true);
    btn08.setVisible(true);}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btn02 = new javax.swing.JButton();
        btn03 = new javax.swing.JButton();
        btn04 = new javax.swing.JButton();
        btn05 = new javax.swing.JButton();
        btn06 = new javax.swing.JButton();
        btn07 = new javax.swing.JButton();
        btn08 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BotonJugar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jButton3.setText("jButton1");

        jButton4.setText("jButton1");

        jButton5.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btn01.setForeground(new java.awt.Color(204, 204, 255));
        btn01.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn01.setMaximumSize(new java.awt.Dimension(64, 64));
        btn01.setMinimumSize(new java.awt.Dimension(64, 64));
        btn01.setPreferredSize(new java.awt.Dimension(64, 64));
        btn01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn01MouseClicked(evt);
            }
        });
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });

        btn02.setForeground(new java.awt.Color(204, 204, 255));
        btn02.setMaximumSize(new java.awt.Dimension(64, 64));
        btn02.setMinimumSize(new java.awt.Dimension(64, 64));
        btn02.setPreferredSize(new java.awt.Dimension(64, 64));
        btn02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn02MouseClicked(evt);
            }
        });
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });

        btn03.setForeground(new java.awt.Color(204, 204, 255));
        btn03.setMaximumSize(new java.awt.Dimension(64, 64));
        btn03.setMinimumSize(new java.awt.Dimension(64, 64));
        btn03.setPreferredSize(new java.awt.Dimension(64, 64));
        btn03.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn03MouseClicked(evt);
            }
        });

        btn04.setForeground(new java.awt.Color(204, 204, 255));
        btn04.setMaximumSize(new java.awt.Dimension(64, 64));
        btn04.setMinimumSize(new java.awt.Dimension(64, 64));
        btn04.setPreferredSize(new java.awt.Dimension(64, 64));
        btn04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn04MouseClicked(evt);
            }
        });

        btn05.setForeground(new java.awt.Color(204, 204, 255));
        btn05.setMaximumSize(new java.awt.Dimension(64, 64));
        btn05.setMinimumSize(new java.awt.Dimension(64, 64));
        btn05.setPreferredSize(new java.awt.Dimension(64, 64));
        btn05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn05MouseClicked(evt);
            }
        });
        btn05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn05ActionPerformed(evt);
            }
        });

        btn06.setForeground(new java.awt.Color(204, 204, 255));
        btn06.setMaximumSize(new java.awt.Dimension(64, 64));
        btn06.setMinimumSize(new java.awt.Dimension(64, 64));
        btn06.setPreferredSize(new java.awt.Dimension(64, 64));
        btn06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn06MouseClicked(evt);
            }
        });

        btn07.setForeground(new java.awt.Color(204, 204, 255));
        btn07.setMaximumSize(new java.awt.Dimension(64, 64));
        btn07.setMinimumSize(new java.awt.Dimension(64, 64));
        btn07.setPreferredSize(new java.awt.Dimension(64, 64));
        btn07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn07MouseClicked(evt);
            }
        });
        btn07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn07ActionPerformed(evt);
            }
        });

        btn08.setForeground(new java.awt.Color(204, 204, 255));
        btn08.setMaximumSize(new java.awt.Dimension(64, 64));
        btn08.setMinimumSize(new java.awt.Dimension(64, 64));
        btn08.setPreferredSize(new java.awt.Dimension(64, 64));
        btn08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn08MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/pastel4.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/pastel5.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/pastel6.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(22, 22, 22))
        );

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/pastel1.png"))); // NOI18N
        jLabel1.setText("Memory Game ");

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        BotonJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/botonJugar.png"))); // NOI18N
        BotonJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonJugarMouseClicked(evt);
            }
        });
        BotonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJugarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/pastel3.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frame/pastel2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BotonJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(BotonJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));
        jPanel3.setForeground(new java.awt.Color(204, 255, 102));

        jLabel7.setFont(new java.awt.Font("Vijaya", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("Dayanara Bautista and Camila Perrazo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(63, 63, 63))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn04, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn06, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn08, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn05, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn07, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn05, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn07, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn03, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn01, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn04, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn02, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn06, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn08, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn01MouseClicked
        //u.evtBtn(btn01,evt,next.get(0));
        Match m = new Match();
        m.setBtn(btn01);
        m.setNumberBtn(1);
        m.setValueMatch(next.get(0));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }//GEN-LAST:event_btn01MouseClicked

    private void btn02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn02MouseClicked
        // TODO add your handling code here:
        Match m = new Match();
        m.setBtn(btn02);
        m.setNumberBtn(2);
        m.setValueMatch(next.get(1));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }//GEN-LAST:event_btn02MouseClicked

    private void btn03MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn03MouseClicked
        // TODO add your handling code here:
        Match m = new Match();
        m.setBtn(btn03);
        m.setNumberBtn(3);
        m.setValueMatch(next.get(2));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }//GEN-LAST:event_btn03MouseClicked

    private void btn04MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn04MouseClicked
       Match m = new Match();
        m.setBtn(btn04);
        m.setNumberBtn(4);
        m.setValueMatch(next.get(3));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }//GEN-LAST:event_btn04MouseClicked

    private void btn05MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn05MouseClicked
        Match m = new Match();
        m.setBtn(btn05);
        m.setNumberBtn(5);
        m.setValueMatch(next.get(4));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }//GEN-LAST:event_btn05MouseClicked

    private void btn06MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn06MouseClicked
        Match m = new Match();
        m.setBtn(btn06);
        m.setNumberBtn(6);
        m.setValueMatch(next.get(5));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }//GEN-LAST:event_btn06MouseClicked

    private void btn07MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn07MouseClicked
        Match m = new Match();
        m.setBtn(btn07);
        m.setNumberBtn(7);
        m.setValueMatch(next.get(6));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }//GEN-LAST:event_btn07MouseClicked

    private void btn08MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn08MouseClicked
        Match m = new Match();
        m.setBtn(btn08);
        m.setNumberBtn(8);
        m.setValueMatch(next.get(7));
        u.getMatch().add(m);
        u.paintMatch();
        u.match();
    }//GEN-LAST:event_btn08MouseClicked

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn01ActionPerformed

    private void btn05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn05ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn05ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn02ActionPerformed

    private void BotonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonJugarActionPerformed

    private void btn07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn07ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn07ActionPerformed

    private void BotonJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonJugarMouseClicked
        // TODO add your handling code here:
    activarFiguras();
    }//GEN-LAST:event_BotonJugarMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonJugar;
    public static javax.swing.JButton btn01;
    public static javax.swing.JButton btn02;
    public static javax.swing.JButton btn03;
    public static javax.swing.JButton btn04;
    public static javax.swing.JButton btn05;
    public static javax.swing.JButton btn06;
    public static javax.swing.JButton btn07;
    public static javax.swing.JButton btn08;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
