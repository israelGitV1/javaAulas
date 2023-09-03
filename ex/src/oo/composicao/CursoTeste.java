package oo.composicao;

import java.util.ArrayList;
import java.util.Arrays;

public class CursoTeste {

	public static void main (String[] args) {
		
		Aluno aluno1 = new Aluno("Mateus");
		Aluno aluno2 = new Aluno("Gustavo");
		Aluno aluno3 = new Aluno("João");
		Aluno aluno5 = new Aluno("Paulo");
		Aluno aluno6 = new Aluno("Isral");
		
		Curso curso1 = new Curso("Sistema da Infomação");
		Curso curso2 = new Curso("Front end");
		Curso curso3 = new Curso("Back end");
		
		System.out.println(aluno1.cursos);
		System.out.println(curso1.alunos);
		
		aluno1.adicionarCurso(curso1);
		aluno2.adicionarCurso(curso1);
		aluno3.adicionarCurso(curso1);
		
		curso2.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno1);
		
		curso3.adicionarAluno(aluno6);
		curso3.adicionarAluno(aluno5);
		
		
		System.out.println("Curso: "+ curso1.nome);		
		
		for(Aluno aluno: curso1.alunos) {
			System.out.println("Aluno: "+ aluno.nome);
		}
		
		System.out.println();
		System.out.println("Curso: "+ curso2.nome);		
		
		for(Aluno aluno: curso2.alunos) {
			System.out.println("Aluno: "+ aluno.nome);
		}
		
		System.out.println();
		System.out.println("Curso: "+ curso3.nome);		
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Aluno: "+ aluno.nome);
		}

		System.out.println("---------------------------------------");
		
		System.out.println("Aluno: "+aluno1.nome);
		for(Curso curso: aluno1.cursos) {
			System.out.println("Curso: "+curso.nome);
		}
		System.out.println();
		
		System.out.println("Aluno: "+aluno2.nome);
		for(Curso curso: aluno2.cursos) {
			System.out.println("Curso: "+curso.nome);
		}
		System.out.println();
		
		System.out.println("Aluno: "+aluno6.nome);
		for(Curso curso: aluno6.cursos) {
			System.out.println("Curso: "+  curso.nome);
		}
		
		System.out.println("---------------------------------------");

		
		for(Curso curso: aluno5.cursos) {
			System.out.println("Curso: "+curso);
		}
		
		for(Aluno aluno: curso2.alunos) {
			System.out.println("Nome: "+aluno);
		}
		
	}

}
