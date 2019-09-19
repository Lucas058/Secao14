package Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Produto127;
import Entities.ProdutoImportado127;
import Entities.ProdutoUsado127;

public class Aula127 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto127> lista = new ArrayList<>();
		
		System.out.print("Entre com o número de produtos: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Produto #" + i);
			System.out.print("Comum, usado ou importado (c/u/i)?");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			
			if(ch == 'c'){
				lista.add(new Produto127 (nome, preco));
				
			}else if(ch == 'u'){
				System.out.print("Data de Fabricação (DD/MM/AAAA): ");
				Date fabricacao = sdf.parse(sc.next());
				lista.add(new ProdutoUsado127(nome, preco, fabricacao));
				
			}else if(ch == 'i') {
				System.out.print("Taxa de importação: ");
				double taxa = sc.nextDouble();
				lista.add(new ProdutoImportado127(nome, preco, taxa));
				
			}else {
				System.out.println("Tipo inexixtente!");
			}
		}
		
		System.out.println("Etiqueta de preço: ");
		for(Produto127 p : lista) {
			System.out.println(p.precoTag());
		}
		
		sc.close();
	}

}
