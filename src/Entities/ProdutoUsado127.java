package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado127 extends Produto127 {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date fabricacao;
	
	public ProdutoUsado127() {
		super();
	}

	public ProdutoUsado127(String nome, double preco, Date fabricacao) {
		super(nome, preco);
		this.fabricacao = fabricacao;
	}

	public Date getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(Date fabricacao) {
		this.fabricacao = fabricacao;
	}
	
	@Override
	public String precoTag() {
		return nome + " (usado) $ " + preco + " (Data de fabricação: "+ sdf.format(fabricacao) + ")";
	}
}
