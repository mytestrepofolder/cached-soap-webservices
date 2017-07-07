/**
 * SepaInternationalBankAccountNumberFormatValidationReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class SepaInternationalBankAccountNumberFormatValidationReport  implements java.io.Serializable {
    private java.lang.String iban;

    private boolean valid;

    public SepaInternationalBankAccountNumberFormatValidationReport() {
    }

    public SepaInternationalBankAccountNumberFormatValidationReport(
           java.lang.String iban,
           boolean valid) {
           this.iban = iban;
           this.valid = valid;
    }


    /**
     * Gets the iban value for this SepaInternationalBankAccountNumberFormatValidationReport.
     * 
     * @return iban
     */
    public java.lang.String getIban() {
        return iban;
    }


    /**
     * Sets the iban value for this SepaInternationalBankAccountNumberFormatValidationReport.
     * 
     * @param iban
     */
    public void setIban(java.lang.String iban) {
        this.iban = iban;
    }


    /**
     * Gets the valid value for this SepaInternationalBankAccountNumberFormatValidationReport.
     * 
     * @return valid
     */
    public boolean isValid() {
        return valid;
    }


    /**
     * Sets the valid value for this SepaInternationalBankAccountNumberFormatValidationReport.
     * 
     * @param valid
     */
    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SepaInternationalBankAccountNumberFormatValidationReport)) return false;
        SepaInternationalBankAccountNumberFormatValidationReport other = (SepaInternationalBankAccountNumberFormatValidationReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.iban==null && other.getIban()==null) || 
             (this.iban!=null &&
              this.iban.equals(other.getIban()))) &&
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
        if (getIban() != null) {
            _hashCode += getIban().hashCode();
        }
        _hashCode += (isValid() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SepaInternationalBankAccountNumberFormatValidationReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "SepaInternationalBankAccountNumberFormatValidationReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iban");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "iban"));
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
