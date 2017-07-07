/**
 * AccountUserSearchV2RequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class AccountUserSearchV2RequestType  implements java.io.Serializable {
    private int accountid;

    private java.lang.String phrase;

    private int page;

    public AccountUserSearchV2RequestType() {
    }

    public AccountUserSearchV2RequestType(
           int accountid,
           java.lang.String phrase,
           int page) {
           this.accountid = accountid;
           this.phrase = phrase;
           this.page = page;
    }


    /**
     * Gets the accountid value for this AccountUserSearchV2RequestType.
     * 
     * @return accountid
     */
    public int getAccountid() {
        return accountid;
    }


    /**
     * Sets the accountid value for this AccountUserSearchV2RequestType.
     * 
     * @param accountid
     */
    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }


    /**
     * Gets the phrase value for this AccountUserSearchV2RequestType.
     * 
     * @return phrase
     */
    public java.lang.String getPhrase() {
        return phrase;
    }


    /**
     * Sets the phrase value for this AccountUserSearchV2RequestType.
     * 
     * @param phrase
     */
    public void setPhrase(java.lang.String phrase) {
        this.phrase = phrase;
    }


    /**
     * Gets the page value for this AccountUserSearchV2RequestType.
     * 
     * @return page
     */
    public int getPage() {
        return page;
    }


    /**
     * Sets the page value for this AccountUserSearchV2RequestType.
     * 
     * @param page
     */
    public void setPage(int page) {
        this.page = page;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountUserSearchV2RequestType)) return false;
        AccountUserSearchV2RequestType other = (AccountUserSearchV2RequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountid == other.getAccountid() &&
            ((this.phrase==null && other.getPhrase()==null) || 
             (this.phrase!=null &&
              this.phrase.equals(other.getPhrase()))) &&
            this.page == other.getPage();
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
        if (getPhrase() != null) {
            _hashCode += getPhrase().hashCode();
        }
        _hashCode += getPage();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountUserSearchV2RequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "accountUserSearchV2RequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "accountid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phrase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "phrase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "page"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
