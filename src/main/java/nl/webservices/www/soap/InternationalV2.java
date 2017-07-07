/**
 * InternationalV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class InternationalV2  implements java.io.Serializable {
    private nl.webservices.www.soap.InternationalFormattedAddress address;

    private java.lang.String element_match_status;

    private java.lang.String element_result_status;

    public InternationalV2() {
    }

    public InternationalV2(
           nl.webservices.www.soap.InternationalFormattedAddress address,
           java.lang.String element_match_status,
           java.lang.String element_result_status) {
           this.address = address;
           this.element_match_status = element_match_status;
           this.element_result_status = element_result_status;
    }


    /**
     * Gets the address value for this InternationalV2.
     * 
     * @return address
     */
    public nl.webservices.www.soap.InternationalFormattedAddress getAddress() {
        return address;
    }


    /**
     * Sets the address value for this InternationalV2.
     * 
     * @param address
     */
    public void setAddress(nl.webservices.www.soap.InternationalFormattedAddress address) {
        this.address = address;
    }


    /**
     * Gets the element_match_status value for this InternationalV2.
     * 
     * @return element_match_status
     */
    public java.lang.String getElement_match_status() {
        return element_match_status;
    }


    /**
     * Sets the element_match_status value for this InternationalV2.
     * 
     * @param element_match_status
     */
    public void setElement_match_status(java.lang.String element_match_status) {
        this.element_match_status = element_match_status;
    }


    /**
     * Gets the element_result_status value for this InternationalV2.
     * 
     * @return element_result_status
     */
    public java.lang.String getElement_result_status() {
        return element_result_status;
    }


    /**
     * Sets the element_result_status value for this InternationalV2.
     * 
     * @param element_result_status
     */
    public void setElement_result_status(java.lang.String element_result_status) {
        this.element_result_status = element_result_status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InternationalV2)) return false;
        InternationalV2 other = (InternationalV2) obj;
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
            ((this.element_match_status==null && other.getElement_match_status()==null) || 
             (this.element_match_status!=null &&
              this.element_match_status.equals(other.getElement_match_status()))) &&
            ((this.element_result_status==null && other.getElement_result_status()==null) || 
             (this.element_result_status!=null &&
              this.element_result_status.equals(other.getElement_result_status())));
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
        if (getElement_match_status() != null) {
            _hashCode += getElement_match_status().hashCode();
        }
        if (getElement_result_status() != null) {
            _hashCode += getElement_result_status().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InternationalV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InternationalV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "InternationalFormattedAddress"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("element_match_status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "element_match_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("element_result_status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "element_result_status"));
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
