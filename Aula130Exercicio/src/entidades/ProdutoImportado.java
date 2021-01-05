package entidades;

public final class ProdutoImportado extends Produto{
		private Double taxaImportacao;
		
	//Declarando Construtores:
	ProdutoImportado(){
		super();
	}
	
	public ProdutoImportado(String nome, Double preco, Double taxa){
		super(nome, preco);
		this.taxaImportacao = taxa;
	}

	
	//Declarando Metodos Getters e Setters:
	public Double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(Double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}
	
	//Método de sobrescrita da emissão de etiqueta:
	@Override
	public void etiquetaProduto() {
		System.out.println(getNome() + ", Valor: R$" + String.format("%.2f", getPreco()) + ", Taxa de Importação: R$" + String.format("%.2f",getTaxaImportacao()) + ".");
		System.out.println("Valor Total: R$" + String.format("%.2f", getPreco()+getTaxaImportacao()) + ".\n");
	}
}
