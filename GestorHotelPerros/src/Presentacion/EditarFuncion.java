
package Presentacion;

import Entidad.clsEFuncion;
import Negocio.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class EditarFuncion extends javax.swing.JFrame {
    
    
    DefaultTableModel modelo2;
    public EditarFuncion() {
        initComponents();
        modelo2 = new DefaultTableModel();
        modelo2.addColumn("ID");
        modelo2.addColumn("EMPLEADO");
        modelo2.addColumn("DESCRIPCION");
        modelo2.addColumn("FECHA INICIO");
        modelo2.addColumn("FECHA FIN");
        modelo2.addColumn("SALARIO");
        modelo2.addColumn("ESTADO");        
        tblFunciones.setModel(modelo2);
        ajustarTamanioColumnas();
        listar2();
        
    }

    private void listar2() {
        mtdLimpiarTabla(modelo2);
        clsNFuncion objNF = new clsNFuncion();
        ResultSet rs = objNF.mtdListarFuncion();
        try {
            while (rs.next()) {
                String dato[] = new String[7];
                dato[0] = rs.getString("id_funcion");
                dato[1] = rs.getString("id_empleado");
                dato[2] = rs.getString("descripcion");
                dato[3] = rs.getString("inicio_contratacion");
                dato[4] = rs.getString("fin_contratacion");
                dato[5] = rs.getString("salario");
                dato[6] = rs.getString("estado");
                modelo2.addRow(dato);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        tblFunciones.setModel(modelo2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFunciones = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdFuncion = new javax.swing.JTextField();
        txtFin_Contratacion = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        txtFuncion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        btnEditar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btncerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblFunciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblFunciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFuncionesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblFunciones);

        jLabel5.setText("Salario");

        jLabel4.setText("Fin de Contratación");

        jLabel7.setText("ID Funcion:");

        txtIdFuncion.setEditable(false);

        jLabel8.setText("Funcion:");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
        cmbEstado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cmbEstadoMouseDragged(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(58, 96, 125));
        btnEditar.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setMargin(new java.awt.Insets(10, 14, 3, 14));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(58, 96, 125));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Editar funcion de empleado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel9.setBackground(new java.awt.Color(58, 96, 125));
        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(58, 96, 125));
        jLabel9.setText("Seleccione empleado:");

        jLabel10.setBackground(new java.awt.Color(58, 96, 125));
        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(58, 96, 125));
        jLabel10.setText("Cambie el estado : ");

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
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncerrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(txtIdFuncion)
                                .addComponent(jLabel4)
                                .addComponent(txtFin_Contratacion)
                                .addComponent(txtSalario)
                                .addComponent(txtFuncion)
                                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(8, 8, 8)
                        .addComponent(txtIdFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFin_Contratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(2, 2, 2)
                        .addComponent(txtFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addGap(2, 2, 2)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncerrar)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void ajustarTamanioColumnas() {
    TableColumnModel columnModel = tblFunciones.getColumnModel();
    columnModel.getColumn(0).setPreferredWidth(35);  // ID
    columnModel.getColumn(1).setPreferredWidth(35); // NOMBRE
    columnModel.getColumn(2).setPreferredWidth(300); // APELLIDO
    columnModel.getColumn(3).setPreferredWidth(150); // TELEFONO
    columnModel.getColumn(4).setPreferredWidth(150);  // GENERO
    columnModel.getColumn(5).setPreferredWidth(80); // DIRECCION
    columnModel.getColumn(6).setPreferredWidth(90); // CORREO
    }
    
    private void tblFuncionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFuncionesMouseClicked
        int fila = tblFunciones.getSelectedRow();
        txtIdFuncion.setText((String) tblFunciones.getValueAt(fila, 0));
        txtFin_Contratacion.setText((String) tblFunciones.getValueAt(fila, 4));
        txtSalario.setText((String) tblFunciones.getValueAt(fila, 5));
        txtFuncion.setText((String) tblFunciones.getValueAt(fila, 2));
    }//GEN-LAST:event_tblFuncionesMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
     // Obtener los valores de los campos de texto y combo box
    String idFuncionText = txtIdFuncion.getText().trim();
    String finContratacionText = txtFin_Contratacion.getText().trim();
    String salarioText = txtSalario.getText().trim();
    String estado = (String) cmbEstado.getSelectedItem();
    String descripcion = txtFuncion.getText().trim();

    // Verificar que los campos no estén vacíos
    if (idFuncionText.isEmpty() ||  salarioText.isEmpty() || estado == null || descripcion.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        return; // Detener la ejecución si algún campo está vacío
    }

    // Verificar que los campos numéricos sean válidos
    int idFuncion;
    int salario;
    try {
        idFuncion = Integer.parseInt(idFuncionText);
        salario = Integer.parseInt(salarioText);

        // Validar que el salario sea positivo
        if (salario <= 0) {
            JOptionPane.showMessageDialog(null, "El salario debe ser un número entero positivo.");
            return; // Detener la ejecución si el salario no es positivo
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El ID de función y el salario deben ser números enteros válidos.");
        return; // Detener la ejecución si hay errores de formato numérico
    }

    // Convertir la fecha al formato requerido por MySQL si no está vacía
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    Date finContratacion = null;
    if (!finContratacionText.isEmpty()) {
        try {
            finContratacion = sdf.parse(finContratacionText);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Fecha de fin de contratación inválida. Formato esperado: YYYY-MM-DD.");
            return; // Detener la ejecución si la fecha no tiene el formato esperado
        }
    }

    // Crear objeto clsEFuncion y clsNFuncion
    clsEFuncion objEF = new clsEFuncion();
    clsNFuncion objNF = new clsNFuncion();

    // Setear los atributos en el objeto clsEFuncion
    objEF.setId_funcion(idFuncion);
    objEF.setFin_contratacion(finContratacion != null ? sdf.format(finContratacion) : null); // Guardar la fecha en formato MySQL o null
    objEF.setSalario(salario);
    objEF.setEstado(estado);
    objEF.setDescripcion(descripcion);

    // Guardar la función y verificar si se guardó correctamente
    try {
        if (objNF.mtdEditarFuncion(objEF)) {
            JOptionPane.showMessageDialog(null, "Se editó la función correctamente");
            listar2();  // Actualizar la lista después de la edición
        } else {
            JOptionPane.showMessageDialog(null, "Error al editar la función");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void cmbEstadoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbEstadoMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstadoMouseDragged

    private void btncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseClicked
        FrmMenuEmpleado frm = new FrmMenuEmpleado();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncerrarMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EditarFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarFuncion().setVisible(true);
            }
        });
    }
    private void mtdLimpiarTabla(DefaultTableModel modelo) {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel btncerrar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblFunciones;
    private javax.swing.JTextField txtFin_Contratacion;
    private javax.swing.JTextField txtFuncion;
    private javax.swing.JTextField txtIdFuncion;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
