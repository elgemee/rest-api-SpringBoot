package com.generation.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.demo.models.SalonModel;

@Repository
public interface SalonRepository extends JpaRepository<SalonModel,Integer>{
//jparepository es una clase--tabla y tipo de modelo id, integer es un objeto, no es un dato primitivo, es como el int 
	//pero tiene mas funcionalidades, podemos guardar un valor nulo
	//clase usamos extends
	//interfaz usamos implementes
}
//hace todas las operaciones de la base de datos