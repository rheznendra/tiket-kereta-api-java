package tiketkeretaapi.transaksi;

import java.beans.PropertyVetoException;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import login.Session;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import tiketkeretaapi.CurrencyID;
import tiketkeretaapi.Koneksi;
import tiketkeretaapi.karyawan.frameDataKry;

/**
 *
 * @author RZ
 */
public class frameDataTrk extends javax.swing.JInternalFrame {

	DefaultTableModel tmTransaksi;
	Koneksi koneksi = new Koneksi();
	Statement cmd;
	ResultSet res;
	Session sess;
	JDesktopPane mainPanel;

	public frameDataTrk(JDesktopPane panel, Session session) {
		initComponents();
		mainPanel = panel;
		sess = session;
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
		setBorder(new EmptyBorder(0, 0, 0, 0));
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAddTransaksi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTransaksi = new javax.swing.JTable();
        btnPrint = new javax.swing.JButton();

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

        btnAddTransaksi.setBackground(new java.awt.Color(57, 62, 70));
        btnAddTransaksi.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnAddTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        btnAddTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_plus_+_16px.png"))); // NOI18N
        btnAddTransaksi.setText("Tambah Data");
        btnAddTransaksi.setBorderPainted(false);
        btnAddTransaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddTransaksi.setPreferredSize(new java.awt.Dimension(132, 25));
        btnAddTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTransaksiActionPerformed(evt);
            }
        });

        tbTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "KODE", "JUMLAH PENUMPANG", "TANGGAL BERANGKAT", "TANGGAL TRANSAKSI", "TOTAL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbTransaksi.getTableHeader().setReorderingAllowed(false);
        tbTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTransaksi);
        if (tbTransaksi.getColumnModel().getColumnCount() > 0) {
            tbTransaksi.getColumnModel().getColumn(0).setResizable(false);
            tbTransaksi.getColumnModel().getColumn(0).setPreferredWidth(15);
        }

        btnPrint.setBackground(new java.awt.Color(57, 62, 70));
        btnPrint.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_print_16px.png"))); // NOI18N
        btnPrint.setText("Print");
        btnPrint.setBorderPainted(false);
        btnPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrint.setPreferredSize(new java.awt.Dimension(132, 25));
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintMouseClicked(evt);
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
                        .addComponent(btnAddTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
		getDataKaryawan();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAddTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTransaksiActionPerformed
		try {
			frameInputTrk addTrk = new frameInputTrk(mainPanel, sess, null, null);
			this.dispose();
			mainPanel.add(addTrk);
			addTrk.setVisible(true);
			addTrk.setMaximum(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(frameDataTrk.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btnAddTransaksiActionPerformed

    private void tbTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTransaksiMouseClicked

		int index = tbTransaksi.rowAtPoint(evt.getPoint());
		int columnCount = tbTransaksi.getColumnCount();
		ArrayList selectedRow = new ArrayList();
		if (evt.getClickCount() == 2) {
			for (int i = 1; i < columnCount; i++) {
				selectedRow.add(tbTransaksi.getValueAt(index, i));
			}
		}
    }//GEN-LAST:event_tbTransaksiMouseClicked

    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
		Map param = new HashMap<>();
		String file = null;
		if (sess.getLevel().equalsIgnoreCase("admin")) {
			file = "src/report/reportTrkAdmin.jasper";
		} else {
			param.put("kodeKry", sess.getKodeKaryawan());
			file = "src/report/reportTrk.jasper";
		}
		try {
			File namaFile = new File(file);
			JasperPrint jp = JasperFillManager.fillReport(namaFile.getPath(), param, koneksi.conn);
			JasperViewer jpv = new JasperViewer(jp, false);
			jpv.setVisible(true);
		} catch (JRException ex) {
			Logger.getLogger(frameDataKry.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btnPrintMouseClicked

	private void getDataKaryawan() {
		String kode, tglBerangkat, tglTrk;
		int jmlPenumpang, total, i = 0;

		try {

			String[] columsName = {"NO", "KODE", "JUMLAH PENUMPANG", "TANGGAL BERANGKAT", "TANGGAL TRANSAKSI", "TOTAL"};
			tmTransaksi = new DefaultTableModel(columsName, 0) {
				@Override
				public boolean isCellEditable(int row, int column) {
					return false;
				}

			};

			String query = "SELECT KODE_TRK, KODE_KARYAWAN, JUMLAH_PENUMPANG, TO_CHAR(TGL_BERANGKAT, 'dd-Mon-yyyy') AS TGL_BERANGKAT, TO_CHAR(TGL_WAKTU_TRK, 'dd-Mon-yyyy HH24:mi') AS TGL_WAKTU_TRK, TOTAL FROM TRANSAKSI";
			if (sess.getLevel().equalsIgnoreCase("KARYAWAN")) {
				query = query + " WHERE KODE_KARYAWAN = '%s'";
				query = String.format(query, sess.getKodeKaryawan());
			}
			query = query + " ORDER BY TGL_WAKTU_TRK DESC";
			cmd = koneksi.conn.createStatement();
			res = cmd.executeQuery(query);

			while (res.next()) {
				i++;
				kode = res.getString("KODE_TRK");
				jmlPenumpang = res.getInt("JUMLAH_PENUMPANG");
				tglBerangkat = res.getString("TGL_BERANGKAT");
				tglTrk = res.getString("TGL_WAKTU_TRK");
				total = res.getInt("TOTAL");
				Object[] data = {i, kode, jmlPenumpang, tglBerangkat, tglTrk, new CurrencyID(total)};
				tmTransaksi.addRow(data);
			}
			tbTransaksi.setModel(tmTransaksi);
			TableColumnModel colModel = tbTransaksi.getColumnModel();
			colModel.getColumn(0).setPreferredWidth(30);
			colModel.getColumn(0).setMaxWidth(30);
			colModel.getColumn(1).setPreferredWidth(100);
			colModel.getColumn(1).setMaxWidth(100);
			colModel.getColumn(5).setPreferredWidth(80);
			colModel.getColumn(5).setMaxWidth(80);
		} catch (SQLException ex) {
			Logger.getLogger(frameDataTrk.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTransaksi;
    private javax.swing.JButton btnPrint;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTransaksi;
    // End of variables declaration//GEN-END:variables
}
