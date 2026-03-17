package br.com.fiap.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Define ate quando a anotacao estara presente (codigo fonte, compilcao, execucao)
@Retention(RetentionPolicy.RUNTIME)
//Define onde pode ser utilizada a anotacao (Field = atributos)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Coluna {

    String nome();
    int tamanho() default 0;
    boolean obrigatorio() default false;

}
