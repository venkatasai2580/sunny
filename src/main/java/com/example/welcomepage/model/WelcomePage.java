package com.example.welcomepage.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Book")
public class WelcomePage {

	@MongoId(FieldType.STRING)
	private String id;
	
	private String FullName;
	
	private String email;
	
	private String password;
	
	private String contact;
}
