package br.com.gft.model;


public class Livros extends Produto {
	private String autor;
	private String tema;
	private int qtdPag;
	
	public Livros () {
		
	}
	
	public Livros(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome,preco,qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;		
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
	
	public void calculaImposto() {
		if(tema == "educativo") {
			System.out.println("O " + this.getNome() + " não tem imposto aplicado.");
		} else {
			System.out.println("O " +this.getNome() + " tem um imposto de " + (this.getPreco()*0.1) +" reais sobre ele.");
		}	
	}
}