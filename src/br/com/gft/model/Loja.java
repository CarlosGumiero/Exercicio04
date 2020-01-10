package br.com.gft.model;
import java.util.List;

public class Loja 
{
	private String nome;
	private String cnpj;
	private List <Livro> livros;
	private List <VideoGame> videoGames;
	
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) 
	{
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}
	
	public void listaLivros()
	{
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("A loja Americanas Possui estes livros para venda:");
		for (Livro livro : livros) 
		{
			System.out.println("Titulo: " + livro.getNome() + ", preço: " + livro.getPreco() + ", quantidade: " + livro.getQtd() + " em estoque.");
		}
	}
	
	public void listaVideoGames()
	{
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("A loja Americanas Possui estes video-games para venda:");
		for (VideoGame games : videoGames)
		{
			System.out.println("Video-game: " + games.getModelo() + ", preço: " + games.getPreco() + ", quantidade: " + games.getQtd() + " em estoque.");
		}
	}
	
	public double calculaPatrimonio()
	{
		System.out.println("-----------------------------------------------------------------------");
		double patrimonio = 0;
		
		if(livros.size() == 0)
		{
			
			System.out.println("A loja não tem livros no seu estoque.");
		}
		else
		{
			for (Livro livro : livros) 
			{
				patrimonio = patrimonio + (livro.getPreco() * livro.getQtd());
			}
		}
		
		if(videoGames.size() == 0)
		{
			System.out.println("A loja não tem video-games no seu estoque.");
		}
		else
		{
			for (VideoGame games : videoGames) 
			{
				patrimonio = patrimonio + (games.getPreco() * games.getQtd());
			}
		}
		
		System.out.println("O patrimonio da loja: Americanas é de R$ " + patrimonio + ".");
		return patrimonio;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
}
