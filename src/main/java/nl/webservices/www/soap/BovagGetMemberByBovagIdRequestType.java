/**
 * BovagGetMemberByBovagIdRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class BovagGetMemberByBovagIdRequestType  implements java.io.Serializable {
    private java.lang.String bovag_id;

    public BovagGetMemberByBovagIdRequestType() {
    }

    public BovagGetMemberByBovagIdRequestType(
           java.lang.String bovag_id) {
           this.bovag_id = bovag_id;
    }


    /**
     * Gets the bovag_id value for this BovagGetMemberByBovagIdRequestType.
     * 
     * @return bovag_id
     */
    public java.lang.String getBovag_id() {
        return bovag_id;
    }


    /**
     * Sets the bovag_id value for this BovagGetMemberByBovagIdRequestType.
     * 
     * @param bovag_id
     */
    public void setBovag_id(java.lang.String bovag_id) {
        this.bovag_id = bovag_id;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BovagGetMemberByBovagIdRequestType)) return false;
        BovagGetMemberByBovagIdRequestType other = (BovagGetMemberByBovagIdRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bovag_id==null && other.getBovag_id()==null) || 
             (this.bovag_id!=null &&
              this.bovag_id.equals(other.getBovag_id())));
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
        if (getBovag_id() != null) {
            _hashCode += getBovag_id().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BovagGetMemberByBovagIdRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bovagGetMemberByBovagIdRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bovag_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "bovag_id"));
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
