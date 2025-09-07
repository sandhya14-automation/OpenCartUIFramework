package com.qa.opencart.pages;

import org.openqa.selenium.By;

public class CartPage {
	int num = 10;
	
	By cart = By.id("cart");
	
	public void numOfItemsInTheCart() {
		System.out.println("Number of items in the cart: " + num);
	}
}
