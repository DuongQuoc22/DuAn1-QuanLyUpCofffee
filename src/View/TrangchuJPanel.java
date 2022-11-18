
package View;

import javax.swing.JPanel;


public class TrangchuJPanel extends javax.swing.JPanel {

    public TrangchuJPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mnDMK = new javax.swing.JMenuItem();
        mnThoat = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        mnDMK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnDMK.setText("Đổi mật khẩu");
        mnDMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDMKActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnDMK);

        mnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mnThoat.setText("Thoát");
        mnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnThoatActionPerformed(evt);
            }
        });
        jPopupMenu1.add(mnThoat);

        setBackground(new java.awt.Color(250, 182, 124));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cà Phê ");

        jPanel1.setBackground(new java.awt.Color(223, 158, 105));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jLabel1)
                        .addGap(0, 583, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addContainerGap(570, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mnDMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDMKActionPerformed
        // TODO add your handling code here:
//        DoiMatKhauJDialog a = new DoiMatKhauJDialog(null, true);
//        a.setVisible(true);
    }//GEN-LAST:event_mnDMKActionPerformed

    private void mnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnThoatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem mnDMK;
    private javax.swing.JMenuItem mnThoat;
    // End of variables declaration//GEN-END:variables
}
