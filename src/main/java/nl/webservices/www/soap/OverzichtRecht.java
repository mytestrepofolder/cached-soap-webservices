/**
 * OverzichtRecht.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class OverzichtRecht  implements java.io.Serializable {
    private java.lang.String object_id;

    private java.lang.String gerechtigde_id;

    public OverzichtRecht() {
    }

    public OverzichtRecht(
           java.lang.String object_id,
           java.lang.String gerechtigde_id) {
           this.object_id = object_id;
           this.gerechtigde_id = gerechtigde_id;
    }


    /**
     * Gets the object_id value for this OverzichtRecht.
     * 
     * @return object_id
     */
    public java.lang.String getObject_id() {
        return object_id;
    }


    /**
     * Sets the object_id value for this OverzichtRecht.
     * 
     * @param object_id
     */
    public void setObject_id(java.lang.String object_id) {
        this.object_id = object_id;
    }


    /**
     * Gets the gerechtigde_id value for this OverzichtRecht.
     * 
     * @return gerechtigde_id
     */
    public java.lang.String getGerechtigde_id() {
        return gerechtigde_id;
    }


    /**
     * Sets the gerechtigde_id value for this OverzichtRecht.
     * 
     * @param gerechtigde_id
     */
    public void setGerechtigde_id(java.lang.String gerechtigde_id) {
        this.gerechtigde_id = gerechtigde_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OverzichtRecht)) return false;
        OverzichtRecht other = (OverzichtRecht) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.object_id==null && other.getObject_id()==null) || 
             (this.object_id!=null &&
              this.object_id.equals(other.getObject_id()))) &&
            ((this.gerechtigde_id==null && other.getGerechtigde_id()==null) || 
             (this.gerechtigde_id!=null &&
              this.gerechtigde_id.equals(other.getGerechtigde_id())));
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
        if (getObject_id() != null) {
            _hashCode += getObject_id().hashCode();
        }
        if (getGerechtigde_id() != null) {
            _hashCode += getGerechtigde_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OverzichtRecht.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "OverzichtRecht"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("object_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "object_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gerechtigde_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "gerechtigde_id"));
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
