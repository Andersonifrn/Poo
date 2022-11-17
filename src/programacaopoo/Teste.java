package programacaopoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Conta> Contas = new ArrayList<>();
		Contas.add(new Conta(5000, "FYGORE"));
		Contas.add(new Conta(3000, "TEJALY"));
		Contas.add(new Conta(1500, "KAHOZE"));

		Collections.sort(Contas);

		int ct = 1;

		for (int i = 0; i < Contas.size(); i++) {
			System.out.println("Conta "+(ct++)+ ":");
			System.out.println("Saldo:" + Contas.get(i).getSaldo());
			System.out.println("CÓdigo: "+Contas.get(i).getCodigo());
			System.out.println();
	
	}
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual c�digo da conta voc� deseja remover?");

		for (int i = 0; i < Contas.size(); i++) {
			Conta c = Contas.get(i);
			String cdg = sc.nextLine();
			//System.out.print(" IMPRESSÃO"+c.getCodigo());
			if (cdg.equals(c.getCodigo())) {   
			
                               
				
					System.out.println("Conta "+(ct++)+ ":");
					System.out.println("Saldo:" + c.getSaldo());
					System.out.println("CÓdigo: "+c.getCodigo());
					System.out.println();
				
					}
                                 }
                            
                                for (Conta Conta1 : Contas) {
                                    
                                    System.out.println("Contas "+Conta1.getCodigo());
                         
                                
			}
		
		}
	
	}
