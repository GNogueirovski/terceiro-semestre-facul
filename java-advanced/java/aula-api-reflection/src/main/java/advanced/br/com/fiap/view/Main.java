package advanced.br.com.fiap.view;

import advanced.br.com.fiap.model.Aluno;

import static advanced.br.com.fiap.model.Aluno.exibeSQL;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", "12345");
        System.out.println(exibeSQL(aluno));
    }
}
