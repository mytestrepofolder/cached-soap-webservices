/**
 * CreditsafeBePaymentExpectationsSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeBePaymentExpectationsSummary  implements java.io.Serializable {
    private java.math.BigDecimal payment_expectation_days;

    private java.math.BigDecimal day_sales_outstanding;

    public CreditsafeBePaymentExpectationsSummary() {
    }

    public CreditsafeBePaymentExpectationsSummary(
           java.math.BigDecimal payment_expectation_days,
           java.math.BigDecimal day_sales_outstanding) {
           this.payment_expectation_days = payment_expectation_days;
           this.day_sales_outstanding = day_sales_outstanding;
    }


    /**
     * Gets the payment_expectation_days value for this CreditsafeBePaymentExpectationsSummary.
     * 
     * @return payment_expectation_days
     */
    public java.math.BigDecimal getPayment_expectation_days() {
        return payment_expectation_days;
    }


    /**
     * Sets the payment_expectation_days value for this CreditsafeBePaymentExpectationsSummary.
     * 
     * @param payment_expectation_days
     */
    public void setPayment_expectation_days(java.math.BigDecimal payment_expectation_days) {
        this.payment_expectation_days = payment_expectation_days;
    }


    /**
     * Gets the day_sales_outstanding value for this CreditsafeBePaymentExpectationsSummary.
     * 
     * @return day_sales_outstanding
     */
    public java.math.BigDecimal getDay_sales_outstanding() {
        return day_sales_outstanding;
    }


    /**
     * Sets the day_sales_outstanding value for this CreditsafeBePaymentExpectationsSummary.
     * 
     * @param day_sales_outstanding
     */
    public void setDay_sales_outstanding(java.math.BigDecimal day_sales_outstanding) {
        this.day_sales_outstanding = day_sales_outstanding;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeBePaymentExpectationsSummary)) return false;
        CreditsafeBePaymentExpectationsSummary other = (CreditsafeBePaymentExpectationsSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payment_expectation_days==null && other.getPayment_expectation_days()==null) || 
             (this.payment_expectation_days!=null &&
              this.payment_expectation_days.equals(other.getPayment_expectation_days()))) &&
            ((this.day_sales_outstanding==null && other.getDay_sales_outstanding()==null) || 
             (this.day_sales_outstanding!=null &&
              this.day_sales_outstanding.equals(other.getDay_sales_outstanding())));
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
        if (getPayment_expectation_days() != null) {
            _hashCode += getPayment_expectation_days().hashCode();
        }
        if (getDay_sales_outstanding() != null) {
            _hashCode += getDay_sales_outstanding().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditsafeBePaymentExpectationsSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeBePaymentExpectationsSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_expectation_days");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "payment_expectation_days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day_sales_outstanding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "day_sales_outstanding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
