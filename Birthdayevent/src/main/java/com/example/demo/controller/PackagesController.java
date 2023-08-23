package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PackagesEntity;
import com.example.demo.service.PackagesService;

@RestController
public class PackagesController {
	
	@Autowired
	PackagesService sser;
	
	@PostMapping("/addpackages")
	public PackagesEntity add(@RequestBody PackagesEntity ss)
	{
		return sser.saveinfo(ss);
	}
	
	@PostMapping("/addnpackages")
	public List<PackagesEntity> addndetails (@RequestBody List<PackagesEntity> ss)
	{
		return sser.savedetails(ss);
	}
	
	@GetMapping("showdetails")
	public List<PackagesEntity> show()
	{
		return sser.showinfo();
	}
	
	@PutMapping("/update")
	public PackagesEntity modify(@RequestBody PackagesEntity ss)
	{
		return sser.changeinfo(ss);
	}
	
	@DeleteMapping("deletedetails")
	public String del(@RequestBody PackagesEntity ss)
	{
		sser.deleteinfo(ss);
		return "/Deleted successfully";
	}
	

	@DeleteMapping ("/deleteparamid")
	public void deletebyparamid(@RequestParam("theme") int id)
	{
		sser.deletepid(id);
	}
}
