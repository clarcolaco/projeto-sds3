package com.devsuperior.dsvendas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {
	private SellerRepository repository;
	public List<Seller> findAll(){
		
			return repository.findAll();
	}
}
