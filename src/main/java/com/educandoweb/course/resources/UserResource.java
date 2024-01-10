package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User_App;

@RestController
//para dizer que essa classe é um recurso web que é implementado por um controlador rest colocamos essa annotation
@RequestMapping(value = "/users")
//dando nome para o recurso
public class UserResource {
	
	//aplicando um recurso básico em nossa aplicação springboot
	@GetMapping
	public ResponseEntity<User_App> findAll(){
	//método que será o endpoint para acessar os usuários
		User_App u = new User_App(1L, "Maria", "maria@gmail.com", "00000", "1234");
		
		return ResponseEntity.ok().body(u);
	}
}
