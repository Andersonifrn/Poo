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
public class Aluno {
    // os atributos
     private static String nome="josé";
     private String matricular;
     
    public static void verifica(){
        String texto=nome;
     System.out.println("Nome do Aluno é :"+texto);
    }
    public Aluno() {
    }

    public Aluno(String nome, String matricular) {
        this.nome = nome;
        this.matricular = matricular;

    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the matricular
     */
    public String getMatricular() {
        return matricular;
    }

    /**
     * @param matricular the matricular to set
     */
    public void setMatricular(String matricular) {
        this.matricular = matricular;
    }
     
     
     
}
