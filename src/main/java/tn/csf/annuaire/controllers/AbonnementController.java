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

import tn.csf.annuaire.models.Abonnement;
import tn.csf.annuaire.security.services.AbonnementServices;





//mark class as Controller  
@RestController 
@CrossOrigin(origins = "*")

public class AbonnementController {

	@Autowired  
	AbonnementServices abonnementServices;  

	//creating a get mapping that retrieves all the Article detail from the database   
	@GetMapping("/Abonnement")
	private List<Abonnement> getAllAbonnements()   
	{  
		return abonnementServices.getAllAbonnements();  
	}  

	//creating a get mapping that retrieves the detail of a specific article  
	@GetMapping("/Abonnement/{id}")  
	private Abonnement getAbonnement(@PathVariable("id") int id)   
	{  
		return abonnementServices.getAbonnementsById(id);  
	}  

	//creating a delete mapping that deletes a specified article  
	@DeleteMapping("/Abonnement/{id}")  
	private void deleteAbonnement(@PathVariable("id") int id)   
	{  
		abonnementServices.delete(id);  
	} 

	//create new article
	@PostMapping("/Abonnement")  
	private int saveAbonnement(@RequestBody Abonnement a)   
	{  
		abonnementServices.saveOrUpdate(a);  
		return a.getId();  
	} 

	//creating put mapping that updates the article detail
	@PutMapping("/Abonnement")  
	private Abonnement update(@RequestBody  Abonnement a)   
	{  
		AbonnementServices.saveOrUpdate(a);  
		return a;  
	}  
	
}