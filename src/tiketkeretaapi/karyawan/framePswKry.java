package tiketkeretaapi.karyawan;

import at.favre.lib.crypto.bcrypt.BCrypt;
import java.beans.PropertyVetoException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import tiketkeretaapi.Koneksi;

/**
 *
 * @author RZ
 */
public class framePswKry extends javax.swing.JInternalFrame {

	JDesktopPane mainPanel;
	Koneksi koneksi = new Koneksi();
	Statement cmd;
	CallableStatement call;
	Integer rs;
	ResultSet res;
	ArrayList dataKry;

	public framePswKry(JDesktopPane panel, ArrayList data) {
		initComponents();
		mainPanel = panel;
		dataKry = data;
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
		setBorder(new EmptyBorder(0, 0, 0, 0));
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbNama = new javax.swing.JLabel();
        lbAlamat = new javax.swing.JLabel();
        btSubmit = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbUsername = new javax.swing.JLabel();
        btInputKry = new javax.swing.JButton();
        tfCurrentPsw = new javax.swing.JPasswordField();
        tfNewPsw = new javax.swing.JPasswordField();
        tfConfNewPsw = new javax.swing.JPasswordField();

        setMinimumSize(new java.awt.Dimension(732, 402));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));
        jPanel1.setMaximumSize(jPanel1.getPreferredSize());

        lbNama.setBackground(new java.awt.Color(57, 62, 70));
        lbNama.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbNama.setForeground(new java.awt.Color(57, 62, 70));
        lbNama.setText("PASSWORD BARU");

        lbAlamat.setBackground(new java.awt.Color(57, 62, 70));
        lbAlamat.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbAlamat.setForeground(new java.awt.Color(57, 62, 70));
        lbAlamat.setText("KONFIRMASI PASSWORD BARU");

        btSubmit.setBackground(new java.awt.Color(57, 62, 70));
        btSubmit.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btSubmit.setForeground(new java.awt.Color(238, 238, 238));
        btSubmit.setText("Ubah");
        btSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSubmitMouseClicked(evt);
            }
        });

        btBack.setBackground(new java.awt.Color(57, 62, 70));
        btBack.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btBack.setForeground(new java.awt.Color(255, 255, 255));
        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_back_arrow_16px.png"))); // NOI18N
        btBack.setText("Kembali");
        btBack.setBorderPainted(false);
        btBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBack.setPreferredSize(new java.awt.Dimension(103, 25));
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        lbUsername.setBackground(new java.awt.Color(57, 62, 70));
        lbUsername.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbUsername.setForeground(new java.awt.Color(57, 62, 70));
        lbUsername.setText("PASSWORD SEKARANG");

        btInputKry.setBackground(new java.awt.Color(57, 62, 70));
        btInputKry.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btInputKry.setForeground(new java.awt.Color(255, 255, 255));
        btInputKry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_male_user_16px.png"))); // NOI18N
        btInputKry.setText("Detail Karyawan");
        btInputKry.setBorderPainted(false);
        btInputKry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btInputKry.setPreferredSize(new java.awt.Dimension(103, 25));
        btInputKry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btInputKryMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfConfNewPsw, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfNewPsw)
                        .addComponent(tfCurrentPsw, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                        .addComponent(lbNama)
                        .addComponent(lbAlamat)
                        .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btInputKry, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbUsername)))
                .addContainerGap(395, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btInputKry, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCurrentPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNewPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbAlamat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfConfNewPsw, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
		try {
			frameDataKry dataKaryawan = new frameDataKry(mainPanel);
			this.dispose();
			mainPanel.add(dataKaryawan);
			dataKaryawan.setMaximum(true);
			dataKaryawan.setVisible(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(frameInputKry.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btBackActionPerformed

    private void btSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSubmitMouseClicked
		disableButton();
		String currentPsw = new String(tfCurrentPsw.getPassword());
		String newPsw = new String(tfNewPsw.getPassword());
		String confNewPsw = new String(tfConfNewPsw.getPassword());
		if (!currentPsw.isBlank() && !newPsw.isBlank() && !confNewPsw.isBlank()) {
			if (checkPsw(currentPsw)) {
				if (newPsw.equals(confNewPsw)) {
					if (updateData(newPsw)) {
						showAlert("Password berhasil diubah.", "inf");
					} else {
						showAlert("Terjadi kesalahan.", "err");
					}
				} else {
					showAlert("Password baru tidak sama.", "err");
				}
			} else {
				showAlert("Password sekarang tidak sesuai pada database.", "err");
			}
		} else {
			showAlert("Form tidak boleh kosong.", "err");
		}
		tfCurrentPsw.setText("");
		tfNewPsw.setText("");
		tfConfNewPsw.setText("");
		enableButton();
    }//GEN-LAST:event_btSubmitMouseClicked

    private void btInputKryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInputKryMouseClicked
		try {
			frameInputKry inputKaryawan = new frameInputKry(mainPanel, dataKry);
			this.dispose();
			mainPanel.add(inputKaryawan);
			inputKaryawan.setMaximum(true);
			inputKaryawan.setVisible(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(framePswKry.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btInputKryMouseClicked

	private void showAlert(String msg, String type) {
		String title = "";
		int tp = 0;
		if (type.equals("inf")) {
			tp = JOptionPane.INFORMATION_MESSAGE;
			title = "Sukses!";
		} else if (type.equals("err")) {
			tp = JOptionPane.ERROR_MESSAGE;
			title = "Error!";
		}
		JOptionPane.showMessageDialog(null, msg, title, tp);
	}

	private boolean updateData(String password) {
		String kode = dataKry.get(0).toString();
		password = BCrypt.withDefaults().hashToString(12, password.toCharArray());
		try {
			call = koneksi.conn.prepareCall("{CALL UPD_PSW_KARYAWAN(?, ?)}");
			call.setString(1, kode);
			call.setString(2, password);
			call.execute();
			return true;
		} catch (SQLException ex) {
			return false;
		}
	}

	private boolean checkPsw(String password) {
		try {
			String kode = dataKry.get(0).toString();
			cmd = koneksi.conn.createStatement();
			res = cmd.executeQuery("SELECT * FROM KARYAWAN WHERE KODE_KARYAWAN ='" + kode + "'");
			if (res.next()) {
				BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), res.getString("PASSWORD"));
				if (result.verified) {
					return true;
				}
			}
			return false;
		} catch (SQLException ex) {
			Logger.getLogger(framePswKry.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		}
	}

	private void disableButton() {
		tfCurrentPsw.setEnabled(false);
		tfNewPsw.setEnabled(false);
		tfConfNewPsw.setEnabled(false);
		btSubmit.setEnabled(false);
	}

	private void enableButton() {
		tfCurrentPsw.setEnabled(true);
		tfNewPsw.setEnabled(true);
		tfConfNewPsw.setEnabled(true);
		btSubmit.setEnabled(true);
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btInputKry;
    private javax.swing.JButton btSubmit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAlamat;
    private javax.swing.JLabel lbNama;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JPasswordField tfConfNewPsw;
    private javax.swing.JPasswordField tfCurrentPsw;
    private javax.swing.JPasswordField tfNewPsw;
    // End of variables declaration//GEN-END:variables
}
