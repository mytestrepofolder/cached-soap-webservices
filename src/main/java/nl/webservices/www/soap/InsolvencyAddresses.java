/**
 * InsolvencyAddresses.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class InsolvencyAddresses  implements java.io.Serializable {
    private java.lang.Boolean hidden;

    private nl.webservices.www.soap.InsolvencyAddress[] address;

    public InsolvencyAddresses() {
    }

    public InsolvencyAddresses(
           java.lang.Boolean hidden,
           nl.webservices.www.soap.InsolvencyAddress[] address) {
           this.hidden = hidden;
           this.address = address;
    }


    /**
     * Gets the hidden value for this InsolvencyAddresses.
     * 
     * @return hidden
     */
    public java.lang.Boolean getHidden() {
        return hidden;
    }


    /**
     * Sets the hidden value for this InsolvencyAddresses.
     * 
     * @param hidden
     */
    public void setHidden(java.lang.Boolean hidden) {
        this.hidden = hidden;
    }


    /**
     * Gets the address value for this InsolvencyAddresses.
     * 
     * @return address
     */
    public nl.webservices.www.soap.InsolvencyAddress[] getAddress() {
        return address;
    }


    /**
     * Sets the address value for this InsolvencyAddresses.
     * 
     * @param address
     */
    public void setAddress(nl.webservices.www.soap.InsolvencyAddress[] address) {
        this.address = address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsolvencyAddresses)) return false;
        InsolvencyAddresses other = (InsolvencyAddresses) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hidden==null && other.getHidden()==null) || 
             (this.hidden!=null &&
              this.hidden.equals(other.getHidden()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              java.util.Arrays.equals(this.address, other.getAddress())));
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
        if (getHidden() != null) {
            _hashCode += getHidden().hashCode();
        }
        if (getAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress(), i);
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
        new org.apache.axis.description.TypeDesc(InsolvencyAddresses.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyAddresses"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hidden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "hidden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InsolvencyAddress"));
        elemField.setMinOccurs(0);
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
