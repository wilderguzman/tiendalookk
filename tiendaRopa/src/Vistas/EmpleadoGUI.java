package Vistas;

import D.EmpleadoDAO;
import static Vistas.ProductoGUI.cboProveedor;
import mo.EmpleadoTo;
import java.awt.Image;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
//import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author D
 */
public class EmpleadoGUI extends javax.swing.JDialog {

    String rutaimagen;
    ResultSet rs;
    EmpleadoDAO empleadoDAO = new EmpleadoDAO();
    boolean sw;

    public EmpleadoGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        setTitle("Control de los empleados");
//        label();
//        rutaimagen = "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnCargar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistros = new javax.swing.JTable();
        txtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnSubir = new javax.swing.JButton();
        panelBotones = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 309, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 255));
        jLabel2.setText(":::REGISTRO DEL EMPLEADO:::");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel2)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 498, -1));

        jLabel3.setText("Empleado:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 91, -1, -1));

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 88, 272, -1));

        btnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargar.png"))); // NOI18N
        btnCargar.setContentAreaFilled(false);
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 76, 64, -1));

        tblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "DNI", "Apellidos", "Nombres", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRegistros.getTableHeader().setReorderingAllowed(false);
        tblRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistros);
        if (tblRegistros.getColumnModel().getColumnCount() > 0) {
            tblRegistros.getColumnModel().getColumn(0).setResizable(false);
            tblRegistros.getColumnModel().getColumn(1).setResizable(false);
            tblRegistros.getColumnModel().getColumn(2).setResizable(false);
            tblRegistros.getColumnModel().getColumn(3).setResizable(false);
            tblRegistros.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 148, 464, 120));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 306, 123, -1));

        jLabel4.setText("DNI:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 309, -1, -1));

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        getContentPane().add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 306, 114, -1));

        jLabel5.setText("Nombres:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 347, -1, -1));
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 344, 123, -1));

        jLabel6.setText("Apellidos:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 347, -1, -1));
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 344, 112, -1));

        jLabel7.setText("Telefono:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 385, -1, -1));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 382, 123, -1));

        btnSubir.setText("Subir");
        btnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubir, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 103, 34));

        panelBotones.setOpaque(false);

        btnCancelar.setBackground(new java.awt.Color(204, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 279, -1, -1));

        jPanel2.setOpaque(false);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGrabar)
                    .addComponent(btnNuevo)
                    .addComponent(btnSalir)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 502, -1, -1));

        lblMensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 382, 161, 21));

        lblImagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 150, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirActionPerformed
