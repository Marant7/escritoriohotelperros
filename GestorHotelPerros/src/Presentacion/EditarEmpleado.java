
package Presentacion;

import Entidad.*;
import Negocio.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class EditarEmpleado extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public EditarEmpleado() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("GENERO");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("CORREO");
        modelo.addColumn("DNI");
        tblEmpleado.setModel(modelo);
        ajustarTamanioColumnas();
        
        listar();
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btncerrar = new javax.swing.JLabel();
        Cbsexo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Nombre:");

        jLabel5.setText("Genero:");

        jLabel3.setText("Apellido:");

        btnEditar.setBackground(new java.awt.Color(58, 96, 125));
        btnEditar.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefono:");

        jLabel6.setText("Dirección:");

        jLabel7.setText("Correo:");

        jLabel8.setText("ID");

        txtID.setEditable(false);

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
        tblEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmpleado);

        jPanel2.setBackground(new java.awt.Color(58, 96, 125));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Editar Empleado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel9.setBackground(new java.awt.Color(58, 96, 125));
        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(58, 96, 125));
        jLabel9.setText("Seleccione empleado para editar:");

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

        Cbsexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        jLabel10.setText("DNI:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(txtCorreo)
                            .addComponent(txtNombre)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellido)
                            .addComponent(txtTelefono)
                            .addComponent(txtDireccion)
                            .addComponent(Cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10)
                                .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncerrar)
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btncerrar)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void ajustarTamanioColumnas() {
    TableColumnModel columnModel = tblEmpleado.getColumnModel();
    columnModel.getColumn(0).setPreferredWidth(35);  // ID
    columnModel.getColumn(1).setPreferredWidth(260); // NOMBRE
    columnModel.getColumn(2).setPreferredWidth(260); // APELLIDO
    columnModel.getColumn(3).setPreferredWidth(110); // TELEFONO
    columnModel.getColumn(4).setPreferredWidth(100);  // GENERO
    columnModel.getColumn(5).setPreferredWidth(300); // DIRECCION
    columnModel.getColumn(6).setPreferredWidth(150); // CORREO
    }
    private void listar(){
        mtdLimpiarTabla();
        clsNEmpleado objNE = new clsNEmpleado();
        ResultSet rs = objNE.mtdListarEmpleado();
        try {
            while (rs.next()) {
                String dato[] = new String[8];
                dato[0] = rs.getString("id_empleado");
                dato[1] = rs.getString("nombre");
                dato[2] = rs.getString("apellido");
                dato[3] = rs.getString("telefono");
                dato[4] = rs.getString("genero");
                dato[5] = rs.getString("direccion");
                dato[6] = rs.getString("correo");
                dato[7] = rs.getString("usuario");
                modelo.addRow(dato);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        tblEmpleado.setModel(modelo);
    }
    
    
    private void tblEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpleadoMouseClicked
        int fila =tblEmpleado.getSelectedRow();
        txtID.setText((String)tblEmpleado.getValueAt(fila,0));
        txtNombre.setText((String)tblEmpleado.getValueAt(fila,1));
        txtApellido.setText((String)tblEmpleado.getValueAt(fila,2));
        txtTelefono.setText((String)tblEmpleado.getValueAt(fila,3));
        String genero = (String) tblEmpleado.getValueAt(fila, 4);
        txtDireccion.setText((String)tblEmpleado.getValueAt(fila,5));
        txtCorreo.setText((String)tblEmpleado.getValueAt(fila,6));
        txtDni.setText((String)tblEmpleado.getValueAt(fila,7));
        
    }//GEN-LAST:event_tblEmpleadoMouseClicked

    private void btncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseClicked

        FrmMenuEmpleado frm = new FrmMenuEmpleado();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncerrarMouseClicked

    private void btncerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseEntered

    }//GEN-LAST:event_btncerrarMouseEntered

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    clsEEmpleado objEE = new clsEEmpleado();
    clsNEmpleado objNE = new clsNEmpleado();

    // Validar el campo de ID
    String id = txtID.getText().trim();
    if (id.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar un ID");
        return;
    }

    try {
        objEE.setId_empleado(Integer.parseInt(id));
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El ID debe ser un número entero");
        return;
    }

    // Validar el campo de nombre
    String nombre = txtNombre.getText().trim();
    if (nombre.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar un nombre");
        return;
    }
    if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
        JOptionPane.showMessageDialog(null, "El nombre solo puede contener letras");
        return;
    }

    // Validar el campo de apellido
    String apellido = txtApellido.getText().trim();
    if (apellido.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar un apellido");
        return;
    }
    if (!apellido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
        JOptionPane.showMessageDialog(null, "El apellido solo puede contener letras");
        return;
    }

    // Validar el campo de teléfono
    String telefono = txtTelefono.getText().trim();
    if (telefono.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar un teléfono");
        return;
    }
    if (!telefono.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "El teléfono solo puede contener números");
        return;
    }
    if (telefono.length() != 9) {
        JOptionPane.showMessageDialog(null, "El teléfono debe tener exactamente 9 dígitos");
        return;  // Salir del método si el teléfono no tiene exactamente 9 dígitos
    }

    // Validar el campo de género
    String genero = Cbsexo.getSelectedItem().toString().trim();
    if (genero.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar un género");
        return;
    }
    if (!genero.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
        JOptionPane.showMessageDialog(null, "El género solo puede contener letras");
        return;
    }

    // Validar el campo de dirección
    String direccion = txtDireccion.getText().trim();
    if (direccion.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar una dirección");
        return;
    }

    // Validar el campo de correo electrónico
    String correo = txtCorreo.getText().trim();
    if (correo.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar un correo electrónico");
        return;
    }
    if (!correo.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
        JOptionPane.showMessageDialog(null, "El correo electrónico no tiene un formato válido");
        return;
    }
    
    String Dni = txtDni.getText().trim();
    
    if (Dni.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar un DNI");
        return;  // Salir del método si el teléfono está vacío
    }
    
    // Validar que el teléfono contenga solo números
    if (!Dni.matches("\\d+")) {
        JOptionPane.showMessageDialog(null, "El DNI solo puede contener números");
        return;  // Salir del método si el teléfono contiene otros caracteres
    }
    if (Dni.length() != 8) {
        JOptionPane.showMessageDialog(null, "El DNI debe tener exactamente 7 dígitos");
        return;  // Salir del método si el teléfono no tiene exactamente 9 dígitos
    }

    // Si pasa la validación, continuar seteando los atributos del objeto objEE
    objEE.setNombre(nombre);
    objEE.setApellido(apellido);
    objEE.setTelefono(telefono);
    objEE.setGenero(genero);
    objEE.setDireccion(direccion);
    objEE.setCorreo(correo);
    objEE.setUsuario(Dni);

    // Llamar al método para editar el empleado
    if (objNE.mtdEditarEmpleado(objEE)) {
        JOptionPane.showMessageDialog(null, "Se editó el empleado correctamente");
        DefaultTableModel model = (DefaultTableModel) tblEmpleado.getModel();
        model.setRowCount(0);
        listar();
        limpiar();
    } else {
        JOptionPane.showMessageDialog(null, "ERROR al editar el empleado");
    }
    }//GEN-LAST:event_btnEditarActionPerformed
        private void limpiar(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtCorreo.setText(""); 
        txtDni.setText("");
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
            java.util.logging.Logger.getLogger(EditarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarEmpleado().setVisible(true);
            }
        });
    }
    private void mtdLimpiarTabla() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cbsexo;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel btncerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}



