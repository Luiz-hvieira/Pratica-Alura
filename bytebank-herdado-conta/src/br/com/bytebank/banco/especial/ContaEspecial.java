/**
 * Classe conta especial, herda da classe Conta.
 * 
 * @author Luiz Henrique Vieira Steff
 * @version 1.0
 */

package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.Modelo.Conta;

public class ContaEspecial extends Conta {
	
	/**
	 * Construtor da classe Conta especial, usa o construtor da classe m�e Conta.
	 * 
	 * @param agencia
	 * 		N�mero de identifica��o da ag�ncia vinculada a conta.
	 * @param numero
	 * 		Identifica��o da pr�pria conta 
	 * @since 1.0
	 */
	
	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
		}
	@Override
	public void deposita(double valor) {
		super.saldo += valor; 

	}

}
