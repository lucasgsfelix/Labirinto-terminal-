package Labirinto;
import java.util.Random;
public class Portas {
	
	public int estadoPorta; //pode receber estado fechado ou estado aberto
	public String nome; //nome da porta
	public int idPorta; //é a sala que a porta está
	public int salaAcessada;//a porta da acesso a qual sala 
	
	Random gerador = new Random();
	
	public void defineEstadoPorta()
	{//função responsável por definir se a porta estará fechada ou aberta
		int aux;
		aux = gerador.nextInt(2)+1;
		if(aux==0)
		{//porta está fechada
			estadoPorta = aux;
			
		}
		else if(aux==1)
		{//porta está aberta
			estadoPorta = aux;
		}
		
	}
	public int getEstadoPorta() {
		return estadoPorta;
	}
	public void setEstadoPorta(int estadoPorta) {
		this.estadoPorta = estadoPorta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdPorta() {
		return idPorta;
	}
	public void setIdPorta(int idPorta) {
		this.idPorta = idPorta;
	}
	
	public int getSalaAcessada() {
		return salaAcessada;
	}
	public void setSalaAcessada(int salaAcessada) {
		this.salaAcessada = salaAcessada;
	}
	
	

}

