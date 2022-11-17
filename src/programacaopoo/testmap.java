/*
  Essa classe vai armazenar os dados de cada agência
 */
package programacaopoo;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ander
 */
public class testmap {

    public static void main(String[] args) {

        HashMap<String, Agencia> bancos = new HashMap<>();

        Scanner sc = new Scanner(System.in);
      
            Agencia c1 = new Agencia("banco do brasil","rua da belat","Rn");
            Agencia c2 = new Agencia("banco Inter","rua do estadio","Rn");
            Agencia c3 = new Agencia("Banco do Bradesco","rua da fazenda","Rn");
  
            bancos.put("bb", c1);
            bancos.put("bbInter", c2);
            bancos.put("bbd", c3);
            try {
            
       
        
            while(true){
                
            
            
            System.out.println("Informe a chaver :");
            String cod=sc.nextLine();
            
        Agencia contas = bancos.get(cod);
        System.out.println("Dados da Agência " + contas.getNome() + " Está na  " + contas.getEndereco() + " no Estado do " + contas.getEstado());
          
        if(cod.equals("s")){
        break;
        }else{
            System.out.println("Informe a chaver diferente:");
        }
            
            }
             } catch (Exception e) {
        }
            finally {
                    System.out.println("Systema encerrar seu funcionamento!");
            }
    }
}
