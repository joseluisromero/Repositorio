package proyecto_sev1;
import clases.Reloj;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.event.MouseEvent;
public class NewJFrame extends JFrameConFondo {
    /** Creates new form New_JFrame */
    public NewJFrame()
    {
        initComponents();
        this.setTitle("***SISTEMA ELECTONICO DE VOTACIONES***");//codigo para titulo en ventana
        setImagen("Recursos/blanco.jpg");//codigo para imagen en Panel
        setLocationRelativeTo(null);// //codigo para que la ventana este siempre centrada
        Reloj modelo=new Reloj();//codigo para crear objeto de clase Reloj
                modelo.addObserver (new Observer()
                 {
                     public void update (Observable unObservable, Object dato)
                     {
                         jLbl_reloj.setText(""+dato);//codigo para mostrar reloj
                     }
                 });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbl_reloj = new javax.swing.JLabel();
        jPnl_MENÚ = new javax.swing.JPanel();
        jBtn_ir_votantes = new javax.swing.JButton();
        jBtn_ir_administrador = new javax.swing.JButton();
        jBtn_salir_sistema = new javax.swing.JButton();
        jLbl_imagenVotos = new javax.swing.JLabel();
        jLbl_imagenSEV = new javax.swing.JLabel();
        jLbl_SEV = new javax.swing.JLabel();
        jLbl_SistemaElectronicaVotaciones = new javax.swing.JLabel();
        jLbl_gifBanderaMapa = new javax.swing.JLabel();
        jLbl_gifEcuador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Form"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance().getContext().getResourceMap(NewJFrame.class);
        jLbl_reloj.setBackground(resourceMap.getColor("jLbl_reloj.background")); // NOI18N
        jLbl_reloj.setForeground(resourceMap.getColor("jLbl_reloj.foreground")); // NOI18N
        jLbl_reloj.setText(resourceMap.getString("jLbl_reloj.text")); // NOI18N
        jLbl_reloj.setName("jLbl_reloj"); // NOI18N

        jPnl_MENÚ.setBackground(resourceMap.getColor("jPnl_MENÚ.background")); // NOI18N
        jPnl_MENÚ.setBorder(javax.swing.BorderFactory.createTitledBorder(null, resourceMap.getString("jPnl_MENÚ.border.title"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, resourceMap.getFont("jPnl_MENÚ.border.titleFont"), resourceMap.getColor("jPnl_MENÚ.border.titleColor"))); // NOI18N
        jPnl_MENÚ.setName("jPnl_MENÚ"); // NOI18N

        jBtn_ir_votantes.setFont(resourceMap.getFont("jBtn_salir_sistema.font")); // NOI18N
        jBtn_ir_votantes.setForeground(resourceMap.getColor("jButton1.foreground")); // NOI18N
        jBtn_ir_votantes.setIcon(resourceMap.getIcon("jBtn_ir_votantes.icon")); // NOI18N
        jBtn_ir_votantes.setText(resourceMap.getString("jBtn_ir_votantes.text")); // NOI18N
        jBtn_ir_votantes.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, resourceMap.getColor("jBtn_salir_sistema.border.matteColor"))); // NOI18N
        jBtn_ir_votantes.setName("jBtn_ir_votantes"); // NOI18N
        jBtn_ir_votantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_ir_votantesMouseClicked(evt);
            }
        });

        jBtn_ir_administrador.setFont(resourceMap.getFont("jBtn_salir_sistema.font")); // NOI18N
        jBtn_ir_administrador.setForeground(resourceMap.getColor("jButton1.foreground")); // NOI18N
        jBtn_ir_administrador.setIcon(resourceMap.getIcon("jBtn_ir_administrador.icon")); // NOI18N
        jBtn_ir_administrador.setText(resourceMap.getString("jBtn_ir_administrador.text")); // NOI18N
        jBtn_ir_administrador.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, resourceMap.getColor("jBtn_salir_sistema.border.matteColor"))); // NOI18N
        jBtn_ir_administrador.setName("jBtn_ir_administrador"); // NOI18N
        jBtn_ir_administrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_ir_administradorMouseClicked(evt);
            }
        });

        jBtn_salir_sistema.setFont(resourceMap.getFont("jBtn_salir_sistema.font")); // NOI18N
        jBtn_salir_sistema.setForeground(resourceMap.getColor("jButton1.foreground")); // NOI18N
        jBtn_salir_sistema.setIcon(resourceMap.getIcon("jBtn_salir_sistema.icon")); // NOI18N
        jBtn_salir_sistema.setText(resourceMap.getString("jBtn_salir_sistema.text")); // NOI18N
        jBtn_salir_sistema.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, resourceMap.getColor("jBtn_salir_sistema.border.matteColor"))); // NOI18N
        jBtn_salir_sistema.setName("jBtn_salir_sistema"); // NOI18N
        jBtn_salir_sistema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtn_salir_sistemaMouseClicked(evt);
            }
        });

        jLbl_imagenVotos.setIcon(resourceMap.getIcon("jLbl_imagenVotos.icon")); // NOI18N
        jLbl_imagenVotos.setText(resourceMap.getString("jLbl_imagenVotos.text")); // NOI18N
        jLbl_imagenVotos.setName("jLbl_imagenVotos"); // NOI18N

        javax.swing.GroupLayout jPnl_MENÚLayout = new javax.swing.GroupLayout(jPnl_MENÚ);
        jPnl_MENÚ.setLayout(jPnl_MENÚLayout);
        jPnl_MENÚLayout.setHorizontalGroup(
            jPnl_MENÚLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_MENÚLayout.createSequentialGroup()
                .addGroup(jPnl_MENÚLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnl_MENÚLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLbl_imagenVotos))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPnl_MENÚLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPnl_MENÚLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtn_ir_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn_ir_votantes, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(jBtn_salir_sistema, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPnl_MENÚLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBtn_ir_administrador, jBtn_ir_votantes, jBtn_salir_sistema});

        jPnl_MENÚLayout.setVerticalGroup(
            jPnl_MENÚLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnl_MENÚLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLbl_imagenVotos)
                .addGap(18, 18, 18)
                .addComponent(jBtn_ir_administrador, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtn_ir_votantes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtn_salir_sistema)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPnl_MENÚLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBtn_ir_administrador, jBtn_ir_votantes, jBtn_salir_sistema});

        jLbl_imagenSEV.setIcon(resourceMap.getIcon("jLbl_imagenSEV.icon")); // NOI18N
        jLbl_imagenSEV.setText(resourceMap.getString("jLbl_imagenSEV.text")); // NOI18N
        jLbl_imagenSEV.setName("jLbl_imagenSEV"); // NOI18N

        jLbl_SEV.setFont(resourceMap.getFont("jLbl_SEV.font")); // NOI18N
        jLbl_SEV.setForeground(resourceMap.getColor("jLbl_SEV.foreground")); // NOI18N
        jLbl_SEV.setText(resourceMap.getString("jLbl_SEV.text")); // NOI18N
        jLbl_SEV.setName("jLbl_SEV"); // NOI18N

        jLbl_SistemaElectronicaVotaciones.setFont(resourceMap.getFont("jLbl_SistemaElectronicaVotaciones.font")); // NOI18N
        jLbl_SistemaElectronicaVotaciones.setForeground(resourceMap.getColor("jLbl_SistemaElectronicaVotaciones.foreground")); // NOI18N
        jLbl_SistemaElectronicaVotaciones.setText(resourceMap.getString("jLbl_SistemaElectronicaVotaciones.text")); // NOI18N
        jLbl_SistemaElectronicaVotaciones.setName("jLbl_SistemaElectronicaVotaciones"); // NOI18N

        jLbl_gifBanderaMapa.setIcon(resourceMap.getIcon("jLbl_gifBanderaMapa.icon")); // NOI18N
        jLbl_gifBanderaMapa.setText(resourceMap.getString("jLbl_gifBanderaMapa.text")); // NOI18N
        jLbl_gifBanderaMapa.setName("jLbl_gifBanderaMapa"); // NOI18N

        jLbl_gifEcuador.setIcon(resourceMap.getIcon("jLbl_gifEcuador.icon")); // NOI18N
        jLbl_gifEcuador.setText(resourceMap.getString("jLbl_gifEcuador.text")); // NOI18N
        jLbl_gifEcuador.setName("jLbl_gifEcuador"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLbl_SistemaElectronicaVotaciones)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jLbl_reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLbl_imagenSEV)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLbl_gifBanderaMapa)
                                .addGap(18, 18, 18)
                                .addComponent(jLbl_SEV)
                                .addGap(16, 16, 16)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPnl_MENÚ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLbl_gifEcuador))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLbl_SistemaElectronicaVotaciones)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLbl_gifBanderaMapa)
                            .addComponent(jLbl_SEV)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLbl_gifEcuador)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPnl_MENÚ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLbl_imagenSEV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLbl_reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jBtn_ir_administradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_ir_administradorMouseClicked
        // TODO add your handling code here:       
                    administrador ir = new administrador();// crea objeto para ir a nueva ventana
                    this.setVisible(false);//oculta la ventana actual
                    ir.setVisible(true);//muestra la nueva ventana
                    ir.setLocationRelativeTo(null);// para que la ventana este siempre centrada
    }//GEN-LAST:event_jBtn_ir_administradorMouseClicked

    private void jBtn_ir_votantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_ir_votantesMouseClicked
        try {
            // TODO add your handling code here:
            votantes ir = new votantes(); // crea objeto para ir a nueva ventana
            this.setVisible(false); //oculta la ventana actual
            ir.setVisible(true); // para que la ventana este siempre centrada
            ir.setLocationRelativeTo(null); // para que la ventana este siempre centrada
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBtn_ir_votantesMouseClicked

    private void jBtn_salir_sistemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtn_salir_sistemaMouseClicked
        // TODO add your handling code here:
        System.exit(1);////codigo para salir del sistema
    }//GEN-LAST:event_jBtn_salir_sistemaMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);// clase principal
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_ir_administrador;
    private javax.swing.JButton jBtn_ir_votantes;
    private javax.swing.JButton jBtn_salir_sistema;
    private javax.swing.JLabel jLbl_SEV;
    private javax.swing.JLabel jLbl_SistemaElectronicaVotaciones;
    private javax.swing.JLabel jLbl_gifBanderaMapa;
    private javax.swing.JLabel jLbl_gifEcuador;
    private javax.swing.JLabel jLbl_imagenSEV;
    private javax.swing.JLabel jLbl_imagenVotos;
    private javax.swing.JLabel jLbl_reloj;
    private javax.swing.JPanel jPnl_MENÚ;
    // End of variables declaration//GEN-END:variables

}