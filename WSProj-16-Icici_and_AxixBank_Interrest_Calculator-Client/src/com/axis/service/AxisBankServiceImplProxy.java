package com.axis.service;

public class AxisBankServiceImplProxy implements com.axis.service.AxisBankServiceImpl {
  private String _endpoint = null;
  private com.axis.service.AxisBankServiceImpl axisBankServiceImpl = null;
  
  public AxisBankServiceImplProxy() {
    _initAxisBankServiceImplProxy();
  }
  
  public AxisBankServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initAxisBankServiceImplProxy();
  }
  
  private void _initAxisBankServiceImplProxy() {
    try {
      axisBankServiceImpl = (new com.axis.service.AxisBankServiceImplServiceLocator()).getAxisBankServiceImpl();
      if (axisBankServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)axisBankServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)axisBankServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (axisBankServiceImpl != null)
      ((javax.xml.rpc.Stub)axisBankServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.axis.service.AxisBankServiceImpl getAxisBankServiceImpl() {
    if (axisBankServiceImpl == null)
      _initAxisBankServiceImplProxy();
    return axisBankServiceImpl;
  }
  
  public double getInstance() throws java.rmi.RemoteException{
    if (axisBankServiceImpl == null)
      _initAxisBankServiceImplProxy();
    return axisBankServiceImpl.getInstance();
  }
  
  
}