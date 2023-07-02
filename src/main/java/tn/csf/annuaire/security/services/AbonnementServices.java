package tn.csf.annuaire.security.services;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.annuaire.models.Abonnement;
import tn.csf.annuaire.repository.AbonnementRepository;





//defining the business logic  
@Service 

public class AbonnementServices {

	@Autowired  
	AbonnementRepository AR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Abonnement> getAllAbonnements()   
	{  
		List<Abonnement> Abonnements = new ArrayList<Abonnement>();  
		AR.findAll().forEach(a -> Abonnements.add(a));  
		return Abonnements;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Abonnement getAbonnementsById(int id)   
	{  
		return AR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Abonnement a)   
	{  
		AR.save(a);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		AR.deleteById(id);  
	} 

}