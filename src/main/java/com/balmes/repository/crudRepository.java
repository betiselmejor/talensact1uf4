package com.balmes.repository;

import java.util.List;

public interface crudRepository<T> {
	
	List<T> findAll();


// Per una entitat S, el que fem �s desar-la/persistir-la	
//	   <S extends T> S save(S entity);

// Retorna la entitat identificada per la clau amb valor ID	
//		T findOne(ID primaryKey);
	
// Retorna totes les entitats	
//  	Iterable<T> findAll();
	
// Retorna el nombre d'entitats
//		Long count();
	
// Esborra l'entitat donada
//		void delete(T entity);
	
// Indica si existeix l'entitat amb la clau ID donada
// boolean exists(ID primaryKey);

}
