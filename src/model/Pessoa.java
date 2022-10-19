package model;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import util.Contador;

public class Pessoa {

	protected Integer id;
	protected String nome;
	protected String telefone;
	protected String dataNascimento;
	protected String dataCadastramento;
	protected String dataUltimaAlteracao;

	public Pessoa(String nome, String telefone, String dataNascimento) {

		this.id = Contador.proximoId();
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, 1); 
		this.dataCadastramento = c.get(Calendar.DAY_OF_MONTH) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR);
		this.dataUltimaAlteracao =  c.get(Calendar.DAY_OF_MONTH) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR);
	}

	
	public void setNome(String nome) {
		if (!this.nome.equals(nome)) {
			atualizaCadastro();
		}
		this.nome = nome;
	}

	public void setDataNascimento(String dataNascimento) {
		if (!this.dataNascimento.equals(dataNascimento)) {
			atualizaCadastro();
		}
		this.dataNascimento = dataNascimento;
	}

	public void setTelefone(String telefone) {
		if (!this.telefone.equals(telefone)) {
			atualizaCadastro();
		}
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public String getDataCadastramento() {
		return dataCadastramento;
	}

	public String getDataUltimaAlteracao() {
		return dataUltimaAlteracao;
	}

	protected void atualizaCadastro() {
		Calendar c = Calendar.getInstance();
		this.dataUltimaAlteracao =  c.get(Calendar.DAY_OF_MONTH) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR);
	}
	
	@Override
	public String toString() {
		return "id " + id + ", nome " + nome + ", telefone " + telefone + ", nascimento " + dataNascimento + ", desde "
				+ dataCadastramento + ", ultima " + dataUltimaAlteracao;
	}

//	

}
