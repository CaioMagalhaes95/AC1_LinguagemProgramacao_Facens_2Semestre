package pokemon;

import static pokemon.Batalha.pokemon1;

public class Batalha extends javax.swing.JFrame {

    public Batalha() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pokemon1 = new javax.swing.JLabel();
        Pokemon2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pokemon1.setBackground(new java.awt.Color(255, 255, 255));
        pokemon1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        pokemon1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(pokemon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 280, 50));

        Pokemon2.setBackground(new java.awt.Color(0, 0, 0));
        Pokemon2.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        Pokemon2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Pokemon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 300, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/arena.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Batalha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Batalha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Pokemon2;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel pokemon1;
    // End of variables declaration//GEN-END:variables
}
