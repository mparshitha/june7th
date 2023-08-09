package com.Xworkz.abstraction.app.smartWatch;

public class Boxing {
private SmartWatch smartWatch;
	
	public Boxing(SmartWatch smartWatch) {
		this.smartWatch = smartWatch;
		System.out.println("smart watch arguement in Suraj");
	}
	
	public void getShowTime() {
		if(smartWatch != null) {
			System.out.println("Watch is not null");
			this.smartWatch.showTime();
		}
		else {
			System.err.println("watch is null, watch not working");
		}
	}
}
