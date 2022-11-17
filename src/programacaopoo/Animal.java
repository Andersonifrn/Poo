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
public abstract  class Animal {
    
   private String nome;
   private String raca;

   public abstract void comportamneto();
   
   public void emitirSom(){
       System.out.println("oooooooolllllll");
   }
   
    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
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
     * @return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }
}
