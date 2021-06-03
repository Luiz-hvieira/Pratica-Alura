/**
 * Classe respons�vel pelo c�lculo dos valores tributados
 * 
 * @author Luiz Henrique Vieira Steff
 * @version 1.0
 * 
 */

package br.com.bytebank.banco.Modelo;

// br.com.bytebank.banco.modelo.CalculadorDeImposto ->FQN 
public class CalculadorDeImposto {
	private double totalImposto;
	
	/**
	 * M�todo respons�vel por registrar no objeto os valores, recebendo um ponteiro
	 * do tipo tribut�vel.
	 * 
	 * @author Luiz Henrique Vieira Steff
	 * @version 1.0
	 * 
	 * @param t
	 */
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	/**
	 * M�todo que devolve o valor total do imposto contabilizado
	 * 
	 * @author Luiz Henrique Vieira Steff
	 * @version 1.0
	 * 
	 * @return 
	 */
		
	public double getTotalImposto() {
		return totalImposto;
	}
	
}
