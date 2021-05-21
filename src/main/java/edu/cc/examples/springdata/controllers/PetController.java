package edu.cc.examples.springdata.controllers;

import java.util.List;

import edu.cc.examples.springdata.models.Pet;

import edu.cc.examples.springdata.models.User;
import edu.cc.examples.springdata.services.IUserService;
import edu.cc.examples.springdata.services.IPetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class PetController {

	@Autowired
	private IPetService petService;

	@GetMapping("/")
	public String index(Model model) {
	    
	    log.info("Ejecutando método index en controlador UserController");
	    
	    List<Pet> pets = petService.listPets();
        model.addAttribute("pets", pets);
	    
		return "index";
	}
	
	@GetMapping("/add")
	public String add(Pet p) {
		log.info("Ejecutando método add en controlador UserController");
		return "formUser";
	}
	
	@PostMapping("/save")
	public String save(Pet p) {
		log.info("Ejecutando método save en controlador UserController");
		log.info("Pet " + p);
		petService.savePet(p);
		
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(Pet p, Model model) {
		log.info("Ejecutando método edit en controlador USerController");
		log.info("Editando mascota " + p);
		Pet pet  = petService.findPet(p);
		
		model.addAttribute("pet", pet);
		return "formUser";
	}
	
	@GetMapping("/delete")
	public String delete(Pet p){
		log.info("Ejecutando método delete en controlador UserController");
		petService.deletePet(p);
		return "redirect:/";
	}
	
	
}