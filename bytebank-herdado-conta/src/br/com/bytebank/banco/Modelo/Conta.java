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
		 * Construtor da classe conta respons�vel por popular os par�metros e contar
		 * o total de contas criadas at� o momento.
		 * 
		 * @param agencia
		 * @param numero
		 */
		
		public Conta(int agencia, int numero) {
			//System.out.println("Estou gerando mais uma conta!");
			this.agencia=agencia;
			this.numero=numero;
			Conta.total++;
			//System.out.println("O total de contas geradas at� o momento � de: "+total);
		}
		
		//m�todos
		/**
		 * Assinatura do m�todo respons�vel por inserir valores nas contas criadas.
		 * 
		 * 
		 * @param valor 
		 * 		Quantia a ser sacada da conta
		 * @since 1.0
		 */
		
		public abstract void deposita (double valor);
		
		/**
		 * M�todo que saca valores das contas bytebank.
		 * Verfifica se o saldo � suficiente.
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
		 * M�todo que transfere valores entre duas contas usando o m�todo saca().
		 * 
		 * @param valor
		 * 		Quantia a ser transferida.
		 * @param destino
		 * 		Conta que receber� a quantia.
		 * @throws SaldoInsuficienteException
		 * 
		 * @since 1.0
		 */
		
		public void transfere (double valor, Conta destino) throws SaldoInsuficienteException{
				this.saca(valor);
				destino.deposita(valor);
		}
		
		/**
		 * M�todo getter do atributo saldo.
		 * 
		 * @return 
		 * 		Valor da vari�vel saldo.
		 * 
		 * @since 1.0
		 */
		
		public double getSaldo() {
			return this.saldo;
		}
		
		/**
		 * M�todo getter do atributo n�mero.
		 * 
		 * @return 
		 * 		Valor vinculado a vari�vel n�mero.
		 * 
		 * @since 1.0
		 */
		
		public int getNumero() {
			return this.numero;
		}
		
		/**
		 * M�todo Setter do atributo numero, verifica que o n�mero � negativo.
		 * 
		 * @param numero
		 * 		N�mero inteiro a qual a conta ser� vinculada para identifica��o.
		 * @since 1.0
		 */
		
		public void setNumero(int numero) {
			if (numero<=0) {
				System.out.println("N�o pode conta negativa!");
				return;
			}
			this.numero=numero;
		}
		
		/**
		 * M�todo getter do atributo agencia
		 * 
		 * @return
		 * 		N�mero inteiro relacionado � identifica��o da ag�ncia.
		 * @since 1.0
		 */
		
		public int getAgencia() {
			return this.agencia;
		}
		
		/**
		 * M�todo Setter do atributo agencia
		 * 
		 * @param agencia
		 * 		Identifica��o da agencia a qual a conta pertencer�.
		 * @since 1.0
		 */
		
		public void setAgencia(int agencia) {
			if (agencia<=0) {
				System.out.println("N�o pode valor negativo");
				return;
			}
			this.agencia = agencia;
		}
		
		/** 
		 * M�todo Setter do atributo titular, recebe uma refer�ncia da classe titular.
		 * 
		 * @param titular
		 * 		Define o objeto titular que � relacionado a conta.
		 * @since 1.0
		 */
		
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		
		/**
		 * M�todo getter do atributo Titular
		 * 
		 * @return 
		 * 		Retorna o ponteiro ao objeto titular.
		 * @since 1.0
		 */
		
		public Cliente getTitular() {
			return titular;
		}
		
		/**
		 * M�todo getter do atributo Total
		 * 
		 * @return 
		 * 		Retorna o valor guardado na vari�vel total.
		 * 
		 * @since 1.0
		 */
		
		public static int getTotal() {
			return Conta.total;
		}	
	}