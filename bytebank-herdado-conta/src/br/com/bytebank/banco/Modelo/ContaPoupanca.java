/**
 * Classe Conta poupança, herda da classe conta, não cobra taxa de saques.
 * 
 * @author Luiz Henrique Vieira Steff
 * @version 1.0
 */

package br.com.bytebank.banco.Modelo;

public class ContaPoupanca extends Conta {
	
	/**
	 * Construtor da classe, chama o construtor da classe mãe Conta repassando os parâmetros.
	 * 
	 * @param agencia
	 * 		Número de identificação da agência vinculada a conta.
	 * @param numero
	 * 		Identificação da própria conta 
	 * @since 1.0
	 */
	
	public ContaPoupanca(int agencia, int numero) {
		super (agencia, numero);
	}
	
	/**
	 * Método que realiza o depósito de uma quantia na conta.
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
