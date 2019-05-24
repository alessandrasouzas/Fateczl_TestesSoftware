package com.fatec.model;

public class Funcionario {
	String nome;
	String rg;
	double valorHora;

	public Funcionario(String umNome, String umRg, double umValorHora) {
		setNome(umNome);
		setRg(umRg);
		setValorHora(umValorHora);
	}

	public void setNome(String nome) {
		if (nome == "" | nome == null)
			
			throw new RuntimeException("Nome invalido");			
		this.nome = nome;
	}
	
	public void setRg(String rg) {
		if (rg == "" | rg == null)
			throw new RuntimeException("Rg invalido");
		this.rg = rg;
	}

	
	public void setValorHora(double valorHora) {
		if (valorHora<=0 )
			throw new RuntimeException("Valor invalido");
		this.valorHora = valorHora;
	}
	
	
	public String getNome() {
		return nome;
	}

	public String getRg() {
		return rg;
	}


	public double getValorHora() {
		return valorHora;
	}


	public double salarioBruto(int nroHorasTrabalhadas) {
		return (valorHora * nroHorasTrabalhadas);
	}

	public double salarioLiquido(double salarioBruto) {
		double inss = salarioBruto * 0.1;
		double ir = 0; // Se salario < 2000
		
		
		if ((salarioBruto >= 2000) && (salarioBruto <=5000.0))
			ir = salarioBruto * 0.15;
		
		
		return (salarioBruto - inss - ir);
	}

}
