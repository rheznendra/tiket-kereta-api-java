package tiketkeretaapi.jadwal;

import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import com.github.lgooddatepicker.components.TimePickerSettings.TimeIncrement;
import java.beans.PropertyVetoException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import tiketkeretaapi.Koneksi;
import tiketkeretaapi.transaksi.frameInputTrk;

/**
 *
 * @author RZ
 */
public class frameInputJdw extends javax.swing.JInternalFrame {

	JDesktopPane mainPanel;
	Koneksi koneksi = new Koneksi();
	CallableStatement call;
	Statement cmd;
	Integer rs;
	ResultSet res;
	boolean anyError = false;

	ArrayList dataJdw;

	public frameInputJdw(JDesktopPane panel, ArrayList data) {
		initComponents();
		mainPanel = panel;
		dataJdw = data;
		if (data != null) {
			btSubmit.setText("Ubah");
		} else {
			btDelete.setVisible(false);
		}
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
		setBorder(new EmptyBorder(0, 0, 0, 0));

//		String kodeK = "KRT-GHOK75";
//		for (int i = 0; i < cbKereta.getItemCount(); i++) {
//			if(cbKereta.getItemAt(i).substring(0, 10).equals(kodeK)) {
//				cbKereta.setSelectedIndex(i);
//			}
//		}
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btBack = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbKereta = new javax.swing.JLabel();
        cbKereta = new javax.swing.JComboBox<>();
        lbHarga = new javax.swing.JLabel();
        spHarga = new javax.swing.JSpinner();
        lbAsal = new javax.swing.JLabel();
        lbTujuan = new javax.swing.JLabel();
        lbHari = new javax.swing.JLabel();
        lbJamBerangkat = new javax.swing.JLabel();
        lbJamTiba = new javax.swing.JLabel();
        btSubmit = new javax.swing.JButton();
        TimePickerSettings ts = new TimePickerSettings();
        ts.use24HourClockFormat();
        ts.generatePotentialMenuTimes(TimeIncrement.OneHour, null, null);
        tpBrkt = new TimePicker(ts);
        tpTiba = new TimePicker(ts);
        cbAsal = new javax.swing.JComboBox<>();
        cbTujuan = new javax.swing.JComboBox<>();
        cbHari = new javax.swing.JComboBox<>();
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

        btBack.setBackground(new java.awt.Color(57, 62, 70));
        btBack.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btBack.setForeground(new java.awt.Color(255, 255, 255));
        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_back_arrow_16px.png"))); // NOI18N
        btBack.setText("Kembali");
        btBack.setBorderPainted(false);
        btBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btBack.setPreferredSize(new java.awt.Dimension(103, 25));
        btBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBackMouseClicked(evt);
            }
        });

        lbKereta.setText("KERETA");
        lbKereta.setBackground(new java.awt.Color(57, 62, 70));
        lbKereta.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbKereta.setForeground(new java.awt.Color(57, 62, 70));

        cbKereta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "============PILIH============" }));
        cbKereta.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        lbHarga.setText("HARGA");
        lbHarga.setBackground(new java.awt.Color(57, 62, 70));
        lbHarga.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbHarga.setForeground(new java.awt.Color(57, 62, 70));

        spHarga.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        lbAsal.setText("ASAL");
        lbAsal.setBackground(new java.awt.Color(57, 62, 70));
        lbAsal.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbAsal.setForeground(new java.awt.Color(57, 62, 70));

        lbTujuan.setText("TUJUAN");
        lbTujuan.setBackground(new java.awt.Color(57, 62, 70));
        lbTujuan.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbTujuan.setForeground(new java.awt.Color(57, 62, 70));

        lbHari.setText("HARI");
        lbHari.setBackground(new java.awt.Color(57, 62, 70));
        lbHari.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbHari.setForeground(new java.awt.Color(57, 62, 70));

        lbJamBerangkat.setText("JAM BERANGKAT");
        lbJamBerangkat.setBackground(new java.awt.Color(57, 62, 70));
        lbJamBerangkat.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbJamBerangkat.setForeground(new java.awt.Color(57, 62, 70));

        lbJamTiba.setText("JAM TIBA");
        lbJamTiba.setBackground(new java.awt.Color(57, 62, 70));
        lbJamTiba.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbJamTiba.setForeground(new java.awt.Color(57, 62, 70));

        btSubmit.setText("Kirim");
        btSubmit.setBackground(new java.awt.Color(57, 62, 70));
        btSubmit.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btSubmit.setForeground(new java.awt.Color(238, 238, 238));
        btSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSubmitMouseClicked(evt);
            }
        });

        tpBrkt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        tpTiba.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        cbAsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "============PILIH============" }));
        cbAsal.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        cbTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "============PILIH============" }));
        cbTujuan.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        cbHari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "============PILIH============", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu" }));
        cbHari.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        btDelete.setBackground(new java.awt.Color(57, 62, 70));
        btDelete.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btDelete.setForeground(new java.awt.Color(238, 238, 238));
        btDelete.setText("Hapus");
        btDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDeleteMouseClicked(evt);
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
                    .addComponent(cbHari, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbJamBerangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tpBrkt, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tpTiba, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbJamTiba)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(cbAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cbTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbKereta, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbKereta, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbAsal, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbHari, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTujuan)
                                .addComponent(lbHarga)
                                .addComponent(spHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbKereta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbAsal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTujuan)
                        .addGap(58, 58, 58)))
                .addComponent(lbHari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbHari, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbJamBerangkat)
                    .addComponent(lbJamTiba))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tpBrkt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tpTiba, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
		setKereta();
		setLokasi();

		if (dataJdw != null) {
			try {
				String kode = dataJdw.get(0).toString();
				cmd = koneksi.conn.createStatement();
				res = cmd.executeQuery("SELECT * FROM JADWAL WHERE KODE_JADWAL = '" + kode + "'");
				if (res.next()) {
					String kereta = res.getString("KODE_KERETA");
					int harga = res.getInt("HARGA");
					String asal = res.getString("KODE_ASAL");
					String tujuan = res.getString("KODE_TUJUAN");
					int hari = res.getInt("HARI");
					String brkt = res.getString("JAM_BERANGKAT");
					String tiba = res.getString("JAM_TIBA");

					setCbxValue(cbKereta, kereta, 10);
					spHarga.setValue(harga);
					setCbxValue(cbAsal, asal, 3);
					setCbxValue(cbTujuan, tujuan, 3);
					setCbxValue(cbHari, hari);
					tpBrkt.setText(brkt);
					tpTiba.setText(tiba);
				}
			} catch (SQLException ex) {
				Logger.getLogger(frameInputJdw.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
    }//GEN-LAST:event_formInternalFrameOpened

	private void setCbxValue(JComboBox jcb, int hari) {
		for (int i = 0; i < jcb.getItemCount(); i++) {
			if (i == hari) {
				jcb.setSelectedIndex(i);
				break;
			}
		}
	}

	private void setCbxValue(JComboBox jcb, String kode, int length) {
		for (int i = 0; i < jcb.getItemCount(); i++) {
			if (extractKode(jcb.getItemAt(i).toString(), length).equals(kode)) {
				jcb.setSelectedIndex(i);
				break;
			}
		}
	}

    private void btBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBackMouseClicked
		try {
			frameDataJdw dataJadwal = new frameDataJdw(mainPanel);
			this.dispose();
			mainPanel.add(dataJadwal);
			dataJadwal.setMaximum(true);
			dataJadwal.setVisible(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(frameInputJdw.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btBackMouseClicked

    private void btSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSubmitMouseClicked
		anyError = false;
		toggleInput(false);

		checkEmptyInput();

		String kereta = null, asal = null, tujuan = null, brkt = null, tiba = null;
		int harga = 0, hari = 0;

		if (!anyError) {
			asal = cbAsal.getSelectedItem().toString();
			asal = extractKode(asal, 3);

			tujuan = cbTujuan.getSelectedItem().toString();
			tujuan = extractKode(tujuan, 3);

			checkAsalTujuan(asal, tujuan);
		}

		if (!anyError) {
			brkt = tpBrkt.getTime().toString();
			tiba = tpTiba.getTime().toString();
			checkFormatJam(brkt, tiba);
		}

		if (!anyError) {
			checkBrktTiba(brkt, tiba);
		}

		if (!anyError) {
			kereta = cbKereta.getSelectedItem().toString();
			kereta = extractKode(kereta, 10);
			hari = cbHari.getSelectedIndex();

			checkKereta(kereta, asal, tujuan, hari, brkt, tiba);
		}

		if (!anyError) {

			harga = (int) spHarga.getValue();
			if (dataJdw == null) {
				insertData(kereta, harga, asal, tujuan, hari, brkt, tiba);
				resetForm();
			} else {
				String kode = dataJdw.get(0).toString();
				updateData(kode, kereta, harga, asal, tujuan, hari, brkt, tiba);
			}
		}
		toggleInput(true);
    }//GEN-LAST:event_btSubmitMouseClicked

	private void checkKereta(String kereta, String asal, String tujuan, int hari, String brkt, String tiba) {

		String sql = "SELECT * FROM JADWAL WHERE KODE_KERETA = '%s' AND KODE_ASAL = '%s' AND KODE_TUJUAN = '%s' AND HARI = %s";
		if (dataJdw != null) {
			String kode = dataJdw.get(0).toString();
			sql = sql + "AND KODE_JADWAL != '" + kode + "'";
		}
		sql = String.format(sql, kereta, asal, tujuan, hari);
		try {
			cmd = koneksi.conn.createStatement();
			res = cmd.executeQuery(sql);
			if (res.next()) {
				String currentJamBrkt = res.getString("JAM_BERANGKAT");
				String currentJamTiba = res.getString("JAM_TIBA");
				checkRangeJam(currentJamBrkt, currentJamTiba, brkt, tiba);
			}
		} catch (SQLException ex) {
			Logger.getLogger(frameInputJdw.class.getName()).log(Level.SEVERE, null, ex);
			showAlert("Terjadi kesalahan.", "err");
		}
	}

	private void checkRangeJam(String currentJamBrkt, String currentJamTiba, String brkt, String tiba) {
		if (brkt.equalsIgnoreCase(currentJamBrkt) && tiba.equalsIgnoreCase(currentJamTiba)) {
			showAlert("Kereta dengan data pilihan yang sama telah tersedia.", "err");
			anyError = true;
		} else {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
				Date cjtiba = sdf.parse(currentJamTiba);
				Date cbrkt = sdf.parse(brkt);
				if (cbrkt.before(cjtiba)) {
					showAlert("Kereta telah tersedia dengan waktu " + currentJamBrkt + " - " + currentJamTiba + ".", "err");
					anyError = true;
				}
			} catch (ParseException ex) {
				Logger.getLogger(frameInputJdw.class.getName()).log(Level.SEVERE, null, ex);
				anyError = true;
				showAlert("Terjadi kesalahan.", "err");
			}
		}
	}

    private void btDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeleteMouseClicked
		String kode = dataJdw.get(0).toString();

		toggleInput(false);

		int response = JOptionPane.showConfirmDialog(null, "Apakah anda yakin?", "Hapus Data", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (response == JOptionPane.YES_OPTION) {
			if (deleteData(kode)) {
				try {
					frameDataJdw dataJadwal = new frameDataJdw(mainPanel);
					this.dispose();
					mainPanel.add(dataJadwal);
					dataJadwal.setMaximum(true);
					dataJadwal.setVisible(true);
					JOptionPane.showMessageDialog(dataJadwal, "Data berhasil dihapus.", "Sukses!", JOptionPane.INFORMATION_MESSAGE);
				} catch (PropertyVetoException ex) {
					Logger.getLogger(frameDataJdw.class.getName()).log(Level.SEVERE, null, ex);
				}

			} else {
				JOptionPane.showMessageDialog(null, "Data gagal dihapus.", "Gagal!", JOptionPane.ERROR_MESSAGE);
			}
		}
		toggleInput(true);
    }//GEN-LAST:event_btDeleteMouseClicked

	private boolean deleteData(String kode) {
		String query = "DELETE FROM JADWAL WHERE KODE_JADWAL = '" + kode + "'";
		try {
			cmd = koneksi.conn.createStatement();
			rs = cmd.executeUpdate(query);
			return true;
		} catch (SQLException ex) {
			return false;
		}
	}

	private void resetForm() {
		cbKereta.setSelectedIndex(0);
		spHarga.setValue(0);
		cbAsal.setSelectedIndex(0);
		cbTujuan.setSelectedIndex(0);
		cbHari.setSelectedIndex(0);
		tpBrkt.setText("");
		tpTiba.setText("");
	}

	private void toggleInput(boolean status) {
		cbKereta.setEnabled(status);
		spHarga.setEnabled(status);
		cbAsal.setEnabled(status);
		cbTujuan.setEnabled(status);
		cbHari.setEnabled(status);
		tpBrkt.setEnabled(status);
		tpTiba.setEnabled(status);
		btSubmit.setEnabled(status);
		btDelete.setEnabled(status);
	}

	private void updateData(String kode, String kereta, int harga, String asal, String tujuan, int hari, String brkt, String tiba) {
		try {
			call = koneksi.conn.prepareCall("{CALL UPD_JADWAL(?, ?, ?, ?, ?, ?, ?, ?)}");
			call.setString(1, kode);
			call.setString(2, kereta);
			call.setInt(3, harga);
			call.setString(4, asal);
			call.setString(5, tujuan);
			call.setInt(6, hari);
			call.setString(7, brkt);
			call.setString(8, tiba);
			call.execute();
			showAlert("Data berhasil diubah", "inf");
		} catch (SQLException ex) {
			Logger.getLogger(frameInputJdw.class.getName()).log(Level.SEVERE, null, ex);
			showAlert("Data gagal diubah.", "err");
		}
	}

	private void insertData(String kereta, int harga, String asal, String tujuan, int hari, String brkt, String tiba) {
		try {
			call = koneksi.conn.prepareCall("{CALL INS_JADWAL(?, ?, ?, ?, ?, ?, ?)}");
			call.setString(1, kereta);
			call.setInt(2, harga);
			call.setString(3, asal);
			call.setString(4, tujuan);
			call.setInt(5, hari);
			call.setString(6, brkt);
			call.setString(7, tiba);
			call.execute();
			showAlert("Data berhasil ditambahkan", "inf");
		} catch (SQLException ex) {
			Logger.getLogger(frameInputJdw.class.getName()).log(Level.SEVERE, null, ex);
			showAlert("Data gagal ditambahkan.", "err");
		}
	}

	private void checkBrktTiba(String brkt, String tiba) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			Date jamBrkt = sdf.parse(brkt);
			Date jamTiba = sdf.parse(tiba);
			if (jamTiba.before(jamBrkt)) {
				showAlert("Jam tiba harus melewati jam berangkat.", "err");
				anyError = true;
			}
		} catch (ParseException ex) {
			Logger.getLogger(frameInputJdw.class.getName()).log(Level.SEVERE, null, ex);
			showAlert("Terjadi kesalahan.", "err");
			anyError = true;
		}
	}

	private void checkFormatJam(String brkt, String tiba) {
		String pattern = "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
		if (!brkt.matches(pattern)) {
			showAlert("Format waktu tidak valid.", "err");
			anyError = true;
		}

		if (!anyError && !tiba.matches(pattern)) {
			showAlert("Format waktu tidak valid.", "err");
			anyError = true;
		}
	}

	private void checkAsalTujuan(String asal, String tujuan) {
		if (asal.equals(tujuan)) {
			showAlert("Asal dan Tujuan tidak boleh sama.", "err");
			anyError = true;
		}
	}

	private void checkEmptyInput() {
		if (cbKereta.getSelectedIndex() == 0) {
			showAlert("Silahkan pilih kereta.", "err");
			anyError = true;
		}

		if (!anyError && (int) spHarga.getValue() <= 0) {
			showAlert("Silahkan masukkan harga.", "err");
			anyError = true;
		}

		if (!anyError && cbAsal.getSelectedIndex() == 0) {
			showAlert("Silahkan pilih Asal.", "err");
			anyError = true;
		}

		if (!anyError && cbTujuan.getSelectedIndex() == 0) {
			showAlert("Silahkan pilih Tujuan.", "err");
			anyError = true;
		}

		if (!anyError && cbHari.getSelectedIndex() == 0) {
			showAlert("Silahkan pilih Hari.", "err");
			anyError = true;
		}

		if (!anyError && tpBrkt.getTime() == null) {
			showAlert("Silahkan pilih Jam Berangkat.", "err");
			anyError = true;
		}

		if (!anyError && tpTiba.getTime() == null) {
			showAlert("Silahkan pilih Jam Tiba.", "err");
			anyError = true;
		}
	}

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

	private String extractKode(String text, int length) {
		text = text.substring(text.length() - (length + 1)).substring(0, length);
		return text;
	}

	private void setKereta() {
		try {
			cmd = koneksi.conn.createStatement();
			res = cmd.executeQuery("SELECT KODE_KERETA, NAMA_KERETA FROM KERETA");
			while (res.next()) {
				String kode = res.getString("KODE_KERETA");
				String nama = res.getString("NAMA_KERETA");
				cbKereta.addItem(nama + " (" + kode + ")");
			}
		} catch (SQLException ex) {
			Logger.getLogger(frameInputJdw.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void setLokasi() {
		try {
			cmd = koneksi.conn.createStatement();
			res = cmd.executeQuery("SELECT * FROM LOKASI");
			while (res.next()) {
				String kode = res.getString("KODE");
				String nama = res.getString("NAMA");
				cbAsal.addItem(nama + " (" + kode + ")");
				cbTujuan.addItem(nama + " (" + kode + ")");
			}
		} catch (SQLException ex) {
			Logger.getLogger(frameInputTrk.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btSubmit;
    private javax.swing.JComboBox<String> cbAsal;
    private javax.swing.JComboBox<String> cbHari;
    private javax.swing.JComboBox<String> cbKereta;
    private javax.swing.JComboBox<String> cbTujuan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAsal;
    private javax.swing.JLabel lbHarga;
    private javax.swing.JLabel lbHari;
    private javax.swing.JLabel lbJamBerangkat;
    private javax.swing.JLabel lbJamTiba;
    private javax.swing.JLabel lbKereta;
    private javax.swing.JLabel lbTujuan;
    private javax.swing.JSpinner spHarga;
    private com.github.lgooddatepicker.components.TimePicker tpBrkt;
    private com.github.lgooddatepicker.components.TimePicker tpTiba;
    // End of variables declaration//GEN-END:variables

}
