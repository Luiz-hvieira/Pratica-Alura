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
	 * Construtor da classe Conta especial, usa o construtor da classe mãe Conta.
	 * 
	 * @param agencia
	 * 		Número de identificação da agência vinculada a conta.
	 * @param numero
	 * 		Identificação da própria conta 
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
