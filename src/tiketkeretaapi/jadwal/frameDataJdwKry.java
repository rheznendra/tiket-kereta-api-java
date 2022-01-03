package tiketkeretaapi.jadwal;

import java.awt.event.ItemEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import tiketkeretaapi.CurrencyID;
import tiketkeretaapi.Koneksi;

/**
 *
 * @author RZ
 */
public class frameDataJdwKry extends javax.swing.JInternalFrame {

	DefaultTableModel tmJadwal;
	Koneksi koneksi = new Koneksi();
	Statement cmd;
	ResultSet res;
	JDesktopPane mainPanel;
	String query = "SELECT k.nama_kereta AS KERETA, j.HARGA, l.NAMA AS ASAL, l2.NAMA AS TUJUAN, GET_HARI(j.HARI) AS HARI, j.JAM_BERANGKAT, j.JAM_TIBA FROM JADWAL j INNER JOIN KERETA k ON j.KODE_KERETA = k.KODE_KERETA INNER JOIN LOKASI l ON j.KODE_ASAL = l.KODE INNER JOIN LOKASI l2 ON j.KODE_TUJUAN = l2.KODE";

	public frameDataJdwKry(JDesktopPane panel) {
		initComponents();
		mainPanel = panel;
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
		setBorder(new EmptyBorder(0, 0, 0, 0));
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbJadwal = new javax.swing.JTable();
        cbAsal = new javax.swing.JComboBox<>();
        cbTujuan = new javax.swing.JComboBox<>();
        cbHari = new javax.swing.JComboBox<>();

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

        tbJadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "KERETA", "HARGA", "ASAL", "TUJUAN", "HARI", "JAM BERANGKAT", "JAM TIBA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbJadwal.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbJadwal);
        if (tbJadwal.getColumnModel().getColumnCount() > 0) {
            tbJadwal.getColumnModel().getColumn(0).setResizable(false);
            tbJadwal.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        cbAsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----ASAL----" }));
        cbAsal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAsalItemStateChanged(evt);
            }
        });

        cbTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----TUJUAN----" }));
        cbTujuan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTujuanItemStateChanged(evt);
            }
        });

        cbHari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----HARI----" }));
        cbHari.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbHariItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbHari, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHari, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
		getDataJadwal(query);
		getAsal();
		getTujuan();
		getHari();
    }//GEN-LAST:event_formInternalFrameOpened

    private void cbAsalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAsalItemStateChanged
		if (evt.getStateChange() == ItemEvent.SELECTED) {
			changeJadwalByItem();
		}
    }//GEN-LAST:event_cbAsalItemStateChanged

    private void cbTujuanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTujuanItemStateChanged
		if (evt.getStateChange() == ItemEvent.SELECTED) {
			changeJadwalByItem();
		}
    }//GEN-LAST:event_cbTujuanItemStateChanged

    private void cbHariItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbHariItemStateChanged
		if (evt.getStateChange() == ItemEvent.SELECTED) {
			changeJadwalByItem();
		}
    }//GEN-LAST:event_cbHariItemStateChanged

	private void changeJadwalByItem() {
		String asal = null, sql = query;
		if (cbAsal.getSelectedIndex() >= 1) {
			asal = extractKode(cbAsal.getSelectedItem().toString(), 3);
		}
		String tujuan = null;
		if (cbTujuan.getSelectedIndex() >= 1) {
			tujuan = extractKode(cbTujuan.getSelectedItem().toString(), 3);
		}
		int hari = 0;
		if (cbHari.getSelectedIndex() >= 1) {
			hari = cbHari.getSelectedIndex();
		}
		if (asal != null || tujuan != null || hari >= 1) {
			sql = sql + " WHERE";
		}
		if (asal != null) {
			sql = sql + " J.KODE_ASAL = '" + asal + "'";
		}
		if (tujuan != null) {
			if (asal != null) {
				sql = sql + " AND";
			}
			sql = sql + " J.KODE_TUJUAN = '" + tujuan + "'";
		}
		if (hari >= 1) {
			if (asal != null || tujuan != null) {
				sql = sql + " AND";
			}
			sql = sql + " J.HARI = '" + hari + "'";
		}
		System.out.println(sql);
		getDataJadwal(sql);
	}

	private void getAsal() {
		try {
			cmd = koneksi.conn.createStatement();
			res = cmd.executeQuery("SELECT j.KODE_ASAL AS KODE, l.NAMA FROM JADWAL j INNER JOIN LOKASI l ON j.KODE_ASAL = l.KODE GROUP BY j.KODE_ASAL, l.NAMA");
			while (res.next()) {
				String kode = res.getString("KODE");
				String nama = res.getString("NAMA");
				cbAsal.addItem(nama + " (" + kode + ")");
			}
		} catch (SQLException ex) {
			Logger.getLogger(frameDataJdwKry.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void getTujuan() {
		try {
			cmd = koneksi.conn.createStatement();
			res = cmd.executeQuery("SELECT j.KODE_TUJUAN AS KODE, l.NAMA FROM JADWAL j INNER JOIN LOKASI l ON j.KODE_TUJUAN = l.KODE GROUP BY j.KODE_TUJUAN, l.NAMA");
			while (res.next()) {
				String kode = res.getString("KODE");
				String nama = res.getString("NAMA");
				cbTujuan.addItem(nama + " (" + kode + ")");
			}
		} catch (SQLException ex) {
			Logger.getLogger(frameDataJdwKry.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private void getHari() {
		String[] strDays = new String[]{"Senin", "Selasa", "Rabu", "Kamis", "Jum'at", "Sabtu", "Minggu"};
		for (int i = 0; i < 7; i++) {
			cbHari.addItem(strDays[i]);
		}
	}

	private void getDataJadwal(String sql) {
		String nama, asal, tujuan, jam_brkt, jam_tiba, hari;
		int i = 0, harga;
		sql = sql + " ORDER BY j.HARI ASC, j.JAM_BERANGKAT ASC";
		try {

			String[] columsName = {"NO", "KERETA", "HARGA", "ASAL", "TUJUAN", "HARI", "JAM BERANGKAT", "JAM TIBA"};
			tmJadwal = new DefaultTableModel(columsName, 0) {
				@Override
				public boolean isCellEditable(int row, int column) {
					return false;
				}

			};
			tmJadwal.setRowCount(0);

			cmd = koneksi.conn.createStatement();
			res = cmd.executeQuery(sql);

			while (res.next()) {
				i++;
				nama = res.getString("KERETA");
				harga = res.getInt("HARGA");
				asal = res.getString("ASAL");
				tujuan = res.getString("TUJUAN");
				hari = res.getString("HARI");
				jam_brkt = res.getString("JAM_BERANGKAT");
				jam_tiba = res.getString("JAM_TIBA");
				Object[] data = {i, nama, new CurrencyID(harga), asal, tujuan, hari, jam_brkt, jam_tiba};
				tmJadwal.addRow(data);
			}
			tbJadwal.setModel(tmJadwal);
			TableColumnModel colModel = tbJadwal.getColumnModel();
			colModel.getColumn(0).setPreferredWidth(50);
			colModel.getColumn(0).setMaxWidth(50);

		} catch (SQLException ex) {
			Logger.getLogger(frameDataJdwKry.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private String extractKode(String text, int length) {
		text = text.substring(text.length() - (length + 1)).substring(0, length);
		return text;
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbAsal;
    private javax.swing.JComboBox<String> cbHari;
    private javax.swing.JComboBox<String> cbTujuan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbJadwal;
    // End of variables declaration//GEN-END:variables
}
