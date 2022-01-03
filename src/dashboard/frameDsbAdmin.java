package dashboard;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.border.EmptyBorder;
import login.Session;
import tiketkeretaapi.Koneksi;

/**
 *
 * @author RZ
 */
public class frameDsbAdmin extends javax.swing.JInternalFrame {

	JDesktopPane mainPanel;
	Koneksi koneksi = new Koneksi();
	Session sess;
	PreparedStatement cs;
	ResultSet rs;

	public frameDsbAdmin(JDesktopPane panel, Session session) {
		initComponents();
		mainPanel = panel;
		sess = session;
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
		setBorder(new EmptyBorder(0, 0, 0, 0));
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelContainer = new javax.swing.JPanel();
        monthlyTrk = new javax.swing.JLabel();
        countMonthlyTrk = new javax.swing.JLabel();
        monthlyIc = new javax.swing.JLabel();
        panelContainer1 = new javax.swing.JPanel();
        totalTrk = new javax.swing.JLabel();
        countTotalTrk = new javax.swing.JLabel();
        totalIc = new javax.swing.JLabel();
        panelContainer2 = new javax.swing.JPanel();
        totalKry = new javax.swing.JLabel();
        countTotalKry = new javax.swing.JLabel();
        kryIc = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(732, 402));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.setMaximumSize(jPanel1.getPreferredSize());

        panelContainer.setBackground(new java.awt.Color(57, 62, 70));
        panelContainer.setForeground(new java.awt.Color(57, 62, 70));
        panelContainer.setPreferredSize(new java.awt.Dimension(300, 85));

        monthlyTrk.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        monthlyTrk.setForeground(new java.awt.Color(238, 238, 238));
        monthlyTrk.setText("TRANSAKSI BULAN INI");

        countMonthlyTrk.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        countMonthlyTrk.setForeground(new java.awt.Color(238, 238, 238));
        countMonthlyTrk.setText("4");

        monthlyIc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_calendar_31_52px.png"))); // NOI18N

        javax.swing.GroupLayout panelContainerLayout = new javax.swing.GroupLayout(panelContainer);
        panelContainer.setLayout(panelContainerLayout);
        panelContainerLayout.setHorizontalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monthlyTrk)
                    .addComponent(countMonthlyTrk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(monthlyIc)
                .addGap(30, 30, 30))
        );
        panelContainerLayout.setVerticalGroup(
            panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(monthlyIc)
                    .addGroup(panelContainerLayout.createSequentialGroup()
                        .addComponent(monthlyTrk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countMonthlyTrk)))
                .addGap(20, 20, 20))
        );

        panelContainer1.setBackground(new java.awt.Color(57, 62, 70));
        panelContainer1.setForeground(new java.awt.Color(57, 62, 70));
        panelContainer1.setPreferredSize(new java.awt.Dimension(300, 85));

        totalTrk.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        totalTrk.setForeground(new java.awt.Color(238, 238, 238));
        totalTrk.setText("TOTAL TRANSAKSI");

        countTotalTrk.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        countTotalTrk.setForeground(new java.awt.Color(238, 238, 238));
        countTotalTrk.setText("25");

        totalIc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_age_52px.png"))); // NOI18N

        javax.swing.GroupLayout panelContainer1Layout = new javax.swing.GroupLayout(panelContainer1);
        panelContainer1.setLayout(panelContainer1Layout);
        panelContainer1Layout.setHorizontalGroup(
            panelContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainer1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countTotalTrk)
                    .addComponent(totalTrk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(totalIc)
                .addGap(30, 30, 30))
        );
        panelContainer1Layout.setVerticalGroup(
            panelContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainer1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(totalIc)
                    .addGroup(panelContainer1Layout.createSequentialGroup()
                        .addComponent(totalTrk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countTotalTrk)))
                .addGap(20, 20, 20))
        );

        panelContainer2.setBackground(new java.awt.Color(57, 62, 70));
        panelContainer2.setForeground(new java.awt.Color(57, 62, 70));
        panelContainer2.setPreferredSize(new java.awt.Dimension(300, 85));

        totalKry.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        totalKry.setForeground(new java.awt.Color(238, 238, 238));
        totalKry.setText("JUMLAH KARYAWAN");

        countTotalKry.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        countTotalKry.setForeground(new java.awt.Color(238, 238, 238));
        countTotalKry.setText("2");

        kryIc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_user_account_52px.png"))); // NOI18N

        javax.swing.GroupLayout panelContainer2Layout = new javax.swing.GroupLayout(panelContainer2);
        panelContainer2.setLayout(panelContainer2Layout);
        panelContainer2Layout.setHorizontalGroup(
            panelContainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainer2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelContainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countTotalKry)
                    .addComponent(totalKry))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(kryIc)
                .addGap(30, 30, 30))
        );
        panelContainer2Layout.setVerticalGroup(
            panelContainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContainer2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelContainer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kryIc)
                    .addGroup(panelContainer2Layout.createSequentialGroup()
                        .addComponent(totalKry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countTotalKry)))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelContainer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(panelContainer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelContainer1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(panelContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelContainer2, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addGap(200, 200, 200))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
		countMonthlyTrk.setText(getMonthlyTrk());
		countTotalTrk.setText(getTotalTrk());
		countTotalKry.setText(getTotalKry());
    }//GEN-LAST:event_formInternalFrameOpened

	private String getMonthlyTrk() {
		String kode = sess.getKodeKaryawan();
		String query = "SELECT COUNT_TRK_MONTHLY(?) AS TOTAL FROM DUAL";
		try {
			cs = koneksi.conn.prepareStatement(query);
			cs.setString(1, null);
			rs = cs.executeQuery();
			if (rs.next()) {
				return String.valueOf(rs.getInt("TOTAL"));
			}
		} catch (SQLException ex) {
			Logger.getLogger(frameDsbAdmin.class.getName()).log(Level.SEVERE, null, ex);
		}
		return "0";
	}

	private String getTotalTrk() {
		String query = "SELECT COUNT_TRK(?) AS TOTAL FROM DUAL";
		try {
			cs = koneksi.conn.prepareStatement(query);
			cs.setString(1, null);
			rs = cs.executeQuery();
			if (rs.next()) {
				return String.valueOf(rs.getInt("TOTAL"));
			}
		} catch (SQLException ex) {
			Logger.getLogger(frameDsbAdmin.class.getName()).log(Level.SEVERE, null, ex);
		}
		return "0";
	}

	private String getTotalKry() {
		String query = "SELECT COUNT_KRY() AS TOTAL FROM DUAL";
		try {
			cs = koneksi.conn.prepareStatement(query);
			rs = cs.executeQuery();
			if (rs.next()) {
				return String.valueOf(rs.getInt("TOTAL"));
			}
		} catch (SQLException ex) {
			Logger.getLogger(frameDsbAdmin.class.getName()).log(Level.SEVERE, null, ex);
		}
		return "0";
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel countMonthlyTrk;
    private javax.swing.JLabel countTotalKry;
    private javax.swing.JLabel countTotalTrk;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kryIc;
    private javax.swing.JLabel monthlyIc;
    private javax.swing.JLabel monthlyTrk;
    private javax.swing.JPanel panelContainer;
    private javax.swing.JPanel panelContainer1;
    private javax.swing.JPanel panelContainer2;
    private javax.swing.JLabel totalIc;
    private javax.swing.JLabel totalKry;
    private javax.swing.JLabel totalTrk;
    // End of variables declaration//GEN-END:variables

}
