package com.luxoft.carmanager;

public class CarManager {

	public static void main(String[] args) {

		Car toyotaPrius1 = new Car("Toyota Prius", 2008, 1500000, 1200, Color.GREEN);

		Car renauLaguna1 = new Car("Renault Laguna", 2000, 970000, 1600, Color.WHITE);

		Car renauLaguna2 = new Car("Renault Laguna", 2000, 970000, 1600, Color.WHITE);
		
		toyotaPrius1.addOdometr(1000);

		System.out.println(toyotaPrius1);
		System.out.println(renauLaguna1);

		System.out.println(toyotaPrius1.equals(renauLaguna2));
		System.out.println(renauLaguna1.equals(renauLaguna2));

	}

}
