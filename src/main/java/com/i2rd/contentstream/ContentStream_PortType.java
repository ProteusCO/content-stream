/**
 * ContentStream_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i2rd.contentstream;

public interface ContentStream_PortType extends java.rmi.Remote {
    public void getContentList(java.lang.String username, java.lang.String password, javax.xml.rpc.holders.IntHolder feedDefinitionId, int maxNumberResultsRequested, int offset, javax.xml.rpc.holders.IntHolder errorOccurred, javax.xml.rpc.holders.StringHolder errorDescription, com.i2rd.contentstream.holders.IntArrayHolder arrUid, com.i2rd.contentstream.holders.StringArrayHolder arrTitle, com.i2rd.contentstream.holders.StringArrayHolder arrDateTime, javax.xml.rpc.holders.IntegerWrapperHolder totalNumberInQueue, javax.xml.rpc.holders.IntegerWrapperHolder moreResults, javax.xml.rpc.holders.IntegerWrapperHolder startingOffset, javax.xml.rpc.holders.IntegerWrapperHolder endingOffset) throws java.rmi.RemoteException;
    public void getArticle(java.lang.String username, java.lang.String password, int uid, int feedDefinitionId, javax.xml.rpc.holders.IntHolder errorOccurred, javax.xml.rpc.holders.StringHolder errorDescription, javax.xml.rpc.holders.StringHolder articleXMLURL, com.i2rd.contentstream.holders.StringArrayHolder arrArticleAssetURL, com.i2rd.contentstream.holders.StringArrayHolder arrArticleAssetFileName) throws java.rmi.RemoteException;
    public void getDigitalAsset(java.lang.String username, java.lang.String password, int uid, int feedDefinitionId, javax.xml.rpc.holders.IntHolder errorOccurred, javax.xml.rpc.holders.StringHolder errorDescription, javax.xml.rpc.holders.StringHolder digitalAssetXMLURL, javax.xml.rpc.holders.StringHolder digitalAssetURL) throws java.rmi.RemoteException;
    public void deleteFromQueue(java.lang.String username, java.lang.String password, int feedDefinitionId, int uid, javax.xml.rpc.holders.IntHolder errorOccurred, javax.xml.rpc.holders.StringHolder errorDescription) throws java.rmi.RemoteException;
}
