package com.fatec.testeUnitario;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.fatec.model.Funcionario;

class UC01CadastrarFuncionario {
	
	public  static Funcionario umFuncionario;
	@Test
	public void CT01CadastrarFuncionarioDadosValidos() {
		try {
			// cenario
			Funcionario umFuncionario;
			// acao
			umFuncionario = new Funcionario("Jose da Silva", "111111", 25.00);
			umFuncionario.getNome();
			umFuncionario.getRg();
			umFuncionario.getValorHora();
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}

	@Test
	public void CT01CadastrarFuncionarioCom_nome_vazio() {
		// cenario
		Funcionario umFuncionario;
		try {
			// acao
			umFuncionario = new Funcionario("", "111111", 25.00);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	public void CT01CadastrarFuncionarioCom_nome_nulo() {
		// cenario
		Funcionario umFuncionario;
		try {
			// acao
			umFuncionario = new Funcionario(null, "111111", 25.00);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	
	
	@Test
	public void CT01CadastrarFuncionarioCom_rg_vazio() {
		// cenario
		Funcionario umFuncionario;
		try {
			// acao
			umFuncionario = new Funcionario("Jose da Silva", "", 25.00);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Rg invalido", e.getMessage());
		}
	}
	public void CT01CadastrarFuncionarioCom_rg_nulo() {
		// cenario
		Funcionario umFuncionario;
		try {
			// acao
			umFuncionario = new Funcionario("Jose da Silva", null, 25.00);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Rg invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT01CadastrarFuncionarioCom_valorHora_igual_a_zero() {
		// cenario
		Funcionario umFuncionario;
		try {
			// acao
			umFuncionario = new Funcionario("Jose da Silva", "111111", 0);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Valor invalido", e.getMessage());
		}
	}
	
	
	
	@Test
	public void CT01CadastrarFuncionarioCom_valorHora_menor_que_zero() {
		// cenario
		Funcionario umFuncionario;
		try {
			// acao
			umFuncionario = new Funcionario("Jose da Silva", "111111", -1);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			assertEquals("Valor invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT01SalarioLiquido_menor_que_2000() {
		// cenario
		Funcionario umFuncionario;
		try {
			// acao
			umFuncionario = new Funcionario("Jose da Silva", "111111", 10);
			umFuncionario.salarioLiquido(umFuncionario.salarioBruto(40));
		} catch (RuntimeException e) {
			fail("deveria lançar uma exceção");
		}
	}
	
	
	@Test
	public void CT01SalarioLiquido_entre_2000_e_5000() {
		// cenario
		Funcionario umFuncionario;
		try {
			// acao
			umFuncionario = new Funcionario("Jose da Silva", "111111", 200);
			umFuncionario.salarioLiquido(umFuncionario.salarioBruto(10));
			//fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			fail("deveria lançar uma exceção");
		}
	}
	
	@Test
	public void CT01SalarioLiquido_maior_5000() {
		// cenario
		Funcionario umFuncionario;
		try {
			// acao
			umFuncionario = new Funcionario("Jose da Silva", "111111", 600);
			umFuncionario.salarioLiquido(umFuncionario.salarioBruto(10));
		} catch (RuntimeException e) {
			fail("deveria lançar uma exceção");
		}
	}	
	

	
	
}