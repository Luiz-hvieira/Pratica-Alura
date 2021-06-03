/*
 *Author: Luiz Henrique Vieira Steff
 *
 *
 *Classe respons�vel por testar a implementa��o dos m�todos da conta corrente e poupan�a. 
 * 
 */

package br.com.bytebank.banco.test;

import br.com.bytebank.banco.Modelo.ContaCorrente;
import br.com.bytebank.banco.Modelo.ContaPoupanca;

public class Testa {
	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(111, 111);
		cc.deposita(100);
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);
		
		// cc.transfere(10, cp);
		
		System.out.println("CC "+cc.getSaldo());

		System.out.println("CP "+cp.getSaldo());
	}
}
