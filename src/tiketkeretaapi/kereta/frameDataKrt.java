package tiketkeretaapi.kereta;

import java.beans.PropertyVetoException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import tiketkeretaapi.Koneksi;
import tiketkeretaapi.karyawan.frameDataKry;

/**
 *
 * @author RZ
 */
public class frameDataKrt extends javax.swing.JInternalFrame {

	DefaultTableModel tmKereta;
	Koneksi koneksi = new Koneksi();
	Statement cmd;
	ResultSet res;

	JDesktopPane mainPanel;

	public frameDataKrt(JDesktopPane panel) {
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
        tbKereta = new javax.swing.JTable();

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

        tbKereta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "KRT-T431LD", "Bima",  new Integer(200)},
                { new Integer(2), "KRT-LOS9FD", "Argopuro",  new Integer(175)}
            },
            new String [] {
                "NO", "KODE KERETA", "NAMA KERETA", "JUMLAH PENUMPANG"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbKereta.getTableHeader().setReorderingAllowed(false);
        tbKereta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKeretaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbKereta);
        if (tbKereta.getColumnModel().getColumnCount() > 0) {
            tbKereta.getColumnModel().getColumn(0).setResizable(false);
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
                        .addGap(547, 556, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
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
		getDataKereta();
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnAddDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDataActionPerformed
		try {
			frameInputKrt addKereta = new frameInputKrt(mainPanel, null);
			this.dispose();
			mainPanel.add(addKereta);
			addKereta.setVisible(true);
			addKereta.setMaximum(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(frameDataKrt.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btnAddDataActionPerformed

    private void tbKeretaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKeretaMouseClicked
        int index = tbKereta.rowAtPoint(evt.getPoint());
		int columnCount = tbKereta.getColumnCount();
		ArrayList selectedRow = new ArrayList();
		if (evt.getClickCount() == 2) {
			for (int i = 1; i < columnCount; i++) {
				selectedRow.add(tbKereta.getValueAt(index, i));
			}
			try {
				frameInputKrt addKereta = new frameInputKrt(mainPanel, selectedRow);
				this.dispose();
				mainPanel.add(addKereta);
				addKereta.setVisible(true);
				addKereta.setMaximum(true);
			} catch (PropertyVetoException ex) {
				Logger.getLogger(frameDataKry.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
    }//GEN-LAST:event_tbKeretaMouseClicked

	private void getDataKereta() {
		String kode, nama;
		int kapasitas;
		int i = 0;
		try {

			String[] columsName = {"NO", "KODE KERETA", "NAMA KERETA", "KAPASITAS PENUMPANG"};
			tmKereta = new DefaultTableModel(columsName, 0) {
				@Override
				public boolean isCellEditable(int row, int column) {
					return false;
				}

			};

			cmd = koneksi.conn.createStatement();
			res = cmd.executeQuery("SELECT * FROM KERETA");

			while (res.next()) {
				i++;
				kode = res.getString("KODE_KERETA");
				nama = res.getString("NAMA_KERETA");
				kapasitas = res.getInt("KAPASITAS");
				Object[] data = {i, kode, nama, kapasitas};
				tmKereta.addRow(data);
			}
			tbKereta.setModel(tmKereta);
			TableColumnModel colModel = tbKereta.getColumnModel();
			colModel.getColumn(0).setPreferredWidth(50);
			colModel.getColumn(0).setMaxWidth(50);

		} catch (SQLException ex) {
			Logger.getLogger(frameDataKrt.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddData;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbKereta;
    // End of variables declaration//GEN-END:variables
}
