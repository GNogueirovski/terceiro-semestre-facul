/*
Aluno: Gabriel Nogueira Peixoto - RM563925
 */
package advanced.br.com.fiap.empresa;

public class Gerente {
    public String nome;

    public Gerente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void atualizar (Funcionario f, String cargo){
        f.setCargo(cargo);
        f.setNome(getNome());
    }

    public void atualizar (Funcionario f, double salario){
        f.setSalario(salario);
        f.setNome(getNome());
    }

}
