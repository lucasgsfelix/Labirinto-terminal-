package Labirinto;

public class Mochila extends Itens {
	
	//irá ter acesso aos métodos de itens
	//irá ser responsável por verificar a quantidade de machados e poções
	
	public int machado; 
	public int pocao;
	public int chave;
	public int gold;
	public int diamantes;
	
	
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public int getDiamantes() {
		return diamantes;
	}
	public void setDiamantes(int diamantes) {
		this.diamantes = diamantes;
	}
	public int itensMochila()
	{//retorna a quantidade de itens você tem na mochila
		if(machado+pocao+chave==5)
		{
			System.out.print("Sua mochila está cheia, você não pode colocar mais itens!");
			System.out.printf("Você tem 5 itens na mochila, %d machado(s), %d chave(s) e %d pocão(ões) !", machado, chave, pocao);
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public int mochilaVazia(String objeto)
	{
		if(machado+pocao+chave==0)
		{
			System.out.print("Você não tem nada para deixar pois, sua mochila está vazia");
			return 0;
		}
		else if((machado==0)&&(objeto.equals("machado")))
		{
			System.out.print("Você não pode largar o machado, pois você não possui nenhum! ");
			return 0;
		}
		else if((chave==0)&&(objeto.equals("chave")))
		{
			System.out.print("Você não pode largar a chave, pois você não possui nenhuma! ");
			return 0;
		}
		else if((pocao==0)&&(objeto.equals("pocao")))
		{
			System.out.print("Você não pode largar a poção, pois você não possui nenhuma! ");
			return 0;
		}
		else
		{
			return 1;
		}
	
		
	}
	public void viewMochila()
	{
		System.out.printf("Você tem %d itens na mochila, %d machado(s), %d chave(s) e %d pocão(ões) !", pocao+machado+chave, machado, chave, pocao);
	}
	public int getChave() {
		return chave;
	}
	public void setChave(int chave) {
		this.chave = chave;
	}
	
	public int getMachado() {
		return machado;
	}
	public void setMachado(int machado) {
		this.machado = machado;
	}
	public int getPocao() {
		return pocao;
	}
	public void setPocao(int pocao) {
		this.pocao = pocao;
	}
	

	

}
