package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){
		this.nome=nome;
	}
	
	void adicionarCurso (Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	public String getCursos() {
		for(Curso curso:cursos) {
			return "\nCurso: "+curso.nome;
		}
		return null;
	}
	
	public String toString() {
		return nome + getCursos();
	}
}
