package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class ProdutoUsado extends Produto{
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataFab; 

	
	//Construtores:
	public ProdutoUsado(){
		super();
	}
	
	public ProdutoUsado(String nome, Double preco, Date data) {
		super(nome,preco);
		this.dataFab = data;
	}

	//Getters e Setters:
	
	public Date getDataFab() {
		return dataFab;
	}

	public void setDataFab(Date dataFab) {
		this.dataFab = dataFab;
	}
	
	//Método de sobrescrita da emissão de etiqueta:
	@Override
	public void etiquetaProduto() {
		System.out.println(getNome() + ", R$" + String.format("%.2f", getPreco()) + " Data Fabricação: " + sdf.format(getDataFab()) +".\n" );
	}
	
	
}
