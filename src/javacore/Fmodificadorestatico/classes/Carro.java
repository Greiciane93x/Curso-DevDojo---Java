package javacore.Fmodificadorestatico.classes;

public class Carro {
	
	private String nome; 
	private double velocidadeMaxima; 
	private double velocidadeLimite = 240;
	
	public Carro() {
	
	}
	
	public Carro(String nome, double velocidadeMaxima) {
	
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima; 
	}
	
	public void imprime() {
		System.out.println(this.nome);
		System.out.println(this.velocidadeMaxima);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public double getVelocidadeLimite() {
		return velocidadeLimite;
	}
	public void setVelocidadeLimite(double velocidadeLimite) {
		this.velocidadeLimite = velocidadeLimite;
	} 
	
	
	

}
