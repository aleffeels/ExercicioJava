package cachorro;

public class cachorrinhos {		//Criação da classe "cachorrinhos"
	
	private String nome; //Atributo 1
	private String raca;	//Atributo 2	
	private coleira Coleira;

	//Construtor com parametros (nome,raca) e assinatura "publica".
	public cachorrinhos(String nome, String raca) 
 	{
		this.nome = nome;
		this.raca = raca;
    }
	
	//Métodos getters:
		public String getnome(){
			return nome;
		}
		
		public String getraca(){
			return raca;
		}

		//Métodos setters:	
		public void setnome(String nome) {
	        	this.nome=nome;
	    	}
		
		public void setraca(String raca) {
	        	this.raca=raca;
	    	}
		
	//Construtor da classe coleira que vamos associar aos cachorrinhos
		public void setcoleira(coleira novacoleira) {
			Coleira = novacoleira;
		}
		
		public coleira getcoleira(){
		return Coleira;
		}
	
	//Construtor padrão, sem aparametros, com assinatura "publica"
	public cachorrinhos() {
		
	}
	
	
	//Dois métodos a mais que a questão pede.
	public void latir(){
		System.out.println("Au Au Au, latiu o " + getnome());
	}
	
	public void rosnar(){
		System.out.println("Grrrrrr!");
	}
	
	//Corpo da função principal(main):
	public static void main(String[] args)
	{
		cachorrinhos c1 = new cachorrinhos();	//Objeto da classe(c1)
		c1.setnome("Pitoco"); 
		c1.setraca("Vira-Lata");
		System.out.println("Nome do dog: " + c1.getnome());
		System.out.println("Raca: " + c1.raca);
		c1.latir();
		
		cachorrinhos c2 = new cachorrinhos();	//Objeto da classe(c2)
		c2.setnome("Belinha"); 
		c2.setraca("Poodle");
		
		System.out.println("Nome do dog: " + c2.getnome());
		System.out.println("Raca: " + c2.raca);
		c2.rosnar();
		
		//Fazendo associação com as coleiras e cachorrinhos
		coleira x1 = new coleira("Rosa");
		coleira x2 = new coleira("Azul");
		
		c1.setcoleira(x1);
		c2.setcoleira(x2);
		
		System.out.println(c1.getnome() + " usa a coleira " + c1.getcoleira().getCor());
		System.out.println(c2.getnome() + " usa a coleira " + c2.getcoleira().getCor());
		System.exit(0);
	}
}
