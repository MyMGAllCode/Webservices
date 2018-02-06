package com.nt.dao;

public class AxisBankDAOFactory {
	
	public static AxisBankDAO getInstance()
	{
		return new AxisBankDAOImpl();
	}

}
