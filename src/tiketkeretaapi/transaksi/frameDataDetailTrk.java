package tiketkeretaapi.transaksi;

import java.beans.PropertyVetoException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import tiketkeretaapi.Koneksi;
import tiketkeretaapi.karyawan.frameInputKry;

/**
 *
 * @author RZ
 */
public class frameDataDetailTrk extends javax.swing.JInternalFrame {

	DefaultTableModel tmDetailTransaksi;
	JDesktopPane mainPanel;
	ArrayList<DataTransaksi> dataTrk;
	ArrayList<DataDetailTransaksi> dataPnp;
	Koneksi koneksi = new Koneksi();
	Statement cmd;
	PreparedStatement ps;
	CallableStatement cs;
	boolean anyError;

	public frameDataDetailTrk(JDesktopPane panel, ArrayList<DataTransaksi> data, ArrayList<DataDetailTransaksi> penumpang) {
		initComponents();
		mainPanel = panel;
		dataTrk = data;
		dataPnp = penumpang;
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
		setBorder(new EmptyBorder(0, 0, 0, 0));
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDetailTransaksi = new javax.swing.JTable();
        btAdd = new javax.swing.JButton();
        btFinish = new javax.swing.JButton();

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

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));

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

        tbDetailTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "NO KTP", "NAMA", "ALAMAT", "NO HP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDetailTransaksi.getTableHeader().setReorderingAllowed(false);
        tbDetailTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDetailTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDetailTransaksi);
        if (tbDetailTransaksi.getColumnModel().getColumnCount() > 0) {
            tbDetailTransaksi.getColumnModel().getColumn(0).setResizable(false);
            tbDetailTransaksi.getColumnModel().getColumn(0).setPreferredWidth(15);
            tbDetailTransaksi.getColumnModel().getColumn(1).setResizable(false);
            tbDetailTransaksi.getColumnModel().getColumn(2).setResizable(false);
            tbDetailTransaksi.getColumnModel().getColumn(3).setResizable(false);
            tbDetailTransaksi.getColumnModel().getColumn(4).setResizable(false);
        }

        btAdd.setBackground(new java.awt.Color(57, 62, 70));
        btAdd.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btAdd.setForeground(new java.awt.Color(255, 255, 255));
        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_user_account_16px_1.png"))); // NOI18N
        btAdd.setText("Tambah");
        btAdd.setBorderPainted(false);
        btAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAdd.setPreferredSize(new java.awt.Dimension(103, 25));
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btFinish.setBackground(new java.awt.Color(57, 62, 70));
        btFinish.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btFinish.setForeground(new java.awt.Color(255, 255, 255));
        btFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Check_Circle_16px.png"))); // NOI18N
        btFinish.setText("Selesai");
        btFinish.setBorderPainted(false);
        btFinish.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btFinish.setPreferredSize(new java.awt.Dimension(103, 25));
        btFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btFinish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFinish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
		getDataKaryawan();
		if (dataPnp.size() >= dataTrk.get(0).getJmlPenumpang()) {
			btAdd.setVisible(false);
		}

		if (dataPnp.size() >= 1) {
			btFinish.setVisible(true);
		} else {
			btFinish.setVisible(false);
		}
    }//GEN-LAST:event_formInternalFrameOpened

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
		try {
			frameInputTrk addTrk = new frameInputTrk(mainPanel, dataTrk, dataPnp);
			this.dispose();
			mainPanel.add(addTrk);
			addTrk.setVisible(true);
			addTrk.setMaximum(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(frameDataDetailTrk.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btBackActionPerformed

    private void tbDetailTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDetailTransaksiMouseClicked
    }//GEN-LAST:event_tbDetailTransaksiMouseClicked

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
		try {
			frameInputDetailTrk addDetailTrk = new frameInputDetailTrk(mainPanel, dataTrk, dataPnp);
			this.dispose();
			mainPanel.add(addDetailTrk);
			addDetailTrk.setVisible(true);
			addDetailTrk.setMaximum(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(frameInputDetailTrk.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btAddActionPerformed

    private void btFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinishActionPerformed
		anyError = false;
		int confirm = JOptionPane.showConfirmDialog(null, "Pastikan data telah benar.", "Apakah anda yakin?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		if (confirm == JOptionPane.YES_OPTION) {
			if (dataPnp.size() < dataTrk.get(0).getJmlPenumpang()) {
				showAlert("Gagal!", "Jumlah penumpang tidak sesuai.", "err");
			} else {
				insertTrk();

				if (!anyError) {
					showAlert("Sukses!", "Tiket berhasil dipesan.", "info");
					try {
						frameDataTrk dataTrk = new frameDataTrk(mainPanel, null);
						this.dispose();
						mainPanel.add(dataTrk);
						dataTrk.setVisible(true);
						dataTrk.setMaximum(true);
					} catch (PropertyVetoException ex) {
						Logger.getLogger(frameDataTrk.class.getName()).log(Level.SEVERE, null, ex);
					}
				} else {

					showAlert("Terjadi Kesalahan!", "Tiket gagal dipesan.", "err");
				}
			}
		}
    }//GEN-LAST:event_btFinishActionPerformed

	private void insertTrk() {
		String kereta = dataTrk.get(0).getKereta();
		int jmlPenumpang = dataTrk.get(0).getJmlPenumpang();
		String tanggal = dataTrk.get(0).getTanggal();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		java.sql.Date tgl = null;

		try {
			java.util.Date parsed = sdf.parse(tanggal);
			tgl = new java.sql.Date(parsed.getTime());
		} catch (ParseException ex) {
			Logger.getLogger(frameDataDetailTrk.class.getName()).log(Level.SEVERE, null, ex);
		}

		String generatedColumn[] = {"KODE_TRK"};

		String sql = "INSERT INTO TRANSAKSI (KODE_TRK, KODE_JADWAL, KODE_KARYAWAN, JUMLAH_PENUMPANG, TGL_BERANGKAT) VALUES (GEN_KODE('TRK'), ?, ?, ?, ?)";
		try {
			koneksi.conn.setAutoCommit(false);

			ps = koneksi.conn.prepareStatement(sql, generatedColumn);
			ps.setString(1, kereta);
			ps.setString(2, null);
			ps.setInt(3, jmlPenumpang);
			ps.setDate(4, tgl);
			ps.executeUpdate();

			ResultSet rs = ps.getGeneratedKeys();
			rs.next();
			String kode = rs.getString(1);

			cs = koneksi.conn.prepareCall("{CALL INS_DT_TRK(?, ?, ?, ?, ?)}");
			for (int i = 0; i < dataPnp.size(); i++) {
				cs.setString(1, kode);
				cs.setString(2, dataPnp.get(i).getKtp());
				cs.setString(3, dataPnp.get(i).getNama());
				cs.setString(4, dataPnp.get(i).getAlamat());
				cs.setString(5, dataPnp.get(i).getNohp());
				cs.addBatch();
			}
			cs.executeBatch();
			koneksi.conn.commit();
		} catch (SQLException ex) {
			Logger.getLogger(frameInputKry.class.getName()).log(Level.SEVERE, null, ex);
			anyError = true;
		}
	}

	private void getDataKaryawan() {

		String[] columsName = {"NO", "NO KTP", "NAMA", "ALAMAT", "NO HP"};
		tmDetailTransaksi = new DefaultTableModel(columsName, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}

		};

		if (dataPnp.size() >= 1) {
			for (int i = 0; i < dataPnp.size(); i++) {
				String ktp = dataPnp.get(i).getKtp();
				String nama = dataPnp.get(i).getNama();
				String alamat = dataPnp.get(i).getAlamat();
				String nohp = dataPnp.get(i).getNohp();

				Object[] data = {i + 1, ktp, nama, alamat, nohp};
				tmDetailTransaksi.addRow(data);
			}
		}
		tbDetailTransaksi.setModel(tmDetailTransaksi);
		TableColumnModel colModel = tbDetailTransaksi.getColumnModel();
		colModel.getColumn(0).setPreferredWidth(50);
		colModel.getColumn(0).setMaxWidth(50);
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
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btBack;
    private javax.swing.JButton btFinish;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDetailTransaksi;
    // End of variables declaration//GEN-END:variables
}
