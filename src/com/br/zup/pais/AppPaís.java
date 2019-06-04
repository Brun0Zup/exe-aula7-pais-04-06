package com.br.zup.pais;

public class AppPaís {
	
	// Atributos
	
	private String iso;
	private String nome;
	private double populacao;
	private double dimensaoKm2;
	
	// Construtor
	public AppPaís(String iso, String nome, double populacao) {
		super();
		this.iso = iso;
		this.nome = nome;
		this.populacao = populacao;
		
	}
	
	public AppPaís (double dimensaoKm2) {
		this.dimensaoKm2 = dimensaoKm2;
	}
	
	// Getters and Setters

	public String getIso() {
		return iso;
	}

	public void setIso(String iso) {
		this.iso = iso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPopulacao() {
		return populacao;
	}

	public void setPopulacao(double populacao) {
		this.populacao = populacao;
	}

	public double getDimensaoKm2() {
		return dimensaoKm2;
	}

	public void setDimensaoKm2(double dimensaoKm2) {
		this.dimensaoKm2 = dimensaoKm2;
	}
	
	
	// toString
	
	// Aqui deve vir o @Override
		public String toString1() {
			
			String modelo = "";
			modelo += "O Iso é: " + this.getIso() + "\n";
			modelo += "O nome do País é: " + this.getNome() + "\n";
			modelo += "A qtd de população" + this.getPopulacao() + "\n";
		
			
			return modelo;
		}
		@Override
		public String toString() {
			
			String modelo = "";
			modelo += "Dimensão em km2 " + this.getDimensaoKm2() + "\n";
			return modelo;
}
}
