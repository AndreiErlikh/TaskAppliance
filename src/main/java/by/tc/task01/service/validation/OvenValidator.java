package by.tc.task01.service.validation;

import java.util.Map;
import java.util.Set;

import by.tc.task01.entity.criteria.SearchCriteria.Oven;

public class OvenValidator 
{
	OvenValidator()
	{
		
	}
	
	public static boolean ovenValidator(Map<String,Object> inputParam) 
	{
		Set<String> keys = (Set<String>)inputParam.keySet();
		
		String type;
		Double keyDouble;

		for(String key:keys) 
		{
			if(key.equals(Oven.POWER_CONSUMPTION.toString())) 
			{
				type = inputParam.get(key).getClass().getSimpleName();
				
				if(type.equals("Double"))
				{
					keyDouble = (Double)inputParam.get(key);
					
					if(keyDouble >= 0 && keyDouble<=50.0) 
					{
						continue;
					}
					else 
					{
						return false;
					}
				}
				else 
				{
					return false;
				}
			}
			else if(key.equals(Oven.WEIGHT.toString())) 
			{
				type = inputParam.get(key).getClass().getSimpleName();
				
				if(type.equals("Double"))
				{
					keyDouble = (Double)inputParam.get(key);
					
					if(keyDouble >= 0 && keyDouble<=15.0) 
					{
						continue;
					}
					else 
					{
						return false;
					}
				}
				else 
				{
					return false;
				}
			}
			else if(key.equals(Oven.CAPACITY.toString())) 
			{
				type = inputParam.get(key).getClass().getSimpleName();
				
				if(type.equals("Double"))
				{
					keyDouble = (Double)inputParam.get(key);
					
					if(keyDouble >= 10.0 && keyDouble<=35.0) 
					{
						continue;
					}
					else 
					{
						return false;
					}
				}
				else 
				{
					return false;
				}
			}
			else if(key.equals(Oven.DEPTH.toString())) 
			{
				type = inputParam.get(key).getClass().getSimpleName();
				
				if(type.equals("Double"))
				{
					keyDouble = (Double)inputParam.get(key);
					
					if(keyDouble >= 20.0 && keyDouble<=60.0) 
					{
						continue;
					}
					else 
					{
						return false;
					}
				}
				else 
				{
					return false;
				}
			}
			else if(key.equals(Oven.HEIGHT.toString())) 
			{
				type = inputParam.get(key).getClass().getSimpleName();
				
				if(type.equals("Double"))
				{
					keyDouble = (Double)inputParam.get(key);
					
					if(keyDouble >= 20.0 && keyDouble<=50.0) 
					{
						continue;
					}
					else 
					{
						return false;
					}
				}
				else 
				{
					return false;
				}
			}
			else if(key.equals(Oven.WIDTH.toString())) 
			{
				type = inputParam.get(key).getClass().getSimpleName();
				
				if(type.equals("Double"))
				{
					keyDouble = (Double)inputParam.get(key);
					
					if(keyDouble >= 20.0 && keyDouble<=50.0) 
					{
						continue;
					}
					else 
					{
						return false;
					}
				}
				else 
				{
					return false;
				}
			}
		}
		return true;
	}
}
