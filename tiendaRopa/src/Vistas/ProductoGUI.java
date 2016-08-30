package Vistas;

import D.CategoriaDAO;
import D.ProductoDao;
import D.ProveedorDAO;
import mo.ProductoTo;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author D
 */
public class ProductoGUI extends javax.swing.JDialog {

    ResultSet rs;
    ProveedorDAO proveedorDAO = new ProveedorDAO();
    CategoriaDAO categoriaDAO = new CategoriaDAO();
    ProductoDao productoDao = new ProductoDao();
    String codigoCategoria;
    String codigoProveedor;
    boolean sw;

    public ProductoGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        setTitle("Vista de Producto");
        setLocationRelativeTo(this);
        txtBuscar.grabFocus();
        label();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCargar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        panelVistas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        cboCategoria = new javax.swing.JComboBox();
        cboProveedor = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtMedida = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnnewCategoria = new javax.swing.JButton();
        btnnewProveedor = new javax.swing.JButton();
        panelBotones = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lblImagen1 = new javax.swing.JLabel();
        lblImagen2 = new javax.swing.JLabel();
        lblImagen3 = new javax.swing.JLabel();
        lblImagen4 = new javax.swing.JLabel();
        lblImagen5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargar.png"))); // NOI18N
        btnCargar.setBorderPainted(false);
        btnCargar.setContentAreaFilled(false);
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        tblRegistro.setBackground(new java.awt.Color(255, 255, 204));
        tblRegistro.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        tblRegistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblRegistro.setForeground(new java.awt.Color(0, 0, 153));
        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "categoria", "proveedor", "marca", "PrecioCompra", "PrecioVenta", "medida", "cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRegistro.setFocusable(false);
        tblRegistro.setOpaque(false);
        tblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistro);

        panelVistas.setOpaque(false);

        jLabel3.setText("categoria:");

        jLabel2.setText("Codigo:");

        txtCodigo.setEditable(false);

        jLabel9.setText("Cantidad:");

        jLabel8.setText("Medida:");

        jLabel7.setText("PrecioVenta:");

        txtPrecioVenta.setEditable(false);

        jLabel5.setText("Marca:");

        txtMarca.setEditable(false);

        jLabel6.setText("PrecioCompra:");

        txtPrecioCompra.setEditable(false);

        cboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCategoriaActionPerformed(evt);
            }
        });

        cboProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cboProveedorMouseClicked(evt);
            }
        });
        cboProveedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboProveedorItemStateChanged(evt);
            }
        });
        cboProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProveedorActionPerformed(evt);
            }
        });

        jLabel4.setText("Proveedor:");

        jPanel1.setOpaque(false);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGrabar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir))
        );

        txtMedida.setEditable(false);

        txtCantidad.setEditable(false);

        btnnewCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewCategoriaActionPerformed(evt);
            }
        });

        btnnewProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVistasLayout = new javax.swing.GroupLayout(panelVistas);
        panelVistas.setLayout(panelVistasLayout);
        panelVistasLayout.setHorizontalGroup(
            panelVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVistasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelVistasLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel5)
                        .addGroup(panelVistasLayout.createSequentialGroup()
                            .addGroup(panelVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(18, 18, 18)
                            .addGroup(panelVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPrecioVenta)
                                .addComponent(txtMedida)
                                .addComponent(txtCantidad))))
                    .addGroup(panelVistasLayout.createSequentialGroup()
                        .addGroup(panelVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVistasLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(40, 40, 40))
                            .addGroup(panelVistasLayout.createSequentialGroup()
                                .addGroup(panelVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(28, 28, 28)))
                        .addGroup(panelVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMarca)
                            .addComponent(cboCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnnewCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnnewProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelVistasLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelVistasLayout.setVerticalGroup(
            panelVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVistasLayout.createSequentialGroup()
                .addGroup(panelVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelVistasLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5))
                    .addGroup(panelVistasLayout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(panelVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnnewCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(panelVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnnewProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelVistasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        panelBotones.setOpaque(false);

        btnCancelar.setBackground(new java.awt.Color(204, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setMaximumSize(new java.awt.Dimension(556, 596));
        jLabel10.setMinimumSize(new java.awt.Dimension(556, 596));
        jLabel10.setName(""); // NOI18N

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/leche gloria.jpg"))); // NOI18N
        lblImagen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblImagen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(153, 255, 51));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 255, 255));
        jLabel12.setText("::PRODUCTOS::");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        lblImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo4915.jpg"))); // NOI18N
        lblImagen1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblImagen1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblImagen2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblImagen2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblImagen3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblImagen3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblImagen4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblImagen4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblImagen5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblImagen5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(19, 19, 19)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelVistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblImagen5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblImagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(3, 10, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCargar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelVistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblImagen5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblImagen4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cboProveedorMouseClicked
//    new ProveedorGUI(null, true).setVisible(true);
    }//GEN-LAST:event_cboProveedorMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitaControles(true);
        limpiaControles();
        sw = true;
        cargaCombo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        try {
            String mensaje;
            ProductoTo to = new ProductoTo();
            codigoCategoria = obtenerCodigoCategoria();
            codigoProveedor = obtenerCodigoProveedor();
            to.setCodCategoria(codigoCategoria);
            to.setCodProveedor(codigoProveedor);
            to.setMarca(txtMarca.getText().toLowerCase());
            to.setPrecioCompra(Double.parseDouble(txtPrecioCompra.getText()));
            to.setPrecioVenta(Double.parseDouble(txtPrecioVenta.getText()));
            to.setMedida(txtMedida.getText().toLowerCase());
            to.setCantidad(Integer.parseInt(txtCantidad.getText()));
            if (sw) {
                productoDao.insertraProducto(to);
                mensaje = "Registro Grabado";
            } else {
                to.setCodProducto(txtCodigo.getText());
                productoDao.ModificarProducto(to);
                mensaje = "Registro modificado";
            }
            habilitaControles(false);
            limpiaControles();
            JOptionPane.showMessageDialog(this, mensaje);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Sin registro");
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void cboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCategoriaActionPerformed
        btnnewCategoria.setEnabled(true);
        btnnewProveedor.setEnabled(true);
    }//GEN-LAST:event_cboCategoriaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            ProductoTo to = new ProductoTo();
            to.setCodProducto(txtCodigo.getText().toLowerCase());
            int opc = JOptionPane.showConfirmDialog(this, "Desea Elimar", "cuadro de advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opc == JOptionPane.YES_OPTION) {
                productoDao.EliminarProducto(to);
                JOptionPane.showMessageDialog(this, "Producto Eliminado");
                limpiaControles();
                cargaRegistros();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        cargaRegistros();
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistroMouseClicked
        muestraRegistro();
        habilitaControles(false);
    }//GEN-LAST:event_tblRegistroMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        habilitaControles(false);
        muestraRegistro();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int opc = JOptionPane.showConfirmDialog(this, "Desea salir", "cuadro de advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (opc == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnnewCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewCategoriaActionPerformed
        new CategoriaGUI(null, true).setVisible(true);
        btnnewCategoria.setEnabled(false);
    }//GEN-LAST:event_btnnewCategoriaActionPerformed

    private void btnnewProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewProveedorActionPerformed
        new ProveedorGUI(null, true).setVisible(true);
        btnnewProveedor.setEnabled(false);
    }//GEN-LAST:event_btnnewProveedorActionPerformed

    private void cboProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProveedorActionPerformed
    }//GEN-LAST:event_cboProveedorActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        habilitaControles(true);
        sw = false;
        cboCategoria.removeAllItems();
        cboProveedor.removeAllItems();
        cargaCombo();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void cboProveedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboProveedorItemStateChanged
    }//GEN-LAST:event_cboProveedorItemStateChanged

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        FacturaGUI.txtCodigo.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 0).toString());
        FacturaGUI.txtCategoria.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 1).toString());
        FacturaGUI.txtMarca.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 3).toString());
        FacturaGUI.txtPrecio.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 4).toString());
        FacturaGUI.lblMedida.setText(tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 6).toString());
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
    private javax.swing.JButton btnnewCategoria;
    private javax.swing.JButton btnnewProveedor;
    private javax.swing.JComboBox cboCategoria;
    public static javax.swing.JComboBox cboProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblImagen3;
    private javax.swing.JLabel lblImagen4;
    private javax.swing.JLabel lblImagen5;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelVistas;
    private javax.swing.JTable tblRegistro;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMedida;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables

    private void cargaRegistroCboProveedor() {
        try {
            rs = proveedorDAO.cargaRegistro();
            while (rs.next()) {
                cboProveedor.addItem(rs.getString(2).toString());
            }
        } catch (Exception e) {
        }
    }

    private void habilitaControles(boolean b) {
        JButton[] btn = {
            btnEliminar, btnModificar, btnNuevo, btnSalir
        };
        for (JButton btnt : btn) {
            btnt.setEnabled(!b);
        }
        btnCancelar.setEnabled(b);
        btnGrabar.setEnabled(b);
        JTextField[] txt = {
            txtMarca, txtPrecioCompra, txtPrecioVenta, txtMedida, txtCantidad
        };
        for (JTextField field : txt) {
            field.setEditable(b);
        }

    }

    private void limpiaControles() {
        JTextField[] txt = {
            txtCodigo, txtMarca, txtPrecioCompra, txtPrecioVenta, txtMedida, txtCantidad
        };
        for (JTextField field : txt) {
            field.setText("");
        }
        cboCategoria.removeAllItems();
        cboProveedor.removeAllItems();
    }

    private void cargaCombo() {

        cargaRegistroCboProveedor();
        cargaRegistroCboCategoria();
    }

    private void cargaRegistroCboCategoria() {
        try {
            rs = categoriaDAO.cargaCategoria();
            while (rs.next()) {
                cboCategoria.addItem(rs.getString(2).toString());
            }
        } catch (Exception e) {
        }
    }

    private String obtenerCodigoCategoria() {
        try {
            rs = categoriaDAO.cargaCategoria();
            while (rs.next()) {

                if (cboCategoria.getSelectedItem().equals(rs.getString(2).toString())) {
                    codigoCategoria = rs.getString(1);
                }
            }

        } catch (Exception e) {
        }
        return codigoCategoria;
    }

    private String obtenerCodigoProveedor() {
        try {
            rs = proveedorDAO.cargaRegistro();
            while (rs.next()) {
                if (cboProveedor.getSelectedItem().equals(rs.getString(2).toString())) {
                    codigoProveedor = rs.getString(1);
                }
            }
        } catch (Exception e) {
        }
        return codigoProveedor;
    }

    private void cargaRegistros() {
        try {
            String nombre = txtBuscar.getText().toLowerCase();
            rs = productoDao.buscaRegistro(nombre);
            DefaultTableModel model = (DefaultTableModel) tblRegistro.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            if (txtBuscar.getText().isEmpty()) {
            } else {
                while (rs.next()) {
                    Object[] registro = {
                        rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)
                    };
                    model.addRow(registro);
                }
            }
        } catch (Exception e) {
        }
    }

    private void muestraRegistro() {
        try {
            String muestra = tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 0).toString();
            rs = productoDao.cargaRegistro();
            while (rs.next()) {
                if (muestra.equals(rs.getString(1))) {
                    txtCodigo.setText(rs.getString(1));
                    cboCategoria.removeAllItems();
                    cboCategoria.addItem(rs.getString(2));
                    cboProveedor.removeAllItems();
                    cboProveedor.addItem(rs.getString(3));
                    txtMarca.setText(rs.getString(4));
                    txtPrecioCompra.setText(rs.getString(5));
                    txtPrecioVenta.setText(rs.getString(6));
                    txtMedida.setText(rs.getString(7));
                    txtCantidad.setText(rs.getString(8));
                }

            }
            MuestraImagenes();
        } catch (Exception e) {
        }
    }

    private void label() {

        JLabel[] lb = {
            lblImagen, lblImagen1, lblImagen2
        };
        for (JLabel lbl : lb) {
            lbl.setVisible(false);
        }
    }

    private void MuestraImagenes() {
        String ima = tblRegistro.getValueAt(tblRegistro.getSelectedRow(), 2).toString();
        if (ima.equals("gloria s.a")) {
            label();
            lblImagen.setVisible(true);
        } else {
            if (ima.equals("alicorp s.a")) {
                label();
                lblImagen1.setVisible(true);
            }
            else{
                label();
            }
        }
    }

}
