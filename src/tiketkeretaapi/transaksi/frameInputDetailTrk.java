package tiketkeretaapi.transaksi;

import java.beans.PropertyVetoException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import login.Session;

/**
 *
 * @author RZ
 */
public class frameInputDetailTrk extends javax.swing.JInternalFrame {

	JDesktopPane mainPanel;
	ArrayList<DataTransaksi> dataTrk;
	ArrayList<DataDetailTransaksi> dataPnp;
	boolean anyError;
	Session sess;
	int index;

	public frameInputDetailTrk(JDesktopPane panel, Session session, ArrayList<DataTransaksi> data, ArrayList<DataDetailTransaksi> penumpang, int idx) {
		initComponents();
		mainPanel = panel;
		dataTrk = data;
		dataPnp = penumpang;
		sess = session;
		index = idx;
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
        tfNoKtp = new javax.swing.JTextField();
        lbNoKtp = new javax.swing.JLabel();
        lbNoHp = new javax.swing.JLabel();
        tfNoHp = new javax.swing.JTextField();
        btDelete = new javax.swing.JButton();

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
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
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

        tfNoKtp.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        lbNoKtp.setBackground(new java.awt.Color(57, 62, 70));
        lbNoKtp.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbNoKtp.setForeground(new java.awt.Color(57, 62, 70));
        lbNoKtp.setText("NOMOR KTP");

        lbNoHp.setBackground(new java.awt.Color(57, 62, 70));
        lbNoHp.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbNoHp.setForeground(new java.awt.Color(57, 62, 70));
        lbNoHp.setText("NOMOR HP");

        tfNoHp.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        btDelete.setBackground(new java.awt.Color(57, 62, 70));
        btDelete.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btDelete.setForeground(new java.awt.Color(238, 238, 238));
        btDelete.setText("Hapus");
        btDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAlamat)
                            .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNoHp)
                            .addComponent(tfNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNoKtp)
                            .addComponent(tfNoKtp, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNama))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNoKtp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNoKtp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNama)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbAlamat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNoHp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(132, 132, 132))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
		redirBack();
    }//GEN-LAST:event_btBackActionPerformed

	private void redirBack() {
		try {
			frameDataDetailTrk dataDetailTrk = new frameDataDetailTrk(mainPanel, sess, dataTrk, dataPnp);
			this.dispose();
			mainPanel.add(dataDetailTrk);
			dataDetailTrk.setMaximum(true);
			dataDetailTrk.setVisible(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(frameDataDetailTrk.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
		anyError = false;

		checkBlankForm();

		if (!anyError) {
			checkKTP();
		}

		if (!anyError) {
			checkNama();
		}

//		if (!anyError) {
//			checkNoHp();
//		}
		if (!anyError) {
			String ktp = tfNoKtp.getText().strip();
			String nama = tfNama.getText().strip();
			String alamat = tfAlamat.getText().strip();
			String nohp = tfNoHp.getText().strip();
			if (index <= 0) {
				dataPnp.add(new DataDetailTransaksi(ktp, nama, alamat, nohp));
				showAlert("Sukses!", "Data penumpang berhasil ditambahkan.", "info");
			} else {
				dataPnp.set(index - 1, new DataDetailTransaksi(ktp, nama, alamat, nohp));
				showAlert("Sukses!", "Data penumpang berhasil diubah.", "info");
			}
			redirBack();
		}
    }//GEN-LAST:event_btSubmitActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
		if (index >= 1) {
			tfNoKtp.setText(dataPnp.get(index - 1).getKtp());
			tfNama.setText(dataPnp.get(index - 1).getNama());
			tfAlamat.setText(dataPnp.get(index - 1).getAlamat());
			tfNoHp.setText(dataPnp.get(index - 1).getNohp());
			btSubmit.setText("Ubah");
			btDelete.setVisible(true);
		} else {
			btDelete.setVisible(false);
		}
    }//GEN-LAST:event_formInternalFrameOpened

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed

		int response = JOptionPane.showConfirmDialog(null, "Apakah anda yakin?", "Hapus Data", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (response == JOptionPane.YES_OPTION) {
			dataPnp.remove(index - 1);
			redirBack();
		}
    }//GEN-LAST:event_btDeleteActionPerformed

	private void checkBlankForm() {
		if (tfNoKtp.getText().isBlank() || tfNama.getText().isBlank() || tfAlamat.getText().isBlank() || tfNoHp.getText().isBlank()) {
			anyError = true;
			showAlert("Gagal!", "Form tidak boleh kosong.", "err");
		}
	}

	private void checkKTP() {

		if (!tfNoKtp.getText().matches("^(1[1-9]|21|[37][1-6]|5[1-3]|6[1-5]|[89][12])\\d{2}\\d{2}([04][1-9]|[1256][0-9]|[37][01])(0[1-9]|1[0-2])\\d{2}\\d{4}$")) {
			anyError = true;
			showAlert("Gagal!", "Format Nomor KTP tidak valid.", "err");
		}

		if (!anyError && dataPnp.size() >= 1) {
			for (int i = 0; i < dataPnp.size(); i++) {
				if (tfNoKtp.getText().strip().equalsIgnoreCase(dataPnp.get(i).getKtp()) && i != index - 1) {
					anyError = true;
					showAlert("Gagal!", "Nomor KTP telah terdaftar.", "err");
					break;
				}
			}
		}
	}

	private void checkNama() {
		if (!tfNama.getText().matches("^(([A-Za-z]+[,.]?[ ]?|[a-z]+['-]?)+)$")) {
			anyError = true;
			showAlert("Gagal!", "Format nama tidak valid.", "err");
		}
	}

	private void checkNoHp() {
		if (!tfNoHp.getText().matches("^(\\+62|62|0)8[1-9][0-9]{6,9}$")) {
			anyError = true;
			showAlert("Gagal!", "Format nomor hp tidak valid.", "err");
		}
	}

	private void showAlert(String title, String msg, String type) {
		int tp = 0;
		if (type.equals("error")) {
			tp = JOptionPane.ERROR_MESSAGE;
		} else if (type.equals("info")) {
			tp = JOptionPane.INFORMATION_MESSAGE;
		}
		JOptionPane.showMessageDialog(null, msg, title, tp);
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btSubmit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAlamat;
    private javax.swing.JLabel lbNama;
    private javax.swing.JLabel lbNoHp;
    private javax.swing.JLabel lbNoKtp;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNoHp;
    private javax.swing.JTextField tfNoKtp;
    // End of variables declaration//GEN-END:variables
}
