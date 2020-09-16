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
public class Escola {
    public static GerenciadorAlunos gAlunos = new GerenciadorAlunos();
    public static GerenciadorCursos gCursos = new GerenciadorCursos();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            
            //Cadastrando 4 alunos
        gAlunos.cadastrarAluno("Eduardo","125","11821EDU002", "alameda", "saraiva", "666");
        gAlunos.cadastrarAluno("Eber","854","11547EBER745", "alameda", "saraiva", "666");
        gAlunos.cadastrarAluno("Vinícius","752","11821VINI987", "alameda", "saraiva", "666");
        gAlunos.cadastrarAluno("Andrei","158","11221AND259", "alameda", "saraiva", "666");
            
            //Cadastrando 2 cursos
        gCursos.cadastrarCurso("Engenharia Biomédica", "EBI", "10");
        gCursos.cadastrarCurso("Engenharia Elétrica", "EEL", "10");
            
            
            //Imprimindo lista de cursos e de alunos
        System.out.println("\r\n"+gAlunos.listaAlunos+"\r\n");
        System.out.println("\r\n"+gCursos.listaCurso+"\r\n");
            
            //Mudando nome de um curso
        gCursos.consultarCursoPorNome("Engenharia Biomédica").setnome("Engenharia de Biomaterias");
            
            //Matriculando alunos nos cursos
        gAlunos.matricularAluno("11821EDU002", "EBI");
        gAlunos.matricularAluno("11547EBER745", "EEL");
        gAlunos.matricularAluno("11821VINI987", "EEL");
        gAlunos.matricularAluno("11221AND259", "EBI");
            
            //Imprimindo listas na tela
        System.out.println("\r\n"+gCursos.listaCurso+"\r\n");
        System.out.println("\r\n"+gAlunos.listaAlunos+"\r\n");
        
            //Lista de alunos que estão matriculados em um mesmo curso
        System.out.println("Alunos do mesmo curso"+"\r\n");
        
        gAlunos.consultarAlunoPorCurso("EEL");
        
    }
    
}
