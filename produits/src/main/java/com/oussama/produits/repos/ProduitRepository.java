package com.oussama.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.oussama.produits.entities.Produit;
public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
