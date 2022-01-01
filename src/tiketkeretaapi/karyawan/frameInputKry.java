package tiketkeretaapi.karyawan;

import at.favre.lib.crypto.bcrypt.BCrypt;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.beans.PropertyVetoException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import org.apache.commons.lang3.RandomStringUtils;
import tiketkeretaapi.Koneksi;

/**
 *
 * @author RZ
 */
public class frameInputKry extends javax.swing.JInternalFrame {

	JDesktopPane mainPanel;
	Koneksi koneksi = new Koneksi();
	Statement cmd;
	CallableStatement call;
	Integer rs;
	ResultSet res;
	ArrayList dataKry;

	public frameInputKry(JDesktopPane panel, ArrayList data) {
		initComponents();
		mainPanel = panel;
		dataKry = data;
		if (data != null) {
			btSubmit.setText("Ubah");
		} else {
			btChangePsw.setVisible(false);
			btDelete.setVisible(false);
		}
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
		setBorder(new EmptyBorder(0, 0, 0, 0));
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbNama = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        lbAlamat = new javax.swing.JLabel();
        tfAlamat = new javax.swing.JTextField();
        btSubmit = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btDelete = new javax.swing.JButton();
        tfUsername = new javax.swing.JTextField();
        lbUsername = new javax.swing.JLabel();
        btChangePsw = new javax.swing.JButton();

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

        lbNama.setBackground(new java.awt.Color(57, 62, 70));
        lbNama.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbNama.setForeground(new java.awt.Color(57, 62, 70));
        lbNama.setText("NAMA");

        tfNama.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        lbAlamat.setBackground(new java.awt.Color(57, 62, 70));
        lbAlamat.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbAlamat.setForeground(new java.awt.Color(57, 62, 70));
        lbAlamat.setText("ALAMAT");

        tfAlamat.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        btSubmit.setBackground(new java.awt.Color(57, 62, 70));
        btSubmit.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btSubmit.setForeground(new java.awt.Color(238, 238, 238));
        btSubmit.setText("Kirim");
        btSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        btDelete.setBackground(new java.awt.Color(57, 62, 70));
        btDelete.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btDelete.setForeground(new java.awt.Color(238, 238, 238));
        btDelete.setText("Hapus");
        btDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDeleteMouseClicked(evt);
            }
        });

        tfUsername.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        lbUsername.setBackground(new java.awt.Color(57, 62, 70));
        lbUsername.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbUsername.setForeground(new java.awt.Color(57, 62, 70));
        lbUsername.setText("USERNAME");

        btChangePsw.setBackground(new java.awt.Color(57, 62, 70));
        btChangePsw.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btChangePsw.setForeground(new java.awt.Color(255, 255, 255));
        btChangePsw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_password_reset_16px.png"))); // NOI18N
        btChangePsw.setText("Ubah Password");
        btChangePsw.setBorderPainted(false);
        btChangePsw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btChangePsw.setPreferredSize(new java.awt.Dimension(103, 25));
        btChangePsw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btChangePswMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNama)
                    .addComponent(lbAlamat)
                    .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btChangePsw, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbUsername)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(395, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btChangePsw, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbAlamat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
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
		String username = tfUsername.getText().strip();
		String nama = tfNama.getText().strip();
		String alamat = tfAlamat.getText().strip();

		disableButton();

		if (!username.isBlank() && !nama.isBlank() && !alamat.isBlank()) {
			if (checkUsername(username)) {
				if (nama.matches("^(([A-Za-z]+[,.]?[ ]?|[a-z]+['-]?)+)$")) {
					if (dataKry == null) {
						String password = genPassword();
						if (insertData(username, nama, alamat, password)) {
							JOptionPane.showMessageDialog(null, "Sukses! Data berhasil ditambahkan, dengan password : " + password + "\nTekan OK untuk meng-copy password.");
							Toolkit.getDefaultToolkit()
									.getSystemClipboard()
									.setContents(new StringSelection(password), null);
							tfUsername.setText(null);
							tfNama.setText(null);
							tfAlamat.setText(null);
						} else {
							JOptionPane.showMessageDialog(null, "Terjadi kesalahan! Data gagal ditambahkan.");
						}
					} else {
						if (updateData(username, nama, alamat)) {
							JOptionPane.showMessageDialog(null, "Sukses! Data berhasil diubah!");
						} else {
							JOptionPane.showMessageDialog(null, "Terjadi kesalahan! Data gagal diubah.");
						}
						btDelete.setEnabled(true);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Gagal! Format nama tidak valid.");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Gagal! Username sudah digunakan.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Gagal! Data tidak boleh kosong.");
		}
		enableButton();
    }//GEN-LAST:event_btSubmitMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
		if (dataKry != null) {
			tfUsername.setText(dataKry.get(1).toString());
			tfNama.setText(dataKry.get(2).toString());
			if (dataKry.get(3) != null) {
				tfAlamat.setText(dataKry.get(3).toString());
			}
		}
    }//GEN-LAST:event_formInternalFrameOpened
    private void btDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeleteMouseClicked
		String kode = dataKry.get(0).toString();

		disableButton();

		int response = JOptionPane.showConfirmDialog(null, "Apakah anda yakin?", "Hapus Data", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (response == JOptionPane.YES_OPTION) {
			if (deleteData(kode)) {
				try {
					frameDataKry dataKaryawan = new frameDataKry(mainPanel);
					this.dispose();
					mainPanel.add(dataKaryawan);
					dataKaryawan.setMaximum(true);
					dataKaryawan.setVisible(true);
					JOptionPane.showMessageDialog(dataKaryawan, "Data berhasil dihapus.", "Sukses!", JOptionPane.INFORMATION_MESSAGE);
				} catch (PropertyVetoException ex) {
					Logger.getLogger(frameInputKry.class.getName()).log(Level.SEVERE, null, ex);
				}

			} else {
				JOptionPane.showMessageDialog(null, "Data gagal dihapus.", "Gagal!", JOptionPane.ERROR_MESSAGE);
			}
		}
		enableButton();
    }//GEN-LAST:event_btDeleteMouseClicked

    private void btChangePswMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btChangePswMouseClicked
		try {
			framePswKry pswKaryawan = new framePswKry(mainPanel, dataKry);
			this.dispose();
			mainPanel.add(pswKaryawan);
			pswKaryawan.setMaximum(true);
			pswKaryawan.setVisible(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(frameInputKry.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btChangePswMouseClicked

	private boolean checkUsername(String username) {
		try {
			String query = "SELECT * FROM KARYAWAN WHERE USERNAME = '" + username + "'";
			cmd = koneksi.conn.createStatement();
			res = cmd.executeQuery(query);
			if (res.next()) {
				return false;
			}
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(frameInputKry.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		}
	}

	private boolean deleteData(String kode) {
		String query = "DELETE FROM KARYAWAN WHERE KODE_KARYAWAN = '" + kode + "'";
		try {
			cmd = koneksi.conn.createStatement();
			rs = cmd.executeUpdate(query);
			return true;
		} catch (SQLException ex) {
			return false;
		}
	}

	private String genPassword() {
		String password = RandomStringUtils.random(8, true, true);
		return password;
	}

	private boolean insertData(String username, String nama, String alamat, String password) {
		password = BCrypt.withDefaults().hashToString(12, password.toCharArray());
		try {
			call = koneksi.conn.prepareCall("{CALL INS_KARYAWAN(?, ?, ?, ?)}");
			call.setString(1, username);
			call.setString(2, nama);
			call.setString(3, alamat);
			call.setString(4, password);
			call.execute();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(frameInputKry.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		}
	}

	private boolean updateData(String username, String nama, String alamat) {
		String kode = dataKry.get(0).toString();
		try {
			call = koneksi.conn.prepareCall("{CALL UPD_KARYAWAN(?, ?, ?, ?)}");
			call.setString(1, kode);
			call.setString(2, username);
			call.setString(3, nama);
			call.setString(4, alamat);
			call.execute();
			return true;
		} catch (SQLException ex) {
			return false;
		}
	}

	private void disableButton() {
		tfUsername.setEnabled(false);
		tfNama.setEnabled(false);
		tfAlamat.setEnabled(false);
		btSubmit.setEnabled(false);
		if (dataKry != null) {
			btDelete.setEnabled(false);
		}
	}

	private void enableButton() {
		tfUsername.setEnabled(true);
		tfNama.setEnabled(true);
		tfAlamat.setEnabled(true);
		btSubmit.setEnabled(true);
		if (dataKry != null) {
			btDelete.setEnabled(true);
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btChangePsw;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btSubmit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAlamat;
    private javax.swing.JLabel lbNama;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
