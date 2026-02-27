/*
Aluno: Gabriel Nogueira Peixoto - RM563925
 */
package advanced.br.com.fiap.imoveis;

public abstract class Imovel {
    private String endereco;
    private double preco;

    public Imovel() {
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "endereco='" + endereco + '\'' +
                ", preco=" + preco +
                '}';
    }
}
