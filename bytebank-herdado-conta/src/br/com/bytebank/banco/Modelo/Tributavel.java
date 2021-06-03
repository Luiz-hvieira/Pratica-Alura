/**
 * Interface Tributavel usada para estabelecer polimorfismo entre outas classes do código.
 * 
 * @author Luiz Henrique
 * @version 1.0
 */

package br.com.bytebank.banco.Modelo;

public interface Tributavel {
	/**
	 * Assinatura do método getter do valor do imposto.
	 * 
	 * @return
	 * 		Retorna em double.
	 */
	public abstract double getValorImposto();
}
