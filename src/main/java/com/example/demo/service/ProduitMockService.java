package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Produit;

@Service
public class ProduitMockService implements IProduitService{
	
	private List<Produit> produits;
	
	public ProduitMockService() {
		this.produits = new ArrayList<Produit>();
		this.produits.add(new Produit("livre1", 50 , 20));
		this.produits.add(new Produit("livre2", 450 , 150));
		this.produits.add(new Produit("livre3", 60 , 11));
		this.produits.add(new Produit("livre4", 30 , 94));

	}
	public ProduitMockService(List<Produit> produits) {
		super();
		this.produits = produits;
	}
	@Override
	public List<Produit> getProduits() {
		return this.produits;
	}
	@Override
	public void addProduit(Produit produit) {
		this.produits.add(produit);
	}
	@Override
	public void updateProduit(Produit produit) {
		this.produits.remove(produit);
		this.produits.add(produit);
	}
	@Override
	public void deleteProduit(Long id) {
		Produit produit = new Produit();
		produit.setId(id);
		this.produits.remove(produit);
			  
	}

}
