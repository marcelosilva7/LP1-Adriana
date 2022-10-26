package classe;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;


public class Celular {
	
	private String marca; 
    private String sistema;
    private String cor;
    private String tela;
    private int armazenamento;
    private List<Celular> celulares = new LinkedList<Celular>();
    private HashSet<Celular> set=new HashSet();
	
    public Celular(String marca, String sistema, String cor, String tela, int armazenamento) {
		this.marca = marca;
		this.sistema = sistema;
		this.cor = cor;
		this.tela = tela;
		this.armazenamento = armazenamento;
	}

    
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTela() {
		return tela;
	}

	public void setTela(String tela) {
		this.tela = tela;
	}

	public int getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}
	    
  	public void cadastrarDvd(Celular celular){
        celulares.add(celular);
    }
    
	
	
    

}
