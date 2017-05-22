package Labirinto;
import java.util.Scanner;
public class Jogo {
	
	//declaração do arraylist 
	public static int verificaTroll(Mapa mapaFinal, int salaAtual)
	{
		int a=0;
		if(mapaFinal.mapa.get(salaAtual-1).trollsSala.size()>0)
		{
			a=1;
		}
		return a;//se a==0 não há trolls na sala
	}
	public static void Troll(Mapa mapaFinal, int salaAtual, Jogador jogador)
	{
		int aux=0;
		int salaTroll;
		for(int i=0;i<mapaFinal.mapa.size();i++)
		{	
			for(int j=0;j<mapaFinal.mapa.get(i).trollsSala.size();j++)
			{
				aux=0;
				for(int k=0;k<mapaFinal.mapa.get(i).itensSala.size();k++)
				{
					if(mapaFinal.mapa.get(i).itensSala.get(k).equals("machado"))
					{//se em alguma sala eu possuo um machado
						salaTroll= mapaFinal.mapa.get(i).trollsSala.get(j).getSalaAtualTroll();
						if(mapaFinal.mapa.get(i).trollsSala.get(j).getMachado()==0)
						{
							if(salaTroll==i)
							{
								mapaFinal.mapa.get(i).trollsSala.get(j).pickUp(mapaFinal, salaTroll, salaAtual);
								System.out.printf("\nO troll %s pegou o machado na sala %d\n", mapaFinal.mapa.get(i).trollsSala.get(j).getNome(), mapaFinal.mapa.get(i).trollsSala.get(j).getSalaAtualTroll()+1);
							}
						}
						if(mapaFinal.mapa.get(i).trollsSala.get(j).getMachado()==1)
						{//se nessa sala tem o troll sozinho
							if(salaTroll==salaAtual-1)
							{//se nessa sala eu tenho o troll com o personagem 
								mapaFinal.mapa.get(i).trollsSala.get(j).arremessar(salaAtual, salaTroll, jogador);
							}
						}
						aux=1;
					}
				}
				if(aux==0)
				{
					if(salaAtual-1!=mapaFinal.mapa.get(i).trollsSala.get(j).getSalaAtualTroll())
					{
						mapaFinal.mapa.get(i).trollsSala.get(j).mover(mapaFinal, salaAtual);
						break;
					}
					
					
				}
			}
		}
	}
	
