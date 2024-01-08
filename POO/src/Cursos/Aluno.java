package Cursos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome;
    //Lista constante não altera o endereço de memória
    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
    
    //Metodo para identificar se é true ou false a pesquisa
    Curso obeterCursoPorNome(String nome) {
        Curso procurado = null;

        for (Curso curso : this.cursos) {
            if (curso.nome.equalsIgnoreCase(nome));
            {
                return curso;
            }
        }
        return null;
    }

    public String toString() {
        return nome;
    }
}
