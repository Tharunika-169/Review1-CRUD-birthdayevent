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

import com.example.demo.model.CakeEntity;
import com.example.demo.service.CakeService;

@RestController
public class CakeController {

	@Autowired
	CakeService sser;
		@PostMapping ("/addcakes")
		public CakeEntity add(@RequestBody CakeEntity ss)
		{
			return sser.saveinfo(ss);
		}
		
		@PostMapping ("/addncakes")
		public List<CakeEntity> addndetails (@RequestBody List<CakeEntity> ss)
		{
			return sser.savedetails(ss);
		}
		
		@GetMapping("showcake")
		public List<CakeEntity> show()
		{
			return sser.showinfo();
		}
		
		@PutMapping("/updatecake")
		public CakeEntity modify(@RequestBody CakeEntity ss)
		{
			return sser.changeinfo(ss);
		}
		
		@DeleteMapping("deletecake")
		public String del(@RequestBody CakeEntity ss)
		{
			sser.deleteinfo(ss);
			return "/Deleted successfully";
		}
		

		@DeleteMapping ("/deleteparamcake")
		public void deletebyparamid(@RequestParam("quantity") int id)
		{
			sser.deletepid(id);
			
		}
}
