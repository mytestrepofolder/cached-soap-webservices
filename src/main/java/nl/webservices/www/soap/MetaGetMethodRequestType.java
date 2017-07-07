/**
 * MetaGetMethodRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class MetaGetMethodRequestType  implements java.io.Serializable {
    private java.lang.String service_name;

    private java.lang.String method_name;

    public MetaGetMethodRequestType() {
    }

    public MetaGetMethodRequestType(
           java.lang.String service_name,
           java.lang.String method_name) {
           this.service_name = service_name;
           this.method_name = method_name;
    }


    /**
     * Gets the service_name value for this MetaGetMethodRequestType.
     * 
     * @return service_name
     */
    public java.lang.String getService_name() {
        return service_name;
    }


    /**
     * Sets the service_name value for this MetaGetMethodRequestType.
     * 
     * @param service_name
     */
    public void setService_name(java.lang.String service_name) {
        this.service_name = service_name;
    }


    /**
     * Gets the method_name value for this MetaGetMethodRequestType.
     * 
     * @return method_name
     */
    public java.lang.String getMethod_name() {
        return method_name;
    }


    /**
     * Sets the method_name value for this MetaGetMethodRequestType.
     * 
     * @param method_name
     */
    public void setMethod_name(java.lang.String method_name) {
        this.method_name = method_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetaGetMethodRequestType)) return false;
        MetaGetMethodRequestType other = (MetaGetMethodRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.service_name==null && other.getService_name()==null) || 
             (this.service_name!=null &&
              this.service_name.equals(other.getService_name()))) &&
            ((this.method_name==null && other.getMethod_name()==null) || 
             (this.method_name!=null &&
              this.method_name.equals(other.getMethod_name())));
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
        if (getService_name() != null) {
            _hashCode += getService_name().hashCode();
        }
        if (getMethod_name() != null) {
            _hashCode += getMethod_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetaGetMethodRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "metaGetMethodRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "service_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("method_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "method_name"));
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
