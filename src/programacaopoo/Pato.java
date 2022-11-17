/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaopoo;

/**
 *
 * @author ander
 */
public class Pato extends Animal {

    public Pato(String nome, String raca) {
        super(nome, raca);
    }

  

    @Override
    public void comportamneto() {
        System.out.println("Andar");
    }
    
}
