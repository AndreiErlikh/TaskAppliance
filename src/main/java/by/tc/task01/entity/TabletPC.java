package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC extends Appliance
{
	private static final long serialVersionUID = 1L;

	private double batteryCapacity;
	private double displayInches;
	private double memoryRom;
	private double flashMemoryCapacity;
	private String color;
	
	public TabletPC()
	{
		
	}
	
	public TabletPC(double batteryCapacity,double displayInches,double memoryRom,double flashMemoryCapacity,String color)
	{
		this.batteryCapacity = batteryCapacity;
		this.displayInches = displayInches;
		this.memoryRom = memoryRom;
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.color = color;
	}

	public double getBATTERY_CAPACITY() 
	{
		return batteryCapacity;
	}

	public void setBATTERY_CAPACITY(double batteryCapacity) 
	{
		this.batteryCapacity = batteryCapacity;
	}

	public double getDISPLAY_INCHES() 
	{
		return displayInches;
	}

	public void setDISPLAY_INCHES(double displayInches) 
	{
		this.displayInches = displayInches;
	}

	public double getMEMORY_ROM() 
	{
		return memoryRom;
	}

	public void setMEMORY_ROM(double memoryRom) 
	{
		this.memoryRom = memoryRom;
	}

	public double getFLASH_MEMORY_CAPACITY() 
	{
		return flashMemoryCapacity;
	}

	public void setFLASH_MEMORY_CAPACITY(double flashMemoryCapacity) 
	{
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public String getCOLOR() 
	{
		return color;
	}

	public void setCOLOR(String color) 
	{
		this.color = color;
	}

	@Override
	public String getName() 
	{
		return "TabletPC"; 
	}
	
	@Override
	public int hashCode() 
	{
		return Objects.hash(batteryCapacity, color, displayInches, flashMemoryCapacity, memoryRom);
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
		TabletPC other = (TabletPC) obj;
		return Double.doubleToLongBits(batteryCapacity) == Double.doubleToLongBits(other.batteryCapacity)
				&& Objects.equals(color, other.color)
				&& Double.doubleToLongBits(displayInches) == Double.doubleToLongBits(other.displayInches)
				&& Double.doubleToLongBits(flashMemoryCapacity) == Double
						.doubleToLongBits(other.flashMemoryCapacity)
				&& Double.doubleToLongBits(memoryRom) == Double.doubleToLongBits(other.memoryRom);
	}

	@Override
	public String toString() 
	{
		return "TabletPC [BATTERY_CAPACITY=" + batteryCapacity + ", DISPLAY_INCHES=" + displayInches + ", MEMORY_ROM="
				+ memoryRom + ", FLASH_MEMORY_CAPACITY=" + flashMemoryCapacity + ", COLOR=" + color + "]";
	}
	
}
