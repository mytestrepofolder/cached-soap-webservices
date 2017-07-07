/**
 * WebservicesNlLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class WebservicesNlLocator extends org.apache.axis.client.Service implements nl.webservices.www.soap.WebservicesNl {

    public WebservicesNlLocator() {
    }


    public WebservicesNlLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebservicesNlLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebservicesNlPort
    private java.lang.String WebservicesNlPort_address = "https://ws1.webservices.nl:443/soap_doclit.php";

    public java.lang.String getWebservicesNlPortAddress() {
        return WebservicesNlPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebservicesNlPortWSDDServiceName = "Webservices.nlPort";

    public java.lang.String getWebservicesNlPortWSDDServiceName() {
        return WebservicesNlPortWSDDServiceName;
    }

    public void setWebservicesNlPortWSDDServiceName(java.lang.String name) {
        WebservicesNlPortWSDDServiceName = name;
    }

    public nl.webservices.www.soap.WebservicesNlPortType getWebservicesNlPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebservicesNlPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebservicesNlPort(endpoint);
    }

    public nl.webservices.www.soap.WebservicesNlPortType getWebservicesNlPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            nl.webservices.www.soap.WebservicesNlBindingStub _stub = new nl.webservices.www.soap.WebservicesNlBindingStub(portAddress, this);
            _stub.setPortName(getWebservicesNlPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebservicesNlPortEndpointAddress(java.lang.String address) {
        WebservicesNlPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (nl.webservices.www.soap.WebservicesNlPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                nl.webservices.www.soap.WebservicesNlBindingStub _stub = new nl.webservices.www.soap.WebservicesNlBindingStub(new java.net.URL(WebservicesNlPort_address), this);
                _stub.setPortName(getWebservicesNlPortWSDDServiceName());
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
        if ("Webservices.nlPort".equals(inputPortName)) {
            return getWebservicesNlPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Webservices.nl");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Webservices.nlPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebservicesNlPort".equals(portName)) {
            setWebservicesNlPortEndpointAddress(address);
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
