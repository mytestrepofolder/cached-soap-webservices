/**
 * CarV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CarV2  implements java.io.Serializable {
    private nl.webservices.www.soap.Car car_data;

    private nl.webservices.www.soap.CarType[] types;

    public CarV2() {
    }

    public CarV2(
           nl.webservices.www.soap.Car car_data,
           nl.webservices.www.soap.CarType[] types) {
           this.car_data = car_data;
           this.types = types;
    }


    /**
     * Gets the car_data value for this CarV2.
     * 
     * @return car_data
     */
    public nl.webservices.www.soap.Car getCar_data() {
        return car_data;
    }


    /**
     * Sets the car_data value for this CarV2.
     * 
     * @param car_data
     */
    public void setCar_data(nl.webservices.www.soap.Car car_data) {
        this.car_data = car_data;
    }


    /**
     * Gets the types value for this CarV2.
     * 
     * @return types
     */
    public nl.webservices.www.soap.CarType[] getTypes() {
        return types;
    }


    /**
     * Sets the types value for this CarV2.
     * 
     * @param types
     */
    public void setTypes(nl.webservices.www.soap.CarType[] types) {
        this.types = types;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarV2)) return false;
        CarV2 other = (CarV2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.car_data==null && other.getCar_data()==null) || 
             (this.car_data!=null &&
              this.car_data.equals(other.getCar_data()))) &&
            ((this.types==null && other.getTypes()==null) || 
             (this.types!=null &&
              java.util.Arrays.equals(this.types, other.getTypes())));
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
        if (getCar_data() != null) {
            _hashCode += getCar_data().hashCode();
        }
        if (getTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTypes(), i);
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
        new org.apache.axis.description.TypeDesc(CarV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("car_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "car_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "Car"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("types");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "types"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CarType"));
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
