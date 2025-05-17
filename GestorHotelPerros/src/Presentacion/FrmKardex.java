
package Presentacion;

import Entidad.clsEInventario;
import Entidad.clsEKardex;
import Negocio.clsNInventario;
import Negocio.clsNKardex;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmKardex extends javax.swing.JFrame {

    DefaultTableModel modelo;
    
    DefaultTableModel modeloinventario;
    
    public FrmKardex() {
        initComponents();
        modelo = new DefaultTableModel();
        modeloinventario = new DefaultTableModel();
        
        modelo.addColumn("CODIGO");
        modelo.addColumn("ID INVENTARIO");
        modelo.addColumn("COD. EMPLEADO");
        modelo.addColumn("MOVIMIENTO");
        modelo.addColumn("DESCRIPCION");
        modelo.addColumn("FECHA");
        modelo.addColumn("CANTIDAD");
        
        tblKARDEX.setModel(modelo);
        
        modeloinventario.addColumn("CODIGO");
        modeloinventario.addColumn("CANTIDAD");
        modeloinventario.addColumn("NOMBRE");
        tblArticulo.setModel(modeloinventario);
        
        mtdlistar();
        mtdlistarUNICO();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnVer = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKARDEX = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoEmpleado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblArticulo = new javax.swing.JTable();
        txtBuscarInventario = new javax.swing.JTextField();
        btnBuscarInventario = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCantidad_disponible = new javax.swing.JTextField();
        jComboTIPO = new javax.swing.JComboBox<>();
        btncerrar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Cantidad");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(58, 96, 125));
        btnNuevo.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Limpiar");
        btnNuevo.setMargin(new java.awt.Insets(11, 14, 3, 14));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(58, 96, 125));
        btnGuardar.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel2.setText("ID Inventario");

        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        btnVer.setBackground(new java.awt.Color(58, 96, 125));
        btnVer.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnVer.setForeground(new java.awt.Color(255, 255, 255));
        btnVer.setText("Listar");
        btnVer.setMargin(new java.awt.Insets(11, 14, 3, 14));
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Tipo de movimiento");

        tblKARDEX.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "ID INVENTARIO", "EMPLEADO", "MOVIMIENTO", "DESCRIPCION", "FECHA", "CANTIDAD"
            }
        ));
        tblKARDEX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKARDEXMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblKARDEX);

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Descripcion");

        btnBuscar.setBackground(new java.awt.Color(58, 96, 125));
        btnBuscar.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR POR FECHA");
        btnBuscar.setMargin(new java.awt.Insets(11, 14, 3, 14));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(58, 96, 125));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Movimientos de los productos / kardex");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        txtCodigoEmpleado.setText("1");
        txtCodigoEmpleado.setEnabled(false);
        txtCodigoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEmpleadoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel7.setText("Codigo Empleado");

        tblArticulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CODIGO", "CANTIDAD", "NOMBRE"
            }
        ));
        tblArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblArticuloMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblArticulo);

        txtBuscarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarInventarioActionPerformed(evt);
            }
        });

        btnBuscarInventario.setText("BUSCAR ID");
        btnBuscarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarInventarioActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel8.setText("Cantidad disponible");

        txtCantidad_disponible.setEditable(false);
        txtCantidad_disponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidad_disponibleActionPerformed(evt);
            }
        });

        jComboTIPO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "entrada", "salida" }));
        jComboTIPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTIPOActionPerformed(evt);
            }
        });

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
        jLabel9.setText("Lista de Movimientos:");

        jLabel10.setBackground(new java.awt.Color(58, 96, 125));
        jLabel10.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(58, 96, 125));
        jLabel10.setText("Lista de articulos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncerrar)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(110, 110, 110)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtCantidad_disponible, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboTIPO, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(btnBuscarInventario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(8, 8, 8)
                                .addComponent(txtCodigoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(jComboTIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad_disponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarInventario))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar)))
                    .addComponent(btncerrar))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtCodigo.setText("");
        txtCodigoEmpleado.setText("");
        txtDescripcion.setText("");
        txtCantidad.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    String codigoText = txtCodigo.getText().trim();
    String cantidadText = txtCantidad.getText().trim();
    String tipo = (String) jComboTIPO.getSelectedItem();

    // Validar que txtCodigo no esté vacío
    if (codigoText.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione un código.");
        return;
    }

    // Validar que txtCantidad contenga un número positivo
    if (!cantidadText.matches("\\d+") || Integer.parseInt(cantidadText) <= 0) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números positivos en el campo Cantidad.");
        return;
    }
    
    int cantidad = Integer.parseInt(cantidadText);

    int codigo = Integer.parseInt(codigoText); // Convertir el código a entero

    int cantidadDisponible = Integer.parseInt(txtCantidad_disponible.getText());

    if (tipo.equals("salida")) {
        if (cantidadDisponible >= cantidad) {
            guardarMovimiento(codigo, cantidad, tipo);
        } else {
            JOptionPane.showMessageDialog(null, "La cantidad disponible no es suficiente.");
        }
    } else {
        guardarMovimiento(codigo, cantidad, tipo);
    }
}

