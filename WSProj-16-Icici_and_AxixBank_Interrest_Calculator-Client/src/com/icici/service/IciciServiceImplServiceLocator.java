/**
 * IciciServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.icici.service;

public class IciciServiceImplServiceLocator extends org.apache.axis.client.Service implements com.icici.service.IciciServiceImplService {

    public IciciServiceImplServiceLocator() {
    }


    public IciciServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IciciServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IciciServiceImpl
    private java.lang.String IciciServiceImpl_address = "http://localhost:4040/WSProj-15-ICICIBank-InterestCalculator-WSDL-AXIS/services/IciciServiceImpl";

    public java.lang.String getIciciServiceImplAddress() {
        return IciciServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IciciServiceImplWSDDServiceName = "IciciServiceImpl";

    public java.lang.String getIciciServiceImplWSDDServiceName() {
        return IciciServiceImplWSDDServiceName;
    }

    public void setIciciServiceImplWSDDServiceName(java.lang.String name) {
        IciciServiceImplWSDDServiceName = name;
    }

    public com.icici.service.IciciServiceImpl getIciciServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IciciServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIciciServiceImpl(endpoint);
    }

    public com.icici.service.IciciServiceImpl getIciciServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.icici.service.IciciServiceImplSoapBindingStub _stub = new com.icici.service.IciciServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getIciciServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIciciServiceImplEndpointAddress(java.lang.String address) {
        IciciServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.icici.service.IciciServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.icici.service.IciciServiceImplSoapBindingStub _stub = new com.icici.service.IciciServiceImplSoapBindingStub(new java.net.URL(IciciServiceImpl_address), this);
                _stub.setPortName(getIciciServiceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IciciServiceImpl".equals(inputPortName)) {
            return getIciciServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.icici.com", "IciciServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.icici.com", "IciciServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IciciServiceImpl".equals(portName)) {
            setIciciServiceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
