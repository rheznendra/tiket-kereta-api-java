package tiketkeretaapi.transaksi;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import java.awt.event.ItemEvent;
import java.beans.PropertyVetoException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import tiketkeretaapi.CurrencyID;
import tiketkeretaapi.Koneksi;

/**
 *
 * @author RZ
 */
public class frameInputTrk extends javax.swing.JInternalFrame {

	JDesktopPane mainPanel;
	Koneksi koneksi = new Koneksi();
	Statement cmd;
	ResultSet res;
	boolean anyError;

	public frameInputTrk(JDesktopPane panel) {
		initComponents();
		mainPanel = panel;
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
		setBorder(new EmptyBorder(0, 0, 0, 0));
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbAsal = new javax.swing.JLabel();
        lbKereta = new javax.swing.JLabel();
        btNext = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbTujuan = new javax.swing.JLabel();
        lbHari = new javax.swing.JLabel();
        cbTujuan = new javax.swing.JComboBox<>();
        cbAsal = new javax.swing.JComboBox<>();
        btCari = new javax.swing.JButton();
        cbKereta = new javax.swing.JComboBox<>();
        lbJmlPenumpang = new javax.swing.JLabel();
        tfHarga = new javax.swing.JTextField();
        lbHarga = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        spJmlPenumpang = new javax.swing.JSpinner();
        Locale locale = new Locale("in");
        DatePickerSettings dps = new DatePickerSettings(locale);
        dps.setFormatForDatesCommonEra("EEEE, dd MMMM yyyy");
        dps.setAllowKeyboardEditing(false);
        dcTgl = new DatePicker(dps);
        LocalDate today = LocalDate.now();
        dps.setDateRangeLimits(today, null);

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

        lbAsal.setText("ASAL");
        lbAsal.setBackground(new java.awt.Color(57, 62, 70));
        lbAsal.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbAsal.setForeground(new java.awt.Color(57, 62, 70));

        lbKereta.setText("KERETA");
        lbKereta.setBackground(new java.awt.Color(57, 62, 70));
        lbKereta.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbKereta.setForeground(new java.awt.Color(57, 62, 70));

        btNext.setBackground(new java.awt.Color(57, 62, 70));
        btNext.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btNext.setForeground(new java.awt.Color(238, 238, 238));
        btNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_next_page_16px.png"))); // NOI18N
        btNext.setText("SELANJUTNYA");
        btNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btNextMouseClicked(evt);
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

        lbTujuan.setText("TUJUAN");
        lbTujuan.setBackground(new java.awt.Color(57, 62, 70));
        lbTujuan.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbTujuan.setForeground(new java.awt.Color(57, 62, 70));

        lbHari.setText("HARI");
        lbHari.setBackground(new java.awt.Color(57, 62, 70));
        lbHari.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbHari.setForeground(new java.awt.Color(57, 62, 70));

        cbTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------------PILIH------------------" }));
        cbTujuan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbTujuan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTujuanItemStateChanged(evt);
            }
        });

        cbAsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------------PILIH------------------" }));
        cbAsal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbAsal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAsalItemStateChanged(evt);
            }
        });

        btCari.setBackground(new java.awt.Color(57, 62, 70));
        btCari.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btCari.setForeground(new java.awt.Color(255, 255, 255));
        btCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_search_16px.png"))); // NOI18N
        btCari.setText("Cari");
        btCari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCariMouseClicked(evt);
            }
        });

        cbKereta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------------PILIH------------------", "Argo Bromo Anggrek 2 (08:55 - 19:35)" }));
        cbKereta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbKereta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbKeretaItemStateChanged(evt);
            }
        });

        lbJmlPenumpang.setText("JUMLAH PENUMPANG");
        lbJmlPenumpang.setBackground(new java.awt.Color(57, 62, 70));
        lbJmlPenumpang.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbJmlPenumpang.setForeground(new java.awt.Color(57, 62, 70));

        tfHarga.setText("Rp. 0/orang");
        tfHarga.setEnabled(false);

        lbHarga.setText("HARGA");
        lbHarga.setBackground(new java.awt.Color(57, 62, 70));
        lbHarga.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbHarga.setForeground(new java.awt.Color(57, 62, 70));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btNext)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbKereta, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbAsal)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(cbAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lbHari)
                                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbKereta))
                            .addComponent(dcTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbHarga)
                            .addComponent(lbJmlPenumpang)
                            .addComponent(lbTujuan)
                            .addComponent(cbTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(spJmlPenumpang, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCari))
                            .addComponent(tfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addComponent(jSeparator2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAsal)
                    .addComponent(lbTujuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbTujuan, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(cbAsal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHari)
                    .addComponent(lbJmlPenumpang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCari, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbKereta)
                            .addComponent(lbHarga))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfHarga)
                            .addComponent(cbKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(spJmlPenumpang, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
		try {
			frameDataTrk dataTrk = new frameDataTrk(mainPanel, null);
			this.dispose();
			mainPanel.add(dataTrk);
			dataTrk.setMaximum(true);
			dataTrk.setVisible(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(frameInputTrk.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btBackActionPerformed

    private void btNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btNextMouseClicked

    }//GEN-LAST:event_btNextMouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
		btNext.setVisible(false);

		setMinTanggal();
		setLokasi();
    }//GEN-LAST:event_formInternalFrameOpened

	private void setMinTanggal() {
		Date dt = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		c.add(Calendar.DATE, 1);
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

    private void cbKeretaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbKeretaItemStateChanged
		if (evt.getStateChange() == ItemEvent.SELECTED) {
			if (cbKereta.getSelectedIndex() >= 1) {
				btNext.setVisible(true);
				String kode = cbKereta.getSelectedItem().toString();
				kode = kode.substring(kode.length() - 11).substring(0, 10);
				try {
					cmd = koneksi.conn.createStatement();
					res = cmd.executeQuery("SELECT * FROM JADWAL WHERE KODE_KERETA = '" + kode + "'");
					if (res.next()) {
						double harga = (double) res.getInt("HARGA");
						tfHarga.setText(new CurrencyID(harga).toString());
					}
				} catch (SQLException ex) {
					Logger.getLogger(frameInputTrk.class.getName()).log(Level.SEVERE, null, ex);
				}
			} else {
				btNext.setVisible(false);
			}
		}
    }//GEN-LAST:event_cbKeretaItemStateChanged

    private void btCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCariMouseClicked
		anyError = false;
		int asalIdx = cbAsal.getSelectedIndex();
		int tujuanIdx = cbTujuan.getSelectedIndex();
		String tanggal = dcTgl.getDate().format(DateTimeFormatter.ofPattern("dd-MM-uuuu"));
		Integer jmlPenumpang = (Integer) spJmlPenumpang.getValue();

		checkLokasi(asalIdx, tujuanIdx);

		if (!anyError) {
			checkTanggal(tanggal);
		}
		if (!anyError) {
			checkPenumpang(jmlPenumpang);
		}

		if (!anyError) {
			String asal = cbAsal.getSelectedItem().toString();
			asal = asal.substring(asal.length() - 4).substring(0, 3);
			String tujuan = cbTujuan.getSelectedItem().toString();
			tujuan = tujuan.substring(tujuan.length() - 4).substring(0, 3);
			setKereta(asal, tujuan);
		}
    }//GEN-LAST:event_btCariMouseClicked

    private void cbTujuanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTujuanItemStateChanged
		if (evt.getStateChange() == ItemEvent.SELECTED) {
			if (cbTujuan.getSelectedIndex() == 0) {
				btNext.setVisible(false);
				cbKereta.removeAllItems();
				cbKereta.addItem("------------------PILIH------------------");
			}
		}
    }//GEN-LAST:event_cbTujuanItemStateChanged
    private void cbAsalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAsalItemStateChanged
		if (evt.getStateChange() == ItemEvent.SELECTED) {
			if (cbAsal.getSelectedIndex() == 0) {
				btNext.setVisible(false);
				cbKereta.removeAllItems();
				cbKereta.addItem("------------------PILIH------------------");
			}
		}
    }//GEN-LAST:event_cbAsalItemStateChanged

	private void setKereta(String asal, String tujuan) {
		try {
			cmd = koneksi.conn.createStatement();
			res = cmd.executeQuery("SELECT * FROM KERETA");

			while (res.next()) {
				String kode = res.getString("KODE_KERETA");
				String kereta = res.getString("NAMA_KERETA");
				cbKereta.addItem(kereta + " (" + kode + ")");
			}
		} catch (SQLException ex) {
			Logger.getLogger(frameInputTrk.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void checkLokasi(int asal, int tujuan) {
		anyError = true;
		if (asal == 0 || tujuan == 0) {
			showAlert("Terjadi Kesalahan!", "Silahkan pilih asal dan tujuan.", "error");
		} else if (asal == tujuan) {
			showAlert("Terjadi Kesalahan!", "Asal dan tujuan tidak boleh sama.", "error");
		} else {
			anyError = false;
		}
	}

	private void checkPenumpang(int jumlah) {
		if (jumlah <= 0) {
			showAlert("Terjadi Kesalahan!", "Minimal 1 penumpang.", "info");
			anyError = true;
		}
	}

	private void checkTanggal(String tanggal) {
		try {
			Date tgl = new SimpleDateFormat("dd-MM-yyyy").parse(tanggal);
			anyError = true;
			if (tanggal == null) {
				showAlert("Terjadi Kesalahan!", "Tanggal tidak boleh kosong.", "error");
			} else {

				Calendar currentDay = Calendar.getInstance();
				currentDay.setTime(currentDay.getTime());
				Date cDay = (Date) currentDay.getTime();
				if (tgl.before(cDay)) {
					showAlert("Terjadi Kesalahan!", "Tanggal minimal besok.", "error");
				} else {
					anyError = false;
				}
			}
		} catch (ParseException ex) {
			Logger.getLogger(frameInputTrk.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void showAlert(String title, String msg, String type) {
		int tp = 0;
		if (type.equals("error")) {
			tp = JOptionPane.INFORMATION_MESSAGE;
		} else if (type.equals("info")) {
			tp = JOptionPane.INFORMATION_MESSAGE;
		}
		JOptionPane.showMessageDialog(null, msg, title, tp);
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btCari;
    private javax.swing.JButton btNext;
    private javax.swing.JComboBox<String> cbAsal;
    private javax.swing.JComboBox<String> cbKereta;
    private javax.swing.JComboBox<String> cbTujuan;
    private com.github.lgooddatepicker.components.DatePicker dcTgl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbAsal;
    private javax.swing.JLabel lbHarga;
    private javax.swing.JLabel lbHari;
    private javax.swing.JLabel lbJmlPenumpang;
    private javax.swing.JLabel lbKereta;
    private javax.swing.JLabel lbTujuan;
    private javax.swing.JSpinner spJmlPenumpang;
    private javax.swing.JTextField tfHarga;
    // End of variables declaration//GEN-END:variables
}
