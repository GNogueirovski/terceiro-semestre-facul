/*
Aluno: Gabriel Nogueira Peixoto - RM563925
 */
package advanced.br.com.fiap.view;

import advanced.br.com.fiap.imoveis.Funcionario;
import advanced.br.com.fiap.imoveis.Gerente;

public class MainImovel {
    public static void main(String[] args) {
        Funcionario casa1 = new Funcionario("rua dos cocais", 10.00);
        Gerente casa2 = new Gerente("rua dos laranjais", 10.00);

        System.out.println(casa1);
        System.out.println();
        System.out.println(casa2);

    }
}
