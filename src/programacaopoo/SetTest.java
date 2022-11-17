/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaopoo;

import java.util.HashSet;

/**
 *
 * @author ander
 */
public class SetTest {
    
    public static void main(String[] args) {
        
        HashSet<Agencia>  bancos = new HashSet<>();
        
        Agencia b1 = new Agencia("banco", "rua linda","Rio grande do norte");
        Agencia b2 = new Agencia("caixa", "rua da palha","Rio grande do norte");
        
        bancos.add(b2);
        bancos.add(b1);
       
        bancos.remove(b2);
        for (Agencia banco : bancos) {
            System.out.println("Os bancos "+banco.getEstado()+" "+banco.getNome()+" "+banco.getEstado());
        }
        
        
    }
}
