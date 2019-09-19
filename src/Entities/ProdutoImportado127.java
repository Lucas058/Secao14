package Entities;

public class ProdutoImportado127 extends Produto127 {

	private double taxa;
	
	public ProdutoImportado127() {
		super();
	}

	public ProdutoImportado127(String nome, double preco, double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
	public double precoTotal() {
		return getPreco() + taxa;
	}
	
	@Override
	public String precoTag() {
		return getNome() + " $ " + precoTotal() + " (Taxa de importação: $ "+ taxa + ")";
	}
	
	
}
