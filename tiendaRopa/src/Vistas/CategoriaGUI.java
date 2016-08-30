package Vistas;

import D.CategoriaDAO;
import mo.CategoriaTo;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author D
 */
public class CategoriaGUI extends javax.swing.JDialog {

    CategoriaDAO cdao = new CategoriaDAO();
    ResultSet rs;

    public CategoriaGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocation(150, 150);
        setResizable(false);
        setTitle("Insertar categorias");
        getRootPane().setDefaultButton(btnGrabar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre:");

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGrabar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrabar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        try {
            CategoriaTo to = new CategoriaTo();
            to.setNombre(txtNombre.getText().trim());
            String nombre = txtNombre.getText().toString();
            rs = cdao.cargaCategoria();
            if (txtNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Ingrese un Nombre");
                txtNombre.grabFocus();
            } 
            else {
                while (rs.next()) {
                    if (nombre.equals(rs.getString(2))) {}
                    else {
                        cdao.Insertar(to);
                        JOptionPane.showMessageDialog(rootPane, "Registro Grabado");
                        txtNombre.setText("");
                    }
                    rs.last();
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Registro Existente");
            txtNombre.getText();
            txtNombre.grabFocus();
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
