package com.Xworkz.prime.app;

public class Grocery {
private String shopName;
private String types;
@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("Argument is not null,can compare");
			if(obj instanceof Grocery) {
				Grocery casted=(Grocery)obj;
				if(this.shopName==casted.shopName && this.types==casted.types) {
					System.out.println("Both are same");
					return true;
				}
			else
			{
				System.err.println("Both are not same");
			}
		}
		else 
		{
			System.err.println("Argument is null,cannot compare");
		}
		}
		return false;
	    }
public Grocery(String shopName, String types) 
{
	super();
	this.shopName = shopName;
	this.types = types;
}
@Override
	public String toString() {
		return "ShopName:"+this.shopName+"  Types:"+this.types;
	}

public String getShopName() {
	return shopName;
}
public String getTypes() {
	return types;
}

}
