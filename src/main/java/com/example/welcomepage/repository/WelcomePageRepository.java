package com.example.welcomepage.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.welcomepage.model.WelcomePage;

public interface WelcomePageRepository extends MongoRepository<WelcomePage, String>{
	

}
