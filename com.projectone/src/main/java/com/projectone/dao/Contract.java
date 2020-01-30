package com.projectone.dao;

import java.util.List;

public interface Contract<T> {

	void insert(T t);

	void delete(T t);

	List<T> findAll();

	T findById(int id);
	
//	int save(T t);
//	int update(T t);
//	int delete(T t);
//	T findById(int id);
//	List<T> findAll();
	

}
