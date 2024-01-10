package com.educandoweb.course;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User_App;

public interface UserRepository extends JpaRepository<User_App, Long> {
	//o JPA ja tem uma implementação padrão pra essa entidade
}
