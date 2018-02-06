/**
 * 
 */
package com.axis.service;

import com.nt.dao.AxisBankDAO;
import com.nt.dao.AxisBankDAOFactory;

/**
 * @author DKP
 *
 */
public class AxisBankServiceImpl implements AxisBankService {

	@Override
	public Double getInstance() {
		AxisBankDAO dao=AxisBankDAOFactory.getInstance();
		Double iciciInterestrate=dao.getAxisBankInterest();
		
		
		return iciciInterestrate;
	}

}
