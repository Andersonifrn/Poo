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
public class SobreCarga {
    
     String nome;
     int idade;
     double peso;
     
     public int ano(int anoAtual,int AnoNasc){
         return anoAtual-AnoNasc;
         
     }
     
      public int ano(int anoAtual,int AnoNasc,int dia){
         return anoAtual-AnoNasc-dia;
         
     }
     
    public static void main(String[] args) {
        SobreCarga cg = new SobreCarga();
        System.out.println("Sua idade é :"+cg.ano(2022, 1993));
    }
}
