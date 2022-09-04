package by.tc.task01.dao;

import java.io.FileNotFoundException;
import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ServiceException;

public interface ApplianceDAO 
{	
	List<Appliance> find(Criteria criteria)throws DAOException;
}
