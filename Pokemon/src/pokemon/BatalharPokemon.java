/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import javax.swing.JOptionPane;

/**
 *
 * @author Caio
 */
public class BatalharPokemon {

    public void Batalhar(PokemonVar x, PokemonVar y) {

        if (x.tipo.equals(y.fraqueza)) {
            JOptionPane.showMessageDialog(null, x.nome + " Venceu");
        } else {
            System.out.println(y.nome + " Venceu");
        }
    }
}
