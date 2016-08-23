package br.com.danielsilva;

import java.util.Scanner;

public class Estoque {

	String nome = "@DO";
	int quantidadeMinima = 5;
	int quantidadeAtual = 30;

	public void mudarNome(String nome) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome do novo produto");
		nome = entrada.nextLine();
		this.nome = nome;

	}

	public void mudarQuantidadeMinima(int quantidadeMinima) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu estoque minimo");
		quantidadeMinima = entrada.nextInt();

	}

	public void repor() {

		int reposicao = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu estoque reserva");
		reposicao = entrada.nextInt();
		quantidadeAtual += reposicao;
	}

	public void darBaixa() {

		int darBaixa = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade para dar baixa no seu estoque");
		darBaixa = entrada.nextInt();
		if (quantidadeMinima >= quantidadeAtual){
			quantidadeAtual -= darBaixa;	
		}
	}

	public String mostra() {

		String mostrar = "Nome do Produto " + nome + "Quantidade minima do seu estoque " + quantidadeMinima + " "
				+ "Estoque disponivel " + " " + quantidadeAtual;
		return mostrar;
	}

	public boolean precisaRepor() {
		if (quantidadeAtual <= quantidadeMinima) {
			return true;
		} else {
			return false;
		}
	}
}
