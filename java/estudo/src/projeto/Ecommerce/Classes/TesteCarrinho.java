package projeto.Ecommerce.Classes;

import java.util.ArrayList;
import java.util.List;

public class TesteCarrinho {

	public static void main(String[] args)
	{
		
		List<Produto> produtos = new ArrayList<Produto>();

		Produto produto1 = new Produto("Fantasia Arlequina", 200.50, 10);
		Produto produto2 = new Produto("Fantasia Pantera Negra", 120.00, 10);
		Produto produto3 = new Produto("Fantasia Super Man", 179.99, 10);
		Produto produto4 = new Produto("Fantasia Homem Aranha", 225.50, 10);
		Produto produto5 = new Produto("Fantasia Wolverine", 209.99, 10);
		Produto produto6 = new Produto("Fantasia Pikachu", 190.00, 10);
		Produto produto7 = new Produto("Fantasia Caveira", 70.99, 10);
		Produto produto8 = new Produto("Fantasia Branca de Neve", 150.00, 10);
		Produto produto9 = new Produto("Fantasia Policial", 75.89, 10);
		Produto produto10 = new Produto("Fantasia Bombeiro", 85.00, 10);
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		produtos.add(produto5);
		produtos.add(produto6);
		produtos.add(produto7);
		produtos.add(produto8);
		produtos.add(produto9);
		produtos.add(produto10);
		
		
		Carrinho car = new Carrinho(produtos, 0);
		
		for (Produto produto : produtos) 
		{
			System.out.println(produto.toString());
		}
		
		
		
		for (Produto produto: produtos) 
		{
			System.out.println(
					produtos.indexOf(produto) + "        ║     \t " + produto.getQtd() + "\t║     " + produto.getNome() + "          \t\t║  " + produto.getPreco());
		}
		
		car.inserirProduto(0, 3);
		
		car.visualizarCarrinho();
		
		car.inserirProduto(4, 3);
		
		car.visualizarCarrinho();
		
		
		for (Produto produto: produtos) 
		{
			System.out.println(
					produtos.indexOf(produto) + "        ║     \t " + produto.getQtd() + "\t║     " + produto.getNome() + "          \t\t║  " + produto.getPreco());
		}
		
		System.out.println(car.getSubtotal());
		
		car.alterarProduto(1, 5);
		
		for (Produto produto: produtos) 
		{
			System.out.println(
					produtos.indexOf(produto) + "        ║     \t " + produto.getQtd() + "\t║     " + produto.getNome() + "          \t\t║  " + produto.getPreco());
		}
		
		car.visualizarCarrinho();
		
		car.alterarProduto(1, 2);
		
		for (Produto produto: produtos) 
		{
			System.out.println(
					produtos.indexOf(produto) + "        ║     \t " + produto.getQtd() + "\t║     " + produto.getNome() + "          \t\t║  " + produto.getPreco());
		}
		
		car.visualizarCarrinho();

	}

}
