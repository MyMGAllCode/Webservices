package com.restsecurity.services;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class MyApplication extends Application {
	private static Set<Object>set=new HashSet<Object>();
	public MyApplication() {
		Product productResource=new Product();
		set.add(productResource);
	}
public Set<Object> getSingletons(){
	return set;
}
}
