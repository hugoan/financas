package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TestaConsultaFuncoes2 {

		public static void main(String[] args) {
			
			EntityManager manager = new JPAUtil().getEntityManager();
			
			Conta conta = new Conta();
			conta.setId(6);

			
			TypedQuery<Double> query = manager.createNamedQuery("mediaDaContaPeloTipoMovimentacao", Double.class);
			
			query.setParameter("pConta", conta);
			query.setParameter("pTipo", TipoMovimentacao.ENTRADA);
			
			Double media = query.getSingleResult();
			
			System.out.println("Media: R$" + media );
			
			
		}
}
