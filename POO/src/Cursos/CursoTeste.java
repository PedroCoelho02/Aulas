package Cursos;

public class CursoTeste {

    public static void main(String[] args) {
        
       Aluno aluno1 = new Aluno("Pedro");
       Aluno aluno2 = new Aluno("Gaby");
       Aluno aluno3 = new Aluno("Vanessa");
       
       Curso curso1 = new Curso("Java");
       Curso curso2 = new Curso("C#");
       Curso curso3 = new Curso("MySQL");
       
       curso1.adicionarAluno(aluno1);
       curso1.adicionarAluno(aluno2);
       
       curso2.adicionarAluno(aluno2);
       curso2.adicionarAluno(aluno3);
       
       curso3.adicionarAluno(aluno1);
       curso3.adicionarAluno(aluno2);
       curso3.adicionarAluno(aluno3);
       
       for(Aluno aluno: curso1.alunos){
           System.out.print("estou matriculado no curos 1 ");
           System.out.print("Meu nome é: " + aluno.nome);
           System.out.println();
       }
        System.out.println();
        
       for(Aluno aluno: curso2.alunos){
           System.out.print("estou matriculado no curos 2 ");
           System.out.print("Meu nome é: " + aluno.nome);
           System.out.println();
       }
        System.out.println();
        
       for(Aluno aluno: curso3.alunos){
           System.out.print("estou matriculado no curos 3 ");
           System.out.print("Meu nome é: " + aluno.nome);
           System.out.println();
       }
        System.out.println();
        
        System.out.println(aluno1.cursos.get(0).alunos);
        
        Curso cursoEncontrado = aluno1.obeterCursoPorNome("java");
        
        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
    
}
