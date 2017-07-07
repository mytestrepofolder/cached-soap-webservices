/**
 * SepaValidateInternationalBankAccountNumberFormatResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class SepaValidateInternationalBankAccountNumberFormatResponseType  implements java.io.Serializable {
    private nl.webservices.www.soap.SepaInternationalBankAccountNumberFormatValidationReport validation_report;

    public SepaValidateInternationalBankAccountNumberFormatResponseType() {
    }

    public SepaValidateInternationalBankAccountNumberFormatResponseType(
           nl.webservices.www.soap.SepaInternationalBankAccountNumberFormatValidationReport validation_report) {
           this.validation_report = validation_report;
    }


    /**
     * Gets the validation_report value for this SepaValidateInternationalBankAccountNumberFormatResponseType.
     * 
     * @return validation_report
     */
    public nl.webservices.www.soap.SepaInternationalBankAccountNumberFormatValidationReport getValidation_report() {
        return validation_report;
    }


    /**
     * Sets the validation_report value for this SepaValidateInternationalBankAccountNumberFormatResponseType.
     * 
     * @param validation_report
     */
    public void setValidation_report(nl.webservices.www.soap.SepaInternationalBankAccountNumberFormatValidationReport validation_report) {
        this.validation_report = validation_report;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SepaValidateInternationalBankAccountNumberFormatResponseType)) return false;
        SepaValidateInternationalBankAccountNumberFormatResponseType other = (SepaValidateInternationalBankAccountNumberFormatResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.validation_report==null && other.getValidation_report()==null) || 
             (this.validation_report!=null &&
              this.validation_report.equals(other.getValidation_report())));
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
        if (getValidation_report() != null) {
            _hashCode += getValidation_report().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SepaValidateInternationalBankAccountNumberFormatResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "sepaValidateInternationalBankAccountNumberFormatResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validation_report");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "validation_report"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "SepaInternationalBankAccountNumberFormatValidationReport"));
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
