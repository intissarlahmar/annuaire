package tn.csf.annuaire.repository;

import org.springframework.data.repository.CrudRepository;

import tn.csf.annuaire.models.Abonnement;


 
//repository that extends CrudRepository  

public interface AbonnementRepository extends CrudRepository<Abonnement, Integer>  
{  
}  