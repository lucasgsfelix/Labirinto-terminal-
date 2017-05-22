package Labirinto;

import java.util.Random;
import java.util.Scanner;

final public class Jogador {
	
	String nome;
	private int pontuacao;
	Itens itens = new Itens();
	Mochila mochila = new Mochila();
	Random gerador = new Random();
	public void pickUp(Mapa mapaFinal, int salaAtual, String objeto)
	{ //método que permite pegar itens
		
		int aux, a=0;
		aux = mochila.itensMochila();
		for(int i=0;i<mapaFinal.mapa.get(salaAtual-1).itensSala.size();i++)
		{
			if((mapaFinal.mapa.get(salaAtual-1).itensSala.get(i)).equals(objeto))
			{
				a=1;//o que quer dizer que há o objeto na sala
			}
		}	
		if(a==1)	
		{
			if(aux==1)
			{
				if(objeto.equals("chave"))
				{
					System.out.printf("Uma %s foi adicionada na sua mochila!\n", objeto);
					mochila.setChave(mochila.getChave()+1);
				}
				else if(objeto.equals("machado"))
				{
					System.out.printf("Um %s foi adicionada na sua mochila!\n", objeto);
					mochila.setMachado(mochila.getMachado()+1);	
				}
				else if(objeto.equals("pocao"))
				{
					System.out.printf("Um %s foi adicionada na sua mochila!\n", objeto);
					mochila.setPocao(mochila.getPocao()+1);
				}
			}
			int random = gerador.nextInt(10)+1;
			if(objeto.equals("diamante"))
			{
				mochila.setDiamantes(mochila.getDiamantes()+random);
				System.out.print("Foi adicionado na sua mochila " + mochila.getDiamantes() + " diamantes! \n");
				
			}
			else if(objeto.equals("ouro"))
			{
				mochila.setOuro(mochila.getOuro()+random);
				System.out.print("Foi adicionado na sua mochila " + mochila.getOuro() + " ouros! \n");
				
			}
			mapaFinal.mapa.get(salaAtual-1).itensSala.remove(objeto);
		}
		else
		{
			System.out.printf("Não há o objeto %s nesta sala, procure em outra sala! \n", objeto);
		}
		
	}
	public void drop(Mapa mapaFinal, int salaAtual, String objeto)
	{ //método que permite deixar itens de lado
		int aux;
		aux = mochila.mochilaVazia(objeto);
		if(aux==1)
		{
			if(objeto.equals("machado"))
			{
				mochila.setMachado(mochila.getMachado()-1);
			}
			else if(objeto.equals("chave"))
			{
				mochila.setChave(mochila.getChave()-1);
			}
			else if(objeto.equals("pocao"))
			{
				mochila.setPocao(mochila.getPocao()-1);
				
			}
			mapaFinal.mapa.get(salaAtual-1).itensSala.add(objeto);
		}
	}	
	public void arremessar(Mapa mapaFinal, int salaAtual, String objeto)
	{ //esse método faz com se perca o machado
		int a=0;
		if(mapaFinal.mapa.get(salaAtual-1).getTrollsSala().size()>0)
		{
			if(mochila.getMachado()==0)
			{
				System.out.print("Você não possui machados para arremessar no Troll !\n");
			}
			else
			{
				for(int i=0;i<mapaFinal.mapa.get(salaAtual-1).getTrollsSala().size();i++)
				{
					if(mapaFinal.mapa.get(salaAtual-1).trollsSala.get(i).getNome().equals(objeto))
					{
						a=1;
					}
				}
				if(a==1)
				{//o que quer dizer que aquele troll está na sala
					System.out.printf("Você arremessou o machado e matou o Troll %s !\n", objeto);
					mochila.setMachado(mochila.getMachado()-1);
					for(int i=0;i<mapaFinal.mapa.get(salaAtual-1).getTrollsSala().size();i++)
					{
						if(mapaFinal.mapa.get(salaAtual-1).trollsSala.get(i).getNome().equals(objeto))
						{
							mapaFinal.mapa.get(salaAtual-1).trollsSala.remove(i);
						}
					}
				}
				else
				{
					System.out.printf("O troll %s não está nessa sala ou o troll não existe, digite o nome correto para o troll que está na sala!\n", objeto);
				}
				
			}
		}
		else
		{
			System.out.print("Você não pode arremessar o machado no troll pois, não há troll na sala !\n");
		}
	}
	private int verificaPorta(Mapa mapaFinal, int salaAtual, int proxSala, int porta)
	{
		if(mapaFinal.mapa.get(salaAtual-1).getPortas().get(porta).getEstadoPorta()==1)
		{
			proxSala = mapaFinal.mapa.get(salaAtual-1).getPortas().get(porta).getSalaAcessada();
			return proxSala;
		}
		else
		{
			if(mochila.getChave()>0)
			{
				proxSala = mapaFinal.mapa.get(salaAtual-1).portas.get(porta).getSalaAcessada();
				System.out.printf("A porta %s foi aberta !  \n", mapaFinal.mapa.get(salaAtual-1).getPortas().get(porta).getNome());
				mapaFinal.mapa.get(salaAtual).getPortas().get(porta).setEstadoPorta(1);
				for(int i=0;i<mapaFinal.mapa.get(proxSala-1).getPortas().size();i++)
				{
					int aux;
					aux = mapaFinal.mapa.get(proxSala-1).getPortas().get(i).getSalaAcessada();
					if(aux==salaAtual)
					{
						mapaFinal.mapa.get(proxSala-1).getPortas().get(i).setEstadoPorta(1);
					}
				}
				mochila.setChave(mochila.getChave()-1);
				return proxSala;
			}
			else if(mochila.getChave()==0)
			{
				System.out.print("Você não possui nenhuma chave por isso não será possível abrir está porta, ache uma chave em alguma sala e retorne aqui! \n");
				return salaAtual;
			}
			else
			{
				return salaAtual;
			}
		}
	}
	public int moveTo(Mapa mapaFinal, int salaAtual, String portaEntrada)
	{
		int proxSala=0;
		if(portaEntrada.equals("A"))
		{
			proxSala=verificaPorta(mapaFinal, salaAtual, proxSala, 0);
		}
		else if(portaEntrada.equals("B"))
		{
			proxSala=verificaPorta(mapaFinal, salaAtual, proxSala, 1);
		}
		else if(portaEntrada.equals("C"))
		{
			proxSala=verificaPorta(mapaFinal, salaAtual, proxSala, 2);
		}
		if(proxSala==0)
		{
			return 1;
		}
		else
		{
			return proxSala;
		}
	}
	private void usarChave()
	{
		if(mochila.getChave()==0)
		{
			System.out.print("Você não possui chaves para usar nesta porta!");
		}
		else 
		{
			System.out.print("Você abriu a porta !");
			mochila.setChave(mochila.getChave()-1); //diminuo um na quantidade de chaves do jogador
		}
	}
	
