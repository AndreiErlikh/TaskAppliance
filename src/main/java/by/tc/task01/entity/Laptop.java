package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance
{

	private static final long serialVersionUID = 1L;
	
	private double batteryCapacity;
	private String os;
	private double memoryRom;
	private double systemMemory;
	private double cpu;
	private double displayInchs;
	
	public Laptop()
	{
		
	}
	
	public Laptop(double batteryCapacity,String os, double memoryRom,double systemMemory,double cpu,double displayInchs)
	{
		this.batteryCapacity = batteryCapacity;
		this.os = os;
		this.memoryRom = memoryRom;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInchs = displayInchs;
	}

	public double getBATTERY_CAPACITY()
	{
		return batteryCapacity;
	}

	public void setBATTERY_CAPACITY(double batteryCapacity) 
	{
		this.batteryCapacity = batteryCapacity;
	}

	public String getOS() 
	{
		return os;
	}

	public void setOS(String os) 
	{
		this.os = os;
	}

	public double getMEMORY_ROM() 
	{
		return memoryRom;
	}

	public void setMEMORY_ROM(double memoryRom) 
	{
		this.memoryRom = memoryRom;
	}

	public double getSYSTEM_MEMORY() 
	{
		return systemMemory;
	}

	public void setSYSTEM_MEMORY(double systemMemory) 
	{
		this.systemMemory = systemMemory;
	}

	public double getCPU() 
	{
		return cpu;
	}

	public void setCPU(double cpu) 
	{
		this.cpu = cpu;
	}

	public double getDISPLAY_INCHS() 
	{
		return displayInchs;
	}

	public void setDISPLAY_INCHS(double displayInchs) 
	{
		this.displayInchs = displayInchs;
	}
	
	@Override
	public String getName() 
	{
		return "Laptop"; 
	}

	@Override
	public int hashCode() {
		return Objects.hash(batteryCapacity, cpu, displayInchs, memoryRom, os, systemMemory);
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
		Laptop other = (Laptop) obj;
		return Double.doubleToLongBits(batteryCapacity) == Double.doubleToLongBits(other.batteryCapacity)
				&& Double.doubleToLongBits(cpu) == Double.doubleToLongBits(other.cpu)
				&& Double.doubleToLongBits(displayInchs) == Double.doubleToLongBits(other.displayInchs)
				&& Double.doubleToLongBits(memoryRom) == Double.doubleToLongBits(other.memoryRom)
				&& Objects.equals(os, other.os)
				&& Double.doubleToLongBits(systemMemory) == Double.doubleToLongBits(other.systemMemory);
	}

	@Override
	public String toString()
	{
		return "Laptop [BATTERY_CAPACITY=" + batteryCapacity + ", OS=" + os + ", MEMORY_ROM=" + memoryRom
				+ ", SYSTEM_MEMORY=" + systemMemory + ", CPU=" + cpu + ", DISPLAY_INCHS=" + displayInchs + "]";
	}
	
	
}
