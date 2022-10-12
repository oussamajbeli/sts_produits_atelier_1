package com.oussama.produits;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.oussama.produits.entities.Produit;
import com.oussama.produits.repos.ProduitRepository;


@SpringBootTest
class ProduitsApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@Test
	public void testCreateProduit() {
	Produit prod = new Produit(new Date(),"HP Pavillion",1700.500);
	produitRepository.save(prod);
	}
	
	@Test
	public void testFindProduit()
	{ 
		Produit p = produitRepository.findById(1L).get(); 
		System.out.println(p);
	}
	
	@Test
	public void testUpdateProduit()
	{ Produit p = produitRepository.findById(1L).get();
	p.setPrixProduit(1000.0); produitRepository.save(p);
	}
	
	@Test
	public void testDeleteProduit()
	{
		produitRepository.deleteById(1L);
	}
	
	@Test
	public void testListerTousProduits()
	{
	List<Produit> prods = produitRepository.findAll();
	for (Produit p : prods)
	{
	System.out.println(p);
	}
	}
	
}
