package Labirinto;

import java.util.ArrayList;


public class Salas {
	
	ArrayList<Portas> portas = new ArrayList();
	ArrayList<String> itensSala = new ArrayList();
	ArrayList<Trolls> trollsSala = new ArrayList();
	
	
	public ArrayList<Portas> getPortas() {
		return portas;
	}

	public void setPortas(ArrayList<Portas> portas) {
		this.portas = portas;
	}

	public int idSala; //identificação da sala

	public ArrayList<String> getItensSala() {
		return itensSala;
	}

	public void setItensSala(ArrayList<String> itensSala) {
		this.itensSala = itensSala;
	}

	public ArrayList<Trolls> getTrollsSala() {
		return trollsSala;
	}

	public void setTrollsSala(ArrayList<Trolls> trollsSala) {
		this.trollsSala = trollsSala;
	}

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}
	
	
	
	

	
}
