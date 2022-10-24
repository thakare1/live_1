package com.example.live.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.live.entities.Loader;
import com.example.live.service.LoaderService;

@RestController
@RequestMapping("/api/contact")
public class LoaderController {
	@Autowired
	private LoaderService loaderService;
	
	@PostMapping("/")
	public String createLoaderr(@RequestBody Loader loader){
		 loaderService.saveLoader(loader);
		return null;
	}
	

}
