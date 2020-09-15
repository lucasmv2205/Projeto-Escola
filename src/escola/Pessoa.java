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
public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;
    
    
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public void CadastrarEndereco(String logradouro, String bairro, String numero){
        Endereco end;
        end = new Endereco();
        end.setbairro(bairro);
        end.setlogradouro(logradouro);
        end.setnumero(numero);
        
        this.endereco = end;
    }
    
    
    public void setendereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Endereco getendereco(){
        return endereco;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public void setcpf(String cpf){
        this.cpf = cpf;
    }
    
    @Override
    public String toString(){
        return "nome: " + nome + "\r\nCPF: " + cpf + endereco;
    }
    
    public String getnome(){
        return nome;
    }
    
    public String getcpf(){
        return cpf;
    }
    
    
}
