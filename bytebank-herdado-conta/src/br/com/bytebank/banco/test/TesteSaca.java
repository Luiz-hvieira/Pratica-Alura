/**
 * Teste da operação saca implementando exceções ao código.
 * 
 * @author Luiz Henrique
 * @version 1.0
 */

package br.com.bytebank.banco.test;

import br.com.bytebank.banco.Modelo.Conta;
import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(200);
		try {
		conta.saca(210);
		} catch ( SaldoInsuficienteException ex ) {
			System.out.println(ex.getMessage());
		}
		System.out.println(conta.getSaldo());
	}

}
