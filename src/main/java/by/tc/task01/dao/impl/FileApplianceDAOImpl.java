package by.tc.task01.dao.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

public class FileApplianceDAOImpl implements ApplianceDAO 
{
	
	public List<Appliance> find(Criteria criteria) throws DAOException 
	{
		List<Appliance> dataList = addData();
		
		List<Appliance> criteriaSheet = new ArrayList<Appliance>();
		
		for(Appliance applince:dataList) 
		{
			if(applince.getName().equals(criteria.getGroupSearchName())) 
			{
				Map<String,Object> map = criteria.getCriteria();
				Set<String> keys = map.keySet();
				
				for(String key:keys) 
				{
					switch (key)
					{
					case "Oven":
						criteriaSheet.add(findOven(key, map.get(key), applince));
						break;
					case "Laptop":
						criteriaSheet.add(findLaptop(key, map.get(key), applince));
						break;
					case "Refrigerator":
						criteriaSheet.add(findRefrigerator(key, map.get(key), applince));
						break;
					case "VacuumCleaner":
						criteriaSheet.add(findVacuumCleaner(key, map.get(key), applince));
						break;
					case "Speakers":
						criteriaSheet.add(findSpeakers(key, map.get(key), applince));
						break;
					case "TabletPC":
						criteriaSheet.add(findTabletPC(key, map.get(key), applince));
						break;
					}
				}
			}
		}
		return criteriaSheet;
	}
	


