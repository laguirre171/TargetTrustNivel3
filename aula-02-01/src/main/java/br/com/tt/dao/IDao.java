package br.com.tt.dao;

public interface IDao<T> {
	public abstract void salvar(T entity);
	
	T buscar(Long id);
	
}
