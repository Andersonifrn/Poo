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
public class ExceptionParticular extends Exception {
    
    private String nome;
    private int idade;
    private double peso;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    public ExceptionParticular(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return " número não é igual!";
    }
    
    
}
