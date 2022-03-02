package com.generation.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.demo.models.SalonModel;
import com.generation.demo.repositories.SalonRepository;
import com.generation.demo.services.SalonService;

@RestController //notacion que convierte en controlador peticiones
public class EscuelaController {
	private SalonService salonService;
	
	public EscuelaController(@Autowired SalonService salonService) {
		this.salonService = salonService;
	
	}
	
	//mostrar datos
	@GetMapping("/salon")
	public ArrayList<SalonModel> obtenerDatos (){
		return salonService.obtenerDatos();
	}
	
	//guardar datos en la escuela salon
@PostMapping("/salon")
public SalonModel guardarDatos(@RequestBody SalonModel salonModel) {
return salonService.guardarDatos(salonModel);
	
}

//eliminar Datos
@DeleteMapping(path = "salon/{id}")//localhost:8080/ *******salonhacerlo publico, asignarle una direccion
public boolean eliminarDatos(@PathVariable("id")Integer Id) {
	return salonService.eliminarDatos(Id);
}
}
//intercepta las peticiones, encargado de devolver informacion, una respuesta al usuario
