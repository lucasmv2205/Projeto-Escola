/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import java.util.ArrayList;

/**
 *
 * @author Lucas Martins
 */
public class GerenciadorCursos {
    ArrayList <Curso> listaCurso = new ArrayList();
    
    public void cadastrarCurso(String nome, String sigla, String duracao){
        Curso c;
        c = new Curso();
        c.setnome(nome);
        c.setsigla(sigla);
        c.setduracao(duracao);
        
        listaCurso.add(c);
    }
    
    public Curso consultarCursoPorSigla(String sigla){
        for(Curso p: listaCurso){
            if(p.getsigla() == sigla){
                return p;
            }
        }
        return null;
        
    }
    
    public Curso consultarCursoPorNome(String nome){
        for(Curso p: listaCurso){
            if(p.getnome() == nome){
                return p;
            }
        }
        return null;
        
    }

}
