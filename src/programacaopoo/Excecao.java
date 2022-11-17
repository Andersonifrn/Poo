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
public class Excecao {
    public static void main(String[] args) {
     
        try {
            int conta [] = new int[4];
        
        conta[9]=2;
        } catch (Exception e) {
           // System.out.println("Error ao acessar uma posição que não contem no vetor");
            System.out.println(e.getMessage());
            // mostrar onde foi o error e o tipo do error
            e.printStackTrace();
        }
        System.out.println("Programa executado");
    }
            
}
