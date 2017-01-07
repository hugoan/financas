package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteJPA {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setTitular("Hugo Araújo Nóbrega");
		conta.setBanco("Bradesco");
		conta.setAgencia("Taguatinga Centro");
		conta.setNumero("123456");

		double inicio = System.currentTimeMillis();
		EntityManager manager = new JPAUtil().getEntityManager();

		manager.getTransaction().begin();
		manager.persist(conta);
		manager.getTransaction().commit();
		manager.close();
		double fim = System.currentTimeMillis();
		System.out.println("Executado em " + (fim - inicio) / 1000 + "s");
	}
}
