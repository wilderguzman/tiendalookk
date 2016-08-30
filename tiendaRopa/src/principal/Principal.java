package principal;

import Vistas.AccesoGUI;
import java.awt.Color;
import javax.swing.UIManager;
/**
 *
 * @author D
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {e.printStackTrace();
        }
        setUndecorated(true);
        initComponents();
        IniciarCarga();
        mustarCarga();
        setLocationRelativeTo(this);
        pack();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progresB = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progresB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                progresBStateChanged(evt);
            }
        });
        getContentPane().add(progresB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 566, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPrincipal2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 566, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void progresBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_progresBStateChanged
if(progresB.getValue()==100){
    AccesoGUI o=new AccesoGUI();
    o.setVisible(true);
    this.dispose();
}    
    }//GEN-LAST:event_progresBStateChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar progresB;
    // End of variables declaration//GEN-END:variables

    private void IniciarCarga() {
new Thread(){
    public void run(){
        int x=0;
        double y=0;
        while (x<=101&&y<=101) {            
            y+=0.25;
            x+=y;
            progresB.setValue(x);
            try {
                sleep(101);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}.start();}

    private void mustarCarga() {
progreso().setForeground(new Color(0,0,0));
progreso().setStringPainted(true);
    }
    public javax.swing.JProgressBar progreso(){
        return progresB;
    }


}
