package br.com.gft.model;
import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto
{
	private String autor;
	private String tema;
	private int qtdPag;

	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag)
	{
		super(nome, preco, qtd);
		this.setAutor(autor);
		this.setTema(tema);
		this.setQtdPag(qtdPag);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public double calculaImposto() 
	{
		double imp = 0;
		if(this.tema == "educativo")
		{
			System.out.println("Livro educativo não tem imposto: " + this.nome + ".");
			return 0;
		}
		else
		{
			imp = preco * 0.1;
			System.out.println("R$" + imp + " de impostos sobre o livro " + this.nome + ".");
			return imp;
		}
	}

	
}
