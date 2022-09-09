package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Farmer;
import com.example.repository.FarmerRepository;

;


@Service
public class FarmerService{
	@Autowired
    FarmerRepository farmerRepositry;
	public List<Farmer> findallFarmers() {
		List<Farmer> farmersList = new ArrayList<Farmer>();
		//System.out.println(repository.findAll());
		farmerRepositry.findAll().forEach(farmer -> farmersList.add(farmer));	
        return farmersList;
	}
	
	 public Farmer addFarmer(Farmer farmer) {
	        return farmerRepositry.save(farmer);
}
	 
	 public List<Farmer> findAllByName(String name){
		   List<Farmer> farmersList = findallFarmers();
	       List<Farmer> farmerList1=farmersList
	       .stream()
	       .filter(fty -> (fty.getName().toLowerCase().contains(name.toLowerCase())))
	       .collect(Collectors.toList());

	       return farmerList1;
	   }

}
