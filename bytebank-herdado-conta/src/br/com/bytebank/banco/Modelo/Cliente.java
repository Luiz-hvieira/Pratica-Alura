/**
 * Classe primordial que representa a abstra��o do conceito de todos os clientes bytebank.
 * 
 * @author Luiz Henrique Vieira Steff
 * @version 1.0
 * 
 */

package br.com.bytebank.banco.Modelo;


	public class Cliente{
		private String nome;
		private String cpf;
		private String profissao;
		private String renda;
		//metodos
		/**
		 * M�todo que retorna o nome do cliente
		 * 
		 * @author Luiz Henrique Vieira Steff
		 * @version 1.0
		 * @return 
		 * 
		 */
		public String getNome() {
			return nome;
		}
		/**
		 * M�todo respons�vel por settar / definir o nome do cliente
		 * 
		 * @author Luiz Henrique Vieira Steff
		 * @version 1.0
		 * 
		 */
		public void setNome(String nome) {
			this.nome = nome;
		}
		/**
		 * M�todo que devolve o CPF do cliente cadastrdo.
		 * 
		 * @author Luiz Henrique Vieira Steff
		 * @version 1.0
		 * 
		 * @return
		 */
		public String getCpf() {
			return cpf;
		}
		
		/**
		 * M�todo que insere o CPF do cliente em cadastro.
		 * 
		 * @author Luiz Henrique Vieira Steff
		 * @version 1.0
		 * 
		 * @param cpf
		 */
		
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
		/**
		 * M�todo que retorna a profiss�o do cliente.
		 * 
		 * @author Luiz Henrique Vieira Steff
		 * @version 1.0
		 * 
		 * @return
		 */
		
		public String getProfissao() {
			return profissao;
		}
		
		/**
		 * M�todo que insere a profiss�o do cliente em sistema
		 * 
		 * @author Luiz Henrique Vieira Steff
		 * @version 1.0
		 * 
		 * @param profissao
		 */
		
		public void setProfissao(String profissao) {
			this.profissao = profissao;
		}
		
		/**
		 * M�todo que retorna a renda do cliente.
		 * 
		 * @author Luiz Henrique Vieira Steff
		 * @version 1.0
		 * 
		 * @return
		 */
		
		public String getRenda() {
			return renda;
		}
		
		/**
		 * M�todo que insere a renda do cliente no sistema.
		 * 
		 * @author Luiz Henrique Vieira Steff
		 * @version 1.0 
		 * 
		 * @param renda
		 */
		
		public void setRenda(String renda) {
			this.renda = renda;
		}	
	}
