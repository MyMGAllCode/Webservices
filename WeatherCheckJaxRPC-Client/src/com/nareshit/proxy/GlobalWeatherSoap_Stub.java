// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation (1.1.3, build R1)
// Generated source version: 1.1.3

package com.nareshit.proxy;

import com.sun.xml.rpc.server.http.MessageContextProperties;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.encoding.literal.*;
import com.sun.xml.rpc.soap.streaming.*;
import com.sun.xml.rpc.soap.message.*;
import com.sun.xml.rpc.soap.SOAPVersion;
import com.sun.xml.rpc.soap.SOAPEncodingConstants;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.lang.reflect.*;
import java.lang.Class;
import com.sun.xml.rpc.client.SenderException;
import com.sun.xml.rpc.client.*;
import com.sun.xml.rpc.client.http.*;
import javax.xml.rpc.handler.*;
import javax.xml.rpc.JAXRPCException;
import javax.xml.rpc.soap.SOAPFaultException;

public class GlobalWeatherSoap_Stub
    extends com.sun.xml.rpc.client.StubBase
    implements com.nareshit.proxy.GlobalWeatherSoap {
    
    
    
    /*
     *  public constructor
     */
    public GlobalWeatherSoap_Stub(HandlerChain handlerChain) {
        super(handlerChain);
        _setProperty(ENDPOINT_ADDRESS_PROPERTY, "http://www.webservicex.net/globalweather.asmx");
    }
    
    
    /*
     *  implementation of getWeather
     */
    public java.lang.String getWeather(java.lang.String cityName, java.lang.String countryName)
        throws java.rmi.RemoteException {
        
        try {
            
            StreamingSenderState _state = _start(_handlerChain);
            
            InternalSOAPMessage _request = _state.getRequest();
            _request.setOperationCode(GetWeather_OPCODE);
            
            com.nareshit.proxy.GetWeather _myGetWeather = new com.nareshit.proxy.GetWeather();
            _myGetWeather.setCityName(cityName);
            _myGetWeather.setCountryName(countryName);
            
            SOAPBlockInfo _bodyBlock = new SOAPBlockInfo(ns1_GetWeather_GetWeather_QNAME);
            _bodyBlock.setValue(_myGetWeather);
            _bodyBlock.setSerializer(ns1_myGetWeather_LiteralSerializer);
            _request.setBody(_bodyBlock);
            
            _state.getMessageContext().setProperty(HttpClientTransport.HTTP_SOAPACTION_PROPERTY, "http://www.webserviceX.NET/GetWeather");
            
            _send((java.lang.String) _getProperty(ENDPOINT_ADDRESS_PROPERTY), _state);
            
            com.nareshit.proxy.GetWeatherResponse _result = null;
            java.lang.Object _responseObj = _state.getResponse().getBody().getValue();
            if (_responseObj instanceof SOAPDeserializationState) {
                _result = (com.nareshit.proxy.GetWeatherResponse)((SOAPDeserializationState) _responseObj).getInstance();
            } else {
                _result = (com.nareshit.proxy.GetWeatherResponse)_responseObj;
            }
            
            return _result.getGetWeatherResult();
            
        } catch (RemoteException e) {
            // let this one through unchanged
            throw e;
        } catch (JAXRPCException e) {
            throw new RemoteException(e.getMessage(), e);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException)e;
            } else {
                throw new RemoteException(e.getMessage(), e);
            }
        }
    }
    
    /*
     *  implementation of getCitiesByCountry
     */
    public java.lang.String getCitiesByCountry(java.lang.String countryName)
        throws java.rmi.RemoteException {
        
        try {
            
            StreamingSenderState _state = _start(_handlerChain);
            
            InternalSOAPMessage _request = _state.getRequest();
            _request.setOperationCode(GetCitiesByCountry_OPCODE);
            
            com.nareshit.proxy.GetCitiesByCountry _myGetCitiesByCountry = new com.nareshit.proxy.GetCitiesByCountry();
            _myGetCitiesByCountry.setCountryName(countryName);
            
            SOAPBlockInfo _bodyBlock = new SOAPBlockInfo(ns1_GetCitiesByCountry_GetCitiesByCountry_QNAME);
            _bodyBlock.setValue(_myGetCitiesByCountry);
            _bodyBlock.setSerializer(ns1_myGetCitiesByCountry_LiteralSerializer);
            _request.setBody(_bodyBlock);
            
            _state.getMessageContext().setProperty(HttpClientTransport.HTTP_SOAPACTION_PROPERTY, "http://www.webserviceX.NET/GetCitiesByCountry");
            
            _send((java.lang.String) _getProperty(ENDPOINT_ADDRESS_PROPERTY), _state);
            
            com.nareshit.proxy.GetCitiesByCountryResponse _result = null;
            java.lang.Object _responseObj = _state.getResponse().getBody().getValue();
            if (_responseObj instanceof SOAPDeserializationState) {
                _result = (com.nareshit.proxy.GetCitiesByCountryResponse)((SOAPDeserializationState) _responseObj).getInstance();
            } else {
                _result = (com.nareshit.proxy.GetCitiesByCountryResponse)_responseObj;
            }
            
            return _result.getGetCitiesByCountryResult();
            
        } catch (RemoteException e) {
            // let this one through unchanged
            throw e;
        } catch (JAXRPCException e) {
            throw new RemoteException(e.getMessage(), e);
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                throw (RuntimeException)e;
            } else {
                throw new RemoteException(e.getMessage(), e);
            }
        }
    }
    
    
    /*
     *  this method deserializes the request/response structure in the body
     */
    protected void _readFirstBodyElement(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState  state) throws Exception {
        int opcode = state.getRequest().getOperationCode();
        switch (opcode) {
            case GetWeather_OPCODE:
                _deserialize_GetWeather(bodyReader, deserializationContext, state);
                break;
            case GetCitiesByCountry_OPCODE:
                _deserialize_GetCitiesByCountry(bodyReader, deserializationContext, state);
                break;
            default:
                throw new SenderException("sender.response.unrecognizedOperation", java.lang.Integer.toString(opcode));
        }
    }
    
    
    
    /*
     * This method deserializes the body of the GetWeather operation.
     */
    private void _deserialize_GetWeather(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState state) throws Exception {
        java.lang.Object myGetWeatherResponseObj =
            ns1_myGetWeatherResponse_LiteralSerializer.deserialize(ns1_GetWeather_GetWeatherResponse_QNAME,
                bodyReader, deserializationContext);
        
        SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_GetWeather_GetWeatherResponse_QNAME);
        bodyBlock.setValue(myGetWeatherResponseObj);
        state.getResponse().setBody(bodyBlock);
    }
    
    /*
     * This method deserializes the body of the GetCitiesByCountry operation.
     */
    private void _deserialize_GetCitiesByCountry(XMLReader bodyReader, SOAPDeserializationContext deserializationContext, StreamingSenderState state) throws Exception {
        java.lang.Object myGetCitiesByCountryResponseObj =
            ns1_myGetCitiesByCountryResponse_LiteralSerializer.deserialize(ns1_GetCitiesByCountry_GetCitiesByCountryResponse_QNAME,
                bodyReader, deserializationContext);
        
        SOAPBlockInfo bodyBlock = new SOAPBlockInfo(ns1_GetCitiesByCountry_GetCitiesByCountryResponse_QNAME);
        bodyBlock.setValue(myGetCitiesByCountryResponseObj);
        state.getResponse().setBody(bodyBlock);
    }
    
    
    
    protected java.lang.String _getDefaultEnvelopeEncodingStyle() {
        return null;
    }
    
    public java.lang.String _getImplicitEnvelopeEncodingStyle() {
        return "";
    }
    
    public java.lang.String _getEncodingStyle() {
        return SOAPNamespaceConstants.ENCODING;
    }
    
    public void _setEncodingStyle(java.lang.String encodingStyle) {
        throw new UnsupportedOperationException("cannot set encoding style");
    }
    
    
    
    
    
    /*
     * This method returns an array containing (prefix, nsURI) pairs.
     */
    protected java.lang.String[] _getNamespaceDeclarations() {
        return myNamespace_declarations;
    }
    
    /*
     * This method returns an array containing the names of the headers we understand.
     */
    public javax.xml.namespace.QName[] _getUnderstoodHeaders() {
        return understoodHeaderNames;
    }
    
    
    protected void _preHandlingHook(StreamingSenderState state) throws Exception {
        super._preHandlingHook(state);
    }
    
    
    protected boolean _preRequestSendingHook(StreamingSenderState state) throws Exception {
        boolean bool = false;
        bool = super._preRequestSendingHook(state);
        return bool;
    }
    
    public void _initialize(InternalTypeMappingRegistry registry) throws Exception {
        super._initialize(registry);
        ns1_myGetWeatherResponse_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.nareshit.proxy.GetWeatherResponse.class, ns1_GetWeatherResponse_TYPE_QNAME);
        ns1_myGetCitiesByCountryResponse_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.nareshit.proxy.GetCitiesByCountryResponse.class, ns1_GetCitiesByCountryResponse_TYPE_QNAME);
        ns1_myGetWeather_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.nareshit.proxy.GetWeather.class, ns1_GetWeather_TYPE_QNAME);
        ns1_myGetCitiesByCountry_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.nareshit.proxy.GetCitiesByCountry.class, ns1_GetCitiesByCountry_TYPE_QNAME);
    }
    
    private static final javax.xml.namespace.QName _portName = new QName("http://www.webserviceX.NET", "GlobalWeatherSoap");
    private static final int GetWeather_OPCODE = 0;
    private static final int GetCitiesByCountry_OPCODE = 1;
    private static final javax.xml.namespace.QName ns1_GetWeather_GetWeather_QNAME = new QName("http://www.webserviceX.NET", "GetWeather");
    private static final javax.xml.namespace.QName ns1_GetWeather_TYPE_QNAME = new QName("http://www.webserviceX.NET", "GetWeather");
    private CombinedSerializer ns1_myGetWeather_LiteralSerializer;
    private static final javax.xml.namespace.QName ns1_GetWeather_GetWeatherResponse_QNAME = new QName("http://www.webserviceX.NET", "GetWeatherResponse");
    private static final javax.xml.namespace.QName ns1_GetWeatherResponse_TYPE_QNAME = new QName("http://www.webserviceX.NET", "GetWeatherResponse");
    private CombinedSerializer ns1_myGetWeatherResponse_LiteralSerializer;
    private static final javax.xml.namespace.QName ns1_GetCitiesByCountry_GetCitiesByCountry_QNAME = new QName("http://www.webserviceX.NET", "GetCitiesByCountry");
    private static final javax.xml.namespace.QName ns1_GetCitiesByCountry_TYPE_QNAME = new QName("http://www.webserviceX.NET", "GetCitiesByCountry");
    private CombinedSerializer ns1_myGetCitiesByCountry_LiteralSerializer;
    private static final javax.xml.namespace.QName ns1_GetCitiesByCountry_GetCitiesByCountryResponse_QNAME = new QName("http://www.webserviceX.NET", "GetCitiesByCountryResponse");
    private static final javax.xml.namespace.QName ns1_GetCitiesByCountryResponse_TYPE_QNAME = new QName("http://www.webserviceX.NET", "GetCitiesByCountryResponse");
    private CombinedSerializer ns1_myGetCitiesByCountryResponse_LiteralSerializer;
    private static final java.lang.String[] myNamespace_declarations =
                                        new java.lang.String[] {
                                            "ns0", "http://www.webserviceX.NET"
                                        };
    
    private static final QName[] understoodHeaderNames = new QName[] {  };
}