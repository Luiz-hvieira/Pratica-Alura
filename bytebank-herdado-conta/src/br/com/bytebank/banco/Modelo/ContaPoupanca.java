/**
 * Classe Conta poupan�a, herda da classe conta, n�o cobra taxa de saques.
 * 
 * @author Luiz Henrique Vieira Steff
 * @version 1.0
 */

package br.com.bytebank.banco.Modelo;

public class ContaPoupanca extends Conta {
	
	/**
	 * Construtor da classe, chama o construtor da classe m�e Conta repassando os par�metros.
	 * 
	 * @param agencia
	 * 		N�mero de identifica��o da ag�ncia vinculada a conta.
	 * @param numero
	 * 		Identifica��o da pr�pria conta 
	 * @since 1.0
	 */
	
	public ContaPoupanca(int agencia, int numero) {
		super (agencia, numero);
	}
	
	/**
	 * M�todo que realiza o dep�sito de uma quantia na conta.
	 * 
	 * @param valor
	 * 		Quantia a ser depositada
	 * @since 1.0
	 */
	
	@Override
	public void deposita(double valor) {
		super.saldo+=valor;		
	}
}
