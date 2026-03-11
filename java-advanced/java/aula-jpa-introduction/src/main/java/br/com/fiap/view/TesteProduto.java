package br.com.fiap.view;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Genero;
import br.com.fiap.entity.Produto;
import br.com.fiap.entity.TipoProduto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteProduto {

	public static void main(String[] args) {
		//Instanciar um Cliente sem o ID (pode criar o construtor)
		Produto produto = new Produto("Teste", new GregorianCalendar(2005, Calendar.JANUARY, 17),
				TipoProduto.DIGITAL, 25, true );
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		//Criar o Entity Manager
		EntityManager em = fabrica.createEntityManager();
		
		//Chamar o metodo persist() do Entity Manager
		em.persist(produto);

		//Transacao - Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		System.out.println("Produto cadastrado!");
	}
}