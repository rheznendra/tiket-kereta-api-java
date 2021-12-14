package tiketkeretaapi.kereta;

import java.beans.PropertyVetoException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import tiketkeretaapi.Koneksi;
import tiketkeretaapi.karyawan.frameInputKry;

/**
 *
 * @author RZ
 */
public class frameInputKrt extends javax.swing.JInternalFrame {

	JDesktopPane mainPanel;
	Koneksi koneksi = new Koneksi();
	Statement cmd;
	CallableStatement call;
	Integer res;
	ArrayList dataKrt;

	public frameInputKrt(JDesktopPane panel, ArrayList data) {
		initComponents();
		mainPanel = panel;
		dataKrt = data;
		if (data != null) {
			btSubmit.setText("Ubah");
		} else {
			btDelete.setVisible(false);
		}
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
		setBorder(new EmptyBorder(0, 0, 0, 0));
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbNamaKrt = new javax.swing.JLabel();
        tfNamaKrt = new javax.swing.JTextField();
        lbKapasitas = new javax.swing.JLabel();
        btDelete = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        tfKapasitas = new javax.swing.JSpinner();
        btSubmit = new javax.swing.JButton();

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

        lbNamaKrt.setBackground(new java.awt.Color(57, 62, 70));
        lbNamaKrt.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbNamaKrt.setForeground(new java.awt.Color(57, 62, 70));
        lbNamaKrt.setText("NAMA KERETA");

        tfNamaKrt.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        lbKapasitas.setBackground(new java.awt.Color(57, 62, 70));
        lbKapasitas.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbKapasitas.setForeground(new java.awt.Color(57, 62, 70));
        lbKapasitas.setText("KAPASITAS PENUMPANG");

        btDelete.setBackground(new java.awt.Color(57, 62, 70));
        btDelete.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btDelete.setForeground(new java.awt.Color(238, 238, 238));
        btDelete.setText("Hapus");
        btDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDeleteMouseClicked(evt);
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

        btSubmit.setBackground(new java.awt.Color(57, 62, 70));
        btSubmit.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btSubmit.setForeground(new java.awt.Color(238, 238, 238));
        btSubmit.setText("Kirim");
        btSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSubmitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 474, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfNamaKrt, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                    .addComponent(lbNamaKrt)
                                    .addComponent(lbKapasitas)
                                    .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfKapasitas))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(lbNamaKrt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNamaKrt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbKapasitas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfKapasitas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
		try {
			frameDataKrt dataKereta = new frameDataKrt(mainPanel);
			this.dispose();
			mainPanel.add(dataKereta);
			dataKereta.setMaximum(true);
			dataKereta.setVisible(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(frameInputKrt.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btBackActionPerformed

    private void btDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeleteMouseClicked
		String kode = dataKrt.get(0).toString();

		disableButton();

		int response = JOptionPane.showConfirmDialog(null, "Apakah anda yakin?", "Hapus Data", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (response == JOptionPane.YES_OPTION) {
			if (deleteData(kode)) {
				try {
					frameDataKrt dataKereta = new frameDataKrt(mainPanel);
					this.dispose();
					mainPanel.add(dataKereta);
					dataKereta.setMaximum(true);
					dataKereta.setVisible(true);
					JOptionPane.showMessageDialog(dataKereta, "Data berhasil dihapus.", "Sukses!", JOptionPane.INFORMATION_MESSAGE);
				} catch (PropertyVetoException ex) {
					Logger.getLogger(frameInputKry.class.getName()).log(Level.SEVERE, null, ex);
				}

			} else {
				JOptionPane.showMessageDialog(null, "Data gagal dihapus.", "Gagal!", JOptionPane.ERROR_MESSAGE);
			}
		}
		enableButton();
    }//GEN-LAST:event_btDeleteMouseClicked

    private void btSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSubmitMouseClicked
		String nama = tfNamaKrt.getText().strip();
		int kapasitas = (int) tfKapasitas.getValue();

		disableButton();

		if (!nama.isBlank() && kapasitas > 0) {
			if (dataKrt == null) {
				if (insertData(nama, kapasitas)) {
					JOptionPane.showMessageDialog(null, "Sukses! Data berhasil ditambahkan!");
					tfNamaKrt.setText(null);
					tfKapasitas.setValue(0);
				} else {
					JOptionPane.showMessageDialog(null, "Terjadi kesalahan! Data gagal ditambahkan.");
				}
			} else {
				if (updateData(nama, kapasitas)) {
					JOptionPane.showMessageDialog(null, "Sukses! Data berhasil diubah!");
				} else {
					JOptionPane.showMessageDialog(null, "Terjadi kesalahan! Data gagal diubah.");
				}
				btDelete.setEnabled(true);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Gagal! Data tidak boleh kosong.");
		}
		enableButton();
    }//GEN-LAST:event_btSubmitMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
		if (dataKrt != null) {
			tfNamaKrt.setText(dataKrt.get(1).toString());
			tfKapasitas.setValue(dataKrt.get(2));
		}
    }//GEN-LAST:event_formInternalFrameOpened

	private boolean deleteData(String kode) {
		String query = "DELETE FROM KERETA WHERE KODE_KERETA = '" + kode + "'";
		try {
			cmd = koneksi.conn.createStatement();
			res = cmd.executeUpdate(query);
			return true;
		} catch (SQLException ex) {
			return false;
		}
	}

	private boolean insertData(String nama, int kapasitas) {
		try {
			call = koneksi.conn.prepareCall("{CALL INS_KERETA(?, ?)}");
			call.setString(1, nama);
			call.setInt(2, kapasitas);
			call.execute();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(frameInputKry.class.getName()).log(Level.SEVERE, null, ex);
			return false;
		}
	}

	private boolean updateData(String nama, int kapasitas) {
		String kode = dataKrt.get(0).toString();
		try {
			call = koneksi.conn.prepareCall("{CALL UPD_KERETA(?, ?, ?)}");
			call.setString(1, kode);
			call.setString(2, nama);
			call.setInt(3, kapasitas);
			call.execute();
			return true;
		} catch (SQLException ex) {
			return false;
		}
	}

	private void disableButton() {
		tfNamaKrt.setEnabled(false);
		tfKapasitas.setEnabled(false);
		btDelete.setEnabled(false);
		if (dataKrt != null) {
			btDelete.setEnabled(false);
		}
	}

	private void enableButton() {
		tfNamaKrt.setEnabled(true);
		tfKapasitas.setEnabled(true);
		btDelete.setEnabled(true);
		if (dataKrt != null) {
			btDelete.setEnabled(true);
		}
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btSubmit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbKapasitas;
    private javax.swing.JLabel lbNamaKrt;
    private javax.swing.JSpinner tfKapasitas;
    private javax.swing.JTextField tfNamaKrt;
    // End of variables declaration//GEN-END:variables
}
