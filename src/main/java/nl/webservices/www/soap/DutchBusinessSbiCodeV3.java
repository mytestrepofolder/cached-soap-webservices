/**
 * DutchBusinessSbiCodeV3.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class DutchBusinessSbiCodeV3  implements java.io.Serializable {
    private java.lang.String sbi_code;

    private java.lang.String description;

    public DutchBusinessSbiCodeV3() {
    }

    public DutchBusinessSbiCodeV3(
           java.lang.String sbi_code,
           java.lang.String description) {
           this.sbi_code = sbi_code;
           this.description = description;
    }


    /**
     * Gets the sbi_code value for this DutchBusinessSbiCodeV3.
     * 
     * @return sbi_code
     */
    public java.lang.String getSbi_code() {
        return sbi_code;
    }


    /**
     * Sets the sbi_code value for this DutchBusinessSbiCodeV3.
     * 
     * @param sbi_code
     */
    public void setSbi_code(java.lang.String sbi_code) {
        this.sbi_code = sbi_code;
    }


    /**
     * Gets the description value for this DutchBusinessSbiCodeV3.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DutchBusinessSbiCodeV3.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DutchBusinessSbiCodeV3)) return false;
        DutchBusinessSbiCodeV3 other = (DutchBusinessSbiCodeV3) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sbi_code==null && other.getSbi_code()==null) || 
             (this.sbi_code!=null &&
              this.sbi_code.equals(other.getSbi_code()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        if (getSbi_code() != null) {
            _hashCode += getSbi_code().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DutchBusinessSbiCodeV3.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "DutchBusinessSbiCodeV3"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sbi_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sbi_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "description"));
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
