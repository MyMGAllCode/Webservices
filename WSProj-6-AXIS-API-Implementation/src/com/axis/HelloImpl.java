package com.axis;

import java.rmi.RemoteException;

public class HelloImpl implements IHello {

	@Override
	public String sayHello(String name) throws RemoteException {
		String msg="Hello:"+name+"Welcome To AXIS API Implementation";		
		return msg;
	}

}
