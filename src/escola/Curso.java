/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

/**
 *
 * @author Lucas Martins
 */
public class Curso {
    private String nome;
    private String sigla;
    private String duracao;
    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public void setsigla(String sigla){
        this.sigla = sigla;
    }
    
    public void setduracao(String duracao){
        this.duracao = duracao;
    }
    
    public String getduracao(){
        return duracao;
    }
    
    public String getsigla(){
        return sigla;
    }
    
    public String getnome(){
        return nome;
    }
    
    @Override
    public String toString(){
        return  "\r\nnome: " + nome + "\r\nsigla: " + sigla + "\r\nduracao: " + duracao;
    }
    
}
