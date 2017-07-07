/**
 * CarATDPrices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarATDPrices  implements java.io.Serializable {
    private java.lang.String brand;

    private java.lang.String model;

    private java.lang.String type;

    private nl.webservices.www.soap.CarATDValuation[] valuations;

    public CarATDPrices() {
    }

    public CarATDPrices(
           java.lang.String brand,
           java.lang.String model,
           java.lang.String type,
           nl.webservices.www.soap.CarATDValuation[] valuations) {
           this.brand = brand;
           this.model = model;
           this.type = type;
           this.valuations = valuations;
    }


    /**
     * Gets the brand value for this CarATDPrices.
     * 
     * @return brand
     */
    public java.lang.String getBrand() {
        return brand;
    }


    /**
     * Sets the brand value for this CarATDPrices.
     * 
     * @param brand
     */
    public void setBrand(java.lang.String brand) {
        this.brand = brand;
    }


    /**
     * Gets the model value for this CarATDPrices.
     * 
     * @return model
     */
    public java.lang.String getModel() {
        return model;
    }


    /**
     * Sets the model value for this CarATDPrices.
     * 
     * @param model
     */
    public void setModel(java.lang.String model) {
        this.model = model;
    }


    /**
     * Gets the type value for this CarATDPrices.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this CarATDPrices.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the valuations value for this CarATDPrices.
     * 
     * @return valuations
     */
    public nl.webservices.www.soap.CarATDValuation[] getValuations() {
        return valuations;
    }


    /**
     * Sets the valuations value for this CarATDPrices.
     * 
     * @param valuations
     */
    public void setValuations(nl.webservices.www.soap.CarATDValuation[] valuations) {
        this.valuations = valuations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarATDPrices)) return false;
        CarATDPrices other = (CarATDPrices) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.brand==null && other.getBrand()==null) || 
             (this.brand!=null &&
              this.brand.equals(other.getBrand()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.valuations==null && other.getValuations()==null) || 
             (this.valuations!=null &&
              java.util.Arrays.equals(this.valuations, other.getValuations())));
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
        if (getBrand() != null) {
            _hashCode += getBrand().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getValuations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValuations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValuations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarATDPrices.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarATDPrices"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "brand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valuations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "valuations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarATDValuation"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "item"));
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
