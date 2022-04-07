package pokemon;

import javax.swing.JOptionPane;

public class select extends javax.swing.JFrame {

    Pokemon pokemon = new Pokemon();

    public void selected() {

    }

    public select() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Squirtle = new javax.swing.JButton();
        Char = new javax.swing.JButton();
        Bulba = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Squirtle.setBackground(new java.awt.Color(0,0,0,1
        ));
        Squirtle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/Squirtle.png"))); // NOI18N
        Squirtle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Squirtle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SquirtleActionPerformed(evt);
            }
        });
        getContentPane().add(Squirtle, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 230, 270));

        Char.setBackground(new java.awt.Color(0,0,0,1)
        );
        Char.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/Char.png"))); // NOI18N
        Char.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Char.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CharActionPerformed(evt);
            }
        });
        getContentPane().add(Char, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 240, 260));

        Bulba.setBackground(new java.awt.Color(0,0,0,1));
        Bulba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/Bulba.png"))); // NOI18N
        Bulba.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Bulba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BulbaActionPerformed(evt);
            }
        });
        getContentPane().add(Bulba, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 240, 260));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pokemon/Pokemon_XY.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BulbaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BulbaActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja batalhar com Bulbasaur?");
        if (resposta == JOptionPane.YES_OPTION) {

            Batalha batalhaTela = new Batalha();
            Batalha.pokemon1.setText("Bulbasaur");
            Batalha.Pokemon2.setText("Squirtle");
            batalhaTela.setVisible(true);

            PokemonVar poke1 = new PokemonVar("Bulbasaur", "Grama", 50, 6, 9, "Fogo");
            PokemonVar poke2 = new PokemonVar("Squirtle", "Agua", 50, 6, 9, "Grama");

            BatalharPokemon batalha = new BatalharPokemon();
            batalha.Batalhar(poke1, poke2);

            System.exit(0);
        }

    }//GEN-LAST:event_BulbaActionPerformed

    private void CharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CharActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja batalhar com Charmander?");
        if (resposta == JOptionPane.YES_OPTION) {

            Batalha batalhaTela = new Batalha();
            Batalha.pokemon1.setText("Charmander");
            Batalha.Pokemon2.setText("Bulbasaur");
            batalhaTela.setVisible(true);

            PokemonVar poke1 = new PokemonVar("Charmander", "Fogo", 50, 6, 9, "Agua");
            PokemonVar poke2 = new PokemonVar("bulbasaur", "Grama", 50, 6, 9, "Fogo");

            BatalharPokemon batalha = new BatalharPokemon();
            batalha.Batalhar(poke1, poke2);

            System.exit(0);

        }
    }//GEN-LAST:event_CharActionPerformed

    private void SquirtleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquirtleActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja batalhar com Squirtle?");
        if (resposta == JOptionPane.YES_OPTION) {

            Batalha batalhaTela = new Batalha();
            Batalha.pokemon1.setText("Squirtle");
            Batalha.Pokemon2.setText("Charmander");
            batalhaTela.setVisible(true);

            PokemonVar poke1 = new PokemonVar("Squirtle", "Agua", 50, 6, 9, "Grama");
            PokemonVar poke2 = new PokemonVar("Charmander", "Fogo", 50, 6, 9, "Agua");

            BatalharPokemon batalha = new BatalharPokemon();
            batalha.Batalhar(poke1, poke2);

            System.exit(0);
        }
    }//GEN-LAST:event_SquirtleActionPerformed

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
            java.util.logging.Logger.getLogger(select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(select.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new select().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bulba;
    private javax.swing.JButton Char;
    private javax.swing.JButton Squirtle;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
