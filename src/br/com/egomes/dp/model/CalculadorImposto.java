package br.com.egomes.dp.model;

public class CalculadorImposto {
	
	public void calcula(Orcamento orcamento,Imposto estrategia) {
		System.out.println(estrategia.calcula(orcamento));
	}

}
