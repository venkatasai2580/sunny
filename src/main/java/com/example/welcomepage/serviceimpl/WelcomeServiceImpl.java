package com.example.welcomepage.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.welcomepage.model.WelcomePage;
import com.example.welcomepage.repository.WelcomePageRepository;
import com.example.welcomepage.service.WelcomeService;



@Service
public class WelcomeServiceImpl implements WelcomeService {

	
	@Autowired
	 WelcomePageRepository welcomePageRepository;
	
	
	@Override
	public Map<String, Object> saveWelcomePage(WelcomePage welcomePage) {
		WelcomePage wpage = welcomePageRepository.save(welcomePage);
		Map<String,Object> map = new HashMap<>();
		if (wpage != null) {
			map.put("msg", "page detials addded successfully");
			map.put("WelcomePage", wpage.getId());
		}

		return map;
	}


	@Override
	public List<WelcomePage> getWelcomePage() {
		
		return welcomePageRepository.findAll();
	}

}
