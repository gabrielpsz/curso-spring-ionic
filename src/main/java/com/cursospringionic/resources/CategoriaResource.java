package com.cursospringionic.resources;

import java.util.List;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cursospringionic.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		Categoria c1 = new Categoria(1, "Teste 01");
		Categoria c2 = new Categoria(2, "Teste 02");
		List<Categoria> listCategoria = new ArrayList<>();
		listCategoria.add(c1);
		listCategoria.add(c2);
		return listCategoria;
	}
	
}