//        //creamos un objeto de JFILECHOOSER para que se abra una ventada de exploracion de archivos
//        JFileChooser dlg = new JFileChooser();
//        //del objeto creado llamados al metodo setFileFilter para que solo busque archivos con extension .jpg
//        dlg.setFileFilter(filter);
//        //Abre la ventana de dialogo
//        int option = dlg.showOpenDialog(this);
//        //Si hace click en el boton abrir del dialogo
//        if (option == JFileChooser.APPROVE_OPTION) {
//            //Obtiene nombre del archivo seleccionado
//            String fil = dlg.getSelectedFile().getPath();
//            //se obtiene la direccion donde se guardara la imagen
//            String file = dlg.getSelectedFile().toString();
//            lblImagen.setIcon(new ImageIcon(fil));
//            //Modificando la imagen
//            ImageIcon icon = new ImageIcon(fil);
//            //Se extrae la imagen del icono
//            Image img = icon.getImage();
//            //Se modifica su tamaño
//            Image newimg = img.getScaledInstance(155, 175, java.awt.Image.SCALE_SMOOTH);
//            //SE GENERA EL IMAGE ICON CON LA NUEVA IMAGEN
//            ImageIcon newIcon = new ImageIcon(newimg);
//            //Se coloca el nuevo icono modificado
//            lblImagen.setIcon(newIcon);
//            //Se cambia el tamaño de la etiqueta
//            lblImagen.setSize(155, 175);
//            //            TXTRUTAFOTO.setText(fil);
//            rutaimagen = "foto";//seletamos la variable local con la ruta de la imagen
//
//        }
    }//GEN-LAST:event_btnSubirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        habilitacotroles(true);
        sw = false;

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            EmpleadoTo to = new EmpleadoTo();
            int opc = JOptionPane.showConfirmDialog(rootPane, "Desea eliminar a ", "mensaje de advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opc == JOptionPane.OK_OPTION) {
                empleadoDAO.EliminarEmpleado(to);
                JOptionPane.showMessageDialog(rootPane, "Registro Eliminado");
                cargaEmpleado();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitacotroles(true);
        limpiaControles();
        sw = true;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        try {
            String mensaje = null;
            EmpleadoTo to = new EmpleadoTo();
            to.setDNI(txtDni.getText());
            to.setNombres(txtNombres.getText());
            to.setApellidos(txtApellidos.getText());
            to.setTelefono(txtTelefono.getText());

            if (txtDni.getText().isEmpty()) {
                mensaje = "Sin Registros";
                empleadoDAO.InsertarEmpleado(null);
            } else {
                if (sw) {
                    empleadoDAO.InsertarEmpleado(to);
                    mensaje = "Registro Grabado";
                } else {
                    to.setCodEmpelado(txtCodigo.getText());
                    empleadoDAO.ModificarEmpleado(to);
                    mensaje = "Registro Modificado";
                }
            }
            JOptionPane.showMessageDialog(rootPane, mensaje);

            habilitacotroles(false);
            limpiaControles();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "El empleado ya Existe");
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "Desea salir", "cuadro de advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opc == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyReleased
        if (!txtDni.getText().matches("[0-9--]*")) {
            lblMensaje.setText("no letras");
            txtDni.setText("");
            txtDni.grabFocus();

        } else {
            lblMensaje.setText("");
        }
    }//GEN-LAST:event_txtDniKeyReleased

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        if (txtDni.getText().length() == 8) {
            lblMensaje.setText("Demaciados Digitos");
            txtDni.grabFocus();
            txtDni.setText("");
        }

    }//GEN-LAST:event_txtDniKeyTyped

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        cargaEmpleado();
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void tblRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistrosMouseClicked
        muestraRegistros();
    }//GEN-LAST:event_tblRegistrosMouseClicked

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        if (!txtTelefono.getText().matches("[0-9--]*")) {
            lblMensaje.setText("no letras");
            txtTelefono.setText("");
        } else {
            lblMensaje.setText("");
        }
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (txtTelefono.getText().length() == 9) {
            lblMensaje.setText("muchos numeros");
            txtTelefono.setText("");
            txtTelefono.grabFocus();
        }

    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        FacturaGUI.txtCodigoEmpleado.setText(tblRegistros.getValueAt(tblRegistros.getSelectedRow(), 0).toString());
        FacturaGUI.txtNombres.setText(tblRegistros.getValueAt(tblRegistros.getSelectedRow(), 3).toString());
        FacturaGUI.txtApellidos.setText(tblRegistros.getValueAt(tblRegistros.getSelectedRow(), 2).toString());
        dispose();
    }//GEN-LAST:event_btnCargarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSubir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JTable tblRegistros;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables

    private void habilitacotroles(boolean b) {
        JTextField[] txt = {
            txtApellidos, txtCodigo, txtDni, txtNombres, txtTelefono
        };
        for (JTextField field : txt) {
            field.setEditable(b);
        }
        JButton[] btn = {
            btnGrabar, btnCancelar
        };
        for (JButton btnt : btn) {
            btnt.setEnabled(b);
        }
        btnNuevo.setEnabled(!b);
        btnModificar.setEnabled(!b);
        btnEliminar.setEnabled(!b);
        btnSalir.setEnabled(!b);
    }

    private void limpiaControles() {
        JTextField[] txt = {
            txtApellidos, txtCodigo, txtDni, txtNombres, txtTelefono
        };
        for (JTextField field : txt) {
            field.setText("");
        }
        txtbuscar.grabFocus();
    }

    private void cargaEmpleado() {

        try {
            DefaultTableModel model = (DefaultTableModel) tblRegistros.getModel();
            String Bnombre = txtbuscar.getText().toString();
            String Bdni = txtbuscar.getText().toString();
            rs = empleadoDAO.buscarEmpleado(Bnombre, Bdni);
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            if (txtbuscar.getText().isEmpty()) {
            } else {
                while (rs.next()) {
                    Object[] registro = {
                        rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)
                    };
                    model.addRow(registro);
                }
            }
        } catch (Exception e) {
        }
    }

    private void muestraRegistros() {

        try {
            String muestra = tblRegistros.getValueAt(tblRegistros.getSelectedRow(), 0).toString();
            rs = empleadoDAO.cargaRegistros();
            while (rs.next()) {
                if (muestra.equals(rs.getString(1))) {
                    txtCodigo.setText(rs.getString(1));
                    txtDni.setText(rs.getString(2));
                    txtNombres.setText(rs.getString(3));
                    txtApellidos.setText(rs.getString(4));
                    txtTelefono.setText(rs.getString(5));
                }
            }
            muestraImagen();
        } catch (Exception e) {
        }
    }

    private void muestraImagen() {
        ImageIcon imagen[] = new ImageIcon[5];
        String cadena = "E000";
        String codigo;
        String cod = tblRegistros.getValueAt(tblRegistros.getSelectedRow(), 0).toString();
        
        for (int i = 1; i < 5; i++) {
            imagen[i] = new ImageIcon(getClass().getResource("/Gui/Foto/E000" + i + ".jpg"));
        }
      
        for (int vista = 1; vista < 10; vista++) {
            codigo = cadena + vista;
            if (cod.equals(codigo)) {
                lblImagen.setIcon(imagen[vista]);
            }
         
        }
    }

}
