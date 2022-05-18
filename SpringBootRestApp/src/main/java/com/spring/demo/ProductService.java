package com.spring.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ProductService {
@Autowired
private ProductRepository repo;

//display all data
public List<Product>listAll(){
	return repo.findAll();
}
	//insert data
	public void save(Product product) {
		repo.save(product);
	}
	
	//search by id
	public Product get(Integer id) {
		return repo.findById(id).get();
}
	
	//delete record
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
