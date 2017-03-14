/**
 * ContentStream_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i2rd.contentstream;

public interface ContentStream_Service extends javax.xml.rpc.Service {
    public java.lang.String getContentStreamAddress();

    public com.i2rd.contentstream.ContentStream_PortType getContentStream() throws javax.xml.rpc.ServiceException;

    public com.i2rd.contentstream.ContentStream_PortType getContentStream(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
