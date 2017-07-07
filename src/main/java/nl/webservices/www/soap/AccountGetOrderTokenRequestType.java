/**
 * AccountGetOrderTokenRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class AccountGetOrderTokenRequestType  implements java.io.Serializable {
    private int accountid;

    private java.lang.String return_url;

    public AccountGetOrderTokenRequestType() {
    }

    public AccountGetOrderTokenRequestType(
           int accountid,
           java.lang.String return_url) {
           this.accountid = accountid;
           this.return_url = return_url;
    }


    /**
     * Gets the accountid value for this AccountGetOrderTokenRequestType.
     * 
     * @return accountid
     */
    public int getAccountid() {
        return accountid;
    }


    /**
     * Sets the accountid value for this AccountGetOrderTokenRequestType.
     * 
     * @param accountid
     */
    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }


    /**
     * Gets the return_url value for this AccountGetOrderTokenRequestType.
     * 
     * @return return_url
     */
    public java.lang.String getReturn_url() {
        return return_url;
    }


    /**
     * Sets the return_url value for this AccountGetOrderTokenRequestType.
     * 
     * @param return_url
     */
    public void setReturn_url(java.lang.String return_url) {
        this.return_url = return_url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountGetOrderTokenRequestType)) return false;
        AccountGetOrderTokenRequestType other = (AccountGetOrderTokenRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountid == other.getAccountid() &&
            ((this.return_url==null && other.getReturn_url()==null) || 
             (this.return_url!=null &&
              this.return_url.equals(other.getReturn_url())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getAccountid();
        if (getReturn_url() != null) {
            _hashCode += getReturn_url().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountGetOrderTokenRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "accountGetOrderTokenRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "accountid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("return_url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "return_url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
