package br.com.tt.dao;

public interface IDao<T> {
	void salvar(T entity);
	
	T buscar(Long id);
	
}
