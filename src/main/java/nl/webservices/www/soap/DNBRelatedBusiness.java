/**
 * DNBRelatedBusiness.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DNBRelatedBusiness  implements java.io.Serializable {
    private java.lang.String duns;

    private java.lang.String dnb_key;

    private java.lang.String trade_name;

    private java.lang.String country;

    public DNBRelatedBusiness() {
    }

    public DNBRelatedBusiness(
           java.lang.String duns,
           java.lang.String dnb_key,
           java.lang.String trade_name,
           java.lang.String country) {
           this.duns = duns;
           this.dnb_key = dnb_key;
           this.trade_name = trade_name;
           this.country = country;
    }


    /**
     * Gets the duns value for this DNBRelatedBusiness.
     * 
     * @return duns
     */
    public java.lang.String getDuns() {
        return duns;
    }


    /**
     * Sets the duns value for this DNBRelatedBusiness.
     * 
     * @param duns
     */
    public void setDuns(java.lang.String duns) {
        this.duns = duns;
    }


    /**
     * Gets the dnb_key value for this DNBRelatedBusiness.
     * 
     * @return dnb_key
     */
    public java.lang.String getDnb_key() {
        return dnb_key;
    }


    /**
     * Sets the dnb_key value for this DNBRelatedBusiness.
     * 
     * @param dnb_key
     */
    public void setDnb_key(java.lang.String dnb_key) {
        this.dnb_key = dnb_key;
    }


    /**
     * Gets the trade_name value for this DNBRelatedBusiness.
     * 
     * @return trade_name
     */
    public java.lang.String getTrade_name() {
        return trade_name;
    }


    /**
     * Sets the trade_name value for this DNBRelatedBusiness.
     * 
     * @param trade_name
     */
    public void setTrade_name(java.lang.String trade_name) {
        this.trade_name = trade_name;
    }


    /**
     * Gets the country value for this DNBRelatedBusiness.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this DNBRelatedBusiness.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DNBRelatedBusiness)) return false;
        DNBRelatedBusiness other = (DNBRelatedBusiness) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.duns==null && other.getDuns()==null) || 
             (this.duns!=null &&
              this.duns.equals(other.getDuns()))) &&
            ((this.dnb_key==null && other.getDnb_key()==null) || 
             (this.dnb_key!=null &&
              this.dnb_key.equals(other.getDnb_key()))) &&
            ((this.trade_name==null && other.getTrade_name()==null) || 
             (this.trade_name!=null &&
              this.trade_name.equals(other.getTrade_name()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry())));
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
        if (getDuns() != null) {
            _hashCode += getDuns().hashCode();
        }
        if (getDnb_key() != null) {
            _hashCode += getDnb_key().hashCode();
        }
        if (getTrade_name() != null) {
            _hashCode += getTrade_name().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DNBRelatedBusiness.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DNBRelatedBusiness"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "duns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnb_key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "dnb_key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trade_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "trade_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country"));
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
