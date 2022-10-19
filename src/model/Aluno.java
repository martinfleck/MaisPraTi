package model;

import java.util.Calendar;

public class Aluno extends Pessoa {

	private double notaFinalCurso;

	public Aluno(String nome, String telefone, String dataNascimento, double notaFinalCurso) {
		super(nome, telefone, dataNascimento);
		this.notaFinalCurso = notaFinalCurso;
	}

	@Override
	public String toString() {
		return "id " + id + ", nome " + nome + ", telefone " + telefone + ", nascimento " + dataNascimento + ", desde "
				+ dataCadastramento + ", ultima " + dataUltimaAlteracao + ", nota final " + notaFinalCurso;
	}

	public double getNotaFinalCurso() {
		return notaFinalCurso;
	}

	public void setNotaFinalCurso(double notaFinalCurso) {
		if (this.notaFinalCurso != notaFinalCurso) {
			atualizaCadastro();
		}
		this.notaFinalCurso = notaFinalCurso;
	}

}
