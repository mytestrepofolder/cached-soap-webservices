/**
 * CarVWEVersionYearDataRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarVWEVersionYearDataRequestType  implements java.io.Serializable {
    private int production_year;

    private int atl_code;

    public CarVWEVersionYearDataRequestType() {
    }

    public CarVWEVersionYearDataRequestType(
           int production_year,
           int atl_code) {
           this.production_year = production_year;
           this.atl_code = atl_code;
    }


    /**
     * Gets the production_year value for this CarVWEVersionYearDataRequestType.
     * 
     * @return production_year
     */
    public int getProduction_year() {
        return production_year;
    }


    /**
     * Sets the production_year value for this CarVWEVersionYearDataRequestType.
     * 
     * @param production_year
     */
    public void setProduction_year(int production_year) {
        this.production_year = production_year;
    }


    /**
     * Gets the atl_code value for this CarVWEVersionYearDataRequestType.
     * 
     * @return atl_code
     */
    public int getAtl_code() {
        return atl_code;
    }


    /**
     * Sets the atl_code value for this CarVWEVersionYearDataRequestType.
     * 
     * @param atl_code
     */
    public void setAtl_code(int atl_code) {
        this.atl_code = atl_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarVWEVersionYearDataRequestType)) return false;
        CarVWEVersionYearDataRequestType other = (CarVWEVersionYearDataRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.production_year == other.getProduction_year() &&
            this.atl_code == other.getAtl_code();
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
        _hashCode += getProduction_year();
        _hashCode += getAtl_code();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarVWEVersionYearDataRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "carVWEVersionYearDataRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("production_year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "production_year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atl_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "atl_code"));
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
