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
public class aluno extends Pessoa{
    private String numMatricula;
    private Curso curso;
    
    public aluno(String nome, String cpf, String numMatricula) {
        super(nome, cpf);
        this.numMatricula = numMatricula;
    }
    
    public void setmatricula(String mat){
        this.numMatricula = mat;
    }
    
    public String getmatricula(){
        return numMatricula;
    }
    
    public void setcurso(Curso curso){
        this.curso = curso;
    }
    
    public Curso getcurso(){
        return curso;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\r\n"+"Matrícula: " + numMatricula + "\r\nCurso: " + curso+"\r\n";
    }
}
