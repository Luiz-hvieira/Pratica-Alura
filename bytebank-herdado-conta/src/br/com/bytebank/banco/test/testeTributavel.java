/**
 * Teste do polimorfismo aplicado na classe Calculador de Imposto.
 * 
 * @author Luiz Henrique
 * @version 1.0
 */
package br.com.bytebank.banco.test;

import br.com.bytebank.banco.Modelo.CalculadorDeImposto;
import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.SeguroDeVida;

public class testeTributavel {
	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(222,333);
		cc.deposita(100);
		
		SeguroDeVida seguro= new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		System.out.println(calc.getTotalImposto());
	}
}
