package tiketkeretaapi.transaksi;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import java.awt.event.ItemEvent;
import java.beans.PropertyVetoException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import login.Session;
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
	Session sess;
	Vector<CbxKereta> vectorKrt = new Vector<>();
	ArrayList<DataTransaksi> dataTrk = new ArrayList<>();
	ArrayList<DataDetailTransaksi> dataPnp = new ArrayList<>();

	public frameInputTrk(JDesktopPane panel, Session session, ArrayList<DataTransaksi> data, ArrayList<DataDetailTransaksi> penumpang) {
		initComponents();
		mainPanel = panel;
		if (data != null) {
			dataTrk = data;
			dataPnp = penumpang;
		}
		sess = session;
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
		setBorder(new EmptyBorder(0, 0, 0, 0));
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btBack = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lbAsal = new javax.swing.JLabel();
        lbKereta = new javax.swing.JLabel();
        btNext = new javax.swing.JButton();
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
        tfHarga1 = new javax.swing.JTextField();
        lbSisaKursi = new javax.swing.JLabel();

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
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

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

        cbKereta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------------------PILIH------------------" }));
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

        tfHarga1.setText("0 kursi tersedia");
        tfHarga1.setEnabled(false);

        lbSisaKursi.setBackground(new java.awt.Color(57, 62, 70));
        lbSisaKursi.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbSisaKursi.setForeground(new java.awt.Color(57, 62, 70));
        lbSisaKursi.setText("SISA KURSI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(lbKereta))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbJmlPenumpang)
                                .addComponent(spJmlPenumpang, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbHarga)
                            .addComponent(lbTujuan)
                            .addComponent(cbTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSisaKursi)
                            .addComponent(tfHarga1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dcTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCari)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAsal)
                    .addComponent(lbTujuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbTujuan)
                    .addComponent(cbAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbHari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCari, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbKereta)
                    .addComponent(lbHarga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfHarga)
                    .addComponent(cbKereta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbJmlPenumpang)
                    .addComponent(lbSisaKursi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfHarga1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spJmlPenumpang, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btNext, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
		if (!anyError) {
			checkPenumpang();
		}

		if (!anyError) {
			String asal = extractKode(cbAsal.getSelectedItem().toString(), 3);
			String tujuan = extractKode(cbTujuan.getSelectedItem().toString(), 3);
			String tanggal = getHariStr();
			int hariNum = getHariNum();
			int jmlPenumpang = (int) spJmlPenumpang.getValue();
			CbxKereta selectedKrt = (CbxKereta) cbKereta.getSelectedItem();
			String kereta = selectedKrt.getId();
			dataTrk.clear();
			dataTrk.add(new DataTransaksi(asal, tujuan, tanggal, hariNum, kereta, jmlPenumpang));

			if (dataPnp.size() >= 1 && jmlPenumpang != dataPnp.size()) {
				ArrayList<DataDetailTransaksi> tempVct = new ArrayList<>();

				int loop = dataPnp.size() > jmlPenumpang ? jmlPenumpang : dataPnp.size();
				for (int i = 0; i < loop; i++) {
					String ktp = dataPnp.get(i).getKtp();
					String nama = dataPnp.get(i).getNama();
					String alamat = dataPnp.get(i).getAlamat();
					String hp = dataPnp.get(i).getNohp();
					tempVct.add(new DataDetailTransaksi(ktp, nama, alamat, hp));
				}
				dataPnp.clear();
				dataPnp.addAll(tempVct);
			}

			try {
				frameDataDetailTrk detailTrk = new frameDataDetailTrk(mainPanel, sess, dataTrk, dataPnp);
				this.dispose();
				mainPanel.add(detailTrk);
				detailTrk.setMaximum(true);
				detailTrk.setVisible(true);
			} catch (PropertyVetoException ex) {
				Logger.getLogger(frameInputTrk.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
    }//GEN-LAST:event_btNextMouseClicked

    private void cbKeretaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbKeretaItemStateChanged
		if (evt.getStateChange() == ItemEvent.SELECTED) {
			if (cbKereta.getSelectedIndex() >= 1) {

				CbxKereta item = (CbxKereta) cbKereta.getSelectedItem();
				String kode = item.getId();
				btNext.setVisible(true);
				String tanggal = getHariStr();
				String query = "SELECT KODE_JADWAL, HARGA FROM JADWAL WHERE KODE_JADWAL = '%s'";
				query = String.format(query, kode);

				try {
					cmd = koneksi.conn.createStatement();
					res = cmd.executeQuery(query);
					if (res.next()) {
						String kodeJdw = res.getString("KODE_JADWAL");
						int harga = res.getInt("HARGA");
						setHarga(harga);
						int sisa = getSisaKursi(kodeJdw, tanggal);
						setSisaKursi(sisa);
					}
				} catch (SQLException ex) {
					Logger.getLogger(frameInputTrk.class.getName()).log(Level.SEVERE, null, ex);
				}
			} else {
				btNext.setVisible(false);
				setHarga(0);
			}
		}
    }//GEN-LAST:event_cbKeretaItemStateChanged

    private void btCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCariMouseClicked
		resetCbKereta();
		anyError = false;
		String asal = cbAsal.getSelectedItem().toString();
		asal = extractKode(asal, 3);
		String tujuan = cbTujuan.getSelectedItem().toString();
		tujuan = extractKode(tujuan, 3);
		int dof;

		checkLokasi(asal, tujuan);

		if (!anyError) {
			checkTanggal();
		}

		if (!anyError) {
			dof = getHariNum();
			setKereta(asal, tujuan, dof);
		}
    }//GEN-LAST:event_btCariMouseClicked

	private String getHariStr() {
		return dcTgl.getDate().format(DateTimeFormatter.ofPattern("dd-MM-uuuu"));
	}

	private int getHariNum() {
		int dof;
		Calendar c = Calendar.getInstance();
		c.setTime(java.sql.Date.valueOf(dcTgl.getDate()));
		dof = c.get(Calendar.DAY_OF_WEEK) - 1;
		dof = dof == 0 ? 7 : dof;
		return dof;
	}

	private String extractKode(String text, int length) {
		text = text.substring(text.length() - (length + 1)).substring(0, length);
		return text;
	}

	private void resetCbKereta() {
		cbKereta.removeAllItems();
		cbKereta.addItem("------------------PILIH------------------");
	}

    private void cbTujuanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTujuanItemStateChanged
		if (evt.getStateChange() == ItemEvent.SELECTED) {
			if (cbTujuan.getSelectedIndex() == 0) {
				btNext.setVisible(false);
				resetCbKereta();
			}
		}
    }//GEN-LAST:event_cbTujuanItemStateChanged
    private void cbAsalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAsalItemStateChanged
		if (evt.getStateChange() == ItemEvent.SELECTED) {
			if (cbAsal.getSelectedIndex() == 0) {
				btNext.setVisible(false);
				resetCbKereta();
			}
		}
    }//GEN-LAST:event_cbAsalItemStateChanged

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
		btNext.setVisible(false);
		setMinTanggal();
		setLokasiAsal();
		setLokasiTujuan();
		dcTgl.addDateChangeListener((DateChangeEvent event) -> {
			if (event.getOldDate() != null) {
				resetCbKereta();
				setHarga(0);
			}
		});
		if (!dataTrk.isEmpty()) {
			String asal = dataTrk.get(0).getAsal();
			String tujuan = dataTrk.get(0).getTujuan();

			String tanggal = dataTrk.get(0).getTanggal();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d-MM-yyyy");
			LocalDate tgl = LocalDate.parse(tanggal, dtf);
			Date dtgl = java.sql.Date.valueOf(tgl);
			tanggal = new SimpleDateFormat("EEEE, dd MMMM yyyy", new Locale("id", "ID")).format(dtgl);
			int hariNum = dataTrk.get(0).getHariNum();

			String kereta = dataTrk.get(0).getKereta();
			int jmlPenumpang = dataTrk.get(0).getJmlPenumpang();
			setCbAsalTujuan(cbAsal, asal);
			setCbAsalTujuan(cbTujuan, tujuan);
			dcTgl.setText(tanggal);

			setKereta(asal, tujuan, hariNum);
			for (int i = 0; i < vectorKrt.size(); i++) {
				if (vectorKrt.get(i).getId().equals(kereta)) {
					cbKereta.setSelectedIndex(i);
					break;
				}
			}

			spJmlPenumpang.setValue(jmlPenumpang);
			btNext.setVisible(true);
		}
    }//GEN-LAST:event_formInternalFrameOpened

	private void setCbAsalTujuan(JComboBox cb, String kode) {
		for (int i = 1; i < cb.getItemCount(); i++) {
			if (extractKode(cb.getItemAt(i).toString(), 3).equals(kode)) {
				cb.setSelectedIndex(i);
				break;
			}
		}
	}

	private void setKereta(String asal, String tujuan, int hari) {
		String query = "SELECT j.KODE_JADWAL, j.JAM_BERANGKAT, j.JAM_TIBA, k.NAMA_KERETA FROM JADWAL j INNER JOIN KERETA k ON j.KODE_KERETA = k.KODE_KERETA WHERE j.KODE_ASAL = '%s' AND j.KODE_TUJUAN = '%s' AND j.HARI = %s ORDER BY 2 ASC";
		query = String.format(query, asal, tujuan, hari);

		vectorKrt.removeAllElements();
		vectorKrt.addElement(new CbxKereta("", "------------------PILIH------------------"));

		try {
			cmd = koneksi.conn.createStatement();
			res = cmd.executeQuery(query);
			if (res.next() == false) {
				showAlert("Pencarian Gagal!", "Ditemukan 0 kereta sesuai asal-tujuan dan hari.", "err");
			} else {
				cbKereta.removeAllItems();
				do {
					String kode = res.getString("KODE_JADWAL");
					String brkt = res.getString("JAM_BERANGKAT");
					String tiba = res.getString("JAM_TIBA");
					String kereta = res.getString("NAMA_KERETA");
					String list = "%s (%s - %s)";
					list = String.format(list, kereta, brkt, tiba);
					vectorKrt.addElement(new CbxKereta(kode, list));
				} while (res.next());
				cbKereta.setModel(new DefaultComboBoxModel(vectorKrt));
			}
		} catch (SQLException ex) {
			Logger.getLogger(frameInputTrk.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void checkLokasi(String asal, String tujuan) {
		anyError = true;
		if (cbAsal.getSelectedIndex() == 0 || cbTujuan.getSelectedIndex() == 0) {
			showAlert("Terjadi Kesalahan!", "Silahkan pilih asal dan tujuan.", "error");
		} else if (asal.equalsIgnoreCase(tujuan)) {
			showAlert("Terjadi Kesalahan!", "Asal dan tujuan tidak boleh sama.", "error");
		} else {
			anyError = false;
		}
	}

	private void checkPenumpang() {
		if ((int) spJmlPenumpang.getValue() <= 0) {
			showAlert("Terjadi Kesalahan!", "Minimal 1 penumpang.", "info");
			anyError = true;
		}
	}

	private void checkTanggal() {
		try {
			anyError = true;
			if (dcTgl.getDate() == null) {
				showAlert("Terjadi Kesalahan!", "Tanggal tidak boleh kosong.", "error");
			} else {
				String tanggal = getHariStr();
				Date tgl = new SimpleDateFormat("dd-MM-yyyy").parse(tanggal);
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
			tp = JOptionPane.ERROR_MESSAGE;
		} else if (type.equals("info")) {
			tp = JOptionPane.INFORMATION_MESSAGE;
		}
		JOptionPane.showMessageDialog(null, msg, title, tp);
	}

	private int getSisaKursi(String kodeJdw, String tanggal) {
		String query = "SELECT COUNT_SISAKURSI('%s', '%s') AS SISA FROM DUAL";
		query = String.format(query, kodeJdw, tanggal);
		try {
			cmd = koneksi.conn.createStatement();
			res = cmd.executeQuery(query);
			if (res.next()) {
				int sisa = res.getInt("SISA");
				return sisa;
			}
		} catch (SQLException ex) {
			Logger.getLogger(frameInputTrk.class.getName()).log(Level.SEVERE, null, ex);
		}
		return 0;
	}

	private void setSisaKursi(int num) {
		String text = "%s kursi tersedia";
		text = String.format(text, num);
		tfHarga1.setText(text);
	}

	private void setHarga(int num) {
		tfHarga.setText(new CurrencyID(num).toString() + "/orang");
	}

	private void setMinTanggal() {
		Date dt = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		c.add(Calendar.DATE, 1);
	}

	private void setLokasiAsal() {
		try {
			cmd = koneksi.conn.createStatement();
			res = cmd.executeQuery("SELECT j.KODE_ASAL AS KODE, l.NAMA FROM JADWAL j INNER JOIN LOKASI l ON j.KODE_ASAL = l.KODE GROUP BY j.KODE_ASAL, l.NAMA");
			while (res.next()) {
				String kode = res.getString("KODE");
				String nama = res.getString("NAMA");
				cbAsal.addItem(nama + " (" + kode + ")");
			}
		} catch (SQLException ex) {
			Logger.getLogger(frameInputTrk.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void setLokasiTujuan() {
		try {
			cmd = koneksi.conn.createStatement();
			res = cmd.executeQuery("SELECT j.KODE_TUJUAN AS KODE, l.NAMA FROM JADWAL j INNER JOIN LOKASI l ON j.KODE_TUJUAN = l.KODE GROUP BY j.KODE_TUJUAN, l.NAMA");
			while (res.next()) {
				String kode = res.getString("KODE");
				String nama = res.getString("NAMA");
				cbTujuan.addItem(nama + " (" + kode + ")");
			}
		} catch (SQLException ex) {
			Logger.getLogger(frameInputTrk.class.getName()).log(Level.SEVERE, null, ex);
		}
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
    private javax.swing.JLabel lbSisaKursi;
    private javax.swing.JLabel lbTujuan;
    private javax.swing.JSpinner spJmlPenumpang;
    private javax.swing.JTextField tfHarga;
    private javax.swing.JTextField tfHarga1;
    // End of variables declaration//GEN-END:variables
}
