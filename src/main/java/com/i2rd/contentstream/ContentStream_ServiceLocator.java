/**
 * ContentStream_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i2rd.contentstream;

public class ContentStream_ServiceLocator extends org.apache.axis.client.Service implements com.i2rd.contentstream.ContentStream_Service {

    public ContentStream_ServiceLocator() {
    }


    public ContentStream_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ContentStream_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ContentStream
    private java.lang.String ContentStream_address = "https://contentstream.cfemedia.com/api/ContentStream.php";

    public java.lang.String getContentStreamAddress() {
        return ContentStream_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ContentStreamWSDDServiceName = "ContentStream";

    public java.lang.String getContentStreamWSDDServiceName() {
        return ContentStreamWSDDServiceName;
    }

    public void setContentStreamWSDDServiceName(java.lang.String name) {
        ContentStreamWSDDServiceName = name;
    }

    public com.i2rd.contentstream.ContentStream_PortType getContentStream() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ContentStream_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getContentStream(endpoint);
    }

    public com.i2rd.contentstream.ContentStream_PortType getContentStream(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.i2rd.contentstream.ContentStreamSoapBindingStub _stub = new com.i2rd.contentstream.ContentStreamSoapBindingStub(portAddress, this);
            _stub.setPortName(getContentStreamWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setContentStreamEndpointAddress(java.lang.String address) {
        ContentStream_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.i2rd.contentstream.ContentStream_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.i2rd.contentstream.ContentStreamSoapBindingStub _stub = new com.i2rd.contentstream.ContentStreamSoapBindingStub(new java.net.URL(ContentStream_address), this);
                _stub.setPortName(getContentStreamWSDDServiceName());
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
        if ("ContentStream".equals(inputPortName)) {
            return getContentStream();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "ContentStream");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "ContentStream"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ContentStream".equals(portName)) {
            setContentStreamEndpointAddress(address);
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
