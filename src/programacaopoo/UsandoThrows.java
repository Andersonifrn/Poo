/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacaopoo;

import java.util.Scanner;

/**
 *
 * @author ander
 */
public class UsandoThrows {
    public static void main(String[] args) {
        

        try {
            double ler =num();
        } catch (Exception ex) {
             System.out.println("error"+ex.getMessage());
             ex.printStackTrace();
        }
       
        
    }
  
    public static double num() throws Exception{
        Scanner sc = new Scanner(System.in);
        double numero=sc.nextDouble();
        return numero;
    }
}
