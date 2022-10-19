package repository;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import model.Aluno;
import model.Pessoa;

public class Repository<T extends Pessoa> {

	private Map<Integer, T> bancoBD;

	public Repository() {
		bancoBD = new TreeMap<>();
	}

	public List<T> buscarAlunos(){
		return this.bancoBD.values().stream().filter(e->e.getClass()==Aluno.class).collect(Collectors.toList());
	}
	
	public List<T> buscarTodos() {

		return this.bancoBD.values().stream().collect(Collectors.toList());
	}

	public T buscarPorId(Integer id) {
		return bancoBD.get(id);
	}

	public void salvar(T t) {
		bancoBD.put(t.getId(), t);
	}

	public void remover(Integer id) {
		bancoBD.remove(id);
	}

}
