package com.nareshit.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.nareshit.proxy.GeoIP;
import com.nareshit.proxy.GeoIPService;
import com.nareshit.proxy.GeoIPServiceSoap;
import com.nareshit.proxy.GeoIPService_Impl;

public class Test {
	public static void main(String[] args) throws ServiceException, RemoteException {
		GeoIPService geo= new GeoIPService_Impl();
		GeoIPServiceSoap sei=geo.getGeoIPServiceSoap();
		String result=(String)(Object)sei.getGeoIP("176.36.10.1");
		System.out.println("GeoIp"+result);
		
		
	}

}
