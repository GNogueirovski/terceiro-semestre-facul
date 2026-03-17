package br.com.fiap.view;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.annotations.Coluna;
import br.com.fiap.model.Pessoa;

@SuppressWarnings("all")
public class Teste {

    public static void main(String[] args) {

        //Instanciar uma pessoa
        Pessoa pessoa = new Pessoa();

        //Recuperar o nome da classe atraves da API Reflection
        String nomeClasse = pessoa.getClass().getName();
        System.out.println();
        System.out.println(nomeClasse);
        System.out.println();

        //Recuperar os metodos da classe atraves da API Reflection
        Method[] metodos = pessoa.getClass().getDeclaredMethods();

        //Exibir o nome dos metodos
        for (Method m : metodos) {
            System.out.println(m.getName());
        }

        //Recuperar os atributos da classe
        Field[] atributos = pessoa.getClass().getDeclaredFields();
        System.out.println();
        //Exibir o nome e o tipo dos atributos
        for (Field f : atributos) {
            System.out.println(f.getName() + " " + f.getType());
            //Recuperar a anotação @Coluna
            Coluna anotacao = f.getAnnotation(Coluna.class);
            //Exibir os parametros da anotação
            System.out.println(anotacao.nome() + " " + anotacao.tamanho()
                    + " " + anotacao.obrigatorio());
        }
    }
}
