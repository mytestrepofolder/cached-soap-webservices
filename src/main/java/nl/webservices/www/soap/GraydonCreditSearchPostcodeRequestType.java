/**
 * GraydonCreditSearchPostcodeRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GraydonCreditSearchPostcodeRequestType  implements java.io.Serializable {
    private java.lang.String postcode;

    private int house_no;

    private java.lang.String telephone_no;

    private java.lang.String country_iso2;

    public GraydonCreditSearchPostcodeRequestType() {
    }

    public GraydonCreditSearchPostcodeRequestType(
           java.lang.String postcode,
           int house_no,
           java.lang.String telephone_no,
           java.lang.String country_iso2) {
           this.postcode = postcode;
           this.house_no = house_no;
           this.telephone_no = telephone_no;
           this.country_iso2 = country_iso2;
    }


    /**
     * Gets the postcode value for this GraydonCreditSearchPostcodeRequestType.
     * 
     * @return postcode
     */
    public java.lang.String getPostcode() {
        return postcode;
    }


    /**
     * Sets the postcode value for this GraydonCreditSearchPostcodeRequestType.
     * 
     * @param postcode
     */
    public void setPostcode(java.lang.String postcode) {
        this.postcode = postcode;
    }


    /**
     * Gets the house_no value for this GraydonCreditSearchPostcodeRequestType.
     * 
     * @return house_no
     */
    public int getHouse_no() {
        return house_no;
    }


    /**
     * Sets the house_no value for this GraydonCreditSearchPostcodeRequestType.
     * 
     * @param house_no
     */
    public void setHouse_no(int house_no) {
        this.house_no = house_no;
    }


    /**
     * Gets the telephone_no value for this GraydonCreditSearchPostcodeRequestType.
     * 
     * @return telephone_no
     */
    public java.lang.String getTelephone_no() {
        return telephone_no;
    }


    /**
     * Sets the telephone_no value for this GraydonCreditSearchPostcodeRequestType.
     * 
     * @param telephone_no
     */
    public void setTelephone_no(java.lang.String telephone_no) {
        this.telephone_no = telephone_no;
    }


    /**
     * Gets the country_iso2 value for this GraydonCreditSearchPostcodeRequestType.
     * 
     * @return country_iso2
     */
    public java.lang.String getCountry_iso2() {
        return country_iso2;
    }


    /**
     * Sets the country_iso2 value for this GraydonCreditSearchPostcodeRequestType.
     * 
     * @param country_iso2
     */
    public void setCountry_iso2(java.lang.String country_iso2) {
        this.country_iso2 = country_iso2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GraydonCreditSearchPostcodeRequestType)) return false;
        GraydonCreditSearchPostcodeRequestType other = (GraydonCreditSearchPostcodeRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postcode==null && other.getPostcode()==null) || 
             (this.postcode!=null &&
              this.postcode.equals(other.getPostcode()))) &&
            this.house_no == other.getHouse_no() &&
            ((this.telephone_no==null && other.getTelephone_no()==null) || 
             (this.telephone_no!=null &&
              this.telephone_no.equals(other.getTelephone_no()))) &&
            ((this.country_iso2==null && other.getCountry_iso2()==null) || 
             (this.country_iso2!=null &&
              this.country_iso2.equals(other.getCountry_iso2())));
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
        if (getPostcode() != null) {
            _hashCode += getPostcode().hashCode();
        }
        _hashCode += getHouse_no();
        if (getTelephone_no() != null) {
            _hashCode += getTelephone_no().hashCode();
        }
        if (getCountry_iso2() != null) {
            _hashCode += getCountry_iso2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GraydonCreditSearchPostcodeRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "graydonCreditSearchPostcodeRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "postcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house_no");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "house_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone_no");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "telephone_no"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_iso2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_iso2"));
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
