/**
 * DutchVehiclePurchaseReference.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchVehiclePurchaseReference  implements java.io.Serializable {
    private nl.webservices.www.soap.DutchVehicleData basic_data;

    private nl.webservices.www.soap.DutchVehicleReference reference;

    private nl.webservices.www.soap.DutchVehiclePurchase purchase_data;

    public DutchVehiclePurchaseReference() {
    }

    public DutchVehiclePurchaseReference(
           nl.webservices.www.soap.DutchVehicleData basic_data,
           nl.webservices.www.soap.DutchVehicleReference reference,
           nl.webservices.www.soap.DutchVehiclePurchase purchase_data) {
           this.basic_data = basic_data;
           this.reference = reference;
           this.purchase_data = purchase_data;
    }


    /**
     * Gets the basic_data value for this DutchVehiclePurchaseReference.
     * 
     * @return basic_data
     */
    public nl.webservices.www.soap.DutchVehicleData getBasic_data() {
        return basic_data;
    }


    /**
     * Sets the basic_data value for this DutchVehiclePurchaseReference.
     * 
     * @param basic_data
     */
    public void setBasic_data(nl.webservices.www.soap.DutchVehicleData basic_data) {
        this.basic_data = basic_data;
    }


    /**
     * Gets the reference value for this DutchVehiclePurchaseReference.
     * 
     * @return reference
     */
    public nl.webservices.www.soap.DutchVehicleReference getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this DutchVehiclePurchaseReference.
     * 
     * @param reference
     */
    public void setReference(nl.webservices.www.soap.DutchVehicleReference reference) {
        this.reference = reference;
    }


    /**
     * Gets the purchase_data value for this DutchVehiclePurchaseReference.
     * 
     * @return purchase_data
     */
    public nl.webservices.www.soap.DutchVehiclePurchase getPurchase_data() {
        return purchase_data;
    }


    /**
     * Sets the purchase_data value for this DutchVehiclePurchaseReference.
     * 
     * @param purchase_data
     */
    public void setPurchase_data(nl.webservices.www.soap.DutchVehiclePurchase purchase_data) {
        this.purchase_data = purchase_data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchVehiclePurchaseReference)) return false;
        DutchVehiclePurchaseReference other = (DutchVehiclePurchaseReference) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.basic_data==null && other.getBasic_data()==null) || 
             (this.basic_data!=null &&
              this.basic_data.equals(other.getBasic_data()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.purchase_data==null && other.getPurchase_data()==null) || 
             (this.purchase_data!=null &&
              this.purchase_data.equals(other.getPurchase_data())));
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
        if (getBasic_data() != null) {
            _hashCode += getBasic_data().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getPurchase_data() != null) {
            _hashCode += getPurchase_data().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchVehiclePurchaseReference.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehiclePurchaseReference"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "basic_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleData"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehicleReference"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchase_data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "purchase_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchVehiclePurchase"));
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
