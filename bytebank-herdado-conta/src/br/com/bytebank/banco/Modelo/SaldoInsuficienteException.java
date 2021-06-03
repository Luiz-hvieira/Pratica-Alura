/**
 * Classe que representa a exceção do saque quando não há saldo na conta.
 * 
 * @author Luiz Henrique Vieira Steff
 * @version 1.0
 */

package br.com.bytebank.banco.Modelo;

		
public class SaldoInsuficienteException extends Exception {
	/**
	 * Construtor da exceção que repassa parâmetro à sua super classe Exception.
	 * 
	 * @param msg
	 * 		Mensagem a ser exibida no console.
	 * @since 1.0
	 */
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
	
}
