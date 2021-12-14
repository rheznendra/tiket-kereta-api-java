package tiketkeretaapi.karyawan;

import java.beans.PropertyVetoException;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import tiketkeretaapi.Koneksi;

/**
 *
 * @author RZ
 */
public class frameDataKry extends javax.swing.JInternalFrame {

	DefaultTableModel tmKaryawan;
	Koneksi koneksi = new Koneksi();
	Statement cmd;
	ResultSet res;

	JDesktopPane mainPanel;

	public frameDataKry(JDesktopPane panel) {
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
        tbKaryawan = new javax.swing.JTable();
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

        tbKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "KRY-SI01KX", null, "John Doe", "U.S America"},
                {null, "KRY-F0AL11", null, "Jane Doe", "Jamaica"}
            },
            new String [] {
                "NO", "ID KARYAWAN", "USERNAME", "NAMA", "ALAMAT"
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
        tbKaryawan.getTableHeader().setReorderingAllowed(false);
        tbKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbKaryawan);

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
                        .addComponent(btnAddData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataActionPerformed
		try {
			frameInputKry addKaryawan = new frameInputKry(mainPanel, null);
			this.dispose();
			mainPanel.add(addKaryawan);
			addKaryawan.setVisible(true);
			addKaryawan.setMaximum(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(frameDataKry.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btnAddDataActionPerformed

    private void tbKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKaryawanMouseClicked
		int index = tbKaryawan.rowAtPoint(evt.getPoint());
		int columnCount = tbKaryawan.getColumnCount();
		ArrayList selectedRow = new ArrayList();
		if (evt.getClickCount() == 2) {
			for (int i = 1; i < columnCount; i++) {
				selectedRow.add(tbKaryawan.getValueAt(index, i));
			}
			try {
				frameInputKry addKaryawan = new frameInputKry(mainPanel, selectedRow);
				this.dispose();
				mainPanel.add(addKaryawan);
				addKaryawan.setVisible(true);
				addKaryawan.setMaximum(true);
			} catch (PropertyVetoException ex) {
				Logger.getLogger(frameDataKry.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
    }//GEN-LAST:event_tbKaryawanMouseClicked

    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
		try {
			File namaFile = new File("src/report/reportKaryawan.jasper");
			JasperPrint jp = JasperFillManager.fillReport(namaFile.getPath(), null, koneksi.conn);
			JasperViewer.viewReport(jp);
		} catch (JRException ex) {
			Logger.getLogger(frameDataKry.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btnPrintMouseClicked

	private void getDataKaryawan() {
		String kode, username, nama, alamat;
		int i = 0;
		try {
			String[] columsName = {"NO", "KODE KARYAWAN", "USERNAME", "NAMA", "ALAMAT"};
			tmKaryawan = new DefaultTableModel(columsName, 0) {
				@Override
				public boolean isCellEditable(int row, int column) {
					return false;
				}
			};
			cmd = koneksi.conn.createStatement();
			res = cmd.executeQuery("SELECT * FROM KARYAWAN");

			while (res.next()) {
				i++;
				kode = res.getString("KODE_KARYAWAN");
				username = res.getString("USERNAME");
				nama = res.getString("NAMA_KARYAWAN");
				alamat = res.getString("ALAMAT");
				Object[] data = {i, kode, username, nama, alamat};
				tmKaryawan.addRow(data);
			}
			tbKaryawan.setModel(tmKaryawan);
			TableColumnModel colModel = tbKaryawan.getColumnModel();
			colModel.getColumn(0).setPreferredWidth(50);
			colModel.getColumn(0).setMaxWidth(50);
		} catch (SQLException ex) {
			Logger.getLogger(frameDataKry.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddData;
    private javax.swing.JButton btnPrint;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbKaryawan;
    // End of variables declaration//GEN-END:variables
}
