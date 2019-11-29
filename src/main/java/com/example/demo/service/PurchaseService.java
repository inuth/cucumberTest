package com.example.demo.service;

import java.util.List;

import com.example.demo.models.Client;
import com.example.demo.models.Product;

public class PurchaseService {
	public double calculTotal(Client client, List<Product> products) {
		double prixMax = 0;
		double total = 0;
		for (Product product : products) {
			total += product.getPrice();
			if (product.getPrice() > prixMax) {
				prixMax = product.getPrice();
			}
		}
		
		return total - (prixMax * 0.2);
	}
}
