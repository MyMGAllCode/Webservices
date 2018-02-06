package com.nt.dao;

public class IciciDAOFactory {
	
	public static IciciDAO getInstance()
	{
		return new IciciDAOImpl();
	}

}
