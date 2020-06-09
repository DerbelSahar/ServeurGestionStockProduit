package com.example.demo;

import java.util.ArrayList;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Produit;
import com.example.demo.repository.ProduitRepository;

@SpringBootApplication
public class ServeurGestionStockProduitApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ServeurGestionStockProduitApplication.class, args);
	//ProduitRepository produitRepository = ((BeanFactory) ctx).getBean(ProduitRepository.class);
	//produitRepository.save(new Produit("livre1", 50 , 20));
	//produitRepository.save(new Produit("livre2", 450 , 150));
	//produitRepository.save(new Produit("livre3", 60 , 11));
	//produitRepository.save(new Produit("livre4", 30 , 94));


	}

}
