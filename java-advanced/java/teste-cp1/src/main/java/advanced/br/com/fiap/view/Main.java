package advanced.br.com.fiap.view;

import advanced.br.com.fiap.dao.FuncionarioDAO;
import advanced.br.com.fiap.dao.FuncionarioDAOImpl;
import advanced.br.com.fiap.entity.Funcionario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");

        //Criar o Entity manager
        EntityManager em = fabrica.createEntityManager();

        //Instanciar o DAO
        FuncionarioDAO dao = new FuncionarioDAOImpl(em);

        //Cadastrar um Cliente (CREATE -> INSERT)
        Funcionario funcionario = new Funcionario("martins", 10, 25.5F );

        try {
            dao.cadastrar(funcionario);
            dao.commit();
            System.out.println();
            funcionario.exibirSQL(funcionario, "INSERT");
            funcionario.imprimirInformacao();
            System.out.println("Funcionario cadastrado!");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
