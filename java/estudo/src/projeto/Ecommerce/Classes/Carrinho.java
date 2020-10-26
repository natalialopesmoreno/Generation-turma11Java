package projeto.Ecommerce.Classes;

import java.util.ArrayList;
import java.util.List;

public class Carrinho 
{
	
	private List<Produto> produtosCarrinho;
	private List<Produto> produtos;
	private double subtotal;
	private int totalItens;
	

	
	//CONSTRUTOR
	
	public Carrinho () 
	{
		this.produtosCarrinho = new ArrayList<Produto>();
	}
	
	
	
	public Carrinho(List<Produto> produtos, int subtotal) 
	{
		this.produtos = produtos;
		this.setSubtotal(subtotal);
		this.produtosCarrinho = new ArrayList<Produto>();
		
		
		for (Produto produto : produtos) 
		{
			Produto pn = new Produto(produto.getNome(), produto.getPreco(), produto.getQtd(), produtos.indexOf(produto));
			this.produtosCarrinho.add(pn);
			
		}
		
		for (Produto produto : produtosCarrinho) 
		{
			produto.setQtd(0);
			
		}
	}




	//GETTER AND SETTER
	
	
	
	public List<Produto> getProdutosCarrinho() 
	{
		return produtosCarrinho;
	}
	
	
	public double getSubtotal() 
	{
		return this.subtotal;
	}



	public void setSubtotal(double subtotal) 
	{
		this.subtotal = subtotal;
	}
	
	public int getTotalItens() {
		return totalItens;
	}



	public void setTotalItens(int totalItens) {
		this.totalItens = totalItens;
	}

	//MÉTODOS
	
	public Produto buscarProdutoCatalogo( int index)
	{
		Produto produto = new Produto();
		produto = this.produtos.get(index);
		return produto;
	}
	
	public Produto buscarProdutoCarrinho(int index) 
	{
		Produto produto = this.produtosCarrinho.get(index);
		
		return	produto;
				
	}
	
	
	public boolean inserirProduto(int index, int qtd) 
	{
		
		
		if (qtd <= this.buscarProdutoCatalogo(index).getQtd() && qtd > 0) 
		{
			
			Produto produto = this.buscarProdutoCarrinho(index);
			produto.setQtd(qtd);
			
			//MODIFICANDO O ESTOQUE
			this.produtos.get(index).setQtd(this.produtos.get(index).getQtd() - qtd);

			
			
			
			System.out.printf("\nO produto %s foi adicionado ao seu carrinho!", produto.getNome());
			//ATUALIZANDO O SUBTOTAL
			this.setSubtotal(this.getSubtotal() + (produto.getPreco()* qtd));
			setTotalItens(getTotalItens()+1);
			return true;
			
		} else 
		{
			System.out.printf("\nEsta quantidade não está disponível! Só há %d itens deste produto \n",
			this.produtos.get(index).getQtd());
			return false;
			

		}
	}
	
	
	
	
	public boolean removerProduto(int index) 
	{
		
		Produto produto = this.buscarProdutoCarrinho(index);
		if(this.produtosCarrinho.contains(produto)) 
		{
		//Atualizando Carrinho
		
		System.out.printf("O produto %s foi removido do seu carrinho!", produto.getNome());
		int qtd = produto.getQtd();
		this.setSubtotal(this.getSubtotal() - (produto.getPreco()* produto.getQtd()));
		setTotalItens(getTotalItens()-1);
		produto.setQtd(0);
		//Atualizando o ESTOQUE
		
		Produto produtoEstoque = this.buscarProdutoCatalogo(produto.getCodigo());
		produtoEstoque.setQtd(produtoEstoque.getQtd() + qtd);
		return true;
		}
		else 
		{
			return false;
		}
		
	}
	
	
	
	public boolean alterarProduto(int index, int qtd) 
	{
		Produto produto = this.buscarProdutoCarrinho(index);
		Produto produtoEstoque = this.buscarProdutoCatalogo(produto.getCodigo());
		
		if(this.produtosCarrinho.contains(produto)) 
		{
			//REDUZINDO A QUANTIDADE
			if(qtd <= produto.getQtd() && qtd >= 0)
			{
			//ALTERANDO CARRINHO
			int diferenca = produto.getQtd() - qtd;
			produto.setQtd(qtd);
			setSubtotal(getSubtotal() - (produto.getPreco()*diferenca));
			//ALTERANDO O ESTOQUE
			produtoEstoque.setQtd(produtoEstoque.getQtd() + diferenca);
			
			}//AUMENTANDO A QUANTIDADE
			else if(qtd > produto.getQtd() && qtd <= produtoEstoque.getQtd() ) 
			{
				//ALTERANDO O CARRINHO
				int diferenca = qtd - produto.getQtd();
				produto.setQtd(qtd);
				setSubtotal(getSubtotal() + (produto.getPreco()*diferenca));
				//ALTERANDO O ESTOQUE
				produtoEstoque.setQtd(produtoEstoque.getQtd() - diferenca);
			}
			
		System.out.printf("\nO produto %s foi alterado para %d unidades", produto.getNome(), produto.getQtd());
		return true;
		
		}
		else 
		{
			return false;
		}

	}
	
	
	
	public void visualizarCarrinho() 
	{
		System.out.println(
				"\n══════════════════════════ PRODUTOS CARRINHO  ═════════════════════════════════\n");
		System.out.print("CÓD ═══════════ QTDE ════════════ PRODUTO ═══════════════════════════════ PREÇO\n");
		

		for (Produto produto : produtosCarrinho) 
		{
			if(produto.getQtd()> 0) 
			{
			System.out.println(
					produtosCarrinho.indexOf(produto) + "        ║     \t " + produto.getQtd() + "\t║     " + produto.getNome() + "          \t\t║  " + produto.getPreco());
			}
		}
		
		System.out.println("═══════════════════════════════════════════════════════════════════════════════");
		System.out.println();
		System.out.println("TOTAL DE ITENS NO CARRINHO: "+ totalItens);
		System.out.println();
		System.out.printf("\nSUBTOTAL DA COMPRA: R$ %.2f \n", subtotal);
		
	}

	
	
}
