package com.sraynitjsr.design_patterns;

class Product {
	private String name;
	private int version;
	public Product(String n, int v) {
		this.name = n;
		this.version = v;
	}
	public String toString() {
		return "Phone Name => " + this.name + " and Version => " + this.version; 
	}
}

class ProductBuilder {
	private String name;
	private int version;
	public ProductBuilder setNameAndReturnProduct(String n) {
		this.name = n;
		return this;
	}
	public ProductBuilder setVersionAndReturnProduct(int v) {
		this.version = v;
		return this;
	}
	public Product getNewProduct() {
		String n = this.name;
		int v = this.version;
		return new Product(n, v);
	}
}

public class MyBuilderPattern {
	public static void startBuilder() {
		System.out.println("Inside Builder Design Pattern");

		Product onlyName = new ProductBuilder().setNameAndReturnProduct("A").getNewProduct();
		System.out.println(onlyName);

		Product onlyVersion = new ProductBuilder().setVersionAndReturnProduct(2020).getNewProduct();
		System.out.println(onlyVersion);

		Product bothNameVersion = new ProductBuilder().setNameAndReturnProduct("Subhradeep").setVersionAndReturnProduct(3546).getNewProduct();
		System.out.println(bothNameVersion);
	}
}

