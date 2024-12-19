/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginpage;

import java.awt.Color;
import java.awt.Menu;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.HoaDon;

/**
 *
 * @author huong
 */
public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        DefaultColor = new Color(54, 33, 89);
        clickedColor = new Color(204, 204, 255);

        //QLSV.setBackground(DefaultColor);
        //phong.setBackground(DefaultColor);
        //HoaDon.setBackground(DefaultColor);
        //home.setBackground(DefaultColor);
    }

    Color DefaultColor, clickedColor;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        QLSV = new javax.swing.JLabel();
        HoaDon = new javax.swing.JLabel();
        phong = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logonho.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ĐẠI HỌC CÔNG NGHIỆP HÀ NỘI");

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));
        jPanel2.setPreferredSize(new java.awt.Dimension(199, 45));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(54, 33, 89));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        QLSV.setBackground(new java.awt.Color(255, 255, 255));
        QLSV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        QLSV.setForeground(new java.awt.Color(255, 255, 255));
        QLSV.setText("   QUẢN LÍ SINH VIÊN");
        QLSV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        QLSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QLSVMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                QLSVMousePressed(evt);
            }
        });
        jPanel3.add(QLSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 45));

        HoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HoaDon.setForeground(new java.awt.Color(255, 255, 255));
        HoaDon.setText("   HÓA ĐƠN");
        HoaDon.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        HoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoaDonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HoaDonMousePressed(evt);
            }
        });
        jPanel3.add(HoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 45));

        phong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        phong.setForeground(new java.awt.Color(255, 255, 255));
        phong.setText("   PHÒNG");
        phong.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        phong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phongMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                phongMousePressed(evt);
            }
        });
        jPanel3.add(phong, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 210, 45));

        home.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("QUẢN LÍ TÀI KHOẢN");
        home.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeMousePressed(evt);
            }
        });
        jPanel3.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 210, 45));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 430));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(714, 714, 714))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 700));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Welcome to HAUI");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 240, 60));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ảnh nền.jpg"))); // NOI18N
        jLabel3.setText("ưe");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, -70, 990, 760));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 520, 540));

        setSize(new java.awt.Dimension(734, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        //this.setVisible(false);

    }//GEN-LAST:event_jPanel2MousePressed

    private void phongMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phongMousePressed
        // TODO add your handling code here:
//         QLSV.setBackground(DefaultColor);
//         phong.setBackground(clickedColor);
//         HoaDon.setBackground(DefaultColor);
//         home.setBackground(DefaultColor);

        //MenuName.set
    }//GEN-LAST:event_phongMousePressed

    private void QLSVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QLSVMousePressed
        // TODO add your handling code here:
        //QLSV.setBackground(clickedColor);
        //phong.setBackground(DefaultColor);
        //HoaDon.setBackground(DefaultColor);
        //home.setBackground(DefaultColor);

        this.setVisible(false);
        QLSV qlsv = new QLSV();
        qlsv.setVisible(true);
    }//GEN-LAST:event_QLSVMousePressed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MousePressed

    private void HoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoaDonMousePressed
        // TODO add your handling code here:
        QLSV.setBackground(DefaultColor);
        phong.setBackground(DefaultColor);
        HoaDon.setBackground(clickedColor);
        home.setBackground(DefaultColor);

    }//GEN-LAST:event_HoaDonMousePressed

    private void QLSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QLSVMouseClicked
        // TODO add your handling code here:
        QLSV qlsvp = new QLSV();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(qlsvp).setVisible(true);

        //QLSV qlsv = new QLSV();
        //this.setVisible(false);
        //qlsv.setVisible(true);
    }//GEN-LAST:event_QLSVMouseClicked

    private void homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMousePressed
        // TODO add your handling code here:
//        QLSV.setBackground(DefaultColor);
//        phong.setBackground(DefaultColor);
//        HoaDon.setBackground(DefaultColor);
//        home.setBackground(clickedColor);
        jDesktopPane1.setVisible(true);
        QLSV qlsvp = new QLSV();
        jDesktopPane1.add(qlsvp).setVisible(false);
    }//GEN-LAST:event_homeMousePressed

    private void HoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoaDonMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        HoaDonPage h = new HoaDonPage();
        h.setVisible(true);
    }//GEN-LAST:event_HoaDonMouseClicked

    private void phongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phongMouseClicked
        this.setVisible(false);
//        KTXPage ktx = null;
//        try {
//            ktx = new KTXPage();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        ktx.setVisible(true);
        NewPhongKTXPage p = new NewPhongKTXPage();
        p.setVisible(true);
    }//GEN-LAST:event_phongMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        QLTK tk = new QLTK();
        tk.setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HoaDon;
    private javax.swing.JLabel QLSV;
    private javax.swing.JLabel home;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel phong;
    // End of variables declaration//GEN-END:variables
}
