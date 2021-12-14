package tiketkeretaapi.jadwal;

import java.beans.PropertyVetoException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import tiketkeretaapi.Koneksi;

/**
 *
 * @author RZ
 */
public class frameDataJdw extends javax.swing.JInternalFrame {

	DefaultTableModel tmJadwal;
	Koneksi koneksi = new Koneksi();
	Statement cmd;
	ResultSet res;

	JDesktopPane mainPanel;

	public frameDataJdw(JDesktopPane panel) {
		initComponents();
		mainPanel = panel;
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
		setBorder(new EmptyBorder(0, 0, 0, 0));
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAddData = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbJadwal = new javax.swing.JTable();

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

        btnAddData.setBackground(new java.awt.Color(57, 62, 70));
        btnAddData.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnAddData.setForeground(new java.awt.Color(255, 255, 255));
        btnAddData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_plus_+_16px.png"))); // NOI18N
        btnAddData.setText("Tambah Data");
        btnAddData.setBorderPainted(false);
        btnAddData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddData.setPreferredSize(new java.awt.Dimension(132, 25));
        btnAddData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDataActionPerformed(evt);
            }
        });

        tbJadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "JDW-DI2XOD", "Bima", "Surabaya", "Malang", "15:35", "18:10", "Senin"}
            },
            new String [] {
                "NO", "KODE JADWAL", "NAMA KERETA", "ASAL", "TUJUAN", "JAM BERANGKAT", "JAM TIBA", "HARI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbJadwal.setPreferredSize(new java.awt.Dimension(300, 40));
        tbJadwal.getTableHeader().setReorderingAllowed(false);
        tbJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbJadwalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbJadwal);
        if (tbJadwal.getColumnModel().getColumnCount() > 0) {
            tbJadwal.getColumnModel().getColumn(0).setResizable(false);
            tbJadwal.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(526, 526, 526))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                        .addGap(50, 50, 50))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnAddData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
		getDataJadwal();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataActionPerformed
		try {
			frameInputJdw addJadwal = new frameInputJdw(mainPanel);
			this.dispose();
			mainPanel.add(addJadwal);
			addJadwal.setVisible(true);
			addJadwal.setMaximum(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(frameDataJdw.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btnAddDataActionPerformed

    private void tbJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbJadwalMouseClicked
		int index = tbJadwal.rowAtPoint(evt.getPoint());
		int columnCount = tbJadwal.getColumnCount();
		Object[] selectedRow = new Object[columnCount];
		if (evt.getClickCount() == 2) {
			for (int i = 0; i < columnCount; i++) {
				selectedRow[i] = tbJadwal.getValueAt(index, i);
			}
		}
    }//GEN-LAST:event_tbJadwalMouseClicked

	private void getDataJadwal() {
		String kode, nama, asal, tujuan, jam_brkt, jam_tiba, hari;
		int i = 0;
		try {

			String[] columsName = {"NO", "KODE JADWAL", "NAMA KERETA", "ASAL", "TUJUAN", "JAM BERANGKAT", "JAM TIBA", "HARI"};
			tmJadwal = new DefaultTableModel(columsName, 0) {
				@Override
				public boolean isCellEditable(int row, int column) {
					return false;
				}

			};

			cmd = koneksi.conn.createStatement();
			res = cmd.executeQuery("SELECT j.KODE_JADWAL, k.nama_kereta, j.ASAL, j.TUJUAN, j.JAM_BERANGKAT, j.JAM_TIBA, GET_HARI(j.HARI) AS HARI FROM JADWAL j INNER JOIN KERETA k ON j.KODE_KERETA = k.KODE_KERETA");

			while (res.next()) {
				i++;
				kode = res.getString("KODE_JADWAL");
				nama = res.getString("NAMA_KERETA");
				asal = res.getString("ASAL");
				tujuan = res.getString("TUJUAN");
				jam_brkt = res.getString("JAM_BERANGKAT");
				jam_tiba = res.getString("JAM_TIBA");
				hari = res.getString("HARI");
				Object[] data = {i, kode, nama, asal, tujuan, jam_brkt, jam_tiba, hari};
				tmJadwal.addRow(data);
			}
			tbJadwal.setModel(tmJadwal);
			TableColumnModel colModel = tbJadwal.getColumnModel();
			colModel.getColumn(0).setPreferredWidth(50);
			colModel.getColumn(0).setMaxWidth(50);

		} catch (SQLException ex) {
			Logger.getLogger(frameDataJdw.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddData;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbJadwal;
    // End of variables declaration//GEN-END:variables
}
