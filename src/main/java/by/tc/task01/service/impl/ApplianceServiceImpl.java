package by.tc.task01.service.impl;


import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOException;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.dao.impl.FileApplianceDAOImpl;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceException;
import by.tc.task01.service.validation.Validator;

public class ApplianceServiceImpl implements ApplianceService
{
	public List<Appliance> find(Criteria criteria) throws ServiceException  
	{
		if (!Validator.criteriaValidator(criteria))
		{
			 throw new ServiceException("Wrong value");
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();	
		
		List<Appliance> appliances;
		
		try
		{
			appliances = applianceDAO.find(criteria);
		} catch (DAOException e) 
		{
			throw new ServiceException(e);
		}

		return appliances;
	}

}
