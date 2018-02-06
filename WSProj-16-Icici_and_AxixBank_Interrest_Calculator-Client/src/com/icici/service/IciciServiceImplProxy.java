package com.icici.service;

public class IciciServiceImplProxy implements com.icici.service.IciciServiceImpl {
  private String _endpoint = null;
  private com.icici.service.IciciServiceImpl iciciServiceImpl = null;
  
  public IciciServiceImplProxy() {
    _initIciciServiceImplProxy();
  }
  
  public IciciServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initIciciServiceImplProxy();
  }
  
  private void _initIciciServiceImplProxy() {
    try {
      iciciServiceImpl = (new com.icici.service.IciciServiceImplServiceLocator()).getIciciServiceImpl();
      if (iciciServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iciciServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iciciServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iciciServiceImpl != null)
      ((javax.xml.rpc.Stub)iciciServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.icici.service.IciciServiceImpl getIciciServiceImpl() {
    if (iciciServiceImpl == null)
      _initIciciServiceImplProxy();
    return iciciServiceImpl;
  }
  
  public double getInstance() throws java.rmi.RemoteException{
    if (iciciServiceImpl == null)
      _initIciciServiceImplProxy();
    return iciciServiceImpl.getInstance();
  }
  
  
}