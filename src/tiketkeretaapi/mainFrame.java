package tiketkeretaapi;

import dashboard.frameDsbKry;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import login.Session;
import login.frameAuth;
import tiketkeretaapi.transaksi.frameDataTrk;

/**
 *
 * @author RZ
 */
public class mainFrame extends javax.swing.JFrame {

	frameDataTrk frameTrk;
	static Session sess = new Session();

	public mainFrame(Session session) {
		initComponents();
		sess = session;
		karyawanName.setText(session.getNamaKaryawan());
		try {
			frameDsbKry dashboard = new frameDsbKry(jDesktopPane, sess);
			jDesktopPane.add(dashboard);
			dashboard.setMaximum(true);
			dashboard.setVisible(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideBar = new javax.swing.JPanel();
        sbTitle = new javax.swing.JLabel();
        sbMenuDashboard = new javax.swing.JPanel();
        icHome = new javax.swing.JLabel();
        sbDashboard = new javax.swing.JButton();
        sbMenuTransaksi = new javax.swing.JPanel();
        icTransaksi = new javax.swing.JLabel();
        sbTransaksi = new javax.swing.JButton();
        sbMenuLogout = new javax.swing.JPanel();
        icLogout = new javax.swing.JLabel();
        sbLogout = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        karyawanName = new javax.swing.JLabel();
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
        sbMenuDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sbMenuDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sbMenuDashboardMouseClicked(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(sbMenuTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sbTransaksi)
                    .addComponent(icTransaksi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sbMenuLogout.setBackground(new java.awt.Color(0, 173, 181));
        sbMenuLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sbMenuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sbMenuLogoutMouseClicked(evt);
            }
        });

        icLogout.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        icLogout.setForeground(new java.awt.Color(238, 238, 238));
        icLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_sign_out_16px.png"))); // NOI18N

        sbLogout.setBackground(new java.awt.Color(238, 238, 238));
        sbLogout.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        sbLogout.setForeground(new java.awt.Color(238, 238, 238));
        sbLogout.setText("Logout");
        sbLogout.setBorder(null);
        sbLogout.setBorderPainted(false);
        sbLogout.setContentAreaFilled(false);

        javax.swing.GroupLayout sbMenuLogoutLayout = new javax.swing.GroupLayout(sbMenuLogout);
        sbMenuLogout.setLayout(sbMenuLogoutLayout);
        sbMenuLogoutLayout.setHorizontalGroup(
            sbMenuLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sbMenuLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icLogout)
                .addGap(18, 18, 18)
                .addComponent(sbLogout)
                .addGap(0, 0, 0))
        );
        sbMenuLogoutLayout.setVerticalGroup(
            sbMenuLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sbMenuLogoutLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(sbMenuLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sbLogout)
                    .addComponent(icLogout))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sideBarLayout = new javax.swing.GroupLayout(sideBar);
        sideBar.setLayout(sideBarLayout);
        sideBarLayout.setHorizontalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sbMenuDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sbTitle)
                .addGap(15, 15, 15))
            .addComponent(sbMenuTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sbMenuLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sideBarLayout.setVerticalGroup(
            sideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sideBarLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(sbTitle)
                .addGap(25, 25, 25)
                .addComponent(sbMenuDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sbMenuTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sbMenuLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(sideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 510));

        header.setBackground(new java.awt.Color(57, 62, 70));

        karyawanName.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        karyawanName.setForeground(new java.awt.Color(255, 255, 255));
        karyawanName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_male_user_16px.png"))); // NOI18N
        karyawanName.setText("John Doe");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap(631, Short.MAX_VALUE)
                .addComponent(karyawanName)
                .addGap(30, 30, 30))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(karyawanName)
                .addGap(25, 25, 25))
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

    private void sbMenuTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbMenuTransaksiMouseClicked
		frameTrk = new frameDataTrk(jDesktopPane, sess);
		try {
			jDesktopPane.add(frameTrk);
			frameTrk.setMaximum(true);
			frameTrk.setVisible(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(adminFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_sbMenuTransaksiMouseClicked

    private void sbMenuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbMenuLogoutMouseClicked
		sess.setKodeKaryawan(null);
		sess.setLevel(null);
		this.dispose();
		new frameAuth().setVisible(true);
    }//GEN-LAST:event_sbMenuLogoutMouseClicked

    private void sbMenuDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sbMenuDashboardMouseClicked
		try {
			frameDsbKry dashboard = new frameDsbKry(jDesktopPane, sess);
			jDesktopPane.add(dashboard);
			dashboard.setMaximum(true);
			dashboard.setVisible(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_sbMenuDashboardMouseClicked

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
			java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		//</editor-fold>
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new mainFrame(sess).setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel header;
    private javax.swing.JLabel icHome;
    private javax.swing.JLabel icLogout;
    private javax.swing.JLabel icTransaksi;
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JLabel karyawanName;
    private javax.swing.JButton sbDashboard;
    private javax.swing.JButton sbLogout;
    private javax.swing.JPanel sbMenuDashboard;
    private javax.swing.JPanel sbMenuLogout;
    private javax.swing.JPanel sbMenuTransaksi;
    private javax.swing.JLabel sbTitle;
    private javax.swing.JButton sbTransaksi;
    private javax.swing.JPanel sideBar;
    // End of variables declaration//GEN-END:variables
}
