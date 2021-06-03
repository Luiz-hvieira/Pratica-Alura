/**
 * Classe que define as contas correntes bytebank, herdando de Conta e implementando Tribut�vel.
 * 
 * @author Luiz Henrique Vieira Steff
 * @version 1.0
 */

package br.com.bytebank.banco.Modelo;

public class ContaCorrente extends Conta implements Tributavel{
	
	/**
	 * Construtor que popula os par�metros do objeto, usando o construtor da superclasse.
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
	 * M�todo respons�vel por sacar incluindo a taxa do banco, repassando o valor para o
	 * m�todo da classe super.
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
	 * M�todo que deposita valores.
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
	 * M�todo getter do valor do imposto.
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

