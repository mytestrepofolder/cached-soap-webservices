/**
 * InsolvencyCourtSession.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class InsolvencyCourtSession  implements java.io.Serializable {
    private java.lang.String street;

    private java.math.BigInteger house_number;

    private java.lang.String addition;

    private java.lang.String city;

    public InsolvencyCourtSession() {
    }

    public InsolvencyCourtSession(
           java.lang.String street,
           java.math.BigInteger house_number,
           java.lang.String addition,
           java.lang.String city) {
           this.street = street;
           this.house_number = house_number;
           this.addition = addition;
           this.city = city;
    }


    /**
     * Gets the street value for this InsolvencyCourtSession.
     * 
     * @return street
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this InsolvencyCourtSession.
     * 
     * @param street
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the house_number value for this InsolvencyCourtSession.
     * 
     * @return house_number
     */
    public java.math.BigInteger getHouse_number() {
        return house_number;
    }


    /**
     * Sets the house_number value for this InsolvencyCourtSession.
     * 
     * @param house_number
     */
    public void setHouse_number(java.math.BigInteger house_number) {
        this.house_number = house_number;
    }


    /**
     * Gets the addition value for this InsolvencyCourtSession.
     * 
     * @return addition
     */
    public java.lang.String getAddition() {
        return addition;
    }


    /**
     * Sets the addition value for this InsolvencyCourtSession.
     * 
     * @param addition
     */
    public void setAddition(java.lang.String addition) {
        this.addition = addition;
    }


    /**
     * Gets the city value for this InsolvencyCourtSession.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this InsolvencyCourtSession.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsolvencyCourtSession)) return false;
        InsolvencyCourtSession other = (InsolvencyCourtSession) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.house_number==null && other.getHouse_number()==null) || 
             (this.house_number!=null &&
              this.house_number.equals(other.getHouse_number()))) &&
            ((this.addition==null && other.getAddition()==null) || 
             (this.addition!=null &&
              this.addition.equals(other.getAddition()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity())));
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
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getHouse_number() != null) {
            _hashCode += getHouse_number().hashCode();
        }
        if (getAddition() != null) {
            _hashCode += getAddition().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsolvencyCourtSession.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyCourtSession"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("house_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "house_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "addition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "city"));
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
