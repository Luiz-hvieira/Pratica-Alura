/**
 * Classe que representa a exce��o do saque quando n�o h� saldo na conta.
 * 
 * @author Luiz Henrique Vieira Steff
 * @version 1.0
 */

package br.com.bytebank.banco.Modelo;

		
public class SaldoInsuficienteException extends Exception {
	/**
	 * Construtor da exce��o que repassa par�metro � sua super classe Exception.
	 * 
	 * @param msg
	 * 		Mensagem a ser exibida no console.
	 * @since 1.0
	 */
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
	
}
