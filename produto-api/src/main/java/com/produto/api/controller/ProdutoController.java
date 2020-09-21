package com.produto.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produto.api.model.Produto;
import com.produto.api.repository.ProdutoRepository;



@RestController
@RequestMapping(value="/api")

public class ProdutoController {
	
	
	@Autowired
	ProdutoRepository prepository;
	
	
	@GetMapping("/produtos")
	public List<Produto> listaProdutos(){
		return prepository.findAll();	
	}
	
	
	
		

}
