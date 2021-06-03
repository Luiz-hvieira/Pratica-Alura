 /**
 * Classe que padroniza todas as contas que podem ser abertas no bytebank.
 * 
 * @author Luiz Henrique Vieira Steff
 * @version 1.0
 * 
 */


package br.com.bytebank.banco.Modelo;


	public abstract class Conta{
		//atributos
		protected double saldo;
		private int agencia;
		private int numero;
		private Cliente titular;
		private static int total;
		
		/**
		 * Construtor da classe conta responsável por popular os parâmetros e contar
		 * o total de contas criadas até o momento.
		 * 
		 * @param agencia
		 * @param numero
		 */
		
		public Conta(int agencia, int numero) {
			//System.out.println("Estou gerando mais uma conta!");
			this.agencia=agencia;
			this.numero=numero;
			Conta.total++;
			//System.out.println("O total de contas geradas até o momento é de: "+total);
		}
		
		//métodos
		/**
		 * Assinatura do método responsável por inserir valores nas contas criadas.
		 * 
		 * 
		 * @param valor 
		 * 		Quantia a ser sacada da conta
		 * @since 1.0
		 */
		
		public abstract void deposita (double valor);
		
		/**
		 * Método que saca valores das contas bytebank.
		 * Verfifica se o saldo é suficiente.
		 * 
		 * @param valor 
		 * 		Valor a ser sacado da conta.
		 * 
		 * @throws SaldoInsuficienteException
		 * @since 1.0
		 */
		
		public void saca(double valor) throws SaldoInsuficienteException {
			if (this.saldo < valor) {
				//Problema
				throw new SaldoInsuficienteException("Saldo: "+this.saldo+" Valor: "+valor);
			} else {
				//normalidade
				this.saldo-=valor;
			}
		}
		
		/**
		 * Método que transfere valores entre duas contas usando o método saca().
		 * 
		 * @param valor
		 * 		Quantia a ser transferida.
		 * @param destino
		 * 		Conta que receberá a quantia.
		 * @throws SaldoInsuficienteException
		 * 
		 * @since 1.0
		 */
		
		public void transfere (double valor, Conta destino) throws SaldoInsuficienteException{
				this.saca(valor);
				destino.deposita(valor);
		}
		
		/**
		 * Método getter do atributo saldo.
		 * 
		 * @return 
		 * 		Valor da variável saldo.
		 * 
		 * @since 1.0
		 */
		
		public double getSaldo() {
			return this.saldo;
		}
		
		/**
		 * Método getter do atributo número.
		 * 
		 * @return 
		 * 		Valor vinculado a variável número.
		 * 
		 * @since 1.0
		 */
		
		public int getNumero() {
			return this.numero;
		}
		
		/**
		 * Método Setter do atributo numero, verifica que o número é negativo.
		 * 
		 * @param numero
		 * 		Número inteiro a qual a conta será vinculada para identificação.
		 * @since 1.0
		 */
		
		public void setNumero(int numero) {
			if (numero<=0) {
				System.out.println("Não pode conta negativa!");
				return;
			}
			this.numero=numero;
		}
		
		/**
		 * Método getter do atributo agencia
		 * 
		 * @return
		 * 		Número inteiro relacionado á identificação da agência.
		 * @since 1.0
		 */
		
		public int getAgencia() {
			return this.agencia;
		}
		
		/**
		 * Método Setter do atributo agencia
		 * 
		 * @param agencia
		 * 		Identificação da agencia a qual a conta pertencerá.
		 * @since 1.0
		 */
		
		public void setAgencia(int agencia) {
			if (agencia<=0) {
				System.out.println("Não pode valor negativo");
				return;
			}
			this.agencia = agencia;
		}
		
		/** 
		 * Método Setter do atributo titular, recebe uma referência da classe titular.
		 * 
		 * @param titular
		 * 		Define o objeto titular que é relacionado a conta.
		 * @since 1.0
		 */
		
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		
		/**
		 * Método getter do atributo Titular
		 * 
		 * @return 
		 * 		Retorna o ponteiro ao objeto titular.
		 * @since 1.0
		 */
		
		public Cliente getTitular() {
			return titular;
		}
		
		/**
		 * Método getter do atributo Total
		 * 
		 * @return 
		 * 		Retorna o valor guardado na variável total.
		 * 
		 * @since 1.0
		 */
		
		public static int getTotal() {
			return Conta.total;
		}	
	}