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
public class MinhaPropriaExcecao {
    
    public static void main(String[] args) {
        
        try {
              int num1=0, num2=20;
        
         //  int resultado=num2/num1;
        if(num1==0){
              throw new ExceptionParticular("Anderson", 28, 68);
        }
       
         
      //  System.out.println("Resultado da divisão é :"+resultado);
        } catch (ExceptionParticular e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
  
      
        
    }
}