private void guardarMovimiento(int codigo, int cantidad, String tipo) {
    clsEKardex objAr = new clsEKardex();

    // Set attributes
    objAr.setId_inventario(codigo);
    objAr.setId_empleado(Integer.parseInt(txtCodigoEmpleado.getText()));
    objAr.setTipo_movimiento(tipo);
    objAr.setComentario(txtDescripcion.getText());
    objAr.setCantidad(cantidad);

    clsNKardex objNal = new clsNKardex();

    if (objNal.mtdGuardarKardex(objAr)) {
        JOptionPane.showMessageDialog(null, "GUARDADO");
        mtdlistar();
    } else {
        JOptionPane.showMessageDialog(null, "Error al guardar el artículo");
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed
    
    private void mtdlistar() {
    modelo.setRowCount(0); // Limpiar el modelo de la tabla antes de agregar nuevos datos
    
    clsNKardex objNa = new clsNKardex();
    ResultSet rs = objNa.mtdListarKardex();
    
    try {
        while (rs.next()) {
            String dato[] = new String[7];
            dato[0] = rs.getString("id_movimiento");
            dato[1] = rs.getString("id_inventario");
            dato[2] = rs.getString("id_empleado");
            dato[3] = rs.getString("tipo_movimiento");
            dato[4] = rs.getString("comentarios");
            dato[5] = rs.getString("fecha");
            dato[6] = rs.getString("cantidad");
            modelo.addRow(dato);
        }
    } catch (SQLException ex) {
        // Manejar la excepción (puedes imprimir el error para depuración)
        ex.printStackTrace();
    }
    
    tblKARDEX.setModel(modelo); // Establecer el modelo actualizado en la tabla
}

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed

        mtdlistar();
        
        mtdlistarUNICO();
    }//GEN-LAST:event_btnVerActionPerformed

    private void tblKARDEXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKARDEXMouseClicked

    }//GEN-LAST:event_tblKARDEXMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
  // Obtener el texto del campo de texto y verificar que no esté vacío
    String fechaBusqueda = txtBuscar.getText().trim();
    if (fechaBusqueda.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa una fecha para buscar en el Kardex.", "Campo Vacío", JOptionPane.WARNING_MESSAGE);
        return; // Salir del método si el campo está vacío
    }

    // Crear el objeto clsEKardex con la fecha ingresada
    clsEKardex objEK = new clsEKardex();
    objEK.setFecha(fechaBusqueda);

    // Crear el objeto clsNKardex para realizar la búsqueda
    clsNKardex objNA = new clsNKardex();
    ResultSet rs = objNA.mtdBuscarkardex(objEK);

    // Limpiar el modelo de la tabla antes de agregar nuevos datos
    DefaultTableModel modelo = (DefaultTableModel) tblKARDEX.getModel();
    modelo.setRowCount(0); // Eliminar todas las filas existentes en la tabla

    try {
        // Iterar sobre los resultados del ResultSet
        while (rs.next()) {
            String dato[] = new String[7]; // Ajustar al número de columnas que deseas mostrar
            dato[0] = rs.getString("id_movimiento");
            dato[1] = rs.getString("id_inventario");
            dato[2] = rs.getString("id_empleado");
            dato[3] = rs.getString("tipo_movimiento");
            dato[4] = rs.getString("comentarios");
            dato[5] = rs.getString("fecha");
            dato[6] = rs.getString("cantidad");
            modelo.addRow(dato);
        }
    } catch (SQLException ex) {
        ex.printStackTrace(); // Manejo básico de excepciones, imprime el error en consola
    } finally {
        // Cerrar ResultSet y manejar excepciones
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Establecer el modelo actualizado en la tabla
    tblKARDEX.setModel(modelo);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtCodigoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEmpleadoActionPerformed

    private void tblArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblArticuloMouseClicked

        int fila =tblArticulo.getSelectedRow();
        txtCodigo.setText((String)tblArticulo.getValueAt(fila,0));
        txtCantidad_disponible.setText((String)tblArticulo.getValueAt(fila,1));
        
    }//GEN-LAST:event_tblArticuloMouseClicked

    private void txtBuscarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarInventarioActionPerformed

    private void btnBuscarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarInventarioActionPerformed

   // Obtener el texto del campo de texto y verificar que no esté vacío
    String idInventarioText = txtBuscarInventario.getText().trim();
    if (idInventarioText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa un ID de inventario.", "Campo Vacío", JOptionPane.WARNING_MESSAGE);
        return; // Salir del método si el campo está vacío
    }

    // Convertir el texto a entero
    int idInventario = Integer.parseInt(idInventarioText);

    // Crear el objeto clsEInventario con el ID ingresado
    clsEInventario objEA = new clsEInventario();
    objEA.setId_inventario(idInventario);

    // Crear el objeto clsNInventario para realizar la búsqueda
    clsNInventario objNA = new clsNInventario();
    ResultSet rs = objNA.mtdBuscarArticuloUNICO(objEA);
    
    // Obtener el modelo de la tabla
    DefaultTableModel modeloinventario = (DefaultTableModel) tblArticulo.getModel();
    modeloinventario.setRowCount(0); // Limpiar todas las filas existentes en la tabla

    try {
        // Iterar sobre los resultados del ResultSet
        while (rs.next()) {
            String dato[] = new String[3]; // Ajustar al número de columnas que deseas mostrar

            // Obtener datos específicos del ResultSet
            dato[0] = rs.getString("id_inventario"); // Verificar el nombre exacto de la columna
            dato[1] = rs.getString("stock"); // Verificar el nombre exacto de la columna
            dato[2] = rs.getString("nombre");

            // Agregar fila al modelo de la tabla
            modeloinventario.addRow(dato);
        }
    } catch (SQLException ex) {
        ex.printStackTrace(); // Manejo básico de excepciones, imprime el error en consola
    } finally {
        // Cerrar ResultSet, PreparedStatement y Connection en el orden adecuado
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Establecer el modelo actualizado en la tabla
    tblArticulo.setModel(modeloinventario);
    }//GEN-LAST:event_btnBuscarInventarioActionPerformed

    private void txtCantidad_disponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidad_disponibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidad_disponibleActionPerformed
  
    private void jComboTIPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTIPOActionPerformed

    }//GEN-LAST:event_jComboTIPOActionPerformed

    private void btncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseClicked

        FrmMenuInventario frm = new FrmMenuInventario();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncerrarMouseClicked

    private void btncerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncerrarMouseEntered

    }//GEN-LAST:event_btncerrarMouseEntered

    
private void mtdlistarUNICO() {
    clsNInventario objNc = new clsNInventario();
    ResultSet rs = objNc.mtdListarArticuloUNICO();
    try {
        modeloinventario.setRowCount(0); // Limpiar la tabla antes de listar
        int count = 0; // Contador de filas
        while (rs.next()) {
            String[] dato = new String[3];
            dato[0] = rs.getString("id_inventario");
            dato[1] = rs.getString("stock");
            dato[2] = rs.getString("nombre");
            modeloinventario.addRow(dato);
            count++;
        }
        System.out.println("Número de filas obtenidas: " + count); // Mostrar el número de filas obtenidas
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    tblArticulo.setModel(modeloinventario);   
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
            java.util.logging.Logger.getLogger(FrmKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmKardex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new FrmKardex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarInventario;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel btncerrar;
    private javax.swing.JComboBox<String> jComboTIPO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblArticulo;
    private javax.swing.JTable tblKARDEX;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarInventario;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidad_disponible;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoEmpleado;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
