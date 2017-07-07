/**
 * CarVWEBrand.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarVWEBrand  implements java.io.Serializable {
    private int brand_id;

    private java.lang.String brand_name;

    public CarVWEBrand() {
    }

    public CarVWEBrand(
           int brand_id,
           java.lang.String brand_name) {
           this.brand_id = brand_id;
           this.brand_name = brand_name;
    }


    /**
     * Gets the brand_id value for this CarVWEBrand.
     * 
     * @return brand_id
     */
    public int getBrand_id() {
        return brand_id;
    }


    /**
     * Sets the brand_id value for this CarVWEBrand.
     * 
     * @param brand_id
     */
    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }


    /**
     * Gets the brand_name value for this CarVWEBrand.
     * 
     * @return brand_name
     */
    public java.lang.String getBrand_name() {
        return brand_name;
    }


    /**
     * Sets the brand_name value for this CarVWEBrand.
     * 
     * @param brand_name
     */
    public void setBrand_name(java.lang.String brand_name) {
        this.brand_name = brand_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarVWEBrand)) return false;
        CarVWEBrand other = (CarVWEBrand) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.brand_id == other.getBrand_id() &&
            ((this.brand_name==null && other.getBrand_name()==null) || 
             (this.brand_name!=null &&
              this.brand_name.equals(other.getBrand_name())));
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
        _hashCode += getBrand_id();
        if (getBrand_name() != null) {
            _hashCode += getBrand_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarVWEBrand.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarVWEBrand"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "brand_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "brand_name"));
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
