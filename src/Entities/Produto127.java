package Entities;

public class Produto127 {

	protected String nome;
	protected double preco;
	
	public Produto127() {
	}

	public Produto127(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String precoTag() {
		return nome + " $ " + preco;
	}
}
