package com.Xworkz.Runner;

import com.Xworkz.implementation.Mobile;
import com.Xworkz.implementation.Tab;

public class MobileRunner {
	public static void main(String[] args) {
		Mobile myPhone = new Mobile();
		myPhone.powerOn();
		myPhone.powerOff();
		myPhone.makeCall();

		Tab myTab = new Tab();
		myTab.powerOn();
		myTab.powerOff();
		
	}
}
