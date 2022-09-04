package by.tc.task01.entity;

import java.util.Objects;

public class Speakers extends Appliance
{
	private static final long serialVersionUID = 1L;

	private double powerConsumption;
	private double numberOfSpeakers;
	private String frequencyRange;
	private double cordLength;
	
	public Speakers()
	{
		
	}
	
	public Speakers(double powerConsumption,double numberOfSpeakers,String frequencyRange,double cordLength)
	{
		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequencyRange = frequencyRange;
		this.cordLength = cordLength;
	}

	public double getPOWER_CONSUMPTION() 
	{
		return powerConsumption;
	}

	public void setPOWER_CONSUMPTION(double powerConsumption) 
	{
		this.powerConsumption = powerConsumption;
	}

	public double getNUMBER_OF_SPEAKERS()
	{
		return numberOfSpeakers;
	}

	public void setNUMBER_OF_SPEAKERS(double numberOfSpeakers) 
	{
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public String getFREQUENCY_RANGE() 
	{
		return frequencyRange;
	}

	public void setFREQUENCY_RANGE(String frequencyRange)
	{
		this.frequencyRange = frequencyRange;
	}

	public double getCORD_LENGTH() 
	{
		return cordLength;
	}

	public void setCORD_LENGTH(double cordLength) 
	{
		this.cordLength = cordLength;
	}

	@Override
	public String getName() 
	{
		return "Speakers"; 
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cordLength, frequencyRange, numberOfSpeakers, powerConsumption);
		return result;
	}

	

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Speakers other = (Speakers) obj;
		return Double.doubleToLongBits(cordLength) == Double.doubleToLongBits(other.cordLength)
				&& Objects.equals(frequencyRange, other.frequencyRange)
				&& Double.doubleToLongBits(numberOfSpeakers) == Double.doubleToLongBits(other.numberOfSpeakers)
				&& Double.doubleToLongBits(powerConsumption) == Double.doubleToLongBits(other.powerConsumption);
	}

	@Override
	public String toString() 
	{
		return "Speakers [POWER_CONSUMPTION=" + powerConsumption + ", NUMBER_OF_SPEAKERS=" + numberOfSpeakers
				+ ", FREQUENCY_RANGE=" + frequencyRange + ", CORD_LENGTH=" + cordLength + "]";
	}
	
}
