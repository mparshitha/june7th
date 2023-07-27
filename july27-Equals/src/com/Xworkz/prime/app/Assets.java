package com.Xworkz.prime.app;

public class Assets {
	private String names;
	private String types;
	private String location;
	@Override
		public boolean equals(Object obj) {
			if(obj!=null){
				System.out.println("Argument is not null,can compare");
				if(obj instanceof Assets) {
					Assets casted=(Assets)obj;
					if(this.names==casted.names && this.types==casted.types && this.location==casted.location) {
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
			return "Names:"+this.names+"  Types:"+this.types+"  Location:"+this.location;
		}

	public String getNames() {
		return names;
	}
	public String getTypes() {
		return types;
	}
	public String getLocation() {
		return location;
	}
	public Assets(String names, String types,String location) {
		super();
		this.names = names;
		this.types = types;
		this.location=location;
	}
	}

