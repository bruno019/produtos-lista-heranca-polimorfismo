package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = new Date();
		Scanner sc = new Scanner(System.in);
		
	/*TESTE DAS CLASSES:	
		Produto q = new Produto("Papel",55.00);
		q.etiquetaProduto();
		
		
		Produto w = new ProdutoImportado("Tesoura",55.00, 12.00);
		w.etiquetaProduto();
		
		Date date = sdf.parse("25/12/2014");
		Produto k = new ProdutoUsado("Carro", 15000.00,date );
		k.etiquetaProduto();
	*/
		//Inicio Programa:
		System.out.println("Entre com o numero de produtos: ");
		int nprod = sc.nextInt();
		List<Produto> listProd = new ArrayList<Produto>();
		
		//loop de insercao de itens na lista de produtos
		for(int i=1; i<=nprod; i++) {
			System.out.println("Produto nº" + i);
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			sc.nextLine();
			System.out.println();
			
			//parte do codigo que identifica a condição (novo usado ou importado) do produto:
			System.out.print("Produto é Novo, Usado, ou Importado? (n/u/i): ");
			char condicao = sc.next().charAt(0);
			
			if(condicao =='n') {
				listProd.add(new Produto(nome, preco));
			}else if(condicao =='u') {
				System.out.print("Data de Fabricacao: ");
				Date df = sdf.parse(sc.next());
				listProd.add(new ProdutoUsado(nome, preco, df));
			}else {
				System.out.print("Valor de Importação: R$");
				double valor = sc.nextDouble();
				listProd.add(new ProdutoImportado(nome,preco,valor));
			}
			
		}
		
		System.out.println("Lista de Produtos Inseridos: ");
		for(Produto p : listProd) {
			p.etiquetaProduto();
		}
		
		
		sc.close();
	}
	

}
