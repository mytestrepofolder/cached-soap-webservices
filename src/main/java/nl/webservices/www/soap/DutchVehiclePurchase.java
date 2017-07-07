/**
 * DutchVehiclePurchase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchVehiclePurchase  implements java.io.Serializable {
    private java.util.Date reference_date;

    private nl.webservices.www.soap.DutchVehiclePrice price_data;

    public DutchVehiclePurchase() {
    }

    public DutchVehiclePurchase(
           java.util.Date reference_date,
           nl.webservices.www.soap.DutchVehiclePrice price_data) {
           this.reference_date = reference_date;
           this.price_data = price_data;
    }


    /**
     * Gets the reference_date value for this DutchVehiclePurchase.
     * 
     * @return reference_date
     */
    public java.util.Date getReference_date() {
        return reference_date;
    }


    /**
     * Sets the reference_date value for this DutchVehiclePurchase.
     * 
     * @param reference_date
     */
    public void setReference_date(java.util.Date reference_date) {
        this.reference_date = reference_date;
    }


    /**
     * Gets the price_data value for this DutchVehiclePurchase.
     * 
     * @return price_data
     */
    public nl.webservices.www.soap.DutchVehiclePrice getPrice_data() {
        return price_data;
    }


    /**
     * Sets the price_data value for this DutchVehiclePurchase.
     * 
     * @param price_data
     */
    public void setPrice_data(nl.webservices.www.soap.DutchVehiclePrice price_data) {
        this.price_data = price_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchVehiclePurchase)) return false;
        DutchVehiclePurchase other = (DutchVehiclePurchase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reference_date==null && other.getReference_date()==null) || 
             (this.reference_date!=null &&
              this.reference_date.equals(other.getReference_date()))) &&
            ((this.price_data==null && other.getPrice_data()==null) || 
             (this.price_data!=null &&
              this.price_data.equals(other.getPrice_data())));
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
        if (getReference_date() != null) {
            _hashCode += getReference_date().hashCode();
        }
        if (getPrice_data() != null) {
            _hashCode += getPrice_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchVehiclePurchase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehiclePurchase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "reference_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "price_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehiclePrice"));
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
