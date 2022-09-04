package by.tc.task01.entity;

import java.util.Objects;

public class Refrigerator extends Appliance
{
	private static final long serialVersionUID = 1L;
	
	private double powerConsumption;
	private double weight;
	private double freezerCapacity;
	private double overallCapacity;
	private double height;
	private double width;
	
	public Refrigerator()
	{
		
	}
	
	public Refrigerator(double powerConsumption,double weight,double freezerCapacity,double overallCapacity,double height,double width)
	{
		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.freezerCapacity = freezerCapacity;
		this.overallCapacity = overallCapacity;
		this.height = height;
		this.width = width;
	}

	public double getPOWER_CONSUMPTION() 
	{
		return powerConsumption;
	}

	public void setPOWER_CONSUMPTION(double powerConsumption) 
	{
		this.powerConsumption = powerConsumption;
	}

	public double getWEIGHT() 
	{
		return weight;
	}

	public void setWEIGHT(double weight) 
	{
		this.weight = weight;
	}

	public double getFREEZER_CAPACITY()
	{
		return freezerCapacity;
	}

	public void setFREEZER_CAPACITY(double freezerCapacity)
	{
		this.freezerCapacity = freezerCapacity;
	}

	public double getOVERALL_CAPACITY()
	{
		return overallCapacity;
	}

	public void setOVERALL_CAPACITY(double overallCapacity)
	{
		this.overallCapacity = overallCapacity;
	}

	public double getHEIGHT()
	{
		return height;
	}

	public void setHEIGHT(double height) 
	{
		this.height = height;
	}

	public double getWIDTH() 
	{
		return width;
	}

	public void setWIDTH(double width) 
	{
		this.width = width;
	}
	
	@Override
	public String getName() 
	{
		return "Refrigerator"; 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(freezerCapacity, height, overallCapacity, powerConsumption, weight, width);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refrigerator other = (Refrigerator) obj;
		return Double.doubleToLongBits(freezerCapacity) == Double.doubleToLongBits(other.freezerCapacity)
				&& Double.doubleToLongBits(height) == Double.doubleToLongBits(other.height)
				&& Double.doubleToLongBits(overallCapacity) == Double.doubleToLongBits(other.overallCapacity)
				&& Double.doubleToLongBits(powerConsumption) == Double.doubleToLongBits(other.powerConsumption)
				&& Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width);
	}

	@Override
	public String toString() 
	{
		return "Refrigerator [POWER_CONSUMPTION=" + powerConsumption + ", WEIGHT=" + weight + ", FREEZER_CAPACITY="
				+ freezerCapacity + ", OVERALL_CAPACITY=" + overallCapacity + ", HEIGHT=" + height + ", WIDTH="
				+ width + "]";
	}
	
}
