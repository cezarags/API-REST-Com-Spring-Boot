package com.produto.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public List<Produto> listaProdutos(){    // Método para retornar uma lista de todos produtos
		return prepository.findAll();	
	}
	
	@GetMapping("/produto/{id}")
	public Produto listarUnicoProduto(@PathVariable(value = "id") long id){ // método para fazer busca pelo Id no bd 
		return prepository.findById(id);
	}
	
	@PostMapping("/produto")
	public Produto salvaProduto(@RequestBody Produto produto) {
		return prepository.save(produto);
		
		
	}
	
		

}
