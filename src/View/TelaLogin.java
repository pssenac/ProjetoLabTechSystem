
package View;


public class TelaLogin extends javax.swing.JFrame {

   
    public TelaLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_acessar = new javax.swing.JButton();
        bt_sair = new javax.swing.JButton();
        JB_user = new javax.swing.JLabel();
        JT_user = new javax.swing.JTextField();
        JT_password = new javax.swing.JPasswordField();
        JB_password = new javax.swing.JLabel();
        JL_LogoLogin = new javax.swing.JLabel();
        JB_fundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bt_acessar.setText("Acessar");
        bt_acessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_acessarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_acessar);
        bt_acessar.setBounds(240, 170, 73, 40);

        bt_sair.setText("Sair");
        getContentPane().add(bt_sair);
        bt_sair.setBounds(330, 170, 70, 40);

        JB_user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JB_user.setForeground(new java.awt.Color(255, 255, 255));
        JB_user.setText("Usuário:");
        getContentPane().add(JB_user);
        JB_user.setBounds(180, 80, 80, 30);
        getContentPane().add(JT_user);
        JT_user.setBounds(260, 80, 160, 30);

        JT_password.setText("jPasswordField1");
        getContentPane().add(JT_password);
        JT_password.setBounds(260, 120, 160, 30);

        JB_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JB_password.setForeground(new java.awt.Color(255, 255, 255));
        JB_password.setText("Senha:");
        getContentPane().add(JB_password);
        JB_password.setBounds(180, 110, 80, 30);

        JL_LogoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/secrecy-icon.png"))); // NOI18N
        getContentPane().add(JL_LogoLogin);
        JL_LogoLogin.setBounds(20, 60, 130, 130);

        JB_fundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/layout.jpg"))); // NOI18N
        getContentPane().add(JB_fundoLogin);
        JB_fundoLogin.setBounds(0, 0, 460, 250);

        setSize(new java.awt.Dimension(476, 282));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // <editor-fold defaultstate="collapsed" desc="BOTÃO ACESSAR"> 
    private void bt_acessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_acessarActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();// Fecha a tela login
         
    }//GEN-LAST:event_bt_acessarActionPerformed
    // </editor-fold> 
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JB_fundoLogin;
    private javax.swing.JLabel JB_password;
    private javax.swing.JLabel JB_user;
    private javax.swing.JLabel JL_LogoLogin;
    private javax.swing.JPasswordField JT_password;
    private javax.swing.JTextField JT_user;
    private javax.swing.JButton bt_acessar;
    private javax.swing.JButton bt_sair;
    // End of variables declaration//GEN-END:variables
}
