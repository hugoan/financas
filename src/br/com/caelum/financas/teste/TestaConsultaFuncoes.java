package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.MovimentacaoDAO;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TestaConsultaFuncoes {

		public static void main(String[] args) {
			
			EntityManager manager = new JPAUtil().getEntityManager();
			
			Conta conta = new Conta();
			conta.setId(7);

			MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAO(manager);
			
			Double media = movimentacaoDAO.getMediaDaConta(conta);
			
			System.out.println("Soma: R$" + media);
		}
}
