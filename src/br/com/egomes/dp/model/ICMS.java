package br.com.egomes.dp.model;

public class ICMS implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor() * 0.05 + 50;
	}

}
