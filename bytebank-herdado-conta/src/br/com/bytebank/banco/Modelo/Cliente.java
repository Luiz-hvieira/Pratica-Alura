/**
 * Classe primordial que representa a abstração do conceito de todos os clientes bytebank.
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
		 * Método que retorna o nome do cliente
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
		 * Método responsável por settar / definir o nome do cliente
		 * 
		 * @author Luiz Henrique Vieira Steff
		 * @version 1.0
		 * 
		 */
		public void setNome(String nome) {
			this.nome = nome;
		}
		/**
		 * Método que devolve o CPF do cliente cadastrdo.
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
		 * Método que insere o CPF do cliente em cadastro.
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
		 * Método que retorna a profissão do cliente.
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
		 * Método que insere a profissão do cliente em sistema
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
		 * Método que retorna a renda do cliente.
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
		 * Método que insere a renda do cliente no sistema.
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
