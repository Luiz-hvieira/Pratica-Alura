/**
 * Classe que representa o seguro de vida, implementa a interface tributável.
 * 
 * @author Luiz Henrique
 * @version 1.0
 */

package br.com.bytebank.banco.Modelo;

public class SeguroDeVida implements Tributavel {
	
	/**
	 * Método getter do valor do imposto, retorna o valor padrão estabelecido em aula de 42.
	 * 
	 * @return 
	 * 		retorna em double o número: 42.
	 * 
	 */
	
	@Override
	public double getValorImposto() {
		return 42;
	}

}