	public List<Appliance> addData() throws DAOException 
	{
		List<Appliance> dataList = new ArrayList<Appliance>();
		Scanner sc = null;
		
		try 
		{
			File file = new File("/Users/andreyerlikh/Downloads/jwd-task01-template_v2/src/main/resources/appliances_db.txt");
			sc = new Scanner(file);
		
			while(sc.hasNext()) 
			{
				String line = sc.nextLine();
				String[] parse = line.split(":");
			
				if(parse.length == 2) 
				{
					String[] parameters = parse[1].split(",");
					String type = parse[0].trim(); 
					
					if(type.equals("Oven")) 
					{
						Oven oven = new Oven();
						
						for(int i = 0;i < parameters.length;i++) 
						{
							String[] parseParameters = parameters[i].split("=");
							parseParameters[0] = parseParameters[0].trim();
						
							if(parseParameters[0].equals(SearchCriteria.Oven.POWER_CONSUMPTION.name())) 
							{
								oven.setPOWER_CONSUMPTION(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Oven.WEIGHT.name())) 
							{
								oven.setWEIGHT(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Oven.CAPACITY.name()))
							{
								oven.setCAPACITY(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Oven.DEPTH.name()))
							{
								oven.setDEPTH(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Oven.HEIGHT.name())) 
							{
								oven.setHEIGHT(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Oven.WIDTH.name()))
							{
								oven.setWIDTH(Double.parseDouble(parseParameters[1]));
							}
						}
						dataList.add(oven);
					}
					else if(type.equals("Laptop")) 
					{
						Laptop laptop = new Laptop();
						
						for(int i = 0;i < parameters.length;i++) 
						{
							String[] parseParameters = parameters[i].split("=");
							parseParameters[0]=parseParameters[0].trim();
						
							if(parseParameters[0].equals(SearchCriteria.Laptop.BATTERY_CAPACITY.name())) 
							{
								laptop.setBATTERY_CAPACITY(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Laptop.OS.name())) 
							{
								laptop.setOS(parseParameters[1]);
							}
							else if(parseParameters[0].equals(SearchCriteria.Laptop.MEMORY_ROM.name()))
							{
								laptop.setMEMORY_ROM(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Laptop.SYSTEM_MEMORY.name()))
							{
								laptop.setSYSTEM_MEMORY(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Laptop.CPU.name())) 
							{
								laptop.setCPU(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Laptop.DISPLAY_INCHS.name()))
							{
								laptop.setDISPLAY_INCHS(Double.parseDouble(parseParameters[1]));
							}
						}
						dataList.add(laptop);
					}
					else if(type.equals("Refrigerator")) 
					{
						Refrigerator refrigerator = new Refrigerator();
						
						for(int i = 0;i < parameters.length;i++) 
						{
							String[] parseParameters = parameters[i].split("=");
							parseParameters[0]=parseParameters[0].trim();
						
							if(parseParameters[0].equals(SearchCriteria.Refrigerator.POWER_CONSUMPTION.name())) 
							{
								refrigerator.setPOWER_CONSUMPTION(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Refrigerator.WEIGHT.name())) 
							{
								refrigerator.setWEIGHT(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Refrigerator.FREEZER_CAPACITY.name()))
							{
								refrigerator.setFREEZER_CAPACITY(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Refrigerator.OVERALL_CAPACITY.name()))
							{
								refrigerator.setOVERALL_CAPACITY(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Refrigerator.HEIGHT.name())) 
							{
								refrigerator.setHEIGHT(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Refrigerator.WIDTH.name()))
							{
								refrigerator.setWIDTH(Double.parseDouble(parseParameters[1]));
							}
						}
						dataList.add(refrigerator);
					}
					else if(type.equals("VacuumCleaner")) 
					{
						VacuumCleaner vacuumCleaner = new VacuumCleaner();
						
						for(int i = 0;i < parameters.length;i++) 
						{
							String[] parseParameters = parameters[i].split("=");
							parseParameters[0]=parseParameters[0].trim();
						
							if(parseParameters[0].equals(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.name())) 
							{
								vacuumCleaner.setPOWER_CONSUMPTION(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.VacuumCleaner.FILTER_TYPE.name())) 
							{
								vacuumCleaner.setFILTER_TYPE(parseParameters[1]);
							}
							else if(parseParameters[0].equals(SearchCriteria.VacuumCleaner.BAG_TYPE.name()))
							{
								vacuumCleaner.setBAG_TYPE(parseParameters[1]);
							}
							else if(parseParameters[0].equals(SearchCriteria.VacuumCleaner.WAND_TYPE.name()))
							{
								vacuumCleaner.setWAND_TYPE(parseParameters[1]);
							}
							else if(parseParameters[0].equals(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.name())) 
							{
								vacuumCleaner.setMOTOR_SPEED_REGULATION(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.name()))
							{
								vacuumCleaner.setCLEANING_WIDTH(Double.parseDouble(parseParameters[1]));
							}
						}
						dataList.add(vacuumCleaner);
					}
					else if(type.equals("TabletPC")) 
					{
						TabletPC tabletPC = new TabletPC();
						
						for(int i = 0;i < parameters.length;i++) 
						{
							String[] parseParameters = parameters[i].split("=");
							parseParameters[0]=parseParameters[0].trim();
						
							if(parseParameters[0].equals(SearchCriteria.TabletPC.BATTERY_CAPACITY.name())) 
							{
								tabletPC.setBATTERY_CAPACITY(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.TabletPC.DISPLAY_INCHES.name())) 
							{
								tabletPC.setDISPLAY_INCHES(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.TabletPC.MEMORY_ROM.name()))
							{
								tabletPC.setMEMORY_ROM(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.name()))
							{
								tabletPC.setFLASH_MEMORY_CAPACITY(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.TabletPC.COLOR.name())) 
							{
								tabletPC.setCOLOR(parseParameters[1]);
							}
						}
						dataList.add(tabletPC);
					}
					else if(type.equals("Speakers")) 
					{
						Speakers speakers = new Speakers();
						
						for(int i = 0;i < parameters.length;i++) 
						{
							String[] parseParameters = parameters[i].split("=");
							parseParameters[0]=parseParameters[0].trim();
						
							if(parseParameters[0].equals(SearchCriteria.Speakers.POWER_CONSUMPTION.name())) 
							{
								speakers.setPOWER_CONSUMPTION(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.name())) 
							{
								speakers.setNUMBER_OF_SPEAKERS(Double.parseDouble(parseParameters[1]));
							}
							else if(parseParameters[0].equals(SearchCriteria.Speakers.FREQUENCY_RANGE.name()))
							{
								speakers.setFREQUENCY_RANGE(parseParameters[1]);
							}
							else if(parseParameters[0].equals(SearchCriteria.Speakers.CORD_LENGTH.name()))
							{
								speakers.setCORD_LENGTH(Double.parseDouble(parseParameters[1]));
							}
						}
						dataList.add(speakers);
					}
				}
			}
		}
		catch(FileNotFoundException e) 
		{
			throw new DAOException(e);
		}
		finally 
		{
			if(sc != null) 
			{
				sc.close();
			}
		}
		return dataList;
	}
	
