package Oct16.Thread;

import java.util.*;

public class Car {
	private List<String> carList = null;
	
	public Car() {
		carList = new ArrayList<String>();
	}
	
	public String getCar() {
		String carName = null;
		switch((int)(Math.random()*3)) {
		case 0: carName = "SM5"; break;
		case 1: carName = "Sonata"; break;
		case 2: carName = "Genesis"; break;
		}
		return carName;
	}
	
	public synchronized String pop() {
		String carName = null;
		if(carList.size() ==0){
			try {
				System.out.println("we have to build a car, please wait");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		carName = (String)carList.remove(carList.size()-1);
		System.out.println("Customer buy a car, carName is "+ carName);
		return carName;
	}
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("Car is builded, carName is "+ car);
		if(carList.size()==5) {
			this.notify();
		}
	}

}
