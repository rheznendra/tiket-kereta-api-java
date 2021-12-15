package tiketkeretaapi;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import login.Session;
import tiketkeretaapi.jadwal.frameDataJdw;
import tiketkeretaapi.karyawan.frameDataKry;
import tiketkeretaapi.kereta.frameDataKrt;
import tiketkeretaapi.transaksi.frameDataTrk;

/**
 *
 * @author RZ
 */
public class adminFrame extends javax.swing.JFrame {

	frameDataKry frameKaryawan;
	frameDataKrt frameKereta;
	frameDataJdw frameJadwal;
	frameDataTrk frameTrk;
	static Session sess = new Session();

	public adminFrame(Session session) {
		initComponents();
		sess = session;
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideBar = new javax.swing.JPanel();
        sbTitle = new javax.swing.JLabel();
        sbMenuDashboard = new javax.swing.JPanel();
        icHome = new javax.swing.JLabel();
        sbDashboard = new javax.swing.JButton();
        sbMenuKaryawan = new javax.swing.JPanel();
        icKaryawan = new javax.swing.JLabel();
        sbKaryawan = new javax.swing.JButton();
        sbMenuKereta = new javax.swing.JPanel();
        icKereta = new javax.swing.JLabel();
        sbKereta = new javax.swing.JButton();
        sbMenuJadwal = new javax.swing.JPanel();
        icJadwal = new javax.swing.JLabel();
        sbJadwal = new javax.swing.JButton();
        sbMenuTransaksi = new javax.swing.JPanel();
        icTransaksi = new javax.swing.JLabel();
        sbTransaksi = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        jDesktopPane = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideBar.setBackground(new java.awt.Color(34, 40, 49));

        sbTitle.setFont(new java.awt.Font("Montserrat", 1, 16)); // NOI18N
        sbTitle.setForeground(new java.awt.Color(238, 238, 238));
        sbTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_train_16px.png"))); // NOI18N
        sbTitle.setText("Tiket Kereta Api");

        sbMenuDashboard.setBackground(new java.awt.Color(0, 173, 181));
        sbMenuDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        icHome.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        icHome.setForeground(new java.awt.Color(238, 238, 238));
        icHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_home_16px_2.png"))); // NOI18N
        icHome.setLabelFor(icHome);
        icHome.setToolTipText("");

        sbDashboard.setBackground(new java.awt.Color(238, 238, 238));
        sbDashboard.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sbDashboard.setForeground(new java.awt.Color(238, 238, 238));
        sbDashboard.setText("Dashboard");
        sbDashboard.setBorder(null);
        sbDashboard.setBorderPainted(false);
        sbDashboard.setContentAreaFilled(false);

        javax.swing.GroupLayout sbMenuDashboardLayout = new javax.swing.GroupLayout(sbMenuDashboard);
        sbMenuDashboard.setLayout(sbMenuDashboardLayout);
        sbMenuDashboardLayout.setHorizontalGroup(
            sbMenuDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sbMenuDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icHome)
                .addGap(18, 18, 18)
                .addComponent(sbDashboard)
                .addGap(0, 0, 0))
        );
        sbMenuDashboardLayout.setVerticalGroup(
            sbMenuDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sbMenuDashboardLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(sbMenuDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(icHome)
                    .addComponent(sbDashboard))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sbMenuKaryawan.setBackground(new java.awt.Color(0, 173, 181));
        sbMenuKaryawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sbMenuKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sbMenuKaryawanMouseClicked(evt);
            }
        });

        icKaryawan.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        icKaryawan.setForeground(new java.awt.Color(238, 238, 238));
        icKaryawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_user_account_16px_1.png"))); // NOI18N

        sbKaryawan.setBackground(new java.awt.Color(238, 238, 238));
        sbKaryawan.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sbKaryawan.setForeground(new java.awt.Color(238, 238, 238));
        sbKaryawan.setText("Karyawan");
        sbKaryawan.setBorder(null);
        sbKaryawan.setBorderPainted(false);
        sbKaryawan.setContentAreaFilled(false);

        javax.swing.GroupLayout sbMenuKaryawanLayout = new javax.swing.GroupLayout(sbMenuKaryawan);
        sbMenuKaryawan.setLayout(sbMenuKaryawanLayout);
        sbMenuKaryawanLayout.setHorizontalGroup(
            sbMenuKaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sbMenuKaryawanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icKaryawan)
                .addGap(18, 18, 18)
                .addComponent(sbKaryawan)
                .addGap(0, 0, 0))
        );
        sbMenuKaryawanLayout.setVerticalGroup(
            sbMenuKaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sbMenuKaryawanLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(sbMenuKaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sbKaryawan)
                    .addComponent(icKaryawan))
                .addGap(8, 8, 8))
        );

        sbMenuKereta.setBackground(new java.awt.Color(0, 173, 181));
        sbMenuKereta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sbMenuKereta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sbMenuKeretaMouseClicked(evt);
            }
        });

        icKereta.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        icKereta.setForeground(new java.awt.Color(238, 238, 238));
        icKereta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_train_16px.png"))); // NOI18N

        sbKereta.setBackground(new java.awt.Color(238, 238, 238));
        sbKereta.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sbKereta.setForeground(new java.awt.Color(238, 238, 238));
        sbKereta.setText("Kereta");
        sbKereta.setBorder(null);
        sbKereta.setBorderPainted(false);
        sbKereta.setContentAreaFilled(false);

        javax.swing.GroupLayout sbMenuKeretaLayout = new javax.swing.GroupLayout(sbMenuKereta);
        sbMenuKereta.setLayout(sbMenuKeretaLayout);
        sbMenuKeretaLayout.setHorizontalGroup(
            sbMenuKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sbMenuKeretaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icKereta)
                .addGap(18, 18, 18)
                .addComponent(sbKereta)
                .addGap(0, 0, 0))
        );
        sbMenuKeretaLayout.setVerticalGroup(
            sbMenuKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sbMenuKeretaLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(sbMenuKeretaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sbKereta)
                    .addComponent(icKereta))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        sbMenuJadwal.setBackground(new java.awt.Color(0, 173, 181));
        sbMenuJadwal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sbMenuJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sbMenuJadwalMouseClicked(evt);
            }
        });

        icJadwal.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        icJadwal.setForeground(new java.awt.Color(238, 238, 238));
        icJadwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_schedule_16px_1.png"))); // NOI18N

        sbJadwal.setBackground(new java.awt.Color(238, 238, 238));
        sbJadwal.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sbJadwal.setForeground(new java.awt.Color(238, 238, 238));
        sbJadwal.setText("Jadwal");
        sbJadwal.setBorder(null);
        sbJadwal.setBorderPainted(false);
        sbJadwal.setContentAreaFilled(false);

        javax.swing.GroupLayout sbMenuJadwalLayout = new javax.swing.GroupLayout(sbMenuJadwal);
        sbMenuJadwal.setLayout(sbMenuJadwalLayout);
        sbMenuJadwalLayout.setHorizontalGroup(
            sbMenuJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sbMenuJadwalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icJadwal)
                .addGap(18, 18, 18)
                .addComponent(sbJadwal)
                .addGap(0, 0, 0))
        );
        sbMenuJadwalLayout.setVerticalGroup(
            sbMenuJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sbMenuJadwalLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(sbMenuJadwalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sbJadwal)
                    .addComponent(icJadwal))
                .addGap(8, 8, 8))
        );

        sbMenuTransaksi.setBackground(new java.awt.Color(0, 173, 181));
        sbMenuTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sbMenuTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sbMenuTransaksiMouseClicked(evt);
            }
        });

        icTransaksi.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        icTransaksi.setForeground(new java.awt.Color(238, 238, 238));
        icTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_cash_register_16px.png"))); // NOI18N

        sbTransaksi.setBackground(new java.awt.Color(238, 238, 238));
        sbTransaksi.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sbTransaksi.setForeground(new java.awt.Color(238, 238, 238));
        sbTransaksi.setText("Transaksi");
        sbTransaksi.setBorder(null);
        sbTransaksi.setBorderPainted(false);
        sbTransaksi.setContentAreaFilled(false);
        sbTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbTransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sbMenuTransaksiLayout = new javax.swing.GroupLayout(sbMenuTransaksi);
        sbMenuTransaksi.setLayout(sbMenuTransaksiLayout);
        sbMenuTransaksiLayout.setHorizontalGroup(
            sbMenuTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sbMenuTransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icTransaksi)
                .addGap(18, 18, 18)
                .addComponent(sbTransaksi)
                .addGap(0, 0, 0))
        );
        sbMenuTransaksiLayout.setVerticalGroup(
            sbMenuTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sbMenuTransaksiLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(sbMenuTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sbTransaksi)
                    .addComponent(icTransaksi))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sbMenuKaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sbMenuDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideBarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(sbTitle)
                .addGap(15, 15, 15))
            .addComponent(sbMenuKereta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sbMenuJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sbMenuTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(sbTitle)
                .addGap(25, 25, 25)
                .addComponent(sbMenuDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sbMenuKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sbMenuKereta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sbMenuJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sbMenuTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 510));

        header.setBackground(new java.awt.Color(57, 62, 70));

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 740, 80));

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 740, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sbMenuKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbMenuKaryawanMouseClicked
		frameKaryawan = new frameDataKry(jDesktopPane);
		jDesktopPane.removeAll();
		jDesktopPane.updateUI();
		try {
			jDesktopPane.add(frameKaryawan);
			frameKaryawan.setMaximum(true);
			frameKaryawan.setVisible(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(adminFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_sbMenuKaryawanMouseClicked

    private void sbMenuKeretaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbMenuKeretaMouseClicked
		frameKereta = new frameDataKrt(jDesktopPane);
		jDesktopPane.removeAll();
		jDesktopPane.updateUI();
		try {
			jDesktopPane.add(frameKereta);
			frameKereta.setMaximum(true);
			frameKereta.setVisible(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(adminFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_sbMenuKeretaMouseClicked

    private void sbMenuJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbMenuJadwalMouseClicked
		frameJadwal = new frameDataJdw(jDesktopPane);
		jDesktopPane.removeAll();
		jDesktopPane.updateUI();
		try {
			jDesktopPane.add(frameJadwal);
			frameJadwal.setMaximum(true);
			frameJadwal.setVisible(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(adminFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_sbMenuJadwalMouseClicked

    private void sbMenuTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbMenuTransaksiMouseClicked
		frameTrk = new frameDataTrk(jDesktopPane, sess);
		jDesktopPane.removeAll();
		jDesktopPane.updateUI();
		try {
			jDesktopPane.add(frameTrk);
			frameTrk.setMaximum(true);
			frameTrk.setVisible(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(adminFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_sbMenuTransaksiMouseClicked

    private void sbTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbTransaksiActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_sbTransaksiActionPerformed

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
			java.util.logging.Logger.getLogger(adminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(adminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(adminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(adminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new adminFrame(sess).setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel header;
    private javax.swing.JLabel icHome;
    private javax.swing.JLabel icJadwal;
    private javax.swing.JLabel icKaryawan;
    private javax.swing.JLabel icKereta;
    private javax.swing.JLabel icTransaksi;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JButton sbDashboard;
    private javax.swing.JButton sbJadwal;
    private javax.swing.JButton sbKaryawan;
    private javax.swing.JButton sbKereta;
    private javax.swing.JPanel sbMenuDashboard;
    private javax.swing.JPanel sbMenuJadwal;
    private javax.swing.JPanel sbMenuKaryawan;
    private javax.swing.JPanel sbMenuKereta;
    private javax.swing.JPanel sbMenuTransaksi;
    private javax.swing.JLabel sbTitle;
    private javax.swing.JButton sbTransaksi;
    private javax.swing.JPanel sideBar;
    // End of variables declaration//GEN-END:variables
}
