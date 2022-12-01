
package View;

import Dao.*;
import Model.*;

import java.awt.Color;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QLDoUongJDialog extends javax.swing.JDialog {

    LoaiSanPhamDao daolsp = new LoaiSanPhamDao();
    int row;
    
    public QLDoUongJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        filltableDoUong();
        txtidloai.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDoUong = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltentheloai = new javax.swing.JTable();
        txttenloai = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        btnlammoi = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtidloai = new javax.swing.JTextField();
        btnsua = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelDoUong.setBackground(new java.awt.Color(41, 93, 157));

        tbltentheloai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "mã thể loại", "tên loại đồ uống"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbltentheloai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbltentheloaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbltentheloai);

        txttenloai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttenloaiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TÊN LOẠI ĐỒ UỐNG");

        btnlammoi.setText("LÀM MỚI");
        btnlammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlammoiActionPerformed(evt);
            }
        });

        btnxoa.setText("XÓA");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnthem.setText("THÊM");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOẠI ĐỒ UỐNG");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MÃ LOẠI ĐÔ UỐNG");

        btnsua.setText("SỬA");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDoUongLayout = new javax.swing.GroupLayout(jPanelDoUong);
        jPanelDoUong.setLayout(jPanelDoUongLayout);
        jPanelDoUongLayout.setHorizontalGroup(
            jPanelDoUongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDoUongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDoUongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDoUongLayout.createSequentialGroup()
                        .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btnlammoi))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDoUongLayout.createSequentialGroup()
                        .addGroup(jPanelDoUongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDoUongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidloai)
                            .addComponent(txttenloai))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDoUongLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDoUongLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanelDoUongLayout.setVerticalGroup(
            jPanelDoUongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDoUongLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelDoUongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtidloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDoUongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttenloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanelDoUongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnxoa)
                    .addComponent(btnthem)
                    .addComponent(btnlammoi)
                    .addComponent(btnsua))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDoUong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDoUong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbltentheloaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbltentheloaiMouseClicked
        // TODO add your handling code here:
        try {
            row = tbltentheloai.getSelectedRow();
            edit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tbltentheloaiMouseClicked

    private void txttenloaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttenloaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttenloaiActionPerformed

    private void btnlammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlammoiActionPerformed
        // TODO add your handling code here:
        lammoi();
    }//GEN-LAST:event_btnlammoiActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:

        insert();
    }//GEN-LAST:event_btnthemActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnsuaActionPerformed

    
    private void filltableDoUong() { // hieenr thij len bang
        DefaultTableModel model = (DefaultTableModel) tbltentheloai.getModel();
        model.setRowCount(0);
        List<LoaiSanPham> list = daolsp.selectAll();
        for (LoaiSanPham x : list) {
            model.addRow(new Object[]{x.getID_LoaiSP(), x.getTenLoai()});
        }
    }

    // chuyền dữ liệu lên form
    private void setform(LoaiSanPham lsp) {
        txttenloai.setText(lsp.getTenLoai());
        txtidloai.setText(lsp.getID_LoaiSP());
    }

    //
    private LoaiSanPham getform() {
        LoaiSanPham lsp = new LoaiSanPham();
        lsp.setID_LoaiSP(txtidloai.getText());
        lsp.setTenLoai(txttenloai.getText());
        return lsp;
    }

    //
    private void edit() {
        String idloaisp = tbltentheloai.getValueAt(row, 0).toString();
        LoaiSanPham lsp = daolsp.selectID(idloaisp);
        setform(lsp);
    }

    // tự điền mã đồ uống
    private void selectMaxIDLSP() {
        if (daolsp.selectAll().isEmpty()) {
            txtidloai.setText("LSP01");
        } else {
            txtidloai.setText("LSP" + (daolsp.selectMaLOAISP() + 1));
        }
    }

    //
    private void lammoi() {
        txttenloai.setText("");
//        txtidloai.setText("");
        selectMaxIDLSP();

    }

    //kiểm tra dữ liêu
    private boolean checknull() {
        String kt = "^[a- zA- Z]+$";
        if (txttenloai.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "loại đồ uống không được để trống");
            return true;
        } else if (txttenloai.getText().length() < 3) {
            JOptionPane.showMessageDialog(this, "loại đồ uống không được dưới 3 kí tự");
            return true;
        } else if (!txttenloai.getText().matches(kt)) {
            JOptionPane.showMessageDialog(this, "nhập sai định dạng loại đồ uống");
            return true;
        }
        return false;
    }

    private boolean checkLoaiSP() {
        List<LoaiSanPham> list = daolsp.selectAll();
        for (int i = 0; i < list.size(); i++) {
            if (txtidloai.getText().equalsIgnoreCase(list.get(i).getID_LoaiSP())) {
                JOptionPane.showMessageDialog(this, "mã loại sản phẩm này đã tồn tại");
                return true;
            } else if (txttenloai.getText().equalsIgnoreCase(list.get(i).getTenLoai())) {
                JOptionPane.showMessageDialog(this, "tên loại sản phẩm này đã tồn tại");
                return true;
            } else ;
        }

        return false;
    }

    // theem du lieu
    private void insert() {
        if (checknull()) {
            return;
        } else if (checkLoaiSP()) {
            return;
        } else {
            try {
                LoaiSanPham lsp = getform();
                daolsp.insert(lsp);
                filltableDoUong();
                lammoi();
                JOptionPane.showMessageDialog(this, "đã thêm loại sản phẩm này");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    // cập nhập
    private void update() {
        if (checknull()) {
            return;
        } else {
            try {
                LoaiSanPham lsp = getform();
                daolsp.update(lsp);
                filltableDoUong();
                lammoi();
                JOptionPane.showMessageDialog(this, "đã cập nhập lại loại sản phẩm này");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // xóa dữ liệu
    private void delete() {
        row = tbltentheloai.getSelectedRow();
        int chon = JOptionPane.showConfirmDialog(this, "bạn có muốn xóa loại sản phẩm này ?");
        if (chon == JOptionPane.YES_OPTION) {
            if (row == -1) {
                JOptionPane.showMessageDialog(this, "không có dòng xóa");
                return;
            } else {
                try {
                    String masp = txtidloai.getText();
                    daolsp.delete(masp);
                    filltableDoUong();
                    lammoi();
                    JOptionPane.showMessageDialog(this, "đã xóa dữ liệu");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "tên loại đồ uống đang tồn tại bên sản phẩm không thể xóa");
                }
            }
        } else ;
    }
    
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
            java.util.logging.Logger.getLogger(QLDoUongJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLDoUongJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLDoUongJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLDoUongJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QLDoUongJDialog dialog = new QLDoUongJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlammoi;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelDoUong;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbltentheloai;
    private javax.swing.JTextField txtidloai;
    private javax.swing.JFormattedTextField txttenloai;
    // End of variables declaration//GEN-END:variables
}
