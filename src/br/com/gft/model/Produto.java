package br.com.gft.model;

public abstract class Produto
{
	protected String nome;
	protected double preco;
	protected int qtd;
	
	
	public Produto(String nome, double preco, int qtd)
	{
		super();
		this.setNome(nome);
		this.setPreco(preco);
		this.setQtd (qtd);
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

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	
}
