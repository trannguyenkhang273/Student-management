/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QLSV.Ui;

import com.QLSV.DAO.DiemDAO;
import com.QLSV.DAO.KyDAO;
import com.QLSV.DAO.LopDAO;
import com.QLSV.DAO.LopSinhVienDAO;
import com.QLSV.DAO.NganhDAO;
import com.QLSV.Model.Ky;
import com.QLSV.Model.Lop;
import com.QLSV.Model.Nganh;
import com.QLSV.Utility.JdbcHelper;
import com.QLSV.Utility.Other;
import java.awt.Color;
import static java.awt.Color.white;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tho
 */
public class TangKyPanel extends javax.swing.JPanel {

    /**
     * Creates new form TangKyPanel
     */
    public TangKyPanel() {
        initComponents();
        Other.setTable(tblLop);
        fillComboBox();
        fillComboBoxKy();
        load();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMaLop = new javax.swing.JTextField();
        cbbMaNghanh = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLop = new javax.swing.JTable();
        cboKy = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDown = new javax.swing.JLabel();
        btnUp = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        txtMaLop.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        cbbMaNghanh.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbbMaNghanh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tblLop.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblLop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã lớp", "Mã Ngành", "Mã Kỳ", "Trạng Thái"
            }
        ));
        tblLop.setGridColor(new java.awt.Color(255, 255, 255));
        tblLop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLopMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLop);

        cboKy.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cboKy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Mã lớp :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Kỳ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Mã nghành :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 31, 151));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tăng Kỳ");

        btnDown.setBackground(new java.awt.Color(241, 242, 246));
        btnDown.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDown.setForeground(new java.awt.Color(255, 255, 255));
        btnDown.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QLSV/Icon/nutTuGiacTB.png"))); // NOI18N
        btnDown.setText("Down");
        btnDown.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDown.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDownMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDownMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDownMouseExited(evt);
            }
        });

        btnUp.setBackground(new java.awt.Color(241, 242, 246));
        btnUp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUp.setForeground(new java.awt.Color(255, 255, 255));
        btnUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QLSV/Icon/nutTuGiacTB.png"))); // NOI18N
        btnUp.setText("Up");
        btnUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbbMaNghanh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cboKy, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbMaNghanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboKy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUp, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDown, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblLopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLopMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            this.index = tblLop.rowAtPoint(evt.getPoint());//lấy vị trí dòng được chọn
            if (this.index >= 0) {
                this.edit();
            }
        }
    }//GEN-LAST:event_tblLopMouseClicked

    private void btnDownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDownMouseClicked
        // TODO add your handling code here:
        giamky();
    }//GEN-LAST:event_btnDownMouseClicked

    private void btnDownMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDownMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDownMouseEntered

    private void btnDownMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDownMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDownMouseExited

    private void btnUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpMouseClicked
        // TODO add your handling code here:
        check();
    }//GEN-LAST:event_btnUpMouseClicked

    private void btnUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpMouseEntered

    private void btnUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDown;
    private javax.swing.JLabel btnUp;
    private javax.swing.JComboBox<String> cbbMaNghanh;
    private javax.swing.JComboBox<String> cboKy;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLop;
    private javax.swing.JTextField txtMaLop;
    // End of variables declaration//GEN-END:variables
    int index =0 ;
    LopDAO  ldao = new LopDAO();
    NganhDAO ngdao = new NganhDAO();
    KyDAO kdao = new KyDAO();
    LopSinhVienDAO lsvdao = new LopSinhVienDAO();
    DiemDAO ddao= new DiemDAO();
    void edit() {
        try {
            String manh = (String) tblLop.getValueAt(this.index, 0);
            Lop model = ldao.selectByID(manh);  
            if (model != null) {
                this.setModel(model);  
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    public void setColor(JLabel p) {
        p.setForeground(new Color(255, 250, 101));
    }

    public void resetColor(JLabel p1) {
        p1.setForeground(new Color(255, 255, 255));
    }
    void setModel(Lop model) {
        txtMaLop.setText(model.getMaLop());
        cbbMaNghanh.setSelectedItem(model.getMaNganh());
        cboKy.setSelectedItem(model.getMaky());

    }

    Lop getModel() {
        Lop model = new Lop();
        model.setMaLop(txtMaLop.getText());
        Object a = (Object) cbbMaNghanh.getSelectedItem();
        String b = String.valueOf(a);
        model.setMaNganh(b);
        
        Object c = (Object) cboKy.getSelectedItem();
        Integer d = Integer.parseInt(c.toString());
        model.setMaky(d);
                System.out.println(model.getMaLop());
        System.out.println(model.getMaky());
        System.out.println(model.getMaNganh());
        return model;
        
    }
    public void setTrang() {
        txtMaLop.setBackground(white);
        txtMaLop.setText("");
    }
    void insert() {
        Lop model = getModel();
        try {
            ldao.insert(model);   
            this.load();                  
            JOptionPane.showMessageDialog(this, "Thêm msới thành công!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Thêm mới thất bại!");
        }
    }
    void update() {
        Lop model = getModel();
        try {
            ldao.update(model);   
            this.load();         
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cập nhật thất bại!");
            e.printStackTrace();
        }
    }
    void tangky(){
    Lop model = getModel();
        try {
            ldao.tangky(model);   
            this.load();         
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cập nhật thất bại!");
            e.printStackTrace();
        }
    }
    void giamky(){
    Lop model = getModel();
        try {
            ldao.giamky(model);   
            this.load();         
            JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cập nhật thất bại!");
            e.printStackTrace();
        }
    }
    void delete() {
            String masv = txtMaLop.getText();
            try {
                ldao.delete(masv);
                this.load();
                JOptionPane.showMessageDialog(this, "Xóa thành công!");
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(this, "Xóa thất bại!");
            }
    }
    void outlop() {
            String maLop = txtMaLop.getText();
            try {
                lsvdao.delete(maLop);
                this.load();
                JOptionPane.showMessageDialog(this, "SV out thành công!");
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(this, "SV out  thất bại!");
            }
    }
    void doitrangthai(){
        String maLop = txtMaLop.getText();
            try {
                lsvdao.doitrangthai(maLop);
                this.load();
                JOptionPane.showMessageDialog(this, "Đổi trạng thái thành công!");
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(this, "Đổi trạng thái thất bại");
            }
    }
    void check(){
        for(int i = 0; i < tblLop.getRowCount();i++){
            if(tblLop.getValueAt(i, 3).toString().equals("Chưa Hoàn Thành")){
                JOptionPane.showMessageDialog(this, "Có Lớp Chưa Hoàn Thành");
                return;
            }
        }
        for(int i=0; i <tblLop.getRowCount();i++){

                ldao.tangky(new Lop(tblLop.getValueAt(i,0).toString(),tblLop.getValueAt(i,1).toString(),Integer.parseInt(tblLop.getValueAt(i,2).toString())));
                lsvdao.delete(tblLop.getValueAt(i, 0).toString());
                lsvdao.doitrangthai(tblLop.getValueAt(i, 0).toString());
        }
        JOptionPane.showMessageDialog(this, "Tăng Kỳ Thành Công");
        load();
    }
    void fillComboBox() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbbMaNghanh.getModel(); 
        model.removeAllElements();   
        try {
            List<Nganh> list = ngdao.selectAll();
            for (Nganh cd : list) {
                model.addElement(cd.getMaNganh());
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    void fillComboBoxKy() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboKy.getModel(); 
        model.removeAllElements();   
        try {
            List<Ky> list = kdao.selectAll();
            for (Ky cd : list) {
                model.addElement(cd.getMaKy());
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }
    void load() {
        DefaultTableModel model = (DefaultTableModel) tblLop.getModel();
        model.setRowCount(0);   //đưa số dòng về 0 (xóa bảng)
        try {
            List<Lop> list = ldao.selectAll();
            for (Lop sv : list) {
                int a = (int) JdbcHelper.value("exec checkTrangThai ?", sv.getMaLop());
                Object[] row = {
                    sv.getMaLop(),
                    sv.getMaNganh(),
                    sv.getMaky(),
                    a==1 ? "Chưa Hoàn Thành":"Hoàn Thành"
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
        }
    }
}
