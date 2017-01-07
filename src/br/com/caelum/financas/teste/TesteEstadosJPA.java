package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteEstadosJPA {

	public static void main(String[] args) {
		
//		Conta conta = new Conta();
//		conta.setId(3);
//        conta.setTitular("Teste Teste");
//        conta.setBanco("BRB");
//        conta.setNumero("123345");
//        conta.setAgencia("321");
	
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();
		
		Conta conta = manager.find(Conta.class, 2);
		
		System.out.println(conta.getTitular());
		
		conta.setTitular("Teste 3");
		
		System.out.println(conta.getTitular());
		
		manager.getTransaction().commit();
		manager.close();
		
		

	}
}