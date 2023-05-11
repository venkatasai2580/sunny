package com.example.welcomepage.service;

import java.util.List;
import java.util.Map;

import com.example.welcomepage.model.WelcomePage;


public interface WelcomeService {

	public Map<String, Object> saveWelcomePage(WelcomePage welcomePage);
	
	public List<WelcomePage> getWelcomePage();
}
