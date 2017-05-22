package Labirinto;
import java.util.ArrayList;
import java.util.Random;

public class Mapa{ //responsável por definir o mapa
	
	
	ArrayList<Salas> mapa = new ArrayList();
	
	public void preencheMapa()	
	{
		//sala #1
		
		Salas sala1 = new Salas();
		Portas porta1 = new Portas();
		Portas porta2 = new Portas();
		Portas portaEntrada = new Portas();
		sala1.setIdSala(1);
		porta1.setNome("A");
		porta1.setSalaAcessada(6);
		porta2.setNome("B");
		porta2.setSalaAcessada(2);
		portaEntrada.setNome("Entrada");
		porta1.setIdPorta(1);
		porta2.setIdPorta(1);
		portaEntrada.setIdPorta(1);
		sala1.portas.add(porta1);
		sala1.portas.add(porta2);
		sala1.portas.add(portaEntrada);
		for(int i=0; i<sala1.portas.size();i++)
		{
			sala1.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala1);
		
		
		//sala #2
		Salas sala2 = new Salas();
		Portas porta3 = new Portas();
		Portas porta4 = new Portas();
		sala2.setIdSala(2);
		porta3.setNome("A");
		porta3.setSalaAcessada(1);
		porta4.setNome("B");
		porta4.setSalaAcessada(3);
		porta3.setIdPorta(2);
		porta4.setIdPorta(2);
		sala2.portas.add(porta3);
		sala2.portas.add(porta4);
		for(int i=0; i<sala2.portas.size();i++)
		{
			sala2.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala2);
		
		//sala #3
		Salas sala3 = new Salas();
		Portas porta5 = new Portas();
		Portas porta6 = new Portas();
		sala3.setIdSala(3);
		porta5.setNome("A");
		porta5.setSalaAcessada(2);
		porta6.setNome("B");
		porta6.setSalaAcessada(8);
		porta5.setIdPorta(3);
		porta6.setIdPorta(3);
		sala3.portas.add(porta5);
		sala3.portas.add(porta6);
		for(int i=0; i<sala3.portas.size();i++)
		{
			sala3.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala3);
		
		//sala #4
		Salas sala4 = new Salas();
		Portas porta7 = new Portas();
		Portas portaSaida = new Portas();
		sala4.setIdSala(4);
		porta7.setNome("B");
		porta7.setSalaAcessada(5);
		portaSaida.setNome("Saída");
		porta7.setIdPorta(4);
		portaSaida.setIdPorta(4);
		sala4.portas.add(porta7);
		sala4.portas.add(portaSaida);
		for(int i=0; i<sala4.portas.size();i++)
		{
			sala4.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala4);
		
		//sala #5
		Salas sala5 = new Salas();
		Portas porta8 = new Portas();
		Portas porta9 = new Portas();
		sala5.setIdSala(5);
		porta8.setNome("A");
		porta8.setSalaAcessada(10);
		porta9.setNome("B");
		porta9.setSalaAcessada(4);
		porta8.setIdPorta(5);
		porta9.setIdPorta(5);
		sala5.portas.add(porta8);
		sala5.portas.add(porta9);
		for(int i=0; i<sala5.portas.size();i++)
		{
			sala5.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala5);
		
		//sala #6
		Salas sala6 = new Salas();
		Portas porta10 = new Portas();
		Portas porta11 = new Portas();
		sala6.setIdSala(6);
		porta10.setNome("A");
		porta10.setSalaAcessada(1);
		porta11.setNome("B");
		porta11.setSalaAcessada(7);
		porta10.setIdPorta(6);
		porta11.setIdPorta(6);
		sala6.portas.add(porta10);
		sala6.portas.add(porta11);
		for(int i=0; i<sala6.portas.size();i++)
		{
			sala6.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala6);
		
		//sala #7
		Salas sala7 = new Salas();
		Portas porta12 = new Portas();
		Portas porta13 = new Portas();
		sala7.setIdSala(7);
		porta12.setNome("A");
		porta12.setSalaAcessada(12);
		porta13.setNome("B");
		porta13.setSalaAcessada(6);
		porta12.setIdPorta(7);
		porta13.setIdPorta(7);
		sala7.portas.add(porta12);
		sala7.portas.add(porta13);
		for(int i=0; i<sala7.portas.size();i++)
		{
			sala7.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala7);
		
		//sala #8
		Salas sala8 = new Salas();
		Portas porta14 = new Portas();
		Portas porta15 = new Portas();
		sala8.setIdSala(8);
		porta14.setNome("A");
		porta14.setSalaAcessada(13);
		porta15.setNome("B");
		porta15.setSalaAcessada(3);
		porta14.setIdPorta(8);
		porta15.setIdPorta(8);
		sala8.portas.add(porta14);
		sala8.portas.add(porta15);
		for(int i=0; i<sala8.portas.size();i++)
		{
			sala8.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala8);
		
		//sala #9
		Salas sala9 = new Salas();
		Portas porta16 = new Portas();
		sala9.setIdSala(9);
		porta16.setNome("A");
		porta16.setSalaAcessada(10);
		porta16.setIdPorta(9);
		sala9.portas.add(porta16);
		for(int i=0; i<sala9.portas.size();i++)
		{
			sala9.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala9);
		
		//sala #10
		Salas sala10 = new Salas();
		Portas porta17 = new Portas();
		Portas porta18 = new Portas();
		Portas porta19 = new Portas();
		sala10.setIdSala(10);
		porta17.setNome("A");
		porta17.setSalaAcessada(9);
		porta18.setNome("B");
		porta18.setSalaAcessada(15);
		porta19.setNome("C");
		porta19.setSalaAcessada(5);
		porta17.setIdPorta(10);
		porta18.setIdPorta(10);
		porta19.setIdPorta(10);
		sala10.portas.add(porta17);
		sala10.portas.add(porta18);
		sala10.portas.add(porta19);
		for(int i=0; i<sala10.portas.size();i++)
		{
			sala10.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala10);
		
		//sala #11
		Salas sala11 = new Salas();
		Portas porta20 = new Portas();
		Portas porta21 = new Portas();
		sala11.setIdSala(11);
		porta20.setNome("A");
		porta20.setSalaAcessada(12);
		porta21.setNome("B");
		porta21.setSalaAcessada(16);
		porta20.setIdPorta(11);
		porta21.setIdPorta(11);
		sala11.portas.add(porta20);
		sala11.portas.add(porta21);
		for(int i=0; i<sala11.portas.size();i++)
		{
			sala11.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala11);
		
		//sala #12
		Salas sala12 = new Salas();
		Portas porta22 = new Portas();
		Portas porta23 = new Portas();
		Portas porta24 = new Portas();
		sala12.setIdSala(12);
		porta22.setNome("A");
		porta22.setSalaAcessada(11);
		porta23.setNome("B");
		porta23.setSalaAcessada(7);
		porta24.setNome("C");
		porta24.setSalaAcessada(13);
		porta22.setIdPorta(12);
		porta23.setIdPorta(12);
		porta24.setIdPorta(12);
		sala12.portas.add(porta22);
		sala12.portas.add(porta23);
		sala12.portas.add(porta24);
		for(int i=0; i<sala12.portas.size();i++)
		{
			sala12.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala12);
		
		//sala #13
		Salas sala13 = new Salas();
		Portas porta25 = new Portas();
		Portas porta26 = new Portas();
		sala13.setIdSala(13);
		porta25.setNome("A");
		porta25.setSalaAcessada(12);
		porta26.setNome("B");
		porta26.setSalaAcessada(8);
		porta25.setIdPorta(13);
		porta26.setIdPorta(13);
		sala13.portas.add(porta25);
		sala13.portas.add(porta26);
		for(int i=0; i<sala13.portas.size();i++)
		{
			sala13.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala13);
		
		//sala #14
		Salas sala14 = new Salas();
		Portas porta27 = new Portas();
		Portas porta28 = new Portas();
		sala14.setIdSala(14);
		porta27.setNome("A");
		porta27.setSalaAcessada(15);
		porta28.setNome("B");
		porta28.setSalaAcessada(19);
		porta27.setIdPorta(14);
		porta28.setIdPorta(14);
		sala14.portas.add(porta27);
		sala14.portas.add(porta28);
		for(int i=0; i<sala14.portas.size();i++)
		{
			sala14.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala14);
		
		//sala #15
		Salas sala15 = new Salas();
		Portas porta29 = new Portas();
		Portas porta30 = new Portas();
		Portas porta31 = new Portas();
		sala15.setIdSala(15);
		porta29.setNome("A");
		porta29.setSalaAcessada(14);
		porta30.setNome("B");
		porta30.setSalaAcessada(10);
		porta31.setNome("C");
		porta31.setSalaAcessada(20);
		porta29.setIdPorta(15);
		porta30.setIdPorta(15);
		porta31.setIdPorta(15);
		sala15.portas.add(porta29);
		sala15.portas.add(porta30);
		sala15.portas.add(porta31);
		for(int i=0; i<sala15.portas.size();i++)
		{
			sala15.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala15);
	
		//sala #16
		Salas sala16 = new Salas();
		Portas porta32 = new Portas();
		Portas porta33 = new Portas();
		sala16.setIdSala(16);
		porta32.setNome("A");
		porta32.setSalaAcessada(11);
		porta33.setNome("B");
		porta33.setSalaAcessada(17);
		porta32.setIdPorta(16);
		porta33.setIdPorta(16);
		sala16.portas.add(porta32);
		sala16.portas.add(porta33);
		for(int i=0; i<sala16.portas.size();i++)
		{
			sala16.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala16);
		
		//sala #17
		Salas sala17 = new Salas();
		Portas porta34 = new Portas();
		Portas porta35 = new Portas();
		sala17.setIdSala(17);
		porta34.setNome("A");
		porta34.setSalaAcessada(16);
		porta35.setNome("B");
		porta35.setSalaAcessada(18);
		porta34.setIdPorta(17);
		porta35.setIdPorta(17);
		sala17.portas.add(porta34);
		sala17.portas.add(porta35);
		for(int i=0; i<sala17.portas.size();i++)
		{
			sala17.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala17);
		
		//sala #18
		Salas sala18 = new Salas();
		Portas porta36 = new Portas();
		Portas porta37 = new Portas();
		sala18.setIdSala(18);
		porta36.setNome("A");
		porta36.setSalaAcessada(19);
		porta37.setNome("B");
		porta37.setSalaAcessada(17);
		porta36.setIdPorta(18);
		porta37.setIdPorta(18);
		sala18.portas.add(porta36);
		sala18.portas.add(porta37);
		for(int i=0; i<sala18.portas.size();i++)
		{
			sala18.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala18);
		
		//sala #19
		Salas sala19 = new Salas();
		Portas porta38 = new Portas();
		Portas porta39 = new Portas();
		sala19.setIdSala(19);
		porta38.setNome("A");
		porta38.setSalaAcessada(14);
		porta39.setNome("B");
		porta39.setSalaAcessada(18);
		porta38.setIdPorta(19);
		porta39.setIdPorta(19);
		sala19.portas.add(porta38);
		sala19.portas.add(porta39);
		for(int i=0; i<sala19.portas.size();i++)
		{
			sala19.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala19);
		
		//sala #20
		Salas sala20 = new Salas();
		Portas porta40 = new Portas();
		sala20.setIdSala(20);
		porta40.setNome("A");
		porta40.setSalaAcessada(15);
		porta40.setIdPorta(20);
		porta40.setIdPorta(20);
		sala20.portas.add(porta40);
		for(int i=0; i<sala20.portas.size();i++)
		{
			sala20.portas.get(i).defineEstadoPorta();
		}
		mapa.add(sala20);
		
	}
	public void defineItens()
	{//quais itens terá em quais salas
		int aux, a;
		//gerador.nextInt(2);
		Random gerador = new Random();
		for(int i=0; i<mapa.size(); i++)
		{
			for(int j=0; j<mapa.get(i).portas.size(); j++)
			{
				aux = mapa.get(i).portas.get(j).getEstadoPorta();
				if(aux==0)
				{//o que quer dizer que a porta está fechada
					mapa.get(i).itensSala.add("chave");
					break;
				}
			}
			a = gerador.nextInt(2);//gerador pra ver se naquela sala vai ter ou não aquele item
			colocaItens(a, "pocao", i);//coloca pocao 
			a = gerador.nextInt(2);
			colocaItens(a, "ouro", i);//coloca ouro
			a = gerador.nextInt(2);
			colocaItens(a, "diamante", i);//coloca diamante
			a = gerador.nextInt(2);
			colocaItens(a, "machado", i);//coloca machado
		}
			
	}
	private void colocaItens(int a, String nome, int i)
	{
		if(a==1)
		{//coloco qualquer item
			mapa.get(i).itensSala.add(nome);
		}
			
	}
	public void defineTrolls()
	{//define a posição onde os trolls irão ficar
		int aux;
		Random gerador = new Random();
		
		aux = gerador.nextInt(20);
		Trolls trollBatata = new Trolls();
		trollBatata.setNome("Batata");
		trollBatata.setSalaInicial(aux);
		trollBatata.setIdTroll(0);
		if(aux==0)
		{
			aux++;
		}
		mapa.get(aux).trollsSala.add(trollBatata);
		
		aux = gerador.nextInt(20);
		Trolls trollSamuel = new Trolls();
		trollSamuel.setNome("Samuel");
		trollSamuel.setSalaInicial(aux);
		trollSamuel.setIdTroll(1);
		if(aux==0)
		{
			aux++;
		}
		mapa.get(aux).trollsSala.add(trollSamuel);
		
		aux = gerador.nextInt(20);
		Trolls trollPraLaQueVai = new Trolls();
		trollPraLaQueVai.setNome("PraLaQueVai");
		trollPraLaQueVai.setSalaInicial(aux);
		trollPraLaQueVai.setIdTroll(2);
		if(aux==0)
		{
			aux++;
		}
		mapa.get(aux).trollsSala.add(trollPraLaQueVai);
		
		aux = gerador.nextInt(20);
		Trolls trollTaRolando = new Trolls();
		trollTaRolando.setNome("TaRolando");
		trollTaRolando.setSalaInicial(aux);
		trollTaRolando.setIdTroll(3);
		if(aux==0)
		{
			aux++;
		}
		mapa.get(aux).trollsSala.add(trollTaRolando);

		aux = gerador.nextInt(20);
		Trolls trollMarta = new Trolls();
		trollMarta.setNome("Marta");
		trollMarta.setSalaInicial(aux);
		trollMarta.setIdTroll(4);
		if(aux==0)
		{
			aux++;
		}
		mapa.get(aux).trollsSala.add(trollMarta);
		
		aux = gerador.nextInt(20);
		Trolls trollVaiVendo = new Trolls();
		trollVaiVendo.setNome("VaiVendo");
		trollVaiVendo.setSalaInicial(aux);
		trollVaiVendo.setIdTroll(5);
		if(aux==0)
		{
			aux++;
		}
		mapa.get(aux).trollsSala.add(trollVaiVendo);
	}
	
	public ArrayList<Salas> getMapa() {
		return mapa;
	}
	public void setMapa(ArrayList<Salas> mapa) {
		this.mapa = mapa;
	}

}
