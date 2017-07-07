/**
 * CarVWEOptionPackage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarVWEOptionPackage  implements java.io.Serializable {
    private int package_id;

    private int price;

    private java.lang.String description;

    private nl.webservices.www.soap.CarVWEOption[] options;

    public CarVWEOptionPackage() {
    }

    public CarVWEOptionPackage(
           int package_id,
           int price,
           java.lang.String description,
           nl.webservices.www.soap.CarVWEOption[] options) {
           this.package_id = package_id;
           this.price = price;
           this.description = description;
           this.options = options;
    }


    /**
     * Gets the package_id value for this CarVWEOptionPackage.
     * 
     * @return package_id
     */
    public int getPackage_id() {
        return package_id;
    }


    /**
     * Sets the package_id value for this CarVWEOptionPackage.
     * 
     * @param package_id
     */
    public void setPackage_id(int package_id) {
        this.package_id = package_id;
    }


    /**
     * Gets the price value for this CarVWEOptionPackage.
     * 
     * @return price
     */
    public int getPrice() {
        return price;
    }


    /**
     * Sets the price value for this CarVWEOptionPackage.
     * 
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }


    /**
     * Gets the description value for this CarVWEOptionPackage.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CarVWEOptionPackage.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the options value for this CarVWEOptionPackage.
     * 
     * @return options
     */
    public nl.webservices.www.soap.CarVWEOption[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this CarVWEOptionPackage.
     * 
     * @param options
     */
    public void setOptions(nl.webservices.www.soap.CarVWEOption[] options) {
        this.options = options;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarVWEOptionPackage)) return false;
        CarVWEOptionPackage other = (CarVWEOptionPackage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.package_id == other.getPackage_id() &&
            this.price == other.getPrice() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions())));
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
        _hashCode += getPackage_id();
        _hashCode += getPrice();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptions(), i);
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
        new org.apache.axis.description.TypeDesc(CarVWEOptionPackage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarVWEOptionPackage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("package_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "package_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarVWEOption"));
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
