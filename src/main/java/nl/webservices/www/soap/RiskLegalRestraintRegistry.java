/**
 * RiskLegalRestraintRegistry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class RiskLegalRestraintRegistry  implements java.io.Serializable {
    private nl.webservices.www.soap.RiskAddress address;

    private java.lang.String telephone_number;

    private java.lang.String email_address;

    public RiskLegalRestraintRegistry() {
    }

    public RiskLegalRestraintRegistry(
           nl.webservices.www.soap.RiskAddress address,
           java.lang.String telephone_number,
           java.lang.String email_address) {
           this.address = address;
           this.telephone_number = telephone_number;
           this.email_address = email_address;
    }


    /**
     * Gets the address value for this RiskLegalRestraintRegistry.
     * 
     * @return address
     */
    public nl.webservices.www.soap.RiskAddress getAddress() {
        return address;
    }


    /**
     * Sets the address value for this RiskLegalRestraintRegistry.
     * 
     * @param address
     */
    public void setAddress(nl.webservices.www.soap.RiskAddress address) {
        this.address = address;
    }


    /**
     * Gets the telephone_number value for this RiskLegalRestraintRegistry.
     * 
     * @return telephone_number
     */
    public java.lang.String getTelephone_number() {
        return telephone_number;
    }


    /**
     * Sets the telephone_number value for this RiskLegalRestraintRegistry.
     * 
     * @param telephone_number
     */
    public void setTelephone_number(java.lang.String telephone_number) {
        this.telephone_number = telephone_number;
    }


    /**
     * Gets the email_address value for this RiskLegalRestraintRegistry.
     * 
     * @return email_address
     */
    public java.lang.String getEmail_address() {
        return email_address;
    }


    /**
     * Sets the email_address value for this RiskLegalRestraintRegistry.
     * 
     * @param email_address
     */
    public void setEmail_address(java.lang.String email_address) {
        this.email_address = email_address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RiskLegalRestraintRegistry)) return false;
        RiskLegalRestraintRegistry other = (RiskLegalRestraintRegistry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.telephone_number==null && other.getTelephone_number()==null) || 
             (this.telephone_number!=null &&
              this.telephone_number.equals(other.getTelephone_number()))) &&
            ((this.email_address==null && other.getEmail_address()==null) || 
             (this.email_address!=null &&
              this.email_address.equals(other.getEmail_address())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getTelephone_number() != null) {
            _hashCode += getTelephone_number().hashCode();
        }
        if (getEmail_address() != null) {
            _hashCode += getEmail_address().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RiskLegalRestraintRegistry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskLegalRestraintRegistry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "RiskAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "telephone_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email_address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "email_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
