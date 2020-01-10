package br.com.gft.model;

public class VideoGame extends Produto {
	
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	public VideoGame() {
		
	}

	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isUsado() {
		return isUsado;
	}
	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	public void calculaImposto() {
		if (this.isUsado() == true) {
			System.out.println("O imposto sobre do " + this.getNome() + " usado é de " + (this.getPreco()*0.25) + " reais.");
	
		} else {
		    System.out.println("O imposto sobre o " + this.getNome() + " é de " + (this.getPreco()*0.45)+ " reais.");
	
		}
	}
	
	
}