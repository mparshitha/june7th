package com.Xworkz.Runner;

import com.Xworkz.implementation.Car;
import com.Xworkz.implementation.Truck;

public class CarRunner {

	public static void main(String[] args) {
		Car myCar = new Car();
        myCar.start();
        myCar.stop();
        myCar.Horn();

        Truck myTruck = new Truck();
        myTruck.start();
        myTruck.stop();

	}

}
