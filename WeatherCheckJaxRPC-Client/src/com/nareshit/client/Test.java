package com.nareshit.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.nareshit.proxy.GlobalWeather;
import com.nareshit.proxy.GlobalWeatherSoap;
import com.nareshit.proxy.GlobalWeather_Impl;

public class Test {

public static void main(String[] args) throws ServiceException, RemoteException {
	GlobalWeather globalWeather=new  GlobalWeather_Impl();
	GlobalWeatherSoap sei=globalWeather.getGlobalWeatherSoap();
	//String result=sei.getCitiesByCountry("india");

	String weather=sei.getWeather("Hyderabad", "India");
	System.out.println("Weather of Bombay:::"+weather);
	//System.out.println("Indian Cities"+result);
	
	
}
}
