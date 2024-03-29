/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.QLSV.Ui;

import com.QLSV.DAO.CauHoiDAO;
import com.QLSV.DAO.DapAnDAO;
import com.QLSV.DAO.DeDAO;
import com.QLSV.Model.CauHoi;
import com.QLSV.Model.DapAn;
import com.QLSV.Model.De;
import com.QLSV.Utility.MsgBox;
import com.QLSV.Utility.Other;
import com.QLSV.Utility.XImage;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Tho
 */
public class TaoDeThiFrame extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyDeFrame
     */
    public TaoDeThiFrame() {
        initComponents();txtNgayMo.setDateFormatString("dd-MM-yyyy");
        txtNgayDong.setDateFormatString("dd-MM-yyyy");
        getContentPane().setBackground(new Color(255,255,255)); 
        Other.setTable(tblBangCauHoi);this.setIconImage(XImage.getAppIcon());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBangCauHoi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaDe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spnThoiGian = new javax.swing.JSpinner();
        spnSoCauHoi = new javax.swing.JSpinner();
        cboKyThi = new javax.swing.JComboBox<>();
        btnNew = new javax.swing.JLabel();
        btnSave = new javax.swing.JLabel();
        txtMaMon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNgayMo = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtNgayDong = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quản Lý Đề");

        tblBangCauHoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Câu hỏi", "Câu trả lời A", "Câu trả lời B", "Câu trả lời C", "Câu trả lời D", "Đáp án 1", "Đáp án 2", "Đáp án 3", "Đáp án 4", "Link đính kèm"
            }
        ));
        jScrollPane1.setViewportView(tblBangCauHoi);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tạo đề thi mới");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Mã đề :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Mã môn :");

        txtMaDe.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaDeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Mật khẩu :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Kỳ thi:");

        txtMatKhau.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Số câu hỏi :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Thời gian :");

        spnThoiGian.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        spnSoCauHoi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        cboKyThi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cboKyThi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Giữa kỳ", "Cuối kỳ" }));

        btnNew.setBackground(new java.awt.Color(241, 242, 246));
        btnNew.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QLSV/Icon/nutTuGiacTB.png"))); // NOI18N
        btnNew.setText("Select File");
        btnNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNewMouseExited(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QLSV/Icon/nutTuGiacTB.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
        });

        txtMaMon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Ngày mở:");

        txtNgayMo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Ngày đóng :");

        txtNgayDong.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/QLSV/Icon/return_30px.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtMaMon)
                                            .addGap(114, 114, 114))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addGap(40, 40, 40)
                                                    .addComponent(txtMaDe, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(33, 33, 33)
                                                    .addComponent(jLabel5)
                                                    .addGap(34, 34, 34)
                                                    .addComponent(cboKyThi, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtNgayMo, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(30, 30, 30)
                                                    .addComponent(jLabel9)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtNgayDong, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(spnSoCauHoi, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(50, 50, 50)
                                            .addComponent(spnThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(95, 95, 95)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtMaDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboKyThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(spnThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSave))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNew, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(spnSoCauHoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtNgayMo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtNgayDong, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaDeActionPerformed
    int maDe = 2;
    int maMon = 4;
    int kyThi = 6;
    int thoiGian = 8;
    int soCauHoi = 10;
    int pass = 12;
    int maGiangVien = 14;
    int ngayMo=16;
    int ngayDong =18;
    List<CauHoi> listCH;
    List<DapAn> listDA;

    public void readExel(File f) {
        int i = 0;
        DefaultTableModel model = (DefaultTableModel) tblBangCauHoi.getModel();
        model.setRowCount(0);
        try {
            FileInputStream file = new FileInputStream(f);
            Workbook workbook = new XSSFWorkbook(file);
            DataFormatter dataFormatter = new DataFormatter();
            Iterator<Sheet> sheets = workbook.sheetIterator();
            while (sheets.hasNext()) {
                Sheet sh = sheets.next();
                System.out.println("Sheet name is " + sh.getSheetName());
                System.out.println("---------");
                Iterator<Row> iterator = sh.iterator();

                while (iterator.hasNext()) {
                    CauHoi ch = new CauHoi();
                    String stt = "";
                    String noiDung = "";
                    String dapAn1 = "";
                    String dapAn2 = "";
                    String dapAn3 = "";
                    String dapAn4 = "";
                    String cauTraLoi1 = "";
                    String cauTraLoi2 = "";
                    String cauTraLoi3 = "";
                    String cauTraLoi4 = "";
                    String linhDinhKem = "";
                    Row row = iterator.next();
                    Iterator<Cell> cellIterator = row.iterator();
                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();
                        i++;
                        String cellValue = dataFormatter.formatCellValue(cell);
                        if (i == maDe) {
                            txtMaDe.setText(cellValue);
                        } else if (i == maMon) {
                            txtMaMon.setText(cellValue);
                        } else if (i == kyThi) {
                            cboKyThi.setSelectedItem(cellValue);
                        } else if (i == thoiGian) {
                            spnThoiGian.setValue(Integer.valueOf(cellValue));
                        } else if (i == soCauHoi) {
                            spnSoCauHoi.setValue(Integer.valueOf(cellValue));
                        } else if (i == pass) {
                            txtMatKhau.setText(cellValue);
                        }else if(i==ngayMo){
                            String day =cellValue.substring(0, cellValue.indexOf("/")); 
                            String month =cellValue.substring(cellValue.indexOf("/")+1, cellValue.lastIndexOf("/"));
                            String year =cellValue.substring(cellValue.lastIndexOf("/")+1,cellValue.length());
                            txtNgayMo.setDate(new Date(Integer.valueOf(year)-1900, Integer.valueOf(month)-1, Integer.valueOf(day)));
                        } else if(i==ngayDong){
                            String day =cellValue.substring(0, cellValue.indexOf("/")); 
                            String month =cellValue.substring(cellValue.indexOf("/")+1, cellValue.lastIndexOf("/"));
                            String year =cellValue.substring(cellValue.lastIndexOf("/")+1,cellValue.length());System.out.println(day +"."+month+"."+year);
                            txtNgayDong.setDate(new Date(Integer.valueOf(year)-1900, Integer.valueOf(month)-1, Integer.valueOf(day)));
                        }   else if (i >= 29) {
                            if (cell.getColumnIndex() == 0) {
                                stt = cellValue;
                            } else if (cell.getColumnIndex() == 1) {
                                noiDung = cellValue;
                            } else if (cell.getColumnIndex() == 2) {
                                dapAn1 = cellValue;
                            } else if (cell.getColumnIndex() == 3) {
                                dapAn2 = cellValue;
                            } else if (cell.getColumnIndex() == 4) {
                                dapAn3 = cellValue;
                            } else if (cell.getColumnIndex() == 5) {
                                dapAn4 = cellValue;
                            } else if (cell.getColumnIndex() == 6) {
                                cauTraLoi1 = cellValue;
                            } else if (cell.getColumnIndex() == 7) {
                                cauTraLoi2 = cellValue;
                            } else if (cell.getColumnIndex() == 8) {
                                cauTraLoi3 = cellValue;
                            } else if (cell.getColumnIndex() == 9) {
                                cauTraLoi4 = cellValue;
                            } else if (cell.getColumnIndex() == 10) {
                                linhDinhKem = cellValue;
                            }
                        }
                    }
                    if (i > 29) {
                        model.addRow(new Object[]{stt, noiDung, dapAn1, dapAn2, dapAn3, dapAn4, cauTraLoi1, cauTraLoi2, cauTraLoi3, cauTraLoi4, linhDinhKem});
                    }
                    System.out.println();
                }
            }
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private void btnNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseClicked
        JFileChooser chooser =new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("SLSX Worksheet", "xlsx");
            chooser.setFileFilter(filter);
            chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if(chooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION){
            File file = chooser.getSelectedFile();
            readExel(file);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewMouseClicked
    DeDAO ddao =new DeDAO();
    CauHoiDAO chdao= new CauHoiDAO()    ;
    DapAnDAO dadao=new DapAnDAO();
    private void btnNewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseEntered
    }//GEN-LAST:event_btnNewMouseEntered
    void cauHoiDapAn(){
        int rowCount  =tblBangCauHoi.getRowCount();
        String maDeString =txtMaDe.getText();
        for(int i=0; i<rowCount;i++){
            CauHoi ch= new CauHoi();
            ch.setMaCauHoi(maDeString+"-"+tblBangCauHoi.getValueAt(i, 0).toString()); 
            ch.setNoiDung(tblBangCauHoi.getValueAt(i, 1).toString()); 
            ch.setMaDe(maDeString);
            ch.setLinkDinhKem(tblBangCauHoi.getValueAt(i, 10).toString()); 
            chdao.insert(ch);
            for(int j=0;j<4;j++){
                DapAn da=new DapAn();
                boolean checkDA=false;
                String tongDA="";
                for(int l=0;l<4;l++){
                    tongDA+=tblBangCauHoi.getValueAt(i, 6+l);
                }
                if(j==0){
                    if(tongDA.contains("A")){
                        checkDA=true;
                    }
                }else if(j==1){
                    if(tongDA.contains("B")){
                        checkDA=true;
                    }
                }else if(j==2){
                    if(tongDA.contains("C")){
                        checkDA=true;
                    }
                }else if(j==3){
                    if(tongDA.contains("D")){
                        checkDA=true;
                    }
                }
                da.setMaCauHoi(ch.getMaCauHoi());
                da.setNoiDung(tblBangCauHoi.getValueAt(i, 2+j).toString());
                da.setDapAn(checkDA);
                dadao.insert(da); 
            }
        }
        
        
    }
    private void btnNewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseExited
    }//GEN-LAST:event_btnNewMouseExited
    De getDe(){
        De d =new De();
        d.setMaDe(txtMaDe.getText());
        d.setKyThi(cboKyThi.getSelectedItem().toString());
        d.setMaGiangVien("GV01");
        d.setThoigian((int) spnThoiGian.getValue());
        d.setSoCauHoi((int) spnSoCauHoi.getValue());
        d.setPassword(txtMatKhau.getText());
        d.setMaMon(txtMaMon.getText()); 
        d.setNgayMo(txtNgayMo.getDate());
        d.setNgayDong(txtNgayDong.getDate()); 
        return d;
    }
    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        try {
            ddao.insert(getDe());
            cauHoiDapAn(); 
            MsgBox.alert(this, "Thêm mới thành công");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Thêm mới thất bại");
        }
            
     
               // TODO add your handling code here:
       
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
    }//GEN-LAST:event_btnSaveMouseExited

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        LenDanhSachThiFrame ld;
        try {
            ld = new LenDanhSachThiFrame();ld.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TaoDeThiFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(TaoDeThiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaoDeThiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaoDeThiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaoDeThiFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaoDeThiFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnNew;
    private javax.swing.JLabel btnSave;
    private javax.swing.JComboBox<String> cboKyThi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnSoCauHoi;
    private javax.swing.JSpinner spnThoiGian;
    private javax.swing.JTable tblBangCauHoi;
    private javax.swing.JTextField txtMaDe;
    private javax.swing.JTextField txtMaMon;
    private javax.swing.JTextField txtMatKhau;
    private com.toedter.calendar.JDateChooser txtNgayDong;
    private com.toedter.calendar.JDateChooser txtNgayMo;
    // End of variables declaration//GEN-END:variables
}
