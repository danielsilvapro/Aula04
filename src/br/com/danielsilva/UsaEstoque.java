package br.com.danielsilva;

public class UsaEstoque {

	public static void main(String[] args) {

		Estoque controlaTody = new Estoque("Todynho", 10, 50);
		Estoque celular = new Estoque("Galaxy", 15, 100);
		Estoque barbie = new Estoque("Barbie Sereia", 30, 100);

		controlaTody.darBaixa(5);
		System.out.println(controlaTody.mostra());
		controlaTody.precisaRepor();

		celular.repor(10);
		System.out.println(celular.mostra());
		celular.precisaRepor();

		barbie.darBaixa(10);
		System.out.println(barbie.mostra());
		barbie.precisaRepor();
	}
}