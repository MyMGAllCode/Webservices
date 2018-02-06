/**
 * 
 */
package com.icici.service;

import com.nt.dao.IciciDAO;
import com.nt.dao.IciciDAOFactory;

/**
 * @author DKP
 *
 */
public class IciciServiceImpl implements IciciService {

	@Override
	public Double getInstance() {
		IciciDAO dao=IciciDAOFactory.getInstance();
		Double iciciInterestrate=dao.getIciciInterest();
		
		
		return iciciInterestrate;
	}

}
