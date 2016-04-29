package br.com.tt.petshopmil.dao;

import java.util.List;

public interface IDao<T> {
	
	void salvar(T entity);
	
	T buscar(Long id);
	
	T buscar(T entity);
	
	List<T> consultar();
	
	List<T> consultar(T entity);
	
	void deletar (T entity);
	
	void deletar (Long id);
	
}
