package com.Xworkz.prime.app;

public class Gold {
	private String name;
	private String types;
	private String shopName;
	private double price;
	@Override
		public boolean equals(Object obj) {
			if(obj!=null){
				System.out.println("Argument is not null,can compare");
				if(obj instanceof Gold) {
					Gold casted=(Gold)obj;
					if(this.name==casted.name && this.types==casted.types && this.shopName==casted.shopName && this.price==casted.price) { 
						System.out.println("Both are same");
						return true;
					}
				else {
					System.err.println("Both are not same");
				}
			}
			else {
				System.err.println("Argument is null,cannot compare");
			}
			}
			return false;
		}
	@Override
		public String toString() {
			return "Name:"+this.name+"  Types:"+this.types+"  ShopName:"+this.shopName+"  Price:"+this.price;
		}

	public String getName() {
		return name;
	}
	public String getTypes() {
		return types;
	}
	public String getShopName() {
		return shopName;
	}
	public double getPrice() {
		return price;
	}
	public Gold(String name, String types,String shopName, double price) {
		super();
		this.name = name;
		this.types = types;
		this.shopName=shopName;
		this.price=price;
	}
	public Gold()
	{
		System.out.println("Invoking no-arg const of Gold");
	}
}
