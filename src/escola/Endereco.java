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
public class Endereco {
    private String logradouro;
    private String numero;
    private String bairro;
    
    public void setbairro(String bairro){
        this.bairro = bairro;
    }
    
    public void setnumero(String numero){
        this.numero = numero;
    }
    
    public void setlogradouro(String logradouro){
        this.logradouro = logradouro;
    }
    
    public String getbairro(){
        return bairro;
    }
    
    public String getnumero(){
        return numero;
    }
    
    public String getlogradouro(){
        return logradouro;
    }
    
    @Override
    public String toString(){
        return  "\r\nbairro: " + bairro + "\r\nnumero: " + numero + "\r\nlogradouro: " + logradouro;
    }
}
