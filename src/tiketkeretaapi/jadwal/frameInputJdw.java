package tiketkeretaapi.jadwal;

import java.awt.event.ItemEvent;
import java.beans.PropertyVetoException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.border.EmptyBorder;
import tiketkeretaapi.Koneksi;

/**
 *
 * @author RZ
 */
public class frameInputJdw extends javax.swing.JInternalFrame {

	JDesktopPane mainPanel;
	Koneksi koneksi = new Koneksi();
	Statement cmd;
	ResultSet res;

	public frameInputJdw(JDesktopPane panel) {
		initComponents();
		mainPanel = panel;
		((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
		setBorder(new EmptyBorder(0, 0, 0, 0));
		loadKereta();
		String kodeK = "KRT-GHOK75";
		for (int i = 0; i < cbKereta.getItemCount(); i++) {
			if(cbKereta.getItemAt(i).substring(0, 10).equals(kodeK)) {
				cbKereta.setSelectedIndex(i);
			}
		}
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
        tfAsal = new javax.swing.JTextField();
        lbTujuan = new javax.swing.JLabel();
        tfTujuan = new javax.swing.JTextField();
        lbHari = new javax.swing.JLabel();
        dcHari = new com.toedter.calendar.JDateChooser();
        lbJamBerangkat = new javax.swing.JLabel();
        tfJamBerangkat = new javax.swing.JTextField();
        lbJamTiba = new javax.swing.JLabel();
        tfJamTiba = new javax.swing.JTextField();
        btSubmit = new javax.swing.JButton();

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

        lbKereta.setBackground(new java.awt.Color(57, 62, 70));
        lbKereta.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbKereta.setForeground(new java.awt.Color(57, 62, 70));
        lbKereta.setText("KERETA");

        cbKereta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbKereta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbKeretaItemStateChanged(evt);
            }
        });

        lbHarga.setBackground(new java.awt.Color(57, 62, 70));
        lbHarga.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbHarga.setForeground(new java.awt.Color(57, 62, 70));
        lbHarga.setText("HARGA");

        lbAsal.setBackground(new java.awt.Color(57, 62, 70));
        lbAsal.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbAsal.setForeground(new java.awt.Color(57, 62, 70));
        lbAsal.setText("ASAL");

        tfAsal.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tfAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAsalActionPerformed(evt);
            }
        });

        lbTujuan.setBackground(new java.awt.Color(57, 62, 70));
        lbTujuan.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbTujuan.setForeground(new java.awt.Color(57, 62, 70));
        lbTujuan.setText("TUJUAN");

        tfTujuan.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tfTujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTujuanActionPerformed(evt);
            }
        });

        lbHari.setBackground(new java.awt.Color(57, 62, 70));
        lbHari.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbHari.setForeground(new java.awt.Color(57, 62, 70));
        lbHari.setText("HARI");

        lbJamBerangkat.setBackground(new java.awt.Color(57, 62, 70));
        lbJamBerangkat.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbJamBerangkat.setForeground(new java.awt.Color(57, 62, 70));
        lbJamBerangkat.setText("JAM BERANGKAT");

        tfJamBerangkat.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tfJamBerangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJamBerangkatActionPerformed(evt);
            }
        });

        lbJamTiba.setBackground(new java.awt.Color(57, 62, 70));
        lbJamTiba.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        lbJamTiba.setForeground(new java.awt.Color(57, 62, 70));
        lbJamTiba.setText("JAM TIBA");

        tfJamTiba.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        tfJamTiba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJamTibaActionPerformed(evt);
            }
        });

        btSubmit.setBackground(new java.awt.Color(57, 62, 70));
        btSubmit.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        btSubmit.setForeground(new java.awt.Color(238, 238, 238));
        btSubmit.setText("Kirim");
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
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
                    .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dcHari, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfJamBerangkat, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbKereta, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbKereta, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbAsal, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfAsal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbHari, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(lbJamBerangkat))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbTujuan)
                                    .addComponent(tfTujuan)
                                    .addComponent(lbHarga)
                                    .addComponent(spHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbJamTiba)
                                    .addComponent(tfJamTiba, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))))
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
                        .addComponent(tfAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTujuan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lbHari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcHari, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbJamBerangkat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfJamBerangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbJamTiba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfJamTiba, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
		try {
			frameDataJdw dataJadwal = new frameDataJdw(mainPanel);
			this.dispose();
			mainPanel.add(dataJadwal);
			dataJadwal.setMaximum(true);
			dataJadwal.setVisible(true);
		} catch (PropertyVetoException ex) {
			Logger.getLogger(frameInputJdw.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_btBackActionPerformed

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_btSubmitActionPerformed

    private void tfAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAsalActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_tfAsalActionPerformed

    private void tfTujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTujuanActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_tfTujuanActionPerformed

    private void tfJamBerangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJamBerangkatActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_tfJamBerangkatActionPerformed

    private void tfJamTibaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJamTibaActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_tfJamTibaActionPerformed

    private void cbKeretaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbKeretaItemStateChanged
		if (evt.getStateChange() == ItemEvent.SELECTED && cbKereta.getSelectedIndex() != 0) {
			String kode = cbKereta.getSelectedItem().toString();
			kode = kode.substring(0, 10);
			System.out.println(kode);
		}
    }//GEN-LAST:event_cbKeretaItemStateChanged

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameOpened

	private void loadKereta() {
		cbKereta.removeAllItems();
		cbKereta.addItem("============PILIH============");
		try {
			cmd = koneksi.conn.createStatement();
			res = cmd.executeQuery("SELECT KODE_KERETA, NAMA_KERETA FROM KERETA");
			while (res.next()) {
				String kode = res.getString("KODE_KERETA");
				String nama = res.getString("NAMA_KERETA");
				cbKereta.addItem(kode + " - " + nama);
			}
		} catch (SQLException ex) {
			Logger.getLogger(frameInputJdw.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btSubmit;
    private javax.swing.JComboBox<String> cbKereta;
    private com.toedter.calendar.JDateChooser dcHari;
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
    private javax.swing.JTextField tfAsal;
    private javax.swing.JTextField tfJamBerangkat;
    private javax.swing.JTextField tfJamTiba;
    private javax.swing.JTextField tfTujuan;
    // End of variables declaration//GEN-END:variables
}
