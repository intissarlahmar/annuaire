package tn.csf.annuaire.controllers;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.csf.annuaire.models.Speciality;
import tn.csf.annuaire.security.services.SpecialityServices;



//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class SpecialityController {

	@Autowired  
	SpecialityServices specialityServices;  

	//creating a get mapping that retrieves all the Article detail from the database   
	@GetMapping("/Speciality")
	private List<Speciality> getAllSpecialities()   
	{  
		return specialityServices.getAllSpecialities();  
	}  

	//creating a get mapping that retrieves the detail of a specific article  
	@GetMapping("/Speciality/{id}")  
	private Speciality getSpeciality(@PathVariable("id") int id)   
	{  
		return specialityServices.getSpecialitiesById(id);  
	}  

	//creating a delete mapping that deletes a specified article  
	@DeleteMapping("/Speciality/{id}")  
	private void deleteSpeciality(@PathVariable("id") int id)   
	{  
		specialityServices.delete(id);  
	} 

	//create new article
	@PostMapping("/Speciality")  
	private int saveSpeciality(@RequestBody Speciality s)   
	{  
		specialityServices.saveOrUpdate(s);  
		return s.getId();  
	} 

	//creating put mapping that updates the article detail
	@PutMapping("/Speciality")  
	private Speciality update(@RequestBody  Speciality s)   
	{  
		specialityServices.saveOrUpdate(s);  
		return s;  
	}  
}