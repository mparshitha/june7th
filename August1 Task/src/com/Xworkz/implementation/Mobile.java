package com.Xworkz.implementation;

import com.Xworkz.abstractclass.Device;

public class Mobile extends Device {
	public final void makeCall() {
		System.out.println("Making a call...");
	}

	@Override
	public void powerOn() {
		System.out.println("Mobile phone powered on.");
	}
}
