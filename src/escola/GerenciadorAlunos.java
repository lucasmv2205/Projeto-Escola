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
public class GerenciadorAlunos {
    ArrayList <aluno> listaAlunos = new ArrayList();
    
    public void cadastrarAluno(String nome, String cpf, String numMatricula, String logradouro, String bairro, String numero){
        aluno a;
        a = new aluno(nome, cpf, numMatricula);
        a.CadastrarEndereco(logradouro, bairro, numero);
        listaAlunos.add(a);
    }
    
    public void matricularAluno(String numMatricula, String sigla){
        for(aluno p: listaAlunos){
            if(p.getmatricula() == numMatricula){
               
                Curso c = Escola.gCursos.consultarCursoPorSigla(sigla);                
                p.setcurso(c);
            }
        }
        
    }
    
    public aluno consultarAlunoPorMatricula(String numMatricula){
        for(aluno p: listaAlunos){
            if(p.getmatricula() == numMatricula){
                return p;
            }
        }
        return null;
        
    }
    
    public aluno consultarAlunoPorNome(String nome){
        for(aluno p: listaAlunos){
            if(p.getnome() == nome){
                return p;
            }
        }
        return null;
    }
    
    public void consultarAlunoPorCurso(String sigla){
        for(aluno p: listaAlunos){
            if(p.getcurso().getsigla() == sigla){
                System.out.println(p);
            }
          
        }

    }
    
    
    
}
