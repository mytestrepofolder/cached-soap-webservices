/**
 * VatValidation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class VatValidation  implements java.io.Serializable {
    private java.lang.String vat_number;

    private boolean valid;

    public VatValidation() {
    }

    public VatValidation(
           java.lang.String vat_number,
           boolean valid) {
           this.vat_number = vat_number;
           this.valid = valid;
    }


    /**
     * Gets the vat_number value for this VatValidation.
     * 
     * @return vat_number
     */
    public java.lang.String getVat_number() {
        return vat_number;
    }


    /**
     * Sets the vat_number value for this VatValidation.
     * 
     * @param vat_number
     */
    public void setVat_number(java.lang.String vat_number) {
        this.vat_number = vat_number;
    }


    /**
     * Gets the valid value for this VatValidation.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this VatValidation.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VatValidation)) return false;
        VatValidation other = (VatValidation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vat_number==null && other.getVat_number()==null) || 
             (this.vat_number!=null &&
              this.vat_number.equals(other.getVat_number()))) &&
            this.valid == other.isValid();
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
        if (getVat_number() != null) {
            _hashCode += getVat_number().hashCode();
        }
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VatValidation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "VatValidation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vat_number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "vat_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "valid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
