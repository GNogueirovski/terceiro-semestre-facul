/*
Aluno: Gabriel Nogueira Peixoto - RM563925
 */
package advanced.br.com.fiap.imoveis;

public class Gerente extends Imovel{
    public Gerente(String endereco, double preco){
        super.setPreco(getDescontoPreco(preco));
        super.setEndereco(endereco);
    }

    public double getDescontoPreco (double precoAtual){
        return precoAtual * 0.85;
    }

    public String toString(){
        return String.format("Endereço: %s\nPreço Abaixado:%.2f", getEndereco(), getPreco());
    }

}
