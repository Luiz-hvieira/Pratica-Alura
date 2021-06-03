/**
 * Classe que define as contas correntes bytebank, herdando de Conta e implementando Tributável.
 * 
 * @author Luiz Henrique Vieira Steff
 * @version 1.0
 */

package br.com.bytebank.banco.Modelo;

public class ContaCorrente extends Conta implements Tributavel{
	
	/**
	 * Construtor que popula os parâmetros do objeto, usando o construtor da superclasse.
	 * 
	 * @param agencia
	 * @param numero
	 * 
	 * @author Luiz Henrique Vieira Steff
	 * @version 1.0
	 */
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
		}
	
	/**
	 * Método responsável por sacar incluindo a taxa do banco, repassando o valor para o
	 * método da classe super.
	 * 
	 * @author Luiz Henrique Vieira Steff
	 * @version 1.0 
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor+0.2;
			super.saca(valorASacar);
		}
	/**
	 * Método que deposita valores.
	 * 
	 * @param saldo saldo do cliente em conta.
	 * 
	 * @author Luiz Henrique Vieira Steff
	 * @version 1.0 1.0 
	 */
	
	@Override
	public void deposita(double valor) {
		super.saldo+=valor;		
	}
	
	
	/**
	 * Método getter do valor do imposto.
	 * 
	 * 
	 * @return retorna em valor, double
	 * @author Luiz Henrique Vieira Steff
	 * @version 1.0 1.0
	 */
	
	@Override
	public double getValorImposto() {
		return super.saldo*0.01;
	}
	
}

