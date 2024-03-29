package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Mario");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Ana");

		Curso curso1 = new Curso("MTM");
		Curso curso2 = new Curso("Quimica");
		Curso curso3 = new Curso("Geo");

		curso1.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno1);

		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso2);
		aluno3.adicionarCurso(curso1);

		for (Aluno aluno : curso1.alunos) {
			System.out.println("Estou matriculado no curso: " + curso3.nome + "...");
			System.out.println("Meu nome: " + aluno.nome + "...");
			System.out.println();
		}
		System.out.println(aluno1.cursos.get(0).alunos);

		Curso cursoEncontrado = aluno1.obterCursoPorNome("MTM");

		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);

		}
	}
}
