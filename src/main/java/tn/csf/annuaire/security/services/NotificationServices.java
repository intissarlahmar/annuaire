package tn.csf.annuaire.security.services;



import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import tn.csf.annuaire.models.Notification;
import tn.csf.annuaire.repository.NotificationRepository;





//defining the business logic  
@Service 

public class NotificationServices{

	@Autowired  
	NotificationRepository NR;  
	//getting all books record by using the method findaAll() of CrudRepository  

	//getting all books record by using the method findaAll() of CrudRepository  
	public List<Notification> getAllNotifications()   
	{  
		List<Notification> Notifications = new ArrayList<Notification>();  
		NR.findAll().forEach(n -> Notifications.add(n));  
		return Notifications;  	
	}  

	//getting a specific record by using the method findById() of CrudRepository  
	public Notification getNotificationsById(int id)   
	{  
		return NR.findById(id).get();  
	}  


	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Notification n)   
	{  
		NR.save(n);  
	} 

	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
		NR.deleteById(id);  
	} 

}


