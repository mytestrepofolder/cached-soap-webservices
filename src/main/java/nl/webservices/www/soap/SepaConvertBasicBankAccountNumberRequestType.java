/**
 * SepaConvertBasicBankAccountNumberRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class SepaConvertBasicBankAccountNumberRequestType  implements java.io.Serializable {
    private java.lang.String bban;

    private java.lang.String country_iso;

    public SepaConvertBasicBankAccountNumberRequestType() {
    }

    public SepaConvertBasicBankAccountNumberRequestType(
           java.lang.String bban,
           java.lang.String country_iso) {
           this.bban = bban;
           this.country_iso = country_iso;
    }


    /**
     * Gets the bban value for this SepaConvertBasicBankAccountNumberRequestType.
     * 
     * @return bban
     */
    public java.lang.String getBban() {
        return bban;
    }


    /**
     * Sets the bban value for this SepaConvertBasicBankAccountNumberRequestType.
     * 
     * @param bban
     */
    public void setBban(java.lang.String bban) {
        this.bban = bban;
    }


    /**
     * Gets the country_iso value for this SepaConvertBasicBankAccountNumberRequestType.
     * 
     * @return country_iso
     */
    public java.lang.String getCountry_iso() {
        return country_iso;
    }


    /**
     * Sets the country_iso value for this SepaConvertBasicBankAccountNumberRequestType.
     * 
     * @param country_iso
     */
    public void setCountry_iso(java.lang.String country_iso) {
        this.country_iso = country_iso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SepaConvertBasicBankAccountNumberRequestType)) return false;
        SepaConvertBasicBankAccountNumberRequestType other = (SepaConvertBasicBankAccountNumberRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bban==null && other.getBban()==null) || 
             (this.bban!=null &&
              this.bban.equals(other.getBban()))) &&
            ((this.country_iso==null && other.getCountry_iso()==null) || 
             (this.country_iso!=null &&
              this.country_iso.equals(other.getCountry_iso())));
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
        if (getBban() != null) {
            _hashCode += getBban().hashCode();
        }
        if (getCountry_iso() != null) {
            _hashCode += getCountry_iso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SepaConvertBasicBankAccountNumberRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sepaConvertBasicBankAccountNumberRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bban");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_iso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_iso"));
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
