package entidades;

public class Produto {
	protected String nome;
	protected Double preco;
	
	//Declarando os Construtores:
	public Produto() {
	}
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//Declarando Getters e Setters:
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPreco() {
		return this.preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	//Declarando método daetiqueta que será impressa:
	public void etiquetaProduto() {
		System.out.println(getNome() + ", Valor: R$" + String.format("%.2f", getPreco()) + ".\n" );
	}
	
}
