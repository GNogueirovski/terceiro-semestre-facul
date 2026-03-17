package br.com.fiap.model;

import br.com.fiap.annotations.Tabela;

@Tabela(nome = "TAB_ALUNO")
public class Aluno {
    public void aluno(){
        System.out.println("Tranquilo");
    }
}
