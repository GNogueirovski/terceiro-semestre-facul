/*
Aluno: Gabriel Nogueira Peixoto - RM563925
 */
package advanced.br.com.fiap.view;

import advanced.br.com.fiap.empresa.Gerente;
import advanced.br.com.fiap.empresa.Funcionario;

import java.util.Scanner;

public class MainEmpresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionarioSede = new Funcionario("augusto", "po", 10000);
        Gerente gerenteSede = new Gerente("Marcelo");


        System.out.println("Digite o nome do gerente responsável:");
        String nomeInput = sc.nextLine().toLowerCase();

        if(nomeInput.equalsIgnoreCase(gerenteSede.getNome())){
            System.out.println("Digite a opção que deseja:\n1) Atualizar Cargo\n2) Atualizar Salário\n3) Sair");
            int opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.printf("Digite o novo salário do %s:", funcionarioSede.getNome());
                    gerenteSede.atualizar(funcionarioSede, sc.nextDouble());
                    break;
                case 2:
                    System.out.printf("Digite o novo cargo do %s:", funcionarioSede.getNome());
                    gerenteSede.atualizar(funcionarioSede, sc.nextLine());
                    break;
                default:
                    System.out.println("Digite um número válido");
            }
            System.out.println(funcionarioSede);
        } else{
            System.out.println("Gerente não é da sede.");
        }





    }
}
