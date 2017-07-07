/**
 * CarVWEVersionPriceReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarVWEVersionPriceReference  implements java.io.Serializable {
    private int order_number;

    private int atl_code;

    private java.lang.String model_name;

    public CarVWEVersionPriceReference() {
    }

    public CarVWEVersionPriceReference(
           int order_number,
           int atl_code,
           java.lang.String model_name) {
           this.order_number = order_number;
           this.atl_code = atl_code;
           this.model_name = model_name;
    }


    /**
     * Gets the order_number value for this CarVWEVersionPriceReference.
     * 
     * @return order_number
     */
    public int getOrder_number() {
        return order_number;
    }


    /**
     * Sets the order_number value for this CarVWEVersionPriceReference.
     * 
     * @param order_number
     */
    public void setOrder_number(int order_number) {
        this.order_number = order_number;
    }


    /**
     * Gets the atl_code value for this CarVWEVersionPriceReference.
     * 
     * @return atl_code
     */
    public int getAtl_code() {
        return atl_code;
    }


    /**
     * Sets the atl_code value for this CarVWEVersionPriceReference.
     * 
     * @param atl_code
     */
    public void setAtl_code(int atl_code) {
        this.atl_code = atl_code;
    }


    /**
     * Gets the model_name value for this CarVWEVersionPriceReference.
     * 
     * @return model_name
     */
    public java.lang.String getModel_name() {
        return model_name;
    }


    /**
     * Sets the model_name value for this CarVWEVersionPriceReference.
     * 
     * @param model_name
     */
    public void setModel_name(java.lang.String model_name) {
        this.model_name = model_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarVWEVersionPriceReference)) return false;
        CarVWEVersionPriceReference other = (CarVWEVersionPriceReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.order_number == other.getOrder_number() &&
            this.atl_code == other.getAtl_code() &&
            ((this.model_name==null && other.getModel_name()==null) || 
             (this.model_name!=null &&
              this.model_name.equals(other.getModel_name())));
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
        _hashCode += getOrder_number();
        _hashCode += getAtl_code();
        if (getModel_name() != null) {
            _hashCode += getModel_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarVWEVersionPriceReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarVWEVersionPriceReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "order_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("atl_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "atl_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "model_name"));
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
