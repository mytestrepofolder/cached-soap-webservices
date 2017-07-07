/**
 * CarVWEOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarVWEOption  implements java.io.Serializable {
    private int option_id;

    private java.lang.String description_short;

    private java.lang.String description;

    private java.lang.Integer price;

    public CarVWEOption() {
    }

    public CarVWEOption(
           int option_id,
           java.lang.String description_short,
           java.lang.String description,
           java.lang.Integer price) {
           this.option_id = option_id;
           this.description_short = description_short;
           this.description = description;
           this.price = price;
    }


    /**
     * Gets the option_id value for this CarVWEOption.
     * 
     * @return option_id
     */
    public int getOption_id() {
        return option_id;
    }


    /**
     * Sets the option_id value for this CarVWEOption.
     * 
     * @param option_id
     */
    public void setOption_id(int option_id) {
        this.option_id = option_id;
    }


    /**
     * Gets the description_short value for this CarVWEOption.
     * 
     * @return description_short
     */
    public java.lang.String getDescription_short() {
        return description_short;
    }


    /**
     * Sets the description_short value for this CarVWEOption.
     * 
     * @param description_short
     */
    public void setDescription_short(java.lang.String description_short) {
        this.description_short = description_short;
    }


    /**
     * Gets the description value for this CarVWEOption.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CarVWEOption.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the price value for this CarVWEOption.
     * 
     * @return price
     */
    public java.lang.Integer getPrice() {
        return price;
    }


    /**
     * Sets the price value for this CarVWEOption.
     * 
     * @param price
     */
    public void setPrice(java.lang.Integer price) {
        this.price = price;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarVWEOption)) return false;
        CarVWEOption other = (CarVWEOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.option_id == other.getOption_id() &&
            ((this.description_short==null && other.getDescription_short()==null) || 
             (this.description_short!=null &&
              this.description_short.equals(other.getDescription_short()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice())));
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
        _hashCode += getOption_id();
        if (getDescription_short() != null) {
            _hashCode += getDescription_short().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarVWEOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarVWEOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("option_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "option_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description_short");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "description_short"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
