package by.tc.task01.service.validation;


import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.Laptop;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;
import by.tc.task01.entity.criteria.SearchCriteria.Refrigerator;
import by.tc.task01.entity.criteria.SearchCriteria.Speakers;
import by.tc.task01.entity.criteria.SearchCriteria.TabletPC;
import by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner;
import by.tc.task01.service.validation.OvenValidator;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) 
	{
		if(criteria.getGroupSearchName().equals(Oven.class.getSimpleName()))
		{	
			return OvenValidator.ovenValidator(criteria.getCriteria());
		}

		return true;
	}

}

