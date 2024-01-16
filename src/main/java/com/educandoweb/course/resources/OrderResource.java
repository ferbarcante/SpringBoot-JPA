package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User_App;
import com.educandoweb.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class OrderResource {
	
	@Autowired //para que o spring ja faça injeção de dependencia p mim
	private UserService service;

	@GetMapping
	public ResponseEntity<List<User_App>> findAll(){
		List<User_App> list = service.findAll();
		return ResponseEntity.ok().body(list);
		//ResponseEntity.ok() para retornar resposta de sucesso do http e no body() corpo da resposta colocar a lista
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User_App> findById(@PathVariable Long id){
		User_App obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
