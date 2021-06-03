/**
 * Classe que representa o seguro de vida, implementa a interface tribut�vel.
 * 
 * @author Luiz Henrique
 * @version 1.0
 */

package br.com.bytebank.banco.Modelo;

public class SeguroDeVida implements Tributavel {
	
	/**
	 * M�todo getter do valor do imposto, retorna o valor padr�o estabelecido em aula de 42.
	 * 
	 * @return 
	 * 		retorna em double o n�mero: 42.
	 * 
	 */
	
	@Override
	public double getValorImposto() {
		return 42;
	}

}
