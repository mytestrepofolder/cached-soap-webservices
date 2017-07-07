/**
 * CreditsafeIndustryQuartilyAnalysis.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package nl.webservices.www.soap;

public class CreditsafeIndustryQuartilyAnalysis  implements java.io.Serializable {
    private nl.webservices.www.soap.CreditsafeQuartiles payment_expectation_days;

    private nl.webservices.www.soap.CreditsafeQuartiles day_sales_outstanding;

    public CreditsafeIndustryQuartilyAnalysis() {
    }

    public CreditsafeIndustryQuartilyAnalysis(
           nl.webservices.www.soap.CreditsafeQuartiles payment_expectation_days,
           nl.webservices.www.soap.CreditsafeQuartiles day_sales_outstanding) {
           this.payment_expectation_days = payment_expectation_days;
           this.day_sales_outstanding = day_sales_outstanding;
    }


    /**
     * Gets the payment_expectation_days value for this CreditsafeIndustryQuartilyAnalysis.
     * 
     * @return payment_expectation_days
     */
    public nl.webservices.www.soap.CreditsafeQuartiles getPayment_expectation_days() {
        return payment_expectation_days;
    }


    /**
     * Sets the payment_expectation_days value for this CreditsafeIndustryQuartilyAnalysis.
     * 
     * @param payment_expectation_days
     */
    public void setPayment_expectation_days(nl.webservices.www.soap.CreditsafeQuartiles payment_expectation_days) {
        this.payment_expectation_days = payment_expectation_days;
    }


    /**
     * Gets the day_sales_outstanding value for this CreditsafeIndustryQuartilyAnalysis.
     * 
     * @return day_sales_outstanding
     */
    public nl.webservices.www.soap.CreditsafeQuartiles getDay_sales_outstanding() {
        return day_sales_outstanding;
    }


    /**
     * Sets the day_sales_outstanding value for this CreditsafeIndustryQuartilyAnalysis.
     * 
     * @param day_sales_outstanding
     */
    public void setDay_sales_outstanding(nl.webservices.www.soap.CreditsafeQuartiles day_sales_outstanding) {
        this.day_sales_outstanding = day_sales_outstanding;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditsafeIndustryQuartilyAnalysis)) return false;
        CreditsafeIndustryQuartilyAnalysis other = (CreditsafeIndustryQuartilyAnalysis) obj;
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
        new org.apache.axis.description.TypeDesc(CreditsafeIndustryQuartilyAnalysis.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeIndustryQuartilyAnalysis"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_expectation_days");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "payment_expectation_days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeQuartiles"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day_sales_outstanding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "day_sales_outstanding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.webservices.nl/soap/", "CreditsafeQuartiles"));
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
