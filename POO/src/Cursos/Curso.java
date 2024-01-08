package Cursos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    
    final String nome;
    //Lista constante não altera o endereço de memória
    final List<Aluno> alunos = new ArrayList<>();
    
    Curso(String nome){
        this.nome = nome;
    }
    
    void adicionarAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
            
}
