/**
 * BusinessGetSBIDescriptionRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BusinessGetSBIDescriptionRequestType  implements java.io.Serializable {
    private java.lang.String sbicode;

    public BusinessGetSBIDescriptionRequestType() {
    }

    public BusinessGetSBIDescriptionRequestType(
           java.lang.String sbicode) {
           this.sbicode = sbicode;
    }


    /**
     * Gets the sbicode value for this BusinessGetSBIDescriptionRequestType.
     * 
     * @return sbicode
     */
    public java.lang.String getSbicode() {
        return sbicode;
    }


    /**
     * Sets the sbicode value for this BusinessGetSBIDescriptionRequestType.
     * 
     * @param sbicode
     */
    public void setSbicode(java.lang.String sbicode) {
        this.sbicode = sbicode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessGetSBIDescriptionRequestType)) return false;
        BusinessGetSBIDescriptionRequestType other = (BusinessGetSBIDescriptionRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sbicode==null && other.getSbicode()==null) || 
             (this.sbicode!=null &&
              this.sbicode.equals(other.getSbicode())));
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
        if (getSbicode() != null) {
            _hashCode += getSbicode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessGetSBIDescriptionRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "businessGetSBIDescriptionRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sbicode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sbicode"));
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
