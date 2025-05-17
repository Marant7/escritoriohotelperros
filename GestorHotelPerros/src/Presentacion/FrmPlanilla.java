
package Presentacion;

import Negocio.clsNPlanilla;
import Negocio.clsNAsistencia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmPlanilla extends javax.swing.JFrame {

    DefaultTableModel modelo;
    public FrmPlanilla() {
        initComponents();
        ListarPlanilla();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPlanilla = new javax.swing.JTable();
        btnDia = new javax.swing.JButton();
        btnHora = new javax.swing.JButton();
        btnSalario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btncerrar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tbPlanilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Empleado", "Funcion", "Fecha", "Dias", "Horas", "Salario"
            }
        ));
        tbPlanilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPlanillaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPlanilla);
        if (tbPlanilla.getColumnModel().getColumnCount() > 0) {
            tbPlanilla.getColumnModel().getColumn(0).setPreferredWidth(5);
            tbPlanilla.getColumnModel().getColumn(1).setPreferredWidth(220);
            tbPlanilla.getColumnModel().getColumn(4).setPreferredWidth(10);
            tbPlanilla.getColumnModel().getColumn(5).setPreferredWidth(10);
            tbPlanilla.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        btnDia.setBackground(new java.awt.Color(58, 96, 125));
        btnDia.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btnDia.setForeground(new java.awt.Color(255, 255, 255));
        btnDia.setText("REGISTRAR DIAS");
        btnDia.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiaActionPerformed(evt);
            }
        });

        btnHora.setBackground(new java.awt.Color(58, 96, 125));
        btnHora.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btnHora.setForeground(new java.awt.Color(255, 255, 255));
        btnHora.setText("REGISTRAR HORAS");
        btnHora.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoraActionPerformed(evt);
            }
        });

        btnSalario.setBackground(new java.awt.Color(58, 96, 125));
        btnSalario.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        btnSalario.setForeground(new java.awt.Color(255, 255, 255));
        btnSalario.setText("REGISTRAR SALARIO");
        btnSalario.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalarioActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(58, 96, 125));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestion de planilla");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(330, 330, 330))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btncerrar.setBackground(new java.awt.Color(58, 96, 125));
        btncerrar.setFont(new java.awt.Font("Myanmar Text", 1, 14)); // NOI18N
        btncerrar.setForeground(new java.awt.Color(58, 96, 125));
        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back.png"))); // NOI18N
        btncerrar.setText("REGRESAR AL MENU");
        btncerrar.setToolTipText("");
        btncerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncerrarMouseEntered(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(58, 96, 125));
        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(58, 96, 125));
        jLabel9.setText("Seleccionar un registro");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(684, 684, 684)
                            .addComponent(btncerrar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(81, 81, 81)
                            .addComponent(btnDia, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(btnHora, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(btnSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addComponent(btncerrar)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiaActionPerformed
    
        int filaSeleccionada = tbPlanilla.getSelectedRow();
    
    
        if (filaSeleccionada != -1) {
            // Obtener los datos de la fila seleccionada
            int idEmpleado = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 0).toString());
            String fecha = modelo.getValueAt(filaSeleccionada, 3).toString(); 

            // Actualizar la hora de salida en la base de datos
            clsNPlanilla objNPla = new clsNPlanilla();
            boolean exito = objNPla.mtdActualizarDia(idEmpleado, fecha);

            if (exito) {
                JOptionPane.showMessageDialog(null, "correctamente.");
                ListarPlanilla();
            } else {
                JOptionPane.showMessageDialog(null, "Error .");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila.");
        }
        
    }//GEN-LAST:event_btnDiaActionPerformed

    private void tbPlanillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPlanillaMouseClicked
        
    }//GEN-LAST:event_tbPlanillaMouseClicked

    private void btnHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoraActionPerformed
        
        int filaSeleccionada = tbPlanilla.getSelectedRow();
    
    
        if (filaSeleccionada != -1) {
            // Obtener los datos de la fila seleccionada
            int idEmpleado = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 0).toString());
            String fecha = modelo.getValueAt(filaSeleccionada, 3).toString(); 

            // Actualizar la hora de salida en la base de datos
            clsNPlanilla objNPla = new clsNPlanilla();
            boolean exito = objNPla.mtdActualizarHora(idEmpleado, fecha);

            if (exito) {
                JOptionPane.showMessageDialog(null, "correctamente.");
                ListarPlanilla();
            } else {
                JOptionPane.showMessageDialog(null, "Error .");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila.");
        }
        
    }//GEN-LAST:event_btnHoraActionPerformed

    private void btnSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalarioActionPerformed
        int filaSeleccionada = tbPlanilla.getSelectedRow();
    
    
        if (filaSeleccionada != -1) {
            // Obtener los datos de la fila seleccionada
            int idEmpleado = Integer.parseInt(modelo.getValueAt(filaSeleccionada, 0).toString());


            // Actualizar la hora de salida en la base de datos
            clsNPlanilla objNPla = new clsNPlanilla();
            boolean exito = objNPla.mtdActualizarSalario(idEmpleado);

            if (exito) {
                JOptionPane.showMessageDialog(null, "correctamente.");
                ListarPlanilla();
            } else {
                JOptionPane.showMessageDialog(null, "Error .");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila.");
        }
    }//GEN-LAST:event_btnSalarioActionPerformed

    private void btncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseClicked

        FrmPrincipal frm = new FrmPrincipal();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncerrarMouseClicked

    private void btncerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseEntered

    }//GEN-LAST:event_btncerrarMouseEntered

    private void ListarPlanilla() {
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Empleado");
        modelo.addColumn("Funcion");
        modelo.addColumn("Fecha");
        modelo.addColumn("Dias"); 
        modelo.addColumn("Horas"); 
        modelo.addColumn("Salario"); 

        
        clsNPlanilla objNPla = new clsNPlanilla();
        
       
        ResultSet rs = objNPla.mtdListarPlanilla(); // Método para obtener los datos de la tabla

        try {
            while (rs.next()) {
                String[] dato = new String[7]; 
                dato[0] = Integer.toString(rs.getInt("id_empleado"));
                dato[1] = rs.getString("empleado_nombre");        
                dato[2] = rs.getString("id_funcion");
                dato[3] = rs.getString("fecha"); 
                dato[4] = rs.getString("dias");
                dato[5] = rs.getString("horas");
                dato[6] = rs.getString("salario_total");
                

                modelo.addRow(dato);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Manejo de excepciones
        }

        tbPlanilla.setModel(modelo);
    }
    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPlanilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPlanilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDia;
    private javax.swing.JButton btnHora;
    private javax.swing.JButton btnSalario;
    private javax.swing.JLabel btncerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPlanilla;
    // End of variables declaration//GEN-END:variables
}
