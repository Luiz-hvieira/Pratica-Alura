/**
 * Interface Tributavel usada para estabelecer polimorfismo entre outas classes do c�digo.
 * 
 * @author Luiz Henrique
 * @version 1.0
 */

package br.com.bytebank.banco.Modelo;

public interface Tributavel {
	/**
	 * Assinatura do m�todo getter do valor do imposto.
	 * 
	 * @return
	 * 		Retorna em double.
	 */
	public abstract double getValorImposto();
}
