
package View;


import Dao.*;
import javax.swing.table.DefaultTableModel;
import Model.*;
import java.io.File;
import java.util.ArrayList;

import static java.util.Collections.list;
import Helper.*;
import Services.SanPhamService;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class QuanLySanPhamJPanel extends javax.swing.JPanel {
 
    SanPhamDao DAOSP = new SanPhamDao();
    LoaiSanPhamDao daolsp = new LoaiSanPhamDao();
    int row;
    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel modelspkd = new DefaultTableModel();
    DonViSanPhamDao daodv = new DonViSanPhamDao();
    List<DonViSanPham> listdv;
    LoaiSanPhamDao dao = new LoaiSanPhamDao();
    List<LoaiSanPham> listlsp;
 
    public QuanLySanPhamJPanel() {
        initComponents();
        init();
        model = (DefaultTableModel) tblSanPhansd.getModel();

        filltotableSP();
        modelspkd = (DefaultTableModel) tblSanPHamksd.getModel();
        filltotableSPKD();
        txtMaSP.requestFocus();
    }
    
    private void init(){
        fillcomboboxLoaiSP();
        fillcomboDonVi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPhansd = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSanPHamksd = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboLoaidouong = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        lblHinh = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cboDonvi = new javax.swing.JComboBox<>();
        btnStart = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rdoksd = new javax.swing.JRadioButton();
        rdosd = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        tbnLamMoi = new javax.swing.JButton();
        btndonvi = new javax.swing.JButton();
        btnloaidouong = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(225, 193, 144));
        jPanel1.setLayout(null);

        tabs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabsMouseClicked(evt);
            }
        });

        tblSanPhansd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên sản phẩm ", "Loại đồ uống ", "Giá", "Đợn vị", "Trạng thái"
            }
        ));
        tblSanPhansd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhansdMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPhansd);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1215, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        tabs.addTab("Sản Phẩm sử dụng", jPanel2);

        tblSanPHamksd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sản phẩm", "Loại đồ uống ", "Giá", "Đợn vị", "Trạng thái"
            }
        ));
        tblSanPHamksd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPHamksdMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSanPHamksd);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1215, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        tabs.addTab("Sản Phẩm không sử dụng", jPanel3);

        jPanel1.add(tabs);
        tabs.setBounds(50, 460, 1220, 300);

        jPanel4.setBackground(new java.awt.Color(225, 193, 144));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Tìm kiếm(Tên hoặc Mã)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(50, 400, 511, 72);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mã sản phẩm");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(450, 120, 100, 17);

        txtMaSP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtMaSP);
        txtMaSP.setBounds(450, 140, 228, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tên sản phẩm");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(450, 210, 120, 17);

        txtTenSP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSPActionPerformed(evt);
            }
        });
        txtTenSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenSPKeyReleased(evt);
            }
        });
        jPanel1.add(txtTenSP);
        txtTenSP.setBounds(450, 230, 228, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Loại đồ uống");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(450, 300, 110, 17);

        cboLoaidouong.setBackground(new java.awt.Color(225, 193, 144));
        cboLoaidouong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(cboLoaidouong);
        cboLoaidouong.setBounds(490, 320, 190, 30);

        jPanel5.setBackground(new java.awt.Color(225, 193, 144));

        lblHinh.setBackground(new java.awt.Color(204, 204, 255));
        lblHinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblHinh.setText("      Click To Donwload Image");
        lblHinh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblHinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHinh, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHinh, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);
        jPanel5.setBounds(120, 90, 210, 290);

        txtGia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtGia);
        txtGia.setBounds(740, 320, 230, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Giá");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(740, 300, 60, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Đơn vị");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(740, 120, 70, 17);

        cboDonvi.setBackground(new java.awt.Color(225, 193, 144));
        cboDonvi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cboDonvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDonviActionPerformed(evt);
            }
        });
        jPanel1.add(cboDonvi);
        cboDonvi.setBounds(790, 140, 180, 30);

        btnStart.setBackground(new java.awt.Color(255, 255, 255));
        btnStart.setText("|<");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        jPanel1.add(btnStart);
        btnStart.setBounds(850, 420, 61, 31);

        btnPrev.setBackground(new java.awt.Color(255, 255, 255));
        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrev);
        btnPrev.setBounds(950, 420, 61, 32);

        btnnext.setBackground(new java.awt.Color(255, 255, 255));
        btnnext.setText(">>");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });
        jPanel1.add(btnnext);
        btnnext.setBounds(1080, 420, 61, 34);

        btnLast.setBackground(new java.awt.Color(255, 255, 255));
        btnLast.setText(">|");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel1.add(btnLast);
        btnLast.setBounds(1170, 420, 61, 34);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Trạng thái");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(740, 210, 100, 17);

        rdoksd.setBackground(new java.awt.Color(225, 193, 144));
        buttonGroup1.add(rdoksd);
        rdoksd.setText("Không sử dụng");
        jPanel1.add(rdoksd);
        rdoksd.setBounds(740, 230, 110, 25);

        rdosd.setBackground(new java.awt.Color(225, 193, 144));
        buttonGroup1.add(rdosd);
        rdosd.setSelected(true);
        rdosd.setText("sử dụng");
        jPanel1.add(rdosd);
        rdosd.setBounds(860, 230, 90, 25);

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorder(null);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem);
        btnThem.setBounds(1100, 140, 101, 34);

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setBorder(null);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa);
        btnXoa.setBounds(1100, 260, 101, 34);

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua);
        btnSua.setBounds(1100, 200, 101, 34);

        tbnLamMoi.setBackground(new java.awt.Color(255, 255, 255));
        tbnLamMoi.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        tbnLamMoi.setText("Làm mới");
        tbnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnLamMoiActionPerformed(evt);
            }
        });
        jPanel1.add(tbnLamMoi);
        tbnLamMoi.setBounds(1100, 320, 101, 34);

        btndonvi.setBackground(new java.awt.Color(225, 193, 144));
        btndonvi.setText("+");
        btndonvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndonviActionPerformed(evt);
            }
        });
        jPanel1.add(btndonvi);
        btndonvi.setBounds(450, 320, 41, 30);

        btnloaidouong.setBackground(new java.awt.Color(225, 193, 144));
        btnloaidouong.setText("+");
        btnloaidouong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloaidouongActionPerformed(evt);
            }
        });
        jPanel1.add(btnloaidouong);
        btnloaidouong.setBounds(740, 140, 50, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ ĐỒ UỐNG");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(470, 10, 380, 44);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1302, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblSanPhansdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhansdMouseClicked

        try {
            row = tblSanPhansd.getSelectedRow();
            edit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblSanPhansdMouseClicked

    private void tblSanPHamksdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPHamksdMouseClicked

        try {
            row = tblSanPHamksd.getSelectedRow();
            editksd();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tblSanPHamksdMouseClicked

    private void tabsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabsMouseClicked

        if (tabs.getSelectedIndex() == 1) {
            txtMaSP.setEditable(false);
            txtTenSP.setEditable(false);
            txtGia.setEditable(false);
            btnThem.setEnabled(false);
            btnXoa.setEnabled(false);
            cboLoaidouong.setEnabled(false);
            cboDonvi.setEnabled(false);

        } else {
            cboLoaidouong.setEnabled(true);
            cboDonvi.setEnabled(true);
            txtMaSP.setEditable(true);
            txtTenSP.setEditable(true);
            txtGia.setEditable(true);
            btnThem.setEnabled(true);

        }
    }//GEN-LAST:event_tabsMouseClicked

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased

        search();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void txtTenSPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenSPKeyReleased

        CheckSPInuput();
    }//GEN-LAST:event_txtTenSPKeyReleased

    private void lblHinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhMouseClicked

        chooseImages();
    }//GEN-LAST:event_lblHinhMouseClicked

    private void cboDonviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDonviActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDonviActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        row = 0;
        if (tabs.getSelectedIndex() == 0) {
            tblSanPhansd.setRowSelectionInterval(row, row);
            edit();
        } else {
            tblSanPHamksd.setRowSelectionInterval(row, row);
            editksd();
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        if (tabs.getSelectedIndex() == 0) {
            if (row > 0) {
                row--;
                tblSanPhansd.setRowSelectionInterval(row, row);
                edit();
            }
        } else {
            if (row > 0) {
                row--;
                tblSanPHamksd.setRowSelectionInterval(row, row);
                editksd();
            }
        }
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        if (tabs.getSelectedIndex() == 0) {
            if (row < tblSanPhansd.getRowCount() - 1) {
                row++;
                tblSanPhansd.setRowSelectionInterval(row, row);
                edit();
            }
        } else {
            if (row < tblSanPHamksd.getRowCount() - 1) {
                row++;
                tblSanPHamksd.setRowSelectionInterval(row, row);
                editksd();
            }
        }
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        if (tabs.getSelectedIndex() == 0) {
            row = tblSanPhansd.getRowCount() - 1;

            tblSanPhansd.setRowSelectionInterval(row, row);
            edit();
        } else {
            row = tblSanPHamksd.getRowCount() - 1;
            tblSanPHamksd.setRowSelectionInterval(row, row);
            editksd();

        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tbnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnLamMoiActionPerformed
        // TODO add your handling code here:
        clearForm();
    }//GEN-LAST:event_tbnLamMoiActionPerformed

    private void btndonviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndonviActionPerformed
        // TODO add your handling code here:
        new QLDoUongJDialog(null, true).setVisible(true);
        fillcomboboxLoaiSP();
    }//GEN-LAST:event_btndonviActionPerformed

    private void btnloaidouongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloaidouongActionPerformed
        // TODO add your handling code here:
        new QLDonViDoUongJDialog(null, true).setVisible(true);
        fillcomboDonVi();
    }//GEN-LAST:event_btnloaidouongActionPerformed

    private void txtTenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSPActionPerformed
    
    
    private void filltotableSP(){
        model.setRowCount(0);
        try {
            List<SanPham> list = DAOSP.selectAll();
            for(SanPham x : list){
                model.addRow(new Object[]{
                    x.getId_sp(),
                    x.getTen_sp(),
                    daolsp.selectNameByID(x.getId_loaiSP()),
                    x.getGia_sp(),
                    daodv.selectNameByID(x.getId_donviSP()),
                    x.isTrangthai() ? "Sử dụng" : "Không sử dụng"
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void filltotableSPKD() {

        modelspkd.setRowCount(0);
        try {
            List<SanPham> list = DAOSP.select_Trangthai();
            for (SanPham x : list) {
                modelspkd.addRow(new Object[]{x.getId_sp(), x.getTen_sp(), daolsp.selectNameByID(x.getId_loaiSP()),
                        x.getGia_sp(), daodv.selectNameByID(x.getId_donviSP()),
                        x.isTrangthai() ? "Sử dụng" : "Không sử dụng"});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void fillcomboboxLoaiSP() {
        DefaultComboBoxModel modelcbo = (DefaultComboBoxModel) cboLoaidouong.getModel();
        modelcbo.removeAllElements();
        listlsp = dao.selectAll();
        for (LoaiSanPham loaiSP : listlsp) {
            modelcbo.addElement(loaiSP);
        }
    }
    
     private void fillcomboDonVi() {
        DefaultComboBoxModel modelDV = (DefaultComboBoxModel) cboDonvi.getModel();
        modelDV.removeAllElements();
        listdv = daodv.selectAll();
        for (DonViSanPham donviDoUong : listdv) {
            modelDV.addElement(donviDoUong.toString());
        }
    }
     
    private void chooseImages() {
        JFileChooser file = new JFileChooser();
        if (file.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File filechoser = file.getSelectedFile();
            Ximages.save(filechoser);
            ImageIcon icon = Ximages.read(filechoser.getName());
            lblHinh.setIcon(icon);
            lblHinh.setToolTipText(filechoser.getName());
            System.out.println(filechoser.getName());
            System.out.println(lblHinh.getToolTipText());
        }
    }
    
    private SanPham getInformation() {
        SanPham sp = new SanPham();
        sp.setId_sp(txtMaSP.getText());
        sp.setTen_sp(txtTenSP.getText());
        sp.setId_loaiSP(daolsp.selectIdByName(cboLoaidouong.getSelectedItem() + ""));
        System.out.println(sp.getId_loaiSP());
        sp.setGia_sp(Integer.parseInt(txtGia.getText()));
        sp.setTrangthai(rdosd.isSelected());
        sp.setId_donviSP(daodv.selectByName(cboDonvi.getSelectedItem() + ""));
        System.out.println(sp.getId_donviSP());
        sp.setHinh(lblHinh.getToolTipText());
        System.out.println(sp.getHinh());
        return sp;
    }
     
    
    private void setForm(SanPham sp) {
        String douong = tblSanPhansd.getValueAt(row, 2).toString();
        for (int i = 0; i < listlsp.size(); i++) {
            if (douong.equals(listlsp.get(i).getTenLoai())) {
                cboLoaidouong.setSelectedIndex(i);
            }
        }
        String donvidouong = tblSanPhansd.getValueAt(row, 4).toString();
        for (int i = 0; i < listdv.size(); i++) {
            if (donvidouong.equals(listdv.get(i).getTenDonvi())) {
                cboDonvi.setSelectedIndex(i);
            }
            txtMaSP.setText(sp.getId_sp());
            txtTenSP.setText(sp.getTen_sp());
//        cboLoaidouong.setSelectedItem(tblSanPhansd.getValueAt(row, 2).toString());
            txtGia.setText(sp.getGia_sp() + "");
            rdoksd.setSelected(!sp.isTrangthai());
            rdosd.setSelected(sp.isTrangthai());
            System.out.println(sp.getHinh());
            try {
                lblHinh.setToolTipText(sp.getHinh());
                lblHinh.setIcon((Ximages.read(sp.getHinh())));
            } catch (Exception e) {
//            lblHinh.setIcon(new ImageIcon("unnamed.png"));
            }
        }
    }
    
    private void clearForm() {
        txtMaSP.setText("");
        txtTenSP.setText("");
        txtGia.setText("");
        lblHinh.setIcon(null);
        row = -1;
        identityMasp2();
        if (tabs.getSelectedIndex() == 0) {
            updateStatus();
        } else {
            updateStatus2();
        }
    }
    
    private void search() {
        if (tabs.getSelectedIndex() == 0) {
            String timkiem = txtTimKiem.getText();
            TableRowSorter<DefaultTableModel> sanpham = new TableRowSorter<>(model);
            tblSanPhansd.setRowSorter(sanpham);
            sanpham.setRowFilter(javax.swing.RowFilter.regexFilter(timkiem));
            tabs.setSelectedIndex(0);
        } else {
            String timkiem = txtTimKiem.getText();
            TableRowSorter<DefaultTableModel> sanpham = new TableRowSorter<>(modelspkd);
            tblSanPHamksd.setRowSorter(sanpham);
            sanpham.setRowFilter(javax.swing.RowFilter.regexFilter(timkiem));
            tabs.setSelectedIndex(1);
        }
    }
    
    private void edit() {
        String masp = tblSanPhansd.getValueAt(row, 0).toString();
        SanPham sp = DAOSP.selectID(masp);
        setForm(sp);
        updateStatus();
    }

    private void editksd() {
        String maspksd = tblSanPHamksd.getValueAt(row, 0).toString();
        SanPham sp = DAOSP.selectID(maspksd);
        setForm(sp);
        updateStatus2();

    }

    private boolean Checknull() {
        if (txtTenSP.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tên sản phẩm!");
            txtTenSP.requestFocus();

            return true;
        }
        List<SanPham> list = DAOSP.selectALLL();
        String id = txtMaSP.getText();
        String tensp = txtTenSP.getText();
        for (int i = 0; i < list.size(); i++) {
            if (id.equalsIgnoreCase(list.get(i).getId_sp())) {
                JOptionPane.showMessageDialog(this, "Trùng khóa chính");
                txtMaSP.requestFocus();
                return true;
            } else if (tensp.equalsIgnoreCase(list.get(i).getTen_sp())) {
                JOptionPane.showMessageDialog(this, "Tên sản phẩm đã tồn tại");
                txtTenSP.requestFocus();
                return true;
            }
        }
        if (txtGia.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập giá sản phẩm!");
            txtGia.requestFocus();
            return true;
        } else if (lblHinh.getIcon() == null) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn hình sản phẩm!");
            return true;
        } else if (txtMaSP.getText().length() < 3) {
            JOptionPane.showMessageDialog(this, "Mã sản phẩm phải trên 2 kí tự");
            return true;
        } else if (txtTenSP.getText().length() < 5) {
            JOptionPane.showMessageDialog(this, "Tên sản phẩm phải trên 5 kí tự");
            return true;
        }
        return false;

    }
    
    private boolean CheckNumber() {
        String regex = "SP\\d+";
        String regexx = "sp\\d+";
        Pattern parten = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        if (!parten.matcher(txtMaSP.getText()).find()) {
            JOptionPane.showMessageDialog(this, "Nhập sai định dạng mã sản phẩm");
            return true;
        } else {
            Pattern p = Pattern.compile("^[0-9]{1,15}$");
            if (!p.matcher(txtGia.getText()).matches()) {
                JOptionPane.showMessageDialog(this, "Nhập sai định dạng giá sản phẩm");
                return true;
            } else if (Integer.parseInt(txtGia.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Giá nhập vào không được âm");
                return true;
            }
            return false;
        }
    }

    private boolean CheckSPInuput() {

        model.setRowCount(0);
        try {
            List<SanPham> list = DAOSP.Select_ByName(txtTenSP.getText());
            for (int i = 0; i < list.size(); i++) {
                model.addRow(new Object[]{list.get(i).getId_sp(), list.get(i).getTen_sp(),
                        daolsp.selectNameByID(list.get(i).getId_loaiSP()),
                        list.get(i).getGia_sp(), daodv.selectNameByID(list.get(i).getId_donviSP()),
                        list.get(i).isTrangthai() ? "Sử dụng" : "Không sử dụng"});
            }
        } catch (Exception e) {
        }
        return false;
    }
// capap nhap trang thai
    
     private void updateStatus() {
        boolean edit = (row >= 0);
        boolean fist = (row == 0);
        boolean last = (row == tblSanPhansd.getRowCount() - 1);
        ////
        txtMaSP.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnXoa.setEnabled(edit);
        btnSua.setEnabled(edit);
        ////
        btnStart.setEnabled(edit && !fist);
        btnPrev.setEnabled(edit && !fist);
        btnnext.setEnabled(!last && edit);
        btnLast.setEnabled(!last && edit);
    }
     Services.SanPhamService service = new SanPhamService();
    private void insert() {
        if (Checknull()) {
            return;
        } else if (CheckNumber()) {
            return;
        } else if (CheckSPInuput()) {
            return;
        } else {
            try {
                if (MsgBox.confirm(this, "Bạn có muốn thêm sản phẩm này ?")) {
                    //SanPham sp = getInformation();
                    service.insert(getInformation());
                    if (tabs.getSelectedIndex() == 0) {
                        filltotableSP();
                        tabs.setSelectedIndex(0);
                    } else {
                        filltotableSPKD();
                        tabs.setSelectedIndex(1);
                    }
                    clearForm();
                    JOptionPane.showMessageDialog(this, "Đã thêm");
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Ops! Lỗi truy vấn dữ liệu rồi!");
            }

        }
    }

    private void update() {
        if (CheckNumber()) {
            return;
        } else {
            try {
                if (MsgBox.confirm(this, "Bạn có muốn sửa sản phẩm ?")) {
                    SanPham sp = getInformation();
                    DAOSP.update(sp);
                    filltotableSP();
                    filltotableSPKD();
                    clearForm();
                    tabs.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(this, "Đã sửa");
                } else ;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Ops! Sửa thất bại");
                e.printStackTrace();
            }

        }
    }

    private void delete() {
        try {
            int chon = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa ?");
            if (row == -1) {
                JOptionPane.showMessageDialog(this, "Dữ liệu chưa được hiển thị để xóa!");
                return;
            }
            if (chon == JOptionPane.YES_OPTION) {
                String manv = txtMaSP.getText();
                DAOSP.delete(manv);
                filltotableSPKD();
                filltotableSP();
                tabs.setSelectedIndex(1);
                clearForm();
                JOptionPane.showMessageDialog(this, "Yeah! Đã xóa");
            }

        } catch (Exception e) {
            e.printStackTrace();
//            JOptionPane.showMessageDialog(this, "xóa không thành công");
        }
    }

    private void identityMasp2() {
        if (DAOSP.selectALLL().isEmpty()) {
            txtMaSP.setText("SP01");
        } else {
            txtMaSP.setText("SP" + (DAOSP.select_Max_id_java() + 1));
        }
    }

    private void updateStatus2() {
        boolean edit = (row >= 0);
        boolean fist = (row == 0);
        boolean last = (row == tblSanPHamksd.getRowCount() - 1);
        ////
        txtMaSP.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnXoa.setEnabled(!edit);
        btnSua.setEnabled(edit);
        ////
        btnStart.setEnabled(edit && !fist);
        btnPrev.setEnabled(edit && !fist);
        btnnext.setEnabled(!last && edit);
        btnLast.setEnabled(!last && edit);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btndonvi;
    private javax.swing.JButton btnloaidouong;
    private javax.swing.JButton btnnext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboDonvi;
    private javax.swing.JComboBox<String> cboLoaidouong;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JRadioButton rdoksd;
    private javax.swing.JRadioButton rdosd;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblSanPHamksd;
    private javax.swing.JTable tblSanPhansd;
    private javax.swing.JButton tbnLamMoi;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
