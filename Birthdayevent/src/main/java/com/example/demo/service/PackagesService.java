package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PackagesEntity;
import com.example.demo.repository.PackagesRepo;

@Service
public class PackagesService {
	
	@Autowired
	PackagesRepo pr;
	
	//to get single element
	public PackagesEntity saveinfo(PackagesEntity ss)
	{
		return pr.save(ss);
	}
	
	
	public List<PackagesEntity> showinfo()
	{
		return pr.findAll();
	}
	
	//to get array of elements
	public List<PackagesEntity> savedetails(List<PackagesEntity>ss)
	{
		return (List<PackagesEntity>)pr.saveAll(ss);
	}
	
	//update
	public PackagesEntity changeinfo(PackagesEntity ss)
	{
		return pr.saveAndFlush(ss);
	}
	
	//to delete a set
	public void deleteinfo(PackagesEntity ss)
	{
		pr.delete(ss);
	}

	//to delete by id
	public void deletepid(int id)
	{
		pr.deleteById(id);
	}
}
