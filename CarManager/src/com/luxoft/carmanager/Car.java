package com.luxoft.carmanager;

public class Car {
	
	String carName;
	int yearProd;
	int priceCent;
	int weight;
	Color color;
	private int odometr = 0;
	protected int ToOdometr = 0;
	
	public Car(String carName, int yearProd, int priceCent, int weight, Color color) {
		this.carName = carName;
		this.yearProd = yearProd;
		this.priceCent = priceCent;
		this.weight = weight;
		this.color = color;

		
	}
	
	public void addOdometr(int additionalDistance) {
		if(additionalDistance > 0) {
			odometr += additionalDistance;
			ToOdometr += additionalDistance;
		}else {
			System.out.println("error");
		}
	}
	
	
	

	public int getOdometr() {
		return odometr;
	}
	
	
	public int getToOdometr() {
		return ToOdometr;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", yearProd=" + yearProd + ", priceCent=" + priceCent + ", weight=" + weight
				+ ", color=" + color + ", odometr=" + odometr + ", ToOdometr=" + ToOdometr + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carName == null) ? 0 : carName.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + odometr;
		result = prime * result + priceCent;
		result = prime * result + weight;
		result = prime * result + yearProd;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carName == null) {
			if (other.carName != null)
				return false;
		} else if (!carName.equals(other.carName))
			return false;
		if (color != other.color)
			return false;
		if (odometr != other.odometr)
			return false;
		if (priceCent != other.priceCent)
			return false;
		if (weight != other.weight)
			return false;
		if (yearProd != other.yearProd)
			return false;
		return true;
	}
	
	

}
