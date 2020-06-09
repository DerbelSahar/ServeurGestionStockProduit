package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;
import com.example.demo.repository.ProduitRepository;
import com.example.demo.*;

@Service
@Primary
public class ProduitService implements IProduitService{
	@Autowired
	private ProduitRepository produitRepository;

	
	public ProduitService() {
	}
	public ProduitService(List<Produit> produits) {
		super();
		
	}
	@Override
	public List<Produit> getProduits() {
		return this.produitRepository.findAll();
	}
	@Override
	public void addProduit(Produit produit) {
		this.produitRepository.save(produit);
	}
	@Override
	public void updateProduit(Produit produit) {
		this.produitRepository.save(produit);
	}
	@Override
	public void deleteProduit(Long id) {
		Produit produit = new Produit();
		produit.setId(id);
		this.produitRepository.delete(produit);
			  
	}

}