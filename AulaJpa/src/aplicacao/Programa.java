package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("1", "Melquias","melquias10.mr@gmail.com");
		Pessoa p2 = new Pessoa("2", "carlos","carlos10.mr@gmail.com");
		Pessoa p3 = new Pessoa("3", "Miqueis","miqueias10.mr@gmail.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
