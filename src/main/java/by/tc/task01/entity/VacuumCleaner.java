package by.tc.task01.entity;

import java.util.Objects;

public class VacuumCleaner extends Appliance
{
	private static final long serialVersionUID = 1L;
	
	private double powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private double motorSpeedRegulation;
	private double cleaningWidth;
	
	public VacuumCleaner()
	{
		
	}
	
	public VacuumCleaner(double powerConsumption,String filterType,String bagType,String wandType,double motorSpeedRegulation,double cleaningWidth)
	{
		this.powerConsumption = powerConsumption;
		this.filterType = filterType;
		this.bagType = bagType;
		this.wandType = wandType;
		this.motorSpeedRegulation = motorSpeedRegulation;
		this.cleaningWidth = cleaningWidth;
	}

	public double getPOWER_CONSUMPTION() 
	{
		return powerConsumption;
	}

	public void setPOWER_CONSUMPTION(double powerConsumption)
	{
		this.powerConsumption = powerConsumption;
	}

	public String getFILTER_TYPE() 
	{
		return filterType;
	}

	public void setFILTER_TYPE(String filterType) 
	{
		this.filterType = filterType;
	}

	public String getBAG_TYPE() 
	{
		return bagType;
	}

	public void setBAG_TYPE(String bagType) 
	{
		this.bagType = bagType;
	}

	public String getWAND_TYPE() 
	{
		return wandType;
	}

	public void setWAND_TYPE(String wandType) 
	{
		this.wandType = wandType;
	}

	public double getMOTOR_SPEED_REGULATION() 
	{
		return motorSpeedRegulation;
	}

	public void setMOTOR_SPEED_REGULATION(double motorSpeedRegulation) 
	{
		this.motorSpeedRegulation = motorSpeedRegulation;
	}

	public double getCLEANING_WIDTH() 
	{
		return cleaningWidth;
	}

	public void setCLEANING_WIDTH(double cleaningWidth) 
	{
		this.cleaningWidth = cleaningWidth;
	}
	
	@Override
	public String getName() 
	{
		return "VacuumCleaner"; 
	}

	@Override
	public int hashCode() {
		return Objects.hash(bagType, cleaningWidth, filterType, motorSpeedRegulation, powerConsumption,
				wandType);
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
		VacuumCleaner other = (VacuumCleaner) obj;
		return Objects.equals(bagType, other.bagType)
				&& Double.doubleToLongBits(cleaningWidth) == Double.doubleToLongBits(other.cleaningWidth)
				&& Objects.equals(filterType, other.filterType)
				&& Double.doubleToLongBits(motorSpeedRegulation) == Double
						.doubleToLongBits(other.motorSpeedRegulation)
				&& Double.doubleToLongBits(powerConsumption) == Double.doubleToLongBits(other.powerConsumption)
				&& Objects.equals(wandType, other.wandType);
	}

	@Override
	public String toString() 
	{
		return "VacuumCleaner [POWER_CONSUMPTION=" + powerConsumption + ", FILTER_TYPE=" + filterType + ", BAG_TYPE="
				+ bagType + ", WAND_TYPE=" + wandType + ", MOTOR_SPEED_REGULATION=" + motorSpeedRegulation
				+ ", CLEANING_WIDTH=" + cleaningWidth + "]";
	}
	
	
}
