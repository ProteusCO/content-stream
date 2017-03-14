/**
 * ContentStreamSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.i2rd.contentstream;

public class ContentStreamSoapBindingStub extends org.apache.axis.client.Stub implements com.i2rd.contentstream.ContentStream_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[4];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContentList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "feedDefinitionId"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "maxNumberResultsRequested"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "offset"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorOccurred"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorDescription"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "arrUid"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "arrTitle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "arrDateTime"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "totalNumberInQueue"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "moreResults"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "startingOffset"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "endingOffset"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getArticle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "uid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "feedDefinitionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorOccurred"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorDescription"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "articleXMLURL"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "arrArticleAssetURL"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "arrArticleAssetFileName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDigitalAsset");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "uid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "feedDefinitionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorOccurred"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorDescription"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "digitalAssetXMLURL"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "digitalAssetURL"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteFromQueue");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "feedDefinitionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "uid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorOccurred"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorDescription"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

    }

    public ContentStreamSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ContentStreamSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ContentStreamSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void getContentList(java.lang.String username, java.lang.String password, javax.xml.rpc.holders.IntHolder feedDefinitionId, int maxNumberResultsRequested, int offset, javax.xml.rpc.holders.IntHolder errorOccurred, javax.xml.rpc.holders.StringHolder errorDescription, com.i2rd.contentstream.holders.IntArrayHolder arrUid, com.i2rd.contentstream.holders.StringArrayHolder arrTitle, com.i2rd.contentstream.holders.StringArrayHolder arrDateTime, javax.xml.rpc.holders.IntegerWrapperHolder totalNumberInQueue, javax.xml.rpc.holders.IntegerWrapperHolder moreResults, javax.xml.rpc.holders.IntegerWrapperHolder startingOffset, javax.xml.rpc.holders.IntegerWrapperHolder endingOffset) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ContentStream#getContentList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "getContentList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(feedDefinitionId.value), new java.lang.Integer(maxNumberResultsRequested), new java.lang.Integer(offset)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                feedDefinitionId.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "feedDefinitionId"))).intValue();
            } catch (java.lang.Exception _exception) {
                feedDefinitionId.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "feedDefinitionId")), int.class)).intValue();
            }
            try {
                errorOccurred.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorOccurred"))).intValue();
            } catch (java.lang.Exception _exception) {
                errorOccurred.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorOccurred")), int.class)).intValue();
            }
            try {
                errorDescription.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorDescription"));
            } catch (java.lang.Exception _exception) {
                errorDescription.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorDescription")), java.lang.String.class);
            }
            try {
                arrUid.value = (int[]) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "arrUid"));
            } catch (java.lang.Exception _exception) {
                arrUid.value = (int[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "arrUid")), int[].class);
            }
            try {
                arrTitle.value = (java.lang.String[]) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "arrTitle"));
            } catch (java.lang.Exception _exception) {
                arrTitle.value = (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "arrTitle")), java.lang.String[].class);
            }
            try {
                arrDateTime.value = (java.lang.String[]) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "arrDateTime"));
            } catch (java.lang.Exception _exception) {
                arrDateTime.value = (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "arrDateTime")), java.lang.String[].class);
            }
            try {
                totalNumberInQueue.value = (java.lang.Integer) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "totalNumberInQueue"));
            } catch (java.lang.Exception _exception) {
                totalNumberInQueue.value = (java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "totalNumberInQueue")), java.lang.Integer.class);
            }
            try {
                moreResults.value = (java.lang.Integer) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "moreResults"));
            } catch (java.lang.Exception _exception) {
                moreResults.value = (java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "moreResults")), java.lang.Integer.class);
            }
            try {
                startingOffset.value = (java.lang.Integer) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "startingOffset"));
            } catch (java.lang.Exception _exception) {
                startingOffset.value = (java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "startingOffset")), java.lang.Integer.class);
            }
            try {
                endingOffset.value = (java.lang.Integer) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "endingOffset"));
            } catch (java.lang.Exception _exception) {
                endingOffset.value = (java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "endingOffset")), java.lang.Integer.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getArticle(java.lang.String username, java.lang.String password, int uid, int feedDefinitionId, javax.xml.rpc.holders.IntHolder errorOccurred, javax.xml.rpc.holders.StringHolder errorDescription, javax.xml.rpc.holders.StringHolder articleXMLURL, com.i2rd.contentstream.holders.StringArrayHolder arrArticleAssetURL, com.i2rd.contentstream.holders.StringArrayHolder arrArticleAssetFileName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ContentStream#getArticle");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "getArticle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(uid), new java.lang.Integer(feedDefinitionId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                errorOccurred.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorOccurred"))).intValue();
            } catch (java.lang.Exception _exception) {
                errorOccurred.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorOccurred")), int.class)).intValue();
            }
            try {
                errorDescription.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorDescription"));
            } catch (java.lang.Exception _exception) {
                errorDescription.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorDescription")), java.lang.String.class);
            }
            try {
                articleXMLURL.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "articleXMLURL"));
            } catch (java.lang.Exception _exception) {
                articleXMLURL.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "articleXMLURL")), java.lang.String.class);
            }
            try {
                arrArticleAssetURL.value = (java.lang.String[]) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "arrArticleAssetURL"));
            } catch (java.lang.Exception _exception) {
                arrArticleAssetURL.value = (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "arrArticleAssetURL")), java.lang.String[].class);
            }
            try {
                arrArticleAssetFileName.value = (java.lang.String[]) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "arrArticleAssetFileName"));
            } catch (java.lang.Exception _exception) {
                arrArticleAssetFileName.value = (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "arrArticleAssetFileName")), java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getDigitalAsset(java.lang.String username, java.lang.String password, int uid, int feedDefinitionId, javax.xml.rpc.holders.IntHolder errorOccurred, javax.xml.rpc.holders.StringHolder errorDescription, javax.xml.rpc.holders.StringHolder digitalAssetXMLURL, javax.xml.rpc.holders.StringHolder digitalAssetURL) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ContentStream#getDigitalAsset");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "getDigitalAsset"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(uid), new java.lang.Integer(feedDefinitionId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                errorOccurred.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorOccurred"))).intValue();
            } catch (java.lang.Exception _exception) {
                errorOccurred.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorOccurred")), int.class)).intValue();
            }
            try {
                errorDescription.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorDescription"));
            } catch (java.lang.Exception _exception) {
                errorDescription.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorDescription")), java.lang.String.class);
            }
            try {
                digitalAssetXMLURL.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "digitalAssetXMLURL"));
            } catch (java.lang.Exception _exception) {
                digitalAssetXMLURL.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "digitalAssetXMLURL")), java.lang.String.class);
            }
            try {
                digitalAssetURL.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "digitalAssetURL"));
            } catch (java.lang.Exception _exception) {
                digitalAssetURL.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "digitalAssetURL")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void deleteFromQueue(java.lang.String username, java.lang.String password, int feedDefinitionId, int uid, javax.xml.rpc.holders.IntHolder errorOccurred, javax.xml.rpc.holders.StringHolder errorDescription) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("ContentStream#deleteFromQueue");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "deleteFromQueue"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, new java.lang.Integer(feedDefinitionId), new java.lang.Integer(uid)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                errorOccurred.value = ((java.lang.Integer) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorOccurred"))).intValue();
            } catch (java.lang.Exception _exception) {
                errorOccurred.value = ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorOccurred")), int.class)).intValue();
            }
            try {
                errorDescription.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorDescription"));
            } catch (java.lang.Exception _exception) {
                errorDescription.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("https://contentstream.cfemedia.com/api/ContentStream", "errorDescription")), java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
