/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celular;

import java.io.Serializable;

/**
 *
 * @author aluno
 */
public class Celular implements Serializable{
    
    
    private String marca; 
    private String sistema;
    private String cor;
    private String tela;
    private int armazenamento;

    public Celular(String marca, String sistema, String cor, String tela, int armazenamento) {
        this.marca = marca;
        this.sistema = sistema;
        this.cor = cor;
        this.tela = tela;
        this.armazenamento = armazenamento;
    }
    
    
    //metodos novos
    
    public void ligacao(){
        System.out.println("Você ta fazendo uma ligação");
    }
    
    public void tirarFoto(){
        System.out.println("Você acaba de tirar uma foto");
    }
    
    public void escutarMusica(){
        System.out.println("Você esta escutando musica");
    }
    
    public void mensagem(){
        System.out.println("Você acabou de mandar uma mensagem");
    }
    
    public void calculadora(){
        System.out.println("Você esta calculando");
    }
    
    
    //metodos normais
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
    
    
    
}