	public void viewSala(Mapa mapaFinal, int salaAtual)
	{//este método irá permitir o jogador ver o que há dentro da sala
		System.out.printf("Na sala %d há as portas: \n", mapaFinal.mapa.get(salaAtual-1).getIdSala());
		for(int i=0;i<mapaFinal.mapa.get(salaAtual-1).getPortas().size();i++)
		{
			System.out.print(mapaFinal.mapa.get(salaAtual-1).getPortas().get(i).getNome());
			System.out.print("\n");
		}
		System.out.print("Também há na sala os seguinte itens: \n");
		for(int i=0;i<mapaFinal.mapa.get(salaAtual-1).getItensSala().size();i++)
		{
			System.out.print(mapaFinal.mapa.get(salaAtual-1).getItensSala().get(i));
			System.out.print("\n");
		}
		if(mapaFinal.mapa.get(salaAtual-1).getTrollsSala().size()==0)
		{
			System.out.print("Não há trolls na sala!\n");
		}
		else
		{
			System.out.print("E há o troll: \n");
			for(int i=0;i<mapaFinal.mapa.get(salaAtual-1).getTrollsSala().size();i++)
			{
				System.out.printf("\nO troll %d ", i);
				System.out.print(mapaFinal.mapa.get(salaAtual-1).getTrollsSala().get(i).getNome());
				
			}
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

}
