
package Vistas;

import Vistas.EmpleadoGUI;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author D
 */
public class MenuGUI extends javax.swing.JFrame {

    
    public MenuGUI() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        setTitle("Sistema de Menu");
        lblFondo.setMaximumSize(new Dimension(1440, 990));
        setIconImage(new ImageIcon("M:\\imagenes aplicativos\\cancelar.jpg").getImage());
      
    }

    MenuGUI(Object object, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        lblFondo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        ArchivoMenu = new javax.swing.JMenu();
        ProductoMenu = new javax.swing.JMenu();
        ComprasProductoMenu = new javax.swing.JMenuItem();
        CategoriaMenu = new javax.swing.JMenuItem();
        AlmacenMenu = new javax.swing.JMenuItem();
        EmpleadoMenu = new javax.swing.JMenuItem();
        ProveedorMenu = new javax.swing.JMenuItem();
        GenerarFacturaItemMenu = new javax.swing.JMenu();
        FacturaMen = new javax.swing.JMenuItem();
        SalirSistemasMenu = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tienda-fondo.jpg"))); // NOI18N
        lblFondo.setAutoscrolls(true);
        lblFondo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        menuBar.setBackground(new java.awt.Color(204, 255, 255));
        menuBar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        ArchivoMenu.setBackground(new java.awt.Color(255, 255, 204));
        ArchivoMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        ArchivoMenu.setMnemonic('f');
        ArchivoMenu.setText("Archivo");
        ArchivoMenu.setContentAreaFilled(false);
        ArchivoMenu.setFocusable(false);

        ProductoMenu.setText("Producto");

        ComprasProductoMenu.setText("Compras");
        ComprasProductoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprasProductoMenuActionPerformed(evt);
            }
        });
        ProductoMenu.add(ComprasProductoMenu);

        CategoriaMenu.setText("Categoria");
        CategoriaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaMenuActionPerformed(evt);
            }
        });
        ProductoMenu.add(CategoriaMenu);

        AlmacenMenu.setText("Almacen");
        AlmacenMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlmacenMenuActionPerformed(evt);
            }
        });
        ProductoMenu.add(AlmacenMenu);

        ArchivoMenu.add(ProductoMenu);

        EmpleadoMenu.setText("Empleado");
        EmpleadoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadoMenuActionPerformed(evt);
            }
        });
        ArchivoMenu.add(EmpleadoMenu);

        ProveedorMenu.setText("Proveedor");
        ProveedorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorMenuActionPerformed(evt);
            }
        });
        ArchivoMenu.add(ProveedorMenu);

        menuBar.add(ArchivoMenu);

        GenerarFacturaItemMenu.setBackground(new java.awt.Color(255, 255, 204));
        GenerarFacturaItemMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        GenerarFacturaItemMenu.setMnemonic('e');
        GenerarFacturaItemMenu.setText("Generar Factura");

        FacturaMen.setMnemonic('t');
        FacturaMen.setText("Generar Factura");
        FacturaMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FacturaMenActionPerformed(evt);
            }
        });
        GenerarFacturaItemMenu.add(FacturaMen);

        menuBar.add(GenerarFacturaItemMenu);

       

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void SalirMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirMenuActionPerformed

    private void FacturaMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FacturaMenActionPerformed
      new FacturaGUI( this, true).setVisible(true);
    }//GEN-LAST:event_FacturaMenActionPerformed

    private void ProveedorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedorMenuActionPerformed
        new ProveedorGUI(this, true).setVisible(true);
    }//GEN-LAST:event_ProveedorMenuActionPerformed

    private void EmpleadoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadoMenuActionPerformed
        new EmpleadoGUI(this, true).setVisible(true);
    }//GEN-LAST:event_EmpleadoMenuActionPerformed

    private void AlmacenMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlmacenMenuActionPerformed
        new AlmacenGUI(this, true).setVisible(true);
    }//GEN-LAST:event_AlmacenMenuActionPerformed

    private void CategoriaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaMenuActionPerformed
        new CategoriaGUI(this, true).setVisible(true);
    }//GEN-LAST:event_CategoriaMenuActionPerformed

    private void ComprasProductoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprasProductoMenuActionPerformed
        new ComprasGui(this, true).setVisible(true);
    }//GEN-LAST:event_ComprasProductoMenuActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AlmacenMenu;
    private javax.swing.JMenu ArchivoMenu;
    private javax.swing.JMenuItem CategoriaMenu;
    private javax.swing.JMenuItem ComprasProductoMenu;
    private javax.swing.JMenuItem EmpleadoMenu;
    private javax.swing.JMenuItem FacturaMen;
    private javax.swing.JMenu GenerarFacturaItemMenu;
    private javax.swing.JMenu ProductoMenu;
    private javax.swing.JMenuItem ProveedorMenu;
    private javax.swing.JMenu SalirSistemasMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}