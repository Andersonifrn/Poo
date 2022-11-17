/* Essa classe vai conter os dados da agência*/
package programacaopoo;

/**
 *
 * @author ander
 */
public class Agencia {
    
// os atributos de agência
    private String nome;
    private String endereco;
    private String estado;

    
    public Agencia (String n,String end,String est){
        this.nome=n;
        this.endereco=end;
        this.estado=est;
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
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
