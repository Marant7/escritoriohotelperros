
package Presentacion;

import Entidad.*;
import Negocio.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AsignarFuncion extends javax.swing.JFrame {

    DefaultTableModel modelo;
    
    public AsignarFuncion() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        tblEmpleado.setModel(modelo);
        listar();
    }

    
    private void listar(){
        mtdLimpiarTabla();
        clsNEmpleado objNE = new clsNEmpleado();
        ResultSet rs = objNE.mtdListarEmpleadoSinFuncion();
        try {
            while (rs.next()) {
                String dato[] = new String[3];
                dato[0] = rs.getString("id_empleado");
                dato[1] = rs.getString("nombre");
                dato[2] = rs.getString("apellido");
                modelo.addRow(dato);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        tblEmpleado.setModel(modelo);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtInicio_Contratacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        txtCrear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        btncerrar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(58, 96, 125));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Empleado ID");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Descripción:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Inicio de Contratación");

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Salario");

        txtCrear.setBackground(new java.awt.Color(58, 96, 125));
        txtCrear.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        txtCrear.setForeground(new java.awt.Color(255, 255, 255));
        txtCrear.setText("Crear");
        txtCrear.setMargin(new java.awt.Insets(10, 14, 3, 14));
        txtCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCrearActionPerformed(evt);
            }
        });

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEmpleado.setGridColor(new java.awt.Color(58, 96, 125));
        tblEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleado);

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

        jLabel8.setBackground(new java.awt.Color(58, 96, 125));
        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(58, 96, 125));
        jLabel8.setText("Empleados sin funcion asignada");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncerrar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(txtSalario)
                            .addComponent(txtInicio_Contratacion)
                            .addComponent(txtDescripcion)
                            .addComponent(txtIdEmpleado)
                            .addComponent(txtCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInicio_Contratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(txtCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btncerrar)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(58, 96, 125));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ASIGNACION DE FUNCION A EMPLEADO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadoMouseClicked
        int fila =tblEmpleado.getSelectedRow();
        txtIdEmpleado.setText((String)tblEmpleado.getValueAt(fila,0));
       
    }//GEN-LAST:event_tblEmpleadoMouseClicked

    private void txtCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCrearActionPerformed
        clsEFuncion objEF = new clsEFuncion();
    clsNFuncion objNF = new clsNFuncion();

    // Obtener y validar el ID del empleado
    String idEmpleadoStr = txtIdEmpleado.getText().trim();
    if (idEmpleadoStr.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar un ID de empleado");
        return;
    }
    int idEmpleado;
    try {
        idEmpleado = Integer.parseInt(idEmpleadoStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El ID de empleado debe ser un número entero");
        return;
    }

    // Obtener y validar la descripción
    String descripcion = txtDescripcion.getText().trim();
    if (descripcion.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar una descripción");
        return;
    }

    // Obtener y validar la fecha de inicio de contratación
    String inicioContratacionStr = txtInicio_Contratacion.getText().trim();
    if (inicioContratacionStr.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar una fecha de inicio de contratación");
        return;
    }
    Date inicioContratacion = null;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    try {
        inicioContratacion = dateFormat.parse(inicioContratacionStr);
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(null, "El formato de la fecha de inicio de contratación debe ser yyyy-MM-dd");
        return;
    }

    // Obtener y validar el salario
    String salarioStr = txtSalario.getText().trim();
    if (salarioStr.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar un salario");
        return;
    }
    int salario;
    try {
        salario = Integer.parseInt(salarioStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El salario debe ser un número entero");
        return;
    }

    // Guardar la función y verificar si se guardó correctamente
    try {
        if (objNF.mtdGuardarFuncion(idEmpleado, descripcion, inicioContratacion, salario)) {
            JOptionPane.showMessageDialog(null, "Se guardó la función correctamente");
            DefaultTableModel model = (DefaultTableModel) tblEmpleado.getModel();
            model.setRowCount(0);
            listar();
            limpiarDatos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar la función");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_txtCrearActionPerformed

    private void btncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseClicked

        FrmMenuEmpleado frm = new FrmMenuEmpleado();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncerrarMouseClicked

    private void btncerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseEntered

    }//GEN-LAST:event_btncerrarMouseEntered
    private void limpiarDatos() {
    txtIdEmpleado.setText("");
    txtDescripcion.setText("");
    txtInicio_Contratacion.setText("");
    txtSalario.setText("");
    // Limpia cualquier otro campo de texto que sea necesario
    }
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
            java.util.logging.Logger.getLogger(AsignarFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignarFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignarFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignarFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignarFuncion().setVisible(true);
            }
        });
    }
    private void mtdLimpiarTabla() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btncerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JButton txtCrear;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtInicio_Contratacion;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
