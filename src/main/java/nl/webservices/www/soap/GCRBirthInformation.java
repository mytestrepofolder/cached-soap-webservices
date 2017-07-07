/**
 * GCRBirthInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class GCRBirthInformation  implements java.io.Serializable {
    private java.util.Date date;

    private java.lang.String residence;

    private java.lang.Integer country_code;

    private java.lang.String country_text;

    public GCRBirthInformation() {
    }

    public GCRBirthInformation(
           java.util.Date date,
           java.lang.String residence,
           java.lang.Integer country_code,
           java.lang.String country_text) {
           this.date = date;
           this.residence = residence;
           this.country_code = country_code;
           this.country_text = country_text;
    }


    /**
     * Gets the date value for this GCRBirthInformation.
     * 
     * @return date
     */
    public java.util.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this GCRBirthInformation.
     * 
     * @param date
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }


    /**
     * Gets the residence value for this GCRBirthInformation.
     * 
     * @return residence
     */
    public java.lang.String getResidence() {
        return residence;
    }


    /**
     * Sets the residence value for this GCRBirthInformation.
     * 
     * @param residence
     */
    public void setResidence(java.lang.String residence) {
        this.residence = residence;
    }


    /**
     * Gets the country_code value for this GCRBirthInformation.
     * 
     * @return country_code
     */
    public java.lang.Integer getCountry_code() {
        return country_code;
    }


    /**
     * Sets the country_code value for this GCRBirthInformation.
     * 
     * @param country_code
     */
    public void setCountry_code(java.lang.Integer country_code) {
        this.country_code = country_code;
    }


    /**
     * Gets the country_text value for this GCRBirthInformation.
     * 
     * @return country_text
     */
    public java.lang.String getCountry_text() {
        return country_text;
    }


    /**
     * Sets the country_text value for this GCRBirthInformation.
     * 
     * @param country_text
     */
    public void setCountry_text(java.lang.String country_text) {
        this.country_text = country_text;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GCRBirthInformation)) return false;
        GCRBirthInformation other = (GCRBirthInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.residence==null && other.getResidence()==null) || 
             (this.residence!=null &&
              this.residence.equals(other.getResidence()))) &&
            ((this.country_code==null && other.getCountry_code()==null) || 
             (this.country_code!=null &&
              this.country_code.equals(other.getCountry_code()))) &&
            ((this.country_text==null && other.getCountry_text()==null) || 
             (this.country_text!=null &&
              this.country_text.equals(other.getCountry_text())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getResidence() != null) {
            _hashCode += getResidence().hashCode();
        }
        if (getCountry_code() != null) {
            _hashCode += getCountry_code().hashCode();
        }
        if (getCountry_text() != null) {
            _hashCode += getCountry_text().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GCRBirthInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "GCRBirthInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "residence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "country_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
