/*
Aluno: Gabriel Nogueira Peixoto - RM563925
 */
package advanced.br.com.fiap.imoveis;

public class Funcionario extends Imovel{
    public Funcionario(String endereco, double preco) {
       super.setPreco(getPrecoAtualizado(preco));
       super.setEndereco(endereco);
    }
    public double getPrecoAtualizado(double precoAtual){
        return precoAtual * 1.25;
    }

    public String toString(){
        return String.format("Endereço: %s\nPreço Inflado:%.2f", getEndereco(), getPreco());
    }
}
