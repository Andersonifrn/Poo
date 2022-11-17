/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programacaopoo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ander
 */
public class AlunoTest {
    public static void main(String[] args) {
        ArrayList<String> niv = new ArrayList<>();
       
        HashMap<String,ArrayList> aluno = new HashMap<>();
        
        niv.add("Anderson");
        
        
        aluno.put("llf", niv);
        
        
        System.out.println("Informação é : "+aluno.get("llf"));
        
        
       
    }
}
