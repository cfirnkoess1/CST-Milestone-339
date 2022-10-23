package com.gcu.model;

import javax.validation.constraints.NotNull;

//Initializes product model variables
public class ProductModel {
	@NotNull
	int productID = 0;
	@NotNull
	String productName = "";
	@NotNull
	String productDescription = "";
	@NotNull
	float productPrice = 0.00f;

	public ProductModel()
	{
	this.productID = productID;
	this.productName = productName;
	this.productDescription = productDescription;
	this.productPrice = productPrice;
	}
	//creates the product model
	public ProductModel(int productID, String productName, String productDescription, float productPrice) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
	}


	//getters and setters for the product model
	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescripiton) {
		this.productDescription	 = productDescripiton;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	
	
}
