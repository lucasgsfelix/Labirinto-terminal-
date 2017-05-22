package Labirinto;
import java.util.Random;
import java.util.ArrayList;

public class Trolls {
	
	int machado;
	String nome;
	int salaInicial;
	int salaAtualTroll;
	int idTroll;
	public int getIdTroll() {
		return idTroll;
	}

	public void setIdTroll(int idTroll) {
		this.idTroll = idTroll;
	}
	Random gerador = new Random();

	public int getSalaAtualTroll() {
		return salaAtualTroll;
	}

	public void setSalaAtualTroll(int salaAtualTroll) {
		this.salaAtualTroll = salaAtualTroll;
	}

	public int getSalaInicial() {
		return salaInicial;
	}

	public void setSalaInicial(int salaInicial) {
		this.salaInicial = salaInicial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMachado() {
		return machado;
	}

	public void setMachado(int machado) {
		this.machado = machado;
	}

	public void pickUp(Mapa mapaFinal, int salaTroll, int salaAtual)
	{ //método que permite pegar machado
		String objeto = "machado";
		int a=0;
		for(int i=0;i<mapaFinal.mapa.get(salaTroll).itensSala.size();i++)
		{
			if((mapaFinal.mapa.get(salaTroll).itensSala.get(i)).equals(objeto))
			{
				a=1;//o que quer dizer que há o objeto na sala
			}
		}	
		if((a==1)&&(salaAtual-1==salaTroll))
		{
			if(getMachado()==0)
			{
				setMachado(getMachado()+1);
				mapaFinal.mapa.get(salaTroll).itensSala.remove("machado");
			
			}
		}
	}
	
	public void arremessar(int salaAtual, int salaTroll, Jogador j)
	{ //esse método faz com se perca o machado
		
		if((getMachado()==1)&&(salaAtual-1==salaTroll))
		{
			System.out.print("\nO troll "+getNome()+" que está na sala "+ salaAtualTroll+1 + " lhe acertou o machado!\n");
			setMachado(getMachado()-1);
			if(j.mochila.getPocao()>0)
			{
				j.mochila.setPocao(j.mochila.getPocao()-1);
			}
			else if((j.mochila.getGold()>0)||(j.mochila.getDiamantes()>0))
			{
				j.mochila.setPocao(j.mochila.getPocao()*0);
				j.mochila.setDiamantes(j.mochila.getDiamantes()*0);
			}
		}
	}
	public void mover(Mapa mapaFinal, int salaAtual){
		int aux = gerador.nextInt(2);
		
		int a=getSalaAtualTroll();
		if(aux==0)
		{
			if(getSalaAtualTroll()==19)
			{
				setSalaAtualTroll(getSalaAtualTroll()-1);
			}
			else 
			{
				setSalaAtualTroll(getSalaAtualTroll()+1);
			}
		}
		else 
		{
			if(getSalaAtualTroll()==0)
			{
				setSalaAtualTroll(getSalaAtualTroll()+1);
			}
			else
			{
				setSalaAtualTroll(getSalaAtualTroll()-1);
			}
		}
		for(int i=0; i<mapaFinal.mapa.get(a).trollsSala.size();i++)
		{
			if(mapaFinal.mapa.get(a).trollsSala.get(i).getIdTroll()==(getIdTroll()))
			{
				mapaFinal.mapa.get(getSalaAtualTroll()).trollsSala.add(mapaFinal.mapa.get(a).trollsSala.get(i));
				mapaFinal.mapa.get(a).trollsSala.remove(mapaFinal.mapa.get(a).trollsSala.get(i));
			}
		}

	}

}
