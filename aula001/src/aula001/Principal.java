package aula001;

import zoo.Leao;
import zoo.Onca;
import conta.ContaCorrente;
import conta.ContaPoupanca;
import conta.ModeloConta;
import generico.Generico;

public class Principal {

	public static void main(String[] args) {
		
//		Onca onca = new Onca();
//		Leao leao = new Leao();
//		
//		onca.retornarRugido();
//		leao.retornarRugido();
		
		Generico g = new Generico<String>();
		g.valor = "Sizenando Silva";
		System.out.println(g.valor);
		
		Generico n = new Generico<Integer>();
		n.valor = 10;
		System.out.println(n.valor);
		
		
		
	}

}