	//////
	private Appliance findOven(String key,Object obj,Appliance applince)
	{
		Oven oven = (Oven)applince;
		
		if(SearchCriteria.Oven.CAPACITY.name().equals(key)) 
		{
			if((Double)obj == oven.getCAPACITY()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.Oven.WEIGHT.name().equals(key)) 
		{
			if((Double)obj == oven.getWEIGHT()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.Oven.POWER_CONSUMPTION.name().equals(key)) 
		{
			if((Double)obj == oven.getPOWER_CONSUMPTION()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.Oven.DEPTH.name().equals(key)) 
		{
			if((Double)obj == oven.getDEPTH()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.Oven.HEIGHT.name().equals(key)) 
		{
			if((Double)obj == oven.getHEIGHT()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.Oven.WIDTH.name().equals(key)) 
		{
			if((Double)obj == oven.getWIDTH()) 
			{
				return applince;
			}
		}	
		return null;
	}
	
	///////
	private Appliance findLaptop(String key,Object obj,Appliance applince) 
	{
		Laptop laptop = (Laptop)applince;
		
		if(SearchCriteria.Laptop.BATTERY_CAPACITY.name().equals(key)) 
		{
			if((Double)obj == laptop.getBATTERY_CAPACITY()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.Laptop.OS.name().equals(key)) 
		{
			if((String)obj == laptop.getOS()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.Laptop.MEMORY_ROM.name().equals(key)) 
		{
			if((Double)obj == laptop.getMEMORY_ROM()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.Laptop.SYSTEM_MEMORY.name().equals(key)) 
		{
			if((Double)obj == laptop.getSYSTEM_MEMORY()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.Laptop.CPU.name().equals(key)) 
		{
			if((Double)obj == laptop.getCPU()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.Laptop.DISPLAY_INCHS.name().equals(key)) 
		{
			if((Double)obj == laptop.getBATTERY_CAPACITY()) 
			{
				return applince;
			}
		}
		return null;
	}
	
	/////////
	private Appliance findRefrigerator(String key,Object obj,Appliance applince) 
	{
		Refrigerator refrigerator = (Refrigerator)applince;
		
		if(SearchCriteria.Refrigerator.POWER_CONSUMPTION.name().equals(key)) 
		{
			if((Double)obj == refrigerator.getPOWER_CONSUMPTION()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.Refrigerator.WEIGHT.name().equals(key)) 
		{
			if((Double)obj == refrigerator.getWEIGHT()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.Refrigerator.FREEZER_CAPACITY.name().equals(key)) 
		{
			if((Double)obj == refrigerator.getFREEZER_CAPACITY()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.Refrigerator.OVERALL_CAPACITY.name().equals(key)) 
		{
			if((Double)obj == refrigerator.getOVERALL_CAPACITY()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.Refrigerator.HEIGHT.name().equals(key)) 
		{
			if((Double)obj == refrigerator.getHEIGHT()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.Refrigerator.WIDTH.name().equals(key)) 
		{
			if((Double)obj == refrigerator.getWIDTH()) 
			{
				return applince;
			}
		}
		return null;
	} 
	
	///////
	private Appliance findVacuumCleaner(String key,Object obj,Appliance applince) 
	{
		VacuumCleaner vacuumCleaner = new VacuumCleaner();
		
		if(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.name().equals(key)) 
		{
			if((Double)obj == vacuumCleaner.getPOWER_CONSUMPTION()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.VacuumCleaner.FILTER_TYPE.name().equals(key)) 
		{
			if((String)obj == vacuumCleaner.getFILTER_TYPE()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.VacuumCleaner.BAG_TYPE.name().equals(key)) 
		{
			if((String)obj == vacuumCleaner.getBAG_TYPE()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.VacuumCleaner.WAND_TYPE.name().equals(key)) 
		{
			if((String)obj == vacuumCleaner.getWAND_TYPE()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.name().equals(key)) 
		{
			if((Double)obj == vacuumCleaner.getMOTOR_SPEED_REGULATION()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.name().equals(key)) 
		{
			if((Double)obj == vacuumCleaner.getCLEANING_WIDTH()) 
			{
				return applince;
			}
		}
		return null;
	}
	
	///////
	private Appliance findSpeakers(String key,Object obj,Appliance applince) 
	{
		Speakers speakers = new Speakers();
		
		if(SearchCriteria.Speakers.POWER_CONSUMPTION.name().equals(key)) 
		{
			if((Double)obj == speakers.getPOWER_CONSUMPTION()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.name().equals(key)) 
		{
			if((Double)obj == speakers.getNUMBER_OF_SPEAKERS()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.Speakers.FREQUENCY_RANGE.name().equals(key)) 
		{
			if((String)obj == speakers.getFREQUENCY_RANGE()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.Speakers.CORD_LENGTH.name().equals(key)) 
		{
			if((Double)obj == speakers.getCORD_LENGTH()) 
			{
				return applince;
			}
		}
		return null;
	}
	
	///////
	private Appliance findTabletPC(String key,Object obj,Appliance applince) 
	{
		TabletPC tabletPC = new TabletPC();
		
		if(SearchCriteria.TabletPC.BATTERY_CAPACITY.name().equals(key)) 
		{
			if((Double)obj == tabletPC.getBATTERY_CAPACITY()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.TabletPC.DISPLAY_INCHES.name().equals(key)) 
		{
			if((Double)obj == tabletPC.getDISPLAY_INCHES()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.TabletPC.MEMORY_ROM.name().equals(key)) 
		{
			if((Double)obj == tabletPC.getMEMORY_ROM()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.name().equals(key)) 
		{
			if((Double)obj == tabletPC.getFLASH_MEMORY_CAPACITY()) 
			{
				return applince;
			}
		}
		else if(SearchCriteria.TabletPC.COLOR.name().equals(key)) 
		{
			if((String)obj == tabletPC.getCOLOR()) 
			{
				return applince;
			}
		}
		return null;
	}
}