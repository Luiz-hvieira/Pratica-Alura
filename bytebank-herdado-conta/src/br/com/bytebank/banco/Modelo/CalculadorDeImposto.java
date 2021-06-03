/**
 * Classe responsável pelo cálculo dos valores tributados
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
	 * Método responsável por registrar no objeto os valores, recebendo um ponteiro
	 * do tipo tributável.
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
	 * Método que devolve o valor total do imposto contabilizado
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
