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
    
        gAlunos.cadastrarAluno("Eduardo","125","11821EEL002", "alameda", "saraiva", "666");
        gAlunos.cadastrarAluno("Eber","854","11547EBI745", "alameda", "saraiva", "666");
        gAlunos.cadastrarAluno("Vinícius","752","11821ECP987", "alameda", "saraiva", "666");
        gAlunos.cadastrarAluno("Andrei","158","11221EBI259", "alameda", "saraiva", "666");
        
        gCursos.cadastrarCurso("Engenharia Biomédica", "EBI", "10");
        gCursos.cadastrarCurso("Engenharia Elétrica", "EEL", "10");
        gCursos.cadastrarCurso("Engenharia Computação", "ECP", "8");
        
        gAlunos.matricularAluno("11821EEL002", "EBI");
        gAlunos.matricularAluno("11547EBI745", "EEL");
        gAlunos.matricularAluno("11821ECP987", "ECP");
        gAlunos.matricularAluno("11221EBI259", "EBI");
        
        System.out.println(gAlunos.listaAlunos);
        System.out.println(gCursos.listaCurso);
        
        
        
    }
    
}