	public static void main(String args[])
	{
		Mapa mapaFinal = new Mapa();
		mapaFinal.preencheMapa();//preenche o mapa
		mapaFinal.defineItens();
		mapaFinal.defineTrolls();
		Scanner ler = new Scanner(System.in);//objeto para leitura
		Jogador jogador = new Jogador();
		int salaAtual=1;
		int aux=0;
		String[] vetor = new String[3];
		String comando;
		while(true)
		{	

			System.out.print("\nDigite o que você deseja que seu personagem faça: \n");
			comando = ler.nextLine();
			vetor = comando.split(" ");
			if(comando.equals("view"))
			{//mostra o que há na sala
				jogador.viewSala(mapaFinal, salaAtual);
			}
			else 
			{
				Troll(mapaFinal, salaAtual, jogador);
				if(comando.equals("moveTo A door"))
				{
					System.out.print("\nDigite Exit se desejas sair pela porta A: \n");
					comando = ler.nextLine();
					int t;
					int flag=0;
					t = mapaFinal.mapa.get(salaAtual).portas.size();
					for (int i=0;i<t;i++)
					{
						if(mapaFinal.mapa.get(salaAtual).portas.get(i).getNome().equals("A"))
						{
							flag=1;
						}
					}
					if(flag==1)
					{
					
						if(comando.equals("Exit"))
						{
							salaAtual = jogador.moveTo(mapaFinal, salaAtual, "A");
							System.out.print("Você agora está na sala "+ salaAtual);
						}
						else 
						{
							System.out.print("\n********Comando inválido********\n");
						}
					}
					else 
					{
						System.out.print("\nEstá sala não possui a porta A, tente novamente!\n");
					}
				}
				else if(comando.equals("moveTo B door"))
				{
					System.out.print("\nDigite Exit se desejas sair pela porta B: \n");
					comando = ler.nextLine();
					int t;
					int flag=0;
					t = mapaFinal.mapa.get(salaAtual).portas.size();
					for (int i=0;i<t;i++)
					{
						if(mapaFinal.mapa.get(salaAtual).portas.get(i).getNome().equals("B"))
						{
							flag=1;
						}
					}
					if(flag==1)
					{
					
						if(comando.equals("Exit"))
						{
							salaAtual = jogador.moveTo(mapaFinal, salaAtual, "B");
							System.out.print("Você agora está na sala "+ salaAtual);
						}
						else 
						{
							System.out.print("\n********Comando inválido********\n");
						}
					}
					else 
					{
						System.out.print("\nEstá sala não possui a porta B, tente novamente!\n");
					}
				}
				else if(comando.equals("moveTo C door"))
				{
					System.out.print("\nDigite Exit se desejas sair pela porta C: \n");
					comando = ler.nextLine();
					int t;
					int flag=0;
					t = mapaFinal.mapa.get(salaAtual).portas.size();
					for (int i=0;i<t;i++)
					{
						if(mapaFinal.mapa.get(salaAtual).portas.get(i).getNome().equals("C"))
						{
							flag=1;
						}
					}
					if(flag==1)
					{
					
						if(comando.equals("Exit"))
						{
							salaAtual = jogador.moveTo(mapaFinal, salaAtual, "C");
							System.out.print("Você agora está na sala "+ salaAtual);
						}
						else 
						{
							System.out.print("\n********Comando inválido********\n");
						}
					}
					else 
					{
						System.out.print("\nEstá sala não possui a porta C, tente novamente!\n");
					}
				}
				else if(comando.equals("moveTo Key"))
				{
					
					System.out.print("\nDigite pickUp Key se desejas pegar a chave: \n");
					comando = ler.nextLine();
					if(comando.equals("pickUp Key"))
					{
						jogador.pickUp(mapaFinal, salaAtual, "chave");
					}
					else 
					{
						System.out.print("\n********Comando inválido********\n");
					}
				}
				else if(comando.equals("moveTo Potion"))
				{
					System.out.print("\nDigite pickUp Potion se desejas pegar a poção: \n");
					comando = ler.nextLine();
					if(comando.equals("pickUp Potion"))
					{
						jogador.pickUp(mapaFinal, salaAtual, "pocao");
					}
					else 
					{
						System.out.print("\n********Comando inválido********\n");
					}
					
				}
				else if(comando.equals("moveTo Gold"))
				{
					System.out.print("\nDigite pickUp Gold se desejas pegar o ouro: \n");
					comando = ler.nextLine();
					if(comando.equals("pickUp Gold"))
					{
						aux=verificaTroll(mapaFinal, salaAtual);
						if(aux==0)
						{
							jogador.pickUp(mapaFinal, salaAtual, "ouro");
						}
						else
						{
							System.out.print("\nHá um troll na sala, enquanto você não mata-lo você não pode pegar os itens da sala!");
						}
					}
					else 
					{
						System.out.print("\n********Comando inválido********\n");
					}
					
				}
				else if(comando.equals("moveTo Diamond"))
				{
					System.out.print("\nDigite pickUp Diamond se desejas pegar o diamante: \n");
					comando = ler.nextLine();
					if(comando.equals("pickUp Diamond"))
					{
						aux=verificaTroll(mapaFinal, salaAtual);
						if(aux==0)
						{
							jogador.pickUp(mapaFinal, salaAtual, "diamante");
						}
						else
						{
							System.out.print("\nHá um troll na sala, enquanto você não mata-lo você não pode pegar os itens da sala!");
						}
					}
					else 
					{
						System.out.print("\n********Comando inválido********\n");
					}
					
				}
				else if(comando.equals("moveTo Axe"))
				{
					System.out.print("\nDigite pickUp Axe se desejas pegar a machado: \n");
					comando = ler.nextLine();
					if(comando.equals("pickUp Axe"))
					{
						jogador.pickUp(mapaFinal, salaAtual, "machado");
					}
					else 
					{
						System.out.print("\n********Comando inválido********\n");
					}
				}
				else if(vetor[0].equals("throwAxe"))
				{
					jogador.arremessar(mapaFinal, salaAtual, vetor[1]);
				}
				else if(comando.equals("drop Axe"))
				{
					jogador.drop(mapaFinal, salaAtual, "machado");
				}
				else if(comando.equals("drop Key"))
				{
					jogador.drop(mapaFinal, salaAtual, "chave");
				}
				else if(comando.equals("drop Potion"))
				{
					jogador.drop(mapaFinal, salaAtual, "pocao");
				}
				else if(comando.equals("view Bag"))
				{
					jogador.mochila.viewMochila();
				}
				else if(comando.equals("moveTo Exit door"))
				{
					if(salaAtual==4)
					{
						System.out.print("Parabéns você conseguiu sair do labirinto!\n");
						System.out.print("Sua pontuação foi de" + jogador.mochila.getGold() + "ouro" + jogador.mochila.getDiamantes() + "diamantes");
						break;
					}
					else
					{
						System.out.print("Está sala não possui a porta de saída!");
					
					}	
				}
				else
				{
					System.out.print("\nO comando digitado não é válido!\n");
				}
			}
		}
		
	}
}
